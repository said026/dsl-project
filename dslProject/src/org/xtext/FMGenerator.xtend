package org.xtext

import java.util.HashMap
import java.util.Random
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.xtext.fM.FeatureModel
import org.xtext.fM.Node
import org.xtext.fM.impl.FMFactoryImpl
import org.xtext.fM.Constraints

class FMGenerator {

	static int MAX_FEATURES = 10
	static int MAX_RULES = 3
	static int featuresCount = 1
	
	// Init the factory 
	val static factory = FMFactoryImpl.init()
	
	// Init a random number generator
	val static rand = new Random()
	
	def static String getRelation() {
		val relations = #['and', 'or', 'alt']
    	val rnd = rand.nextInt(relations.length)
    	relations.get(rnd)
	}

	def static String genFeatureName() {
		val featName = "Feature" + featuresCount
		featuresCount++
		featName
	}
	
	def static String getRanomFeatureName() {
		"Feature" + (rand.nextInt(MAX_FEATURES) + 1)
	}
	
	def static void genRules(Constraints constraints) {
		// Add a specific number of rules
		(1..MAX_RULES).forEach[
			
			val rule = factory.createRule
			
			val rule_element = factory.createRuleElement
			
			rule_element.open_operator = "imp"
			rule_element.close_operator = rule_element.open_operator
			
			val left_var = factory.createVar
			left_var.name = getRanomFeatureName()
			
			
			// Set left side variable
			rule_element.left_side = left_var
			
			if (rand.nextBoolean()) {
				
				// Implies not ( A => ~B )
	
				val right_var = factory.createVar
				right_var.name = getRanomFeatureName()
				
				// In case the two vars are the same
				while (left_var.name == right_var.name) {
					right_var.name = getRanomFeatureName()
				}
				
				right_var.not = true
				
				// Set right side
				rule_element.right_side = right_var
			} else {
				// Implies
				val right_var = factory.createVar
				right_var.name = getRanomFeatureName()
				
				// In case the two vars are the same
				while (left_var.name == right_var.name) {
					right_var.name = getRanomFeatureName()
				}	
						
				rule_element.right_side = right_var
			}
			
			// Add rule to RuleElement
			rule.elements.add(rule_element)
			
			// Add rule to constraints
			constraints.rules.add(rule)
		]
	}
	
	def static void randomRelation(Node node) {
		
		// In case we reached the maximum number of features
		if (featuresCount >= MAX_FEATURES) {
			return
		}
		
		
		// Add a random number of features to the node
		
		val nb_features = rand.nextInt(MAX_FEATURES) + 1

		(1..nb_features).forEach[
			val leaf = factory.createLeaf
		
			leaf.name = genFeatureName()
			
			// Set mandatoriness
			leaf.mandatory = rand.nextBoolean()
			
			node.children.add(leaf)
		]
		
		// Generate a random number of nodes
		val nb_nodes = rand.nextInt(MAX_FEATURES) + 1
		
		(1..nb_nodes).forEach[
			val child_node = factory.createNode
		
			// Create new relation
			child_node.open_relation = getRelation()
			child_node.close_relation = child_node.open_relation
			
			// Set name
			child_node.name = genFeatureName()
			
			// Set mandatoriness
			child_node.mandatory = rand.nextBoolean()
			
			// Add features to the created node
			randomRelation(child_node)
			
			if (child_node.children.size > 0) {
				// Add the created node to the root
				node.children.add(child_node)	
			}
		]

	}
	
	def static saveFeatureModel(URI uri, FeatureModel fm) {
		val injector = new FMStandaloneSetup().createInjectorAndDoEMFRegistration()
		val rs = injector.getInstance(typeof(ResourceSet))

		var Resource r = rs.createResource(uri)
		r.getContents.add(fm)
		println("Generated feature model at : " + uri)
		r.save(new HashMap())
	}

	def static void main(String[] args) {
		
		// Create the feature model
		val featureModel = factory.createFeatureModel
		
		val featureDiagram = factory.createFeatureDiagram
		
		// Create root node 
		val rootNode = factory.createNode
		
		rootNode.name = genFeatureName()
		rootNode.mandatory = true
		
		rootNode.open_relation = getRelation()
		rootNode.close_relation = rootNode.open_relation
		 
		// Add name
		featureDiagram.root = rootNode
		
		// Add a random number of children
		randomRelation(rootNode)
		featureDiagram.root = rootNode
		println(rootNode)
		
		// Append the feature diagram
		featureModel.diagram = featureDiagram
		
		// Create constraints
		val constraints = factory.createConstraints
		
		// Add rules
		genRules(constraints)
		
		featureModel.constraints = constraints
		
		// Save the feature model		
		saveFeatureModel(URI.createURI("/home/said026/test.fm"), featureModel)
	}
}
	