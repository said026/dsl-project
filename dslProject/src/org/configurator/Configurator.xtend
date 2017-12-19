package org.configurator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.fM.FeatureModel
import org.xtext.fM.Node
import java.util.Scanner

class Configurator {
	
	val static selectedFeatures = newArrayList() 
	
	def static loadFeatureModel(URI uri) {
		new org.xtext.FMStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		
		res.contents.get(0) as FeatureModel
	}
		
	def static void processNode(Node n) {
		val parent = n.name
		
		if (!n.mandatory) {
			// Ask user for choice
			println("Include \"" + n.name + "\" ?")
			println("1. Yes")
			println("2. No")
			
			val scanner = new Scanner(System.in)
			val choice = scanner.nextLine();
			
			if (Integer.parseInt(choice) == 1) {
				selectedFeatures.add(parent)
			} else {
				println("")
				return
			}
		} else {
			// mandatory feature
			selectedFeatures.add(parent)
		}
		
		switch n.open_relation {
			case 'and': {
					n.children.forEach[c|
						// If the child is itself a node
						if (c instanceof Node) {
							processNode(c)
						} else if (!c.mandatory) {
							// Ask user for choice
							println("Include \"" + c.name + "\" ?")
							println("1. Yes")
							println("2. No")
							
							val scanner = new Scanner(System.in)
							val choice = scanner.nextLine();
							
							if (Integer.parseInt(choice) == 1) {
								selectedFeatures.add(c.name)
							} else {
								println("")
								return
							}
						}
					]
			}
			case 'or': {
					n.children.forEach[c|
						// If the child is itself a node
						if (c instanceof Node) {
							processNode(c)
						} else {
							// Ask user for choice
							println("Include \"" + c.name + "\" ?")
							println("1. Yes")
							println("2. No")
							
							val scanner = new Scanner(System.in)
							val choice = scanner.nextLine()
							
							if (Integer.parseInt(choice) == 1) {
								selectedFeatures.add(c.name)
							} else {
								println("")
								return
							}
						}
					]			
			}
			case 'alt': {
					val decided = newArrayList(false)
					
					n.children.forEach[c|
						// If the child is itself a node
						if (c instanceof Node) {
							processNode(c)
						} else if (!decided.get(0)){
							// Ask user for choice
							println("Include \"" + c.name + "\" ?")
							println("1. Yes")
							println("2. No")
							
							val scanner = new Scanner(System.in)
							val choice = scanner.nextLine()
							
							if (Integer.parseInt(choice) == 1) {
								selectedFeatures.add(c.name)
								decided.set(0, true)
								return
							} else {
								println("")
								return
							}
						}
					]				
			}
		}
	}
	
	def static void main(String[] args) {
		// Load the Feature Model
		val fm = loadFeatureModel(URI.createURI("/home/said026/example.fm"))
		
		val root = fm.diagram.root
		
		println("Welcome to the \"" + root.name+ "\" configurator !")
		println("========================================================================")
		
		if (root instanceof Node) {
			processNode(root)
		}
		
		println("========================================================================")
		println("Thank you ! Here is the set of selected features :")
		selectedFeatures.forEach[f|
			println("- " + f)
		]
	}
}