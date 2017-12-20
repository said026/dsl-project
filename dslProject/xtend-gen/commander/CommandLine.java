package commander;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.transform.MiniZincTransform;
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
    try {
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
      MiniZincTransform.doTransform("/home/said026/example.fm", "/home/said026/example.mzn");
      try {
        FileWriter _fileWriter = new FileWriter("/home/said026/example.mzn", true);
        BufferedWriter _bufferedWriter = new BufferedWriter(_fileWriter);
        final PrintWriter out = new PrintWriter(_bufferedWriter);
        final Consumer<String> _function = (String p) -> {
          out.println((("constraint " + p) + ";"));
        };
        ((List<String>)Conversions.doWrapArray(params_list)).forEach(_function);
        out.close();
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          InputOutput.<String>println("File I/O error occurred");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      final StringBuffer output = new StringBuffer();
      final Set<String> command = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("/bin/bash", "-c", "minizinc", "/home/said026/example.mzn"));
      final Process p = Runtime.getRuntime().exec(((String[])Conversions.unwrapArray(command, String.class)));
      p.waitFor();
      InputStream _inputStream = p.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      final BufferedReader reader = new BufferedReader(_inputStreamReader);
      String line = "";
      while (((line = reader.readLine()) != null)) {
        output.append((line + "\n"));
      }
      int _indexOf = output.indexOf("UNSATISFIABLE");
      boolean _tripleNotEquals = (_indexOf != (-1));
      if (_tripleNotEquals) {
        InputOutput.<String>println("The selected configuration is not valid !");
      } else {
        InputOutput.<String>println("The selected configuration is valid !");
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
