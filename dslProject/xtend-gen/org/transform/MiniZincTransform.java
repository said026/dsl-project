package org.transform;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.xtext.FMStandaloneSetupGenerated;
import org.xtext.fM.Child;
import org.xtext.fM.Constraints;
import org.xtext.fM.FeatureModel;
import org.xtext.fM.Formula;
import org.xtext.fM.Node;
import org.xtext.fM.Rule;
import org.xtext.fM.RuleElement;
import org.xtext.fM.Var;

@SuppressWarnings("all")
public class MiniZincTransform {
  private final static ArrayList<Object> featuresList = CollectionLiterals.<Object>newArrayList();
  
  private final static ArrayList<Object> constraints = CollectionLiterals.<Object>newArrayList();
  
  public static FeatureModel loadFeatureModel(final URI uri) {
    FeatureModel _xblockexpression = null;
    {
      new FMStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
      Resource res = new ResourceSetImpl().getResource(uri, true);
      EObject _get = res.getContents().get(0);
      _xblockexpression = ((FeatureModel) _get);
    }
    return _xblockexpression;
  }
  
  public static void saveFeatureModel(final URI uri, final FeatureModel fm) {
    try {
      Resource rs = new ResourceSetImpl().createResource(uri);
      rs.getContents().add(fm);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static boolean addFeature(final String name) {
    boolean _xifexpression = false;
    boolean _contains = MiniZincTransform.featuresList.contains(name);
    boolean _not = (!_contains);
    if (_not) {
      _xifexpression = MiniZincTransform.featuresList.add(name);
    }
    return _xifexpression;
  }
  
  public static int getFeatureID(final String name) {
    int _xifexpression = (int) 0;
    boolean _contains = MiniZincTransform.featuresList.contains(name);
    if (_contains) {
      int _indexOf = MiniZincTransform.featuresList.indexOf(name);
      _xifexpression = (_indexOf + 1);
    } else {
      throw new IllegalArgumentException(("Feature not found " + name));
    }
    return _xifexpression;
  }
  
  public static void addClauses(final Node n) {
    final String parent = n.getName();
    final Consumer<Child> _function = (Child c1) -> {
      MiniZincTransform.addFeature(c1.getName());
    };
    n.getChildren().forEach(_function);
    final ArrayList<String> c_list = CollectionLiterals.<String>newArrayList();
    String _open_relation = n.getOpen_relation();
    if (_open_relation != null) {
      switch (_open_relation) {
        case "and":
          final Consumer<Child> _function_1 = (Child c) -> {
            if ((c instanceof Node)) {
              MiniZincTransform.addClauses(((Node)c));
            }
            boolean _isMandatory = c.isMandatory();
            if (_isMandatory) {
              String _name = c.getName();
              String _plus = ((parent + " -> ") + _name);
              MiniZincTransform.constraints.add(_plus);
              String _name_1 = c.getName();
              String _plus_1 = (_name_1 + " -> ");
              String _plus_2 = (_plus_1 + parent);
              MiniZincTransform.constraints.add(_plus_2);
            } else {
              String _name_2 = c.getName();
              String _plus_3 = (_name_2 + " -> ");
              String _plus_4 = (_plus_3 + parent);
              MiniZincTransform.constraints.add(_plus_4);
            }
          };
          n.getChildren().forEach(_function_1);
          break;
        case "or":
          c_list.clear();
          final Consumer<Child> _function_2 = (Child c) -> {
            if ((c instanceof Node)) {
              MiniZincTransform.addClauses(((Node)c));
            }
            c_list.add(c.getName());
          };
          n.getChildren().forEach(_function_2);
          String const_ = String.join(" \\/ ", c_list);
          const_ = ((parent + " -> ") + const_);
          MiniZincTransform.constraints.add(const_);
          break;
        case "alt":
          c_list.clear();
          final Consumer<Child> _function_3 = (Child c) -> {
            if ((c instanceof Node)) {
              MiniZincTransform.addClauses(((Node)c));
            }
            c_list.add(c.getName());
          };
          n.getChildren().forEach(_function_3);
          String const__1 = String.join(" xor ", c_list);
          const__1 = ((parent + " -> ") + const__1);
          MiniZincTransform.constraints.add(const__1);
          break;
      }
    }
  }
  
  public static boolean addConstraints(final Formula rule) {
    boolean _xifexpression = false;
    if ((rule instanceof Var)) {
      boolean _xifexpression_1 = false;
      boolean _isNot = ((Var)rule).isNot();
      if (_isNot) {
        String _name = ((Var)rule).getName();
        String _plus = ("not " + _name);
        _xifexpression_1 = MiniZincTransform.constraints.add(_plus);
      } else {
        _xifexpression_1 = MiniZincTransform.constraints.add(((Var)rule).getName());
      }
      _xifexpression = _xifexpression_1;
    } else {
      boolean _xifexpression_2 = false;
      if ((rule instanceof RuleElement)) {
        boolean _switchResult = false;
        String _open_operator = ((RuleElement)rule).getOpen_operator();
        if (_open_operator != null) {
          switch (_open_operator) {
            case "imp":
              boolean _xifexpression_3 = false;
              boolean _isNot_1 = ((RuleElement)rule).getRight_side().isNot();
              if (_isNot_1) {
                String _name_1 = ((RuleElement)rule).getLeft_side().getName();
                String _plus_1 = (_name_1 + " -> not ");
                String _name_2 = ((RuleElement)rule).getRight_side().getName();
                String _plus_2 = (_plus_1 + _name_2);
                _xifexpression_3 = MiniZincTransform.constraints.add(_plus_2);
              } else {
                String _name_3 = ((RuleElement)rule).getLeft_side().getName();
                String _plus_3 = (_name_3 + " -> ");
                String _name_4 = ((RuleElement)rule).getRight_side().getName();
                String _plus_4 = (_plus_3 + _name_4);
                _xifexpression_3 = MiniZincTransform.constraints.add(_plus_4);
              }
              _switchResult = _xifexpression_3;
              break;
          }
        }
        _xifexpression_2 = _switchResult;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  public static void doTransform(final String input, final String output) {
    try {
      final FeatureModel fm = MiniZincTransform.loadFeatureModel(URI.createURI(input));
      final Child root = fm.getDiagram().getRoot();
      if ((root == null)) {
        throw new IllegalArgumentException("The feature model must not be empty");
      }
      final PrintWriter pw = new PrintWriter(output, "UTF-8");
      pw.println("% Output file");
      if ((root instanceof Node)) {
        final String name = ((Node)root).getName();
        MiniZincTransform.addFeature(name);
        MiniZincTransform.addClauses(((Node)root));
        final Consumer<Object> _function = (Object e) -> {
          InputOutput.<Object>println(e);
        };
        MiniZincTransform.constraints.forEach(_function);
        InputOutput.<ArrayList<Object>>println(MiniZincTransform.featuresList);
      }
      final Constraints cs = fm.getConstraints();
      boolean _isEmpty = cs.getRules().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Consumer<Rule> _function_1 = (Rule rule) -> {
          final Consumer<Formula> _function_2 = (Formula e) -> {
            MiniZincTransform.addConstraints(e);
          };
          rule.getElements().forEach(_function_2);
        };
        cs.getRules().forEach(_function_1);
      }
      MiniZincTransform.constraints.add(MiniZincTransform.featuresList.get(0));
      final Procedure2<Object, Integer> _function_2 = (Object f, Integer i) -> {
        pw.println((("var bool: " + f) + ";"));
      };
      IterableExtensions.<Object>forEach(MiniZincTransform.featuresList, _function_2);
      final Consumer<Object> _function_3 = (Object c) -> {
        pw.println((("constraint " + c) + ";"));
      };
      MiniZincTransform.constraints.forEach(_function_3);
      pw.println("solve satisfy;");
      pw.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    MiniZincTransform.doTransform("/home/said026/example.fm", "/home/said026/example.mzn");
  }
}
