/**
 * generated by Xtext 2.12.0
 */
package org.xtext.fM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.fM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FMFactoryImpl extends EFactoryImpl implements FMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FMFactory init()
  {
    try
    {
      FMFactory theFMFactory = (FMFactory)EPackage.Registry.INSTANCE.getEFactory(FMPackage.eNS_URI);
      if (theFMFactory != null)
      {
        return theFMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FMPackage.FEATURE_MODEL: return createFeatureModel();
      case FMPackage.FEATURE_DIAGRAM: return createFeatureDiagram();
      case FMPackage.CHILD: return createChild();
      case FMPackage.LEAF: return createLeaf();
      case FMPackage.NODE: return createNode();
      case FMPackage.CONSTRAINTS: return createConstraints();
      case FMPackage.RULE: return createRule();
      case FMPackage.RULE_ELEMENT: return createRuleElement();
      case FMPackage.FORMULA: return createFormula();
      case FMPackage.VAR: return createVar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureModel createFeatureModel()
  {
    FeatureModelImpl featureModel = new FeatureModelImpl();
    return featureModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDiagram createFeatureDiagram()
  {
    FeatureDiagramImpl featureDiagram = new FeatureDiagramImpl();
    return featureDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Child createChild()
  {
    ChildImpl child = new ChildImpl();
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leaf createLeaf()
  {
    LeafImpl leaf = new LeafImpl();
    return leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraints createConstraints()
  {
    ConstraintsImpl constraints = new ConstraintsImpl();
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleElement createRuleElement()
  {
    RuleElementImpl ruleElement = new RuleElementImpl();
    return ruleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formula createFormula()
  {
    FormulaImpl formula = new FormulaImpl();
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMPackage getFMPackage()
  {
    return (FMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FMPackage getPackage()
  {
    return FMPackage.eINSTANCE;
  }

} //FMFactoryImpl
