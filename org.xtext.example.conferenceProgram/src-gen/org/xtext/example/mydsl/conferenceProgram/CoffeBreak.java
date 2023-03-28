/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffe Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getCoffeBreak()
 * @model
 * @generated
 */
public interface CoffeBreak extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getCoffeBreak_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Time</em>' attribute.
   * @see #setStartTime(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getCoffeBreak_StartTime()
   * @model
   * @generated
   */
  String getStartTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getStartTime <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Time</em>' attribute.
   * @see #getStartTime()
   * @generated
   */
  void setStartTime(String value);

  /**
   * Returns the value of the '<em><b>End Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Time</em>' attribute.
   * @see #setEndTime(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getCoffeBreak_EndTime()
   * @model
   * @generated
   */
  String getEndTime();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak#getEndTime <em>End Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Time</em>' attribute.
   * @see #getEndTime()
   * @generated
   */
  void setEndTime(String value);

} // CoffeBreak
