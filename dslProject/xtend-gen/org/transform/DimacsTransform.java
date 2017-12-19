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
public class DimacsTransform {
  private final static ArrayList<Object> featuresList = CollectionLiterals.<Object>newArrayList();
  
  private final static ArrayList<Object> clauses = CollectionLiterals.<Object>newArrayList();
  
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
    boolean _contains = DimacsTransform.featuresList.contains(name);
    boolean _not = (!_contains);
    if (_not) {
      _xifexpression = DimacsTransform.featuresList.add(name);
    }
    return _xifexpression;
  }
  
  public static int getFeatureID(final String name) {
    int _xifexpression = (int) 0;
    boolean _contains = DimacsTransform.featuresList.contains(name);
    if (_contains) {
      int _indexOf = DimacsTransform.featuresList.indexOf(name);
      _xifexpression = (_indexOf + 1);
    } else {
      throw new IllegalArgumentException(("Feature not found " + name));
    }
    return _xifexpression;
  }
  
  public static void addClauses(final Node n) {
    final int parent_id = DimacsTransform.getFeatureID(n.getName());
    final Consumer<Child> _function = (Child c1) -> {
      DimacsTransform.addFeature(c1.getName());
    };
    n.getChildren().forEach(_function);
    final ArrayList<Integer> c_list = CollectionLiterals.<Integer>newArrayList();
    String _open_relation = n.getOpen_relation();
    if (_open_relation != null) {
      switch (_open_relation) {
        case "and":
          final Consumer<Child> _function_1 = (Child c) -> {
            if ((c instanceof Node)) {
              DimacsTransform.addClauses(((Node)c));
            }
            final int c_id = DimacsTransform.getFeatureID(c.getName());
            boolean _isMandatory = c.isMandatory();
            if (_isMandatory) {
              String _plus = (Integer.valueOf(parent_id) + " -");
              String _plus_1 = (_plus + Integer.valueOf(c_id));
              String _plus_2 = (_plus_1 + " 0");
              DimacsTransform.clauses.add(_plus_2);
              String _plus_3 = (Integer.valueOf(c_id) + " -");
              String _plus_4 = (_plus_3 + Integer.valueOf(parent_id));
              String _plus_5 = (_plus_4 + " 0");
              DimacsTransform.clauses.add(_plus_5);
            } else {
              String _plus_6 = (Integer.valueOf(parent_id) + " -");
              String _plus_7 = (_plus_6 + Integer.valueOf(c_id));
              String _plus_8 = (_plus_7 + " 0");
              DimacsTransform.clauses.add(_plus_8);
            }
          };
          n.getChildren().forEach(_function_1);
          break;
        case "or":
          c_list.clear();
          final Consumer<Child> _function_2 = (Child c) -> {
            if ((c instanceof Node)) {
              DimacsTransform.addClauses(((Node)c));
            }
            final int c_id = DimacsTransform.getFeatureID(c.getName());
            String _plus = (Integer.valueOf(parent_id) + " -");
            String _plus_1 = (_plus + Integer.valueOf(c_id));
            String _plus_2 = (_plus_1 + " 0");
            DimacsTransform.clauses.add(_plus_2);
            c_list.add(Integer.valueOf(c_id));
          };
          n.getChildren().forEach(_function_2);
          String s = "";
          for (final int i : c_list) {
            String _s = s;
            String _plus = (Integer.valueOf(i) + " ");
            s = (_s + _plus);
          }
          String _s_1 = s;
          s = (_s_1 + (("-" + Integer.valueOf(parent_id)) + " 0"));
          DimacsTransform.clauses.add(s);
          break;
        case "alt":
          c_list.clear();
          final Consumer<Child> _function_3 = (Child c) -> {
            if ((c instanceof Node)) {
              DimacsTransform.addClauses(((Node)c));
            }
            final int c_id = DimacsTransform.getFeatureID(c.getName());
            String _plus_1 = (Integer.valueOf(parent_id) + " -");
            String _plus_2 = (_plus_1 + Integer.valueOf(c_id));
            String _plus_3 = (_plus_2 + " 0");
            DimacsTransform.clauses.add(_plus_3);
            c_list.add(Integer.valueOf(c_id));
          };
          n.getChildren().forEach(_function_3);
          String s_1 = "";
          for (final int i_1 : c_list) {
            String _s_2 = s_1;
            String _plus_1 = (Integer.valueOf(i_1) + " ");
            s_1 = (_s_2 + _plus_1);
          }
          String _s_3 = s_1;
          s_1 = (_s_3 + (("-" + Integer.valueOf(parent_id)) + " 0"));
          DimacsTransform.clauses.add(s_1);
          final Procedure2<Integer, Integer> _function_4 = (Integer element, Integer index) -> {
            c_list.set((index).intValue(), Integer.valueOf(((element).intValue() * (-1))));
          };
          IterableExtensions.<Integer>forEach(c_list, _function_4);
          for (int i_2 = 0; (i_2 < c_list.size()); i_2++) {
            for (int j = (i_2 + 1); (j < c_list.size()); j++) {
              Integer _get = c_list.get(i_2);
              String _plus_2 = (_get + " ");
              Integer _get_1 = c_list.get(j);
              String _plus_3 = (_plus_2 + _get_1);
              String _plus_4 = (_plus_3 + " 0");
              DimacsTransform.clauses.add(_plus_4);
            }
          }
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
        String _plus = (" -" + _name);
        String _plus_1 = (_plus + " 0");
        _xifexpression_1 = DimacsTransform.clauses.add(_plus_1);
      } else {
        String _name_1 = ((Var)rule).getName();
        String _plus_2 = (_name_1 + " 0");
        _xifexpression_1 = DimacsTransform.clauses.add(_plus_2);
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
                int _featureID = DimacsTransform.getFeatureID(((RuleElement)rule).getLeft_side().getName());
                String _plus_3 = ("-" + Integer.valueOf(_featureID));
                String _plus_4 = (_plus_3 + " -");
                int _featureID_1 = DimacsTransform.getFeatureID(((RuleElement)rule).getRight_side().getName());
                String _plus_5 = (_plus_4 + Integer.valueOf(_featureID_1));
                String _plus_6 = (_plus_5 + " 0");
                _xifexpression_3 = DimacsTransform.clauses.add(_plus_6);
              } else {
                int _featureID_2 = DimacsTransform.getFeatureID(((RuleElement)rule).getLeft_side().getName());
                String _plus_7 = ("-" + Integer.valueOf(_featureID_2));
                String _plus_8 = (_plus_7 + " ");
                int _featureID_3 = DimacsTransform.getFeatureID(((RuleElement)rule).getRight_side().getName());
                String _plus_9 = (_plus_8 + Integer.valueOf(_featureID_3));
                String _plus_10 = (_plus_9 + " 0");
                _xifexpression_3 = DimacsTransform.clauses.add(_plus_10);
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
  
  public static void main(final String[] args) {
    try {
      final FeatureModel fm = DimacsTransform.loadFeatureModel(URI.createURI("/home/said026/example.fm"));
      final Child root = fm.getDiagram().getRoot();
      if ((root == null)) {
        throw new IllegalArgumentException("The feature model must not be empty");
      }
      final PrintWriter pw = new PrintWriter("/home/said026/example.dimacs", "UTF-8");
      pw.println("c Output file");
      DimacsTransform.clauses.add("1 0");
      if ((root instanceof Node)) {
        final String name = ((Node)root).getName();
        DimacsTransform.addFeature(name);
        DimacsTransform.addClauses(((Node)root));
        final Consumer<Object> _function = (Object e) -> {
          InputOutput.<Object>println(e);
        };
        DimacsTransform.clauses.forEach(_function);
        InputOutput.<ArrayList<Object>>println(DimacsTransform.featuresList);
      }
      final Constraints constraints = fm.getConstraints();
      boolean _isEmpty = constraints.getRules().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Consumer<Rule> _function_1 = (Rule rule) -> {
          final Consumer<Formula> _function_2 = (Formula e) -> {
            DimacsTransform.addConstraints(e);
          };
          rule.getElements().forEach(_function_2);
        };
        constraints.getRules().forEach(_function_1);
      }
      final Procedure2<Object, Integer> _function_2 = (Object f, Integer i) -> {
        pw.println(((("c " + f) + " ") + Integer.valueOf(((i).intValue() + 1))));
      };
      IterableExtensions.<Object>forEach(DimacsTransform.featuresList, _function_2);
      int _size = DimacsTransform.featuresList.size();
      String _plus = ("p cnf " + Integer.valueOf(_size));
      String _plus_1 = (_plus + " ");
      int _size_1 = DimacsTransform.clauses.size();
      String _plus_2 = (_plus_1 + Integer.valueOf(_size_1));
      pw.println(_plus_2);
      final Consumer<Object> _function_3 = (Object c) -> {
        pw.println(c);
      };
      DimacsTransform.clauses.forEach(_function_3);
      pw.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
