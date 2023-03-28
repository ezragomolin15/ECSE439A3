/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.conferenceProgram.CoffeBreak;
import org.xtext.example.mydsl.conferenceProgram.ConferenceProgram;
import org.xtext.example.mydsl.conferenceProgram.ConferenceProgramFactory;
import org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage;
import org.xtext.example.mydsl.conferenceProgram.DemoAndPoster;
import org.xtext.example.mydsl.conferenceProgram.GoogleMapsDirections;
import org.xtext.example.mydsl.conferenceProgram.IndustryPaper;
import org.xtext.example.mydsl.conferenceProgram.Keynote;
import org.xtext.example.mydsl.conferenceProgram.Location;
import org.xtext.example.mydsl.conferenceProgram.Lunch;
import org.xtext.example.mydsl.conferenceProgram.Panel;
import org.xtext.example.mydsl.conferenceProgram.ResearchPaper;
import org.xtext.example.mydsl.conferenceProgram.Room;
import org.xtext.example.mydsl.conferenceProgram.Session;
import org.xtext.example.mydsl.conferenceProgram.SocialEvent;
import org.xtext.example.mydsl.conferenceProgram.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceProgramPackageImpl extends EPackageImpl implements ConferenceProgramPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conferenceProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trackEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sessionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass researchPaperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass industryPaperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass demoAndPosterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass panelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keynoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coffeBreakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lunchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass socialEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass googleMapsDirectionsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ConferenceProgramPackageImpl()
  {
    super(eNS_URI, ConferenceProgramFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ConferenceProgramPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ConferenceProgramPackage init()
  {
    if (isInited) return (ConferenceProgramPackage)EPackage.Registry.INSTANCE.getEPackage(ConferenceProgramPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredConferenceProgramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ConferenceProgramPackageImpl theConferenceProgramPackage = registeredConferenceProgramPackage instanceof ConferenceProgramPackageImpl ? (ConferenceProgramPackageImpl)registeredConferenceProgramPackage : new ConferenceProgramPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theConferenceProgramPackage.createPackageContents();

    // Initialize created meta-data
    theConferenceProgramPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theConferenceProgramPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ConferenceProgramPackage.eNS_URI, theConferenceProgramPackage);
    return theConferenceProgramPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConferenceProgram()
  {
    return conferenceProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConferenceProgram_Name()
  {
    return (EAttribute)conferenceProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConferenceProgram_Date()
  {
    return (EAttribute)conferenceProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConferenceProgram_Tracks()
  {
    return (EReference)conferenceProgramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConferenceProgram_SocialEvents()
  {
    return (EReference)conferenceProgramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConferenceProgram_Keynotes()
  {
    return (EReference)conferenceProgramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConferenceProgram_Coffebreaks()
  {
    return (EReference)conferenceProgramEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConferenceProgram_Lunches()
  {
    return (EReference)conferenceProgramEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTrack()
  {
    return trackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTrack_Name()
  {
    return (EAttribute)trackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTrack_Session()
  {
    return (EReference)trackEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSession()
  {
    return sessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSession_Name()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSession_Researchpaper()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSession_Industrypaper()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSession_Demoandposter()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSession_Panel()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSession_Location()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSession_StartTime()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSession_EndTime()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResearchPaper()
  {
    return researchPaperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getResearchPaper_Name()
  {
    return (EAttribute)researchPaperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIndustryPaper()
  {
    return industryPaperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIndustryPaper_Name()
  {
    return (EAttribute)industryPaperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDemoAndPoster()
  {
    return demoAndPosterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDemoAndPoster_Name()
  {
    return (EAttribute)demoAndPosterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPanel()
  {
    return panelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPanel_Name()
  {
    return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLocation()
  {
    return locationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLocation_Room()
  {
    return (EReference)locationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoom()
  {
    return roomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRoom_Name()
  {
    return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getKeynote()
  {
    return keynoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getKeynote_Name()
  {
    return (EAttribute)keynoteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getKeynote_StartTime()
  {
    return (EAttribute)keynoteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getKeynote_EndTime()
  {
    return (EAttribute)keynoteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCoffeBreak()
  {
    return coffeBreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoffeBreak_Name()
  {
    return (EAttribute)coffeBreakEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoffeBreak_StartTime()
  {
    return (EAttribute)coffeBreakEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCoffeBreak_EndTime()
  {
    return (EAttribute)coffeBreakEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLunch()
  {
    return lunchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLunch_Name()
  {
    return (EAttribute)lunchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLunch_StartTime()
  {
    return (EAttribute)lunchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLunch_EndTime()
  {
    return (EAttribute)lunchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSocialEvent()
  {
    return socialEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSocialEvent_Name()
  {
    return (EAttribute)socialEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSocialEvent_Location()
  {
    return (EReference)socialEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSocialEvent_StartTime()
  {
    return (EAttribute)socialEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSocialEvent_EndTime()
  {
    return (EAttribute)socialEventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSocialEvent_Directions()
  {
    return (EReference)socialEventEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGoogleMapsDirections()
  {
    return googleMapsDirectionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGoogleMapsDirections_Url()
  {
    return (EAttribute)googleMapsDirectionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConferenceProgramFactory getConferenceProgramFactory()
  {
    return (ConferenceProgramFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    conferenceProgramEClass = createEClass(CONFERENCE_PROGRAM);
    createEAttribute(conferenceProgramEClass, CONFERENCE_PROGRAM__NAME);
    createEAttribute(conferenceProgramEClass, CONFERENCE_PROGRAM__DATE);
    createEReference(conferenceProgramEClass, CONFERENCE_PROGRAM__TRACKS);
    createEReference(conferenceProgramEClass, CONFERENCE_PROGRAM__SOCIAL_EVENTS);
    createEReference(conferenceProgramEClass, CONFERENCE_PROGRAM__KEYNOTES);
    createEReference(conferenceProgramEClass, CONFERENCE_PROGRAM__COFFEBREAKS);
    createEReference(conferenceProgramEClass, CONFERENCE_PROGRAM__LUNCHES);

    trackEClass = createEClass(TRACK);
    createEAttribute(trackEClass, TRACK__NAME);
    createEReference(trackEClass, TRACK__SESSION);

    sessionEClass = createEClass(SESSION);
    createEAttribute(sessionEClass, SESSION__NAME);
    createEReference(sessionEClass, SESSION__RESEARCHPAPER);
    createEReference(sessionEClass, SESSION__INDUSTRYPAPER);
    createEReference(sessionEClass, SESSION__DEMOANDPOSTER);
    createEReference(sessionEClass, SESSION__PANEL);
    createEReference(sessionEClass, SESSION__LOCATION);
    createEAttribute(sessionEClass, SESSION__START_TIME);
    createEAttribute(sessionEClass, SESSION__END_TIME);

    researchPaperEClass = createEClass(RESEARCH_PAPER);
    createEAttribute(researchPaperEClass, RESEARCH_PAPER__NAME);

    industryPaperEClass = createEClass(INDUSTRY_PAPER);
    createEAttribute(industryPaperEClass, INDUSTRY_PAPER__NAME);

    demoAndPosterEClass = createEClass(DEMO_AND_POSTER);
    createEAttribute(demoAndPosterEClass, DEMO_AND_POSTER__NAME);

    panelEClass = createEClass(PANEL);
    createEAttribute(panelEClass, PANEL__NAME);

    locationEClass = createEClass(LOCATION);
    createEReference(locationEClass, LOCATION__ROOM);

    roomEClass = createEClass(ROOM);
    createEAttribute(roomEClass, ROOM__NAME);

    keynoteEClass = createEClass(KEYNOTE);
    createEAttribute(keynoteEClass, KEYNOTE__NAME);
    createEAttribute(keynoteEClass, KEYNOTE__START_TIME);
    createEAttribute(keynoteEClass, KEYNOTE__END_TIME);

    coffeBreakEClass = createEClass(COFFE_BREAK);
    createEAttribute(coffeBreakEClass, COFFE_BREAK__NAME);
    createEAttribute(coffeBreakEClass, COFFE_BREAK__START_TIME);
    createEAttribute(coffeBreakEClass, COFFE_BREAK__END_TIME);

    lunchEClass = createEClass(LUNCH);
    createEAttribute(lunchEClass, LUNCH__NAME);
    createEAttribute(lunchEClass, LUNCH__START_TIME);
    createEAttribute(lunchEClass, LUNCH__END_TIME);

    socialEventEClass = createEClass(SOCIAL_EVENT);
    createEAttribute(socialEventEClass, SOCIAL_EVENT__NAME);
    createEReference(socialEventEClass, SOCIAL_EVENT__LOCATION);
    createEAttribute(socialEventEClass, SOCIAL_EVENT__START_TIME);
    createEAttribute(socialEventEClass, SOCIAL_EVENT__END_TIME);
    createEReference(socialEventEClass, SOCIAL_EVENT__DIRECTIONS);

    googleMapsDirectionsEClass = createEClass(GOOGLE_MAPS_DIRECTIONS);
    createEAttribute(googleMapsDirectionsEClass, GOOGLE_MAPS_DIRECTIONS__URL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(conferenceProgramEClass, ConferenceProgram.class, "ConferenceProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConferenceProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConferenceProgram_Date(), ecorePackage.getEString(), "date", null, 0, 1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConferenceProgram_Tracks(), this.getTrack(), null, "tracks", null, 0, -1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConferenceProgram_SocialEvents(), this.getSocialEvent(), null, "socialEvents", null, 0, -1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConferenceProgram_Keynotes(), this.getKeynote(), null, "keynotes", null, 0, -1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConferenceProgram_Coffebreaks(), this.getCoffeBreak(), null, "coffebreaks", null, 0, -1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConferenceProgram_Lunches(), this.getLunch(), null, "lunches", null, 0, -1, ConferenceProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrack_Session(), this.getSession(), null, "session", null, 0, -1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSession_Name(), ecorePackage.getEString(), "name", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Researchpaper(), this.getResearchPaper(), null, "researchpaper", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Industrypaper(), this.getIndustryPaper(), null, "industrypaper", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Demoandposter(), this.getDemoAndPoster(), null, "demoandposter", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Panel(), this.getPanel(), null, "panel", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Location(), this.getLocation(), null, "location", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSession_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSession_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(researchPaperEClass, ResearchPaper.class, "ResearchPaper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResearchPaper_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResearchPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(industryPaperEClass, IndustryPaper.class, "IndustryPaper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndustryPaper_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndustryPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(demoAndPosterEClass, DemoAndPoster.class, "DemoAndPoster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDemoAndPoster_Name(), ecorePackage.getEString(), "name", null, 0, 1, DemoAndPoster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocation_Room(), this.getRoom(), null, "room", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keynoteEClass, Keynote.class, "Keynote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeynote_Name(), ecorePackage.getEString(), "name", null, 0, 1, Keynote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeynote_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, Keynote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeynote_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, Keynote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coffeBreakEClass, CoffeBreak.class, "CoffeBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoffeBreak_Name(), ecorePackage.getEString(), "name", null, 0, 1, CoffeBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoffeBreak_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, CoffeBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoffeBreak_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, CoffeBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lunchEClass, Lunch.class, "Lunch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLunch_Name(), ecorePackage.getEString(), "name", null, 0, 1, Lunch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLunch_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, Lunch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLunch_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, Lunch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(socialEventEClass, SocialEvent.class, "SocialEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSocialEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, SocialEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialEvent_Location(), this.getLocation(), null, "location", null, 0, 1, SocialEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSocialEvent_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, SocialEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSocialEvent_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, SocialEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSocialEvent_Directions(), this.getGoogleMapsDirections(), null, "directions", null, 0, 1, SocialEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(googleMapsDirectionsEClass, GoogleMapsDirections.class, "GoogleMapsDirections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoogleMapsDirections_Url(), ecorePackage.getEString(), "url", null, 0, 1, GoogleMapsDirections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ConferenceProgramPackageImpl
