package commander

import org.eclipse.emf.common.util.URI
import org.xtext.fM.FeatureModel
import org.xtext.fM.Node
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.fM.Leaf
import java.util.Scanner

class CommandLine {
	
	val static featuresList = newArrayList() 
	
	def static loadFeatureModel(URI uri) {
		new org.xtext.FMStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		
		res.contents.get(0) as FeatureModel
	}
	
	def static void addFeatures(Node n){
		// Add parent
		val parent = n.name
		featuresList.add(parent)
		
		// Get all the children names
		n.children.forEach[c|
			if (c instanceof Leaf) {
				featuresList.add(c.name)
			} else {
				// In case we have a Node
				addFeatures(c as Node)
			}	
		]
	}
	
	def static void main(String[] args) {
		val fm = loadFeatureModel(URI.createURI("/home/said026/example.fm"))
		val root = fm.diagram.root
		
		if (root === null)
  			throw new IllegalArgumentException("The feature model must not be empty")
		
		addFeatures(root as Node)
		
		println("Please give the list of features you want to be included in your configuration (comma separated) :")
		
		// Ask user for input commands
		val scanner = new Scanner(System.in)
		val params = scanner.nextLine()
		
		val params_list = params.split(",")
	}
}