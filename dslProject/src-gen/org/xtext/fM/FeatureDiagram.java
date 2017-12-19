/**
 * generated by Xtext 2.12.0
 */
package org.xtext.fM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fM.FeatureDiagram#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.xtext.fM.FMPackage#getFeatureDiagram()
 * @model
 * @generated
 */
public interface FeatureDiagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(Child)
   * @see org.xtext.fM.FMPackage#getFeatureDiagram_Root()
   * @model containment="true"
   * @generated
   */
  Child getRoot();

  /**
   * Sets the value of the '{@link org.xtext.fM.FeatureDiagram#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(Child value);

} // FeatureDiagram
