package commander;

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
import org.xtext.fM.Leaf;
import org.xtext.fM.Node;

@SuppressWarnings("all")
public class CommandLine {
  private final static ArrayList<Object> featuresList = CollectionLiterals.<Object>newArrayList();
  
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
  
  public static void addFeatures(final Node n) {
    final String parent = n.getName();
    CommandLine.featuresList.add(parent);
    final Consumer<Child> _function = (Child c) -> {
      if ((c instanceof Leaf)) {
        CommandLine.featuresList.add(((Leaf)c).getName());
      } else {
        CommandLine.addFeatures(((Node) c));
      }
    };
    n.getChildren().forEach(_function);
  }
  
  public static void main(final String[] args) {
    final FeatureModel fm = CommandLine.loadFeatureModel(URI.createURI("/home/said026/example.fm"));
    final Child root = fm.getDiagram().getRoot();
    if ((root == null)) {
      throw new IllegalArgumentException("The feature model must not be empty");
    }
    CommandLine.addFeatures(((Node) root));
    InputOutput.<String>println("Please give the list of features you want to be included in your configuration (comma separated) :");
    final Scanner scanner = new Scanner(System.in);
    final String params = scanner.nextLine();
    final String[] params_list = params.split(",");
  }
}
