/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ResearchTrack#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ResearchTrack#getResearchsession <em>Researchsession</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getResearchTrack()
 * @model
 * @generated
 */
public interface ResearchTrack extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getResearchTrack_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.ResearchTrack#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Researchsession</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.ResearchSession}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Researchsession</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getResearchTrack_Researchsession()
   * @model containment="true"
   * @generated
   */
  EList<ResearchSession> getResearchsession();

} // ResearchTrack