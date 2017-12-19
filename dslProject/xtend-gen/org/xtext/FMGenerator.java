package org.xtext;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.xtext.FMStandaloneSetup;
import org.xtext.fM.Constraints;
import org.xtext.fM.FMFactory;
import org.xtext.fM.FeatureDiagram;
import org.xtext.fM.FeatureModel;
import org.xtext.fM.Leaf;
import org.xtext.fM.Node;
import org.xtext.fM.Rule;
import org.xtext.fM.RuleElement;
import org.xtext.fM.Var;
import org.xtext.fM.impl.FMFactoryImpl;

@SuppressWarnings("all")
public class FMGenerator {
  private static int MAX_FEATURES = 10;
  
  private static int MAX_RULES = 3;
  
  private static int featuresCount = 1;
  
  private final static FMFactory factory = FMFactoryImpl.init();
  
  private final static Random rand = new Random();
  
  public static String getRelation() {
    String _xblockexpression = null;
    {
      final List<String> relations = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("and", "or", "alt"));
      final int rnd = FMGenerator.rand.nextInt(((Object[])Conversions.unwrapArray(relations, Object.class)).length);
      _xblockexpression = relations.get(rnd);
    }
    return _xblockexpression;
  }
  
  public static String genFeatureName() {
    String _xblockexpression = null;
    {
      final String featName = ("Feature" + Integer.valueOf(FMGenerator.featuresCount));
      FMGenerator.featuresCount++;
      _xblockexpression = featName;
    }
    return _xblockexpression;
  }
  
  public static String getRanomFeatureName() {
    int _nextInt = FMGenerator.rand.nextInt(FMGenerator.MAX_FEATURES);
    int _plus = (_nextInt + 1);
    return ("Feature" + Integer.valueOf(_plus));
  }
  
  public static void genRules(final Constraints constraints) {
    final Consumer<Integer> _function = (Integer it) -> {
      final Rule rule = FMGenerator.factory.createRule();
      final RuleElement rule_element = FMGenerator.factory.createRuleElement();
      rule_element.setOpen_operator("imp");
      rule_element.setClose_operator(rule_element.getOpen_operator());
      final Var left_var = FMGenerator.factory.createVar();
      left_var.setName(FMGenerator.getRanomFeatureName());
      rule_element.setLeft_side(left_var);
      boolean _nextBoolean = FMGenerator.rand.nextBoolean();
      if (_nextBoolean) {
        final Var right_var = FMGenerator.factory.createVar();
        right_var.setName(FMGenerator.getRanomFeatureName());
        while (Objects.equal(left_var.getName(), right_var.getName())) {
          right_var.setName(FMGenerator.getRanomFeatureName());
        }
        right_var.setNot(true);
        rule_element.setRight_side(right_var);
      } else {
        final Var right_var_1 = FMGenerator.factory.createVar();
        right_var_1.setName(FMGenerator.getRanomFeatureName());
        while (Objects.equal(left_var.getName(), right_var_1.getName())) {
          right_var_1.setName(FMGenerator.getRanomFeatureName());
        }
        rule_element.setRight_side(right_var_1);
      }
      rule.getElements().add(rule_element);
      constraints.getRules().add(rule);
    };
    new IntegerRange(1, FMGenerator.MAX_RULES).forEach(_function);
  }
  
  public static void randomRelation(final Node node) {
    if ((FMGenerator.featuresCount >= FMGenerator.MAX_FEATURES)) {
      return;
    }
    int _nextInt = FMGenerator.rand.nextInt(FMGenerator.MAX_FEATURES);
    final int nb_features = (_nextInt + 1);
    final Consumer<Integer> _function = (Integer it) -> {
      final Leaf leaf = FMGenerator.factory.createLeaf();
      leaf.setName(FMGenerator.genFeatureName());
      leaf.setMandatory(FMGenerator.rand.nextBoolean());
      node.getChildren().add(leaf);
    };
    new IntegerRange(1, nb_features).forEach(_function);
    int _nextInt_1 = FMGenerator.rand.nextInt(FMGenerator.MAX_FEATURES);
    final int nb_nodes = (_nextInt_1 + 1);
    final Consumer<Integer> _function_1 = (Integer it) -> {
      final Node child_node = FMGenerator.factory.createNode();
      child_node.setOpen_relation(FMGenerator.getRelation());
      child_node.setClose_relation(child_node.getOpen_relation());
      child_node.setName(FMGenerator.genFeatureName());
      child_node.setMandatory(FMGenerator.rand.nextBoolean());
      FMGenerator.randomRelation(child_node);
      int _size = child_node.getChildren().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        node.getChildren().add(child_node);
      }
    };
    new IntegerRange(1, nb_nodes).forEach(_function_1);
  }
  
  public static void saveFeatureModel(final URI uri, final FeatureModel fm) {
    try {
      final Injector injector = new FMStandaloneSetup().createInjectorAndDoEMFRegistration();
      final ResourceSet rs = injector.<ResourceSet>getInstance(ResourceSet.class);
      Resource r = rs.createResource(uri);
      r.getContents().add(fm);
      InputOutput.<String>println(("Generated feature model at : " + uri));
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      r.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    final FeatureModel featureModel = FMGenerator.factory.createFeatureModel();
    final FeatureDiagram featureDiagram = FMGenerator.factory.createFeatureDiagram();
    final Node rootNode = FMGenerator.factory.createNode();
    rootNode.setName(FMGenerator.genFeatureName());
    rootNode.setMandatory(true);
    rootNode.setOpen_relation(FMGenerator.getRelation());
    rootNode.setClose_relation(rootNode.getOpen_relation());
    featureDiagram.setRoot(rootNode);
    FMGenerator.randomRelation(rootNode);
    featureDiagram.setRoot(rootNode);
    InputOutput.<Node>println(rootNode);
    featureModel.setDiagram(featureDiagram);
    final Constraints constraints = FMGenerator.factory.createConstraints();
    FMGenerator.genRules(constraints);
    featureModel.setConstraints(constraints);
    FMGenerator.saveFeatureModel(URI.createURI("/home/said026/test.fm"), featureModel);
  }
}
