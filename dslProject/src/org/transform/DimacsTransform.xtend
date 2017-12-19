package org.transform

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.fM.FeatureModel
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import org.xtext.fM.Node
import java.io.PrintWriter
import org.xtext.fM.Var
import org.xtext.fM.RuleElement
import org.xtext.fM.Formula

class DimacsTransform {
	
	val static featuresList = newArrayList() 
	val static clauses = newArrayList()
	
	def static loadFeatureModel(URI uri) {
		new org.xtext.FMStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		
		res.contents.get(0) as FeatureModel
	}
	
	def static saveFeatureModel(URI uri, FeatureModel fm) {
		var Resource rs = new ResourceSetImpl().createResource(uri)
		rs.getContents.add(fm)
		
		rs.save(new HashMap())
	}
	
	def static addFeature(String name) {
		if (!featuresList.contains(name))
			featuresList.add(name)
	}
	
	def static int getFeatureID(String name) {
		
		if (featuresList.contains(name)) {
			featuresList.indexOf(name) + 1
		} else {
			throw new IllegalArgumentException("Feature not found " + name)
		}
	}
	
	def static void addClauses(Node n){
		val parent_id = getFeatureID(n.name)
		
		// Get all the children names
		n.children.forEach[c1 |
			addFeature(c1.name)
		]
		
		// List of children
		val c_list = newArrayList()
				
		switch n.open_relation {
			case 'and' : {
				n.children.forEach[c|
					// If the child is itself a node
					if (c instanceof Node) addClauses(c)
					
					val c_id = getFeatureID(c.name)
					if (c.mandatory) {
						clauses.add(parent_id + " -" + c_id + " 0")
						clauses.add(c_id + " -" + parent_id + " 0")
					} else {
						clauses.add(parent_id + " -" + c_id + " 0")
					}	
				]
			}
			case 'or' : {
				// Clear the c_list list
				c_list.clear()
				n.children.forEach[c|
					// If the child is itself a node
					if (c instanceof Node) addClauses(c)
					
					val c_id = getFeatureID(c.name)
					
					clauses.add(parent_id + " -" + c_id + " 0")
					
					// Add child to list
					c_list.add(c_id)
				]
				var s = ""
				for (int i : c_list)
					s += i + " "
				// add parent
				s += "-" + parent_id + " 0"
				
				clauses.add(s)
			}
			case 'alt' : {
				// Clear the c_list list
				c_list.clear()
				n.children.forEach[c|
					// If the child is itself a node
					if (c instanceof Node) addClauses(c)
					
					val c_id = getFeatureID(c.name)
					
					clauses.add(parent_id + " -" + c_id + " 0")
					
					// Add child to list
					c_list.add(c_id)
				]
				
				var s = ""
				for (int i : c_list)
					s += i + " "
				// add parent
				s += "-" + parent_id + " 0"
				
				clauses.add(s)
				
				// Add negative clauses
				c_list.forEach[ element, index |
					c_list.set(index, element * -1)
				]
				
				for (var i = 0 ; i < c_list.size ; i++) {
					for (var j = i +1 ; j < c_list.size ; j++) {
						clauses.add(c_list.get(i) + " " + c_list.get(j) + " 0")
					}
				}
			}
		}
	}
	
	def static addConstraints(Formula rule) {
		
		if (rule instanceof Var) {
			
			if (rule.not) {
				clauses.add(" -" + rule.name + " 0")
			} else {
				clauses.add(rule.name + " 0")
			}
		} else if (rule instanceof RuleElement) {
			switch rule.open_operator {
				case 'imp': {
					if (rule.right_side.not) {
						// A => not B
						clauses.add("-" + getFeatureID(rule.left_side.name) + " -" + getFeatureID(rule.right_side.name) + " 0")
					} else {
						// A => B
						clauses.add("-" + getFeatureID(rule.left_side.name) + " " + getFeatureID(rule.right_side.name) + " 0")
					}
				}
			}
		}
	}
	
	def static void main(String[] args) {
		// Load the Feature Model
		val fm = loadFeatureModel(URI.createURI("/home/said026/example.fm"))
		val root = fm.diagram.root
		
		if (root === null)
  			throw new IllegalArgumentException("The feature model must not be empty")
  		
  		// Create a DIMACS output file 
  		val pw = new PrintWriter("/home/said026/example.dimacs", "UTF-8");
		pw.println("c Output file")
		
		// Add root clause
		clauses.add("1 0")
		
		if (root instanceof Node) {				
			// Add the feature to the list
			val name = root.name
			addFeature(name)
							
			addClauses(root)
			clauses.forEach[e | println(e)]
			println(featuresList)
		} 
		
		// Process the constraints
		val constraints = fm.constraints
		if (!constraints.rules.empty) {
			constraints.rules.forEach[rule|
				rule.elements.forEach[e|
					addConstraints(e)	
				]
			]
		}
		
		// Print the feature list to the output file
		featuresList.forEach[f,i | pw.println("c " + f + " " + (i+1))]
		
		// Print the problem line
		pw.println("p cnf " + featuresList.size + " " + clauses.size)
		
		// Print clauses to the output file
		clauses.forEach[c | pw.println(c)]
		
		// flush the writer
        pw.flush()
	}	
}
				