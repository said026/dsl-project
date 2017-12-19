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

class MiniZincTransform {
	
	val static featuresList = newArrayList() 
	val static constraints = newArrayList()
	
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
		val parent = n.name
		
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
					
					if (c.mandatory) {
						constraints.add(parent + " -> " + c.name)
						constraints.add(c.name + " -> " + parent)
					} else {
						constraints.add(c.name + " -> " + parent)
					}	
				]
			}
			case 'or' : {
				// Clear the c_list list
				c_list.clear()
				n.children.forEach[c|
					// If the child is itself a node
					if (c instanceof Node) addClauses(c)
					// Add child to list
					c_list.add(c.name)
				]
				var const = String.join(" \\/ ", c_list)
				
				// add parent
				const = parent + " -> " + const
				
				constraints.add(const)
			}
			case 'alt' : {
				// Clear the c_list list
				c_list.clear()
				n.children.forEach[c|
					// If the child is itself a node
					if (c instanceof Node) addClauses(c)
					
					// Add child to list
					c_list.add(c.name)
				]
				
				var const = String.join(" xor ", c_list)
				
				// add parent
				const = parent + " -> " + const
				
				constraints.add(const)
				
			}
		}
	}
	
	def static addConstraints(Formula rule) {
		
		if (rule instanceof Var) {
			
			if (rule.not) {
				constraints.add("not " + rule.name)
			} else {
				constraints.add(rule.name)
			}
		} else if (rule instanceof RuleElement) {
			switch rule.open_operator {
				case 'imp': {
					if (rule.right_side.not) {
						// A => not B
						constraints.add(rule.left_side.name + " -> not " + rule.right_side.name)
					} else {
						// A => B
						constraints.add(rule.left_side.name + " -> " + rule.right_side.name)
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
  		val pw = new PrintWriter("/home/said026/example.mzn", "UTF-8");
		pw.println("% Output file")
				
		if (root instanceof Node) {				
			// Add the feature to the list
			val name = root.name
			addFeature(name)
							
			addClauses(root)
			constraints.forEach[e | println(e)]
			println(featuresList)
		} 
		
		// Process the constraints
		val cs = fm.constraints
		if (!cs.rules.empty) {
			cs.rules.forEach[rule|
				rule.elements.forEach[e|
					addConstraints(e)	
				]
			]
		}
		
		// Add root clause
		constraints.add(featuresList.get(0))
		
		// Print the feature list to the output file
		featuresList.forEach[f,i | 
			
			pw.println("var bool: " + f + ";")
		]
		
		// Print clauses to the output file
		constraints.forEach[c | pw.println("constraint " + c + ";")]
		
		// Add satisfy instruction
		pw.println("solve satisfy;")
		// flush the writer
        pw.flush()
	}	
}
