package commander

import org.eclipse.emf.common.util.URI
import org.xtext.fM.FeatureModel
import org.xtext.fM.Node
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.fM.Leaf
import java.util.Scanner
import org.transform.MiniZincTransform
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.io.BufferedReader
import java.io.InputStreamReader

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
		
		// We perform a model transformation to Minizinc
		MiniZincTransform.doTransform("/home/said026/example.fm", "/home/said026/example.mzn")
		
		// We add the selected features as constraints
		try {
    		val out = new PrintWriter(new BufferedWriter(new FileWriter("/home/said026/example.mzn", true)))
    		params_list.forEach[p|
    			out.println("constraint " + p + ";")
    		]
    		out.close()
		} catch (IOException e) {
    		println("File I/O error occurred")
		}
		
		// Check the satisfiability of the configuration
		val output = new StringBuffer()
		val command = #{"/bin/bash", "-c", "minizinc", "/home/said026/example.mzn"}
		
		val p = Runtime.getRuntime().exec(command)
	    p.waitFor()
	
	    val reader = new BufferedReader(new InputStreamReader(p.getInputStream()))
	
	    var line = ""
	    while ((line = reader.readLine())!== null) {
			output.append(line + "\n")
	    }
	    if (output.indexOf("UNSATISFIABLE") !== -1) {
	    	println("The selected configuration is not valid !")
	    } else {
	    	println("The selected configuration is valid !")
	    }
	}
}