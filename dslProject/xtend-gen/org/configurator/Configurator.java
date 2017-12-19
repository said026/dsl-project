package org.configurator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.FMStandaloneSetupGenerated;
import org.xtext.fM.Child;
import org.xtext.fM.FeatureModel;
import org.xtext.fM.Node;

@SuppressWarnings("all")
public class Configurator {
  private final static ArrayList<Object> selectedFeatures = CollectionLiterals.<Object>newArrayList();
  
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
  
  public static void processNode(final Node n) {
    final String parent = n.getName();
    boolean _isMandatory = n.isMandatory();
    boolean _not = (!_isMandatory);
    if (_not) {
      String _name = n.getName();
      String _plus = ("Include \"" + _name);
      String _plus_1 = (_plus + "\" ?");
      InputOutput.<String>println(_plus_1);
      InputOutput.<String>println("1. Yes");
      InputOutput.<String>println("2. No");
      final Scanner scanner = new Scanner(System.in);
      final String choice = scanner.nextLine();
      int _parseInt = Integer.parseInt(choice);
      boolean _equals = (_parseInt == 1);
      if (_equals) {
        Configurator.selectedFeatures.add(parent);
      } else {
        InputOutput.<String>println("");
        return;
      }
    } else {
      Configurator.selectedFeatures.add(parent);
    }
    String _open_relation = n.getOpen_relation();
    if (_open_relation != null) {
      switch (_open_relation) {
        case "and":
          final Consumer<Child> _function = (Child c) -> {
            if ((c instanceof Node)) {
              Configurator.processNode(((Node)c));
            } else {
              boolean _isMandatory_1 = c.isMandatory();
              boolean _not_1 = (!_isMandatory_1);
              if (_not_1) {
                String _name_1 = c.getName();
                String _plus_2 = ("Include \"" + _name_1);
                String _plus_3 = (_plus_2 + "\" ?");
                InputOutput.<String>println(_plus_3);
                InputOutput.<String>println("1. Yes");
                InputOutput.<String>println("2. No");
                final Scanner scanner_1 = new Scanner(System.in);
                final String choice_1 = scanner_1.nextLine();
                int _parseInt_1 = Integer.parseInt(choice_1);
                boolean _equals_1 = (_parseInt_1 == 1);
                if (_equals_1) {
                  Configurator.selectedFeatures.add(c.getName());
                } else {
                  InputOutput.<String>println("");
                  return;
                }
              }
            }
          };
          n.getChildren().forEach(_function);
          break;
        case "or":
          final Consumer<Child> _function_1 = (Child c) -> {
            if ((c instanceof Node)) {
              Configurator.processNode(((Node)c));
            } else {
              String _name_1 = c.getName();
              String _plus_2 = ("Include \"" + _name_1);
              String _plus_3 = (_plus_2 + "\" ?");
              InputOutput.<String>println(_plus_3);
              InputOutput.<String>println("1. Yes");
              InputOutput.<String>println("2. No");
              final Scanner scanner_1 = new Scanner(System.in);
              final String choice_1 = scanner_1.nextLine();
              int _parseInt_1 = Integer.parseInt(choice_1);
              boolean _equals_1 = (_parseInt_1 == 1);
              if (_equals_1) {
                Configurator.selectedFeatures.add(c.getName());
              } else {
                InputOutput.<String>println("");
                return;
              }
            }
          };
          n.getChildren().forEach(_function_1);
          break;
        case "alt":
          final ArrayList<Boolean> decided = CollectionLiterals.<Boolean>newArrayList(Boolean.valueOf(false));
          final Consumer<Child> _function_2 = (Child c) -> {
            if ((c instanceof Node)) {
              Configurator.processNode(((Node)c));
            } else {
              Boolean _get = decided.get(0);
              boolean _not_1 = (!(_get).booleanValue());
              if (_not_1) {
                String _name_1 = c.getName();
                String _plus_2 = ("Include \"" + _name_1);
                String _plus_3 = (_plus_2 + "\" ?");
                InputOutput.<String>println(_plus_3);
                InputOutput.<String>println("1. Yes");
                InputOutput.<String>println("2. No");
                final Scanner scanner_1 = new Scanner(System.in);
                final String choice_1 = scanner_1.nextLine();
                int _parseInt_1 = Integer.parseInt(choice_1);
                boolean _equals_1 = (_parseInt_1 == 1);
                if (_equals_1) {
                  Configurator.selectedFeatures.add(c.getName());
                  decided.set(0, Boolean.valueOf(true));
                  return;
                } else {
                  InputOutput.<String>println("");
                  return;
                }
              }
            }
          };
          n.getChildren().forEach(_function_2);
          break;
      }
    }
  }
  
  public static void main(final String[] args) {
    final FeatureModel fm = Configurator.loadFeatureModel(URI.createURI("/home/said026/example.fm"));
    final Child root = fm.getDiagram().getRoot();
    String _name = root.getName();
    String _plus = ("Welcome to the \"" + _name);
    String _plus_1 = (_plus + "\" configurator !");
    InputOutput.<String>println(_plus_1);
    InputOutput.<String>println("========================================================================");
    if ((root instanceof Node)) {
      Configurator.processNode(((Node)root));
    }
    InputOutput.<String>println("========================================================================");
    InputOutput.<String>println("Thank you ! Here is the set of selected features :");
    final Consumer<Object> _function = (Object f) -> {
      InputOutput.<String>println(("- " + f));
    };
    Configurator.selectedFeatures.forEach(_function);
  }
}
