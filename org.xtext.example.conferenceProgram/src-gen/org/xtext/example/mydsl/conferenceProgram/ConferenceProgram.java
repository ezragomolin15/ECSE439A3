/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getDate <em>Date</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getResearchtracks <em>Researchtracks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getIndustrytracks <em>Industrytracks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getDemosandposterstrack <em>Demosandposterstrack</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getPanelstrack <em>Panelstrack</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getSocialEvents <em>Social Events</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getKeynotes <em>Keynotes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getCoffebreaks <em>Coffebreaks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getLunches <em>Lunches</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram()
 * @model
 * @generated
 */
public interface ConferenceProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Researchtracks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Researchtracks</em>' containment reference.
   * @see #setResearchtracks(ResearchTrack)
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Researchtracks()
   * @model containment="true"
   * @generated
   */
  ResearchTrack getResearchtracks();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram#getResearchtracks <em>Researchtracks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Researchtracks</em>' containment reference.
   * @see #getResearchtracks()
   * @generated
   */
  void setResearchtracks(ResearchTrack value);

  /**
   * Returns the value of the '<em><b>Industrytracks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.IndustryTrack}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Industrytracks</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Industrytracks()
   * @model containment="true"
   * @generated
   */
  EList<IndustryTrack> getIndustrytracks();

  /**
   * Returns the value of the '<em><b>Demosandposterstrack</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.DemosAndPosterTrack}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Demosandposterstrack</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Demosandposterstrack()
   * @model containment="true"
   * @generated
   */
  EList<DemosAndPosterTrack> getDemosandposterstrack();

  /**
   * Returns the value of the '<em><b>Panelstrack</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.PanelTrack}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Panelstrack</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Panelstrack()
   * @model containment="true"
   * @generated
   */
  EList<PanelTrack> getPanelstrack();

  /**
   * Returns the value of the '<em><b>Social Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.SocialEvent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Social Events</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_SocialEvents()
   * @model containment="true"
   * @generated
   */
  EList<SocialEvent> getSocialEvents();

  /**
   * Returns the value of the '<em><b>Keynotes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.Keynote}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keynotes</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Keynotes()
   * @model containment="true"
   * @generated
   */
  EList<Keynote> getKeynotes();

  /**
   * Returns the value of the '<em><b>Coffebreaks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coffebreaks</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Coffebreaks()
   * @model containment="true"
   * @generated
   */
  EList<CoffeBreak> getCoffebreaks();

  /**
   * Returns the value of the '<em><b>Lunches</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.conferenceProgram.Lunch}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lunches</em>' containment reference list.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#getConferenceProgram_Lunches()
   * @model containment="true"
   * @generated
   */
  EList<Lunch> getLunches();

} // ConferenceProgram