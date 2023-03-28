/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.conferenceProgram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceProgramFactoryImpl extends EFactoryImpl implements ConferenceProgramFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConferenceProgramFactory init()
  {
    try
    {
      ConferenceProgramFactory theConferenceProgramFactory = (ConferenceProgramFactory)EPackage.Registry.INSTANCE.getEFactory(ConferenceProgramPackage.eNS_URI);
      if (theConferenceProgramFactory != null)
      {
        return theConferenceProgramFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConferenceProgramFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConferenceProgramFactoryImpl()
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
      case ConferenceProgramPackage.CONFERENCE_PROGRAM: return createConferenceProgram();
      case ConferenceProgramPackage.TRACK: return createTrack();
      case ConferenceProgramPackage.SESSION: return createSession();
      case ConferenceProgramPackage.RESEARCH_PAPER: return createResearchPaper();
      case ConferenceProgramPackage.INDUSTRY_PAPER: return createIndustryPaper();
      case ConferenceProgramPackage.DEMO_AND_POSTER: return createDemoAndPoster();
      case ConferenceProgramPackage.PANEL: return createPanel();
      case ConferenceProgramPackage.LOCATION: return createLocation();
      case ConferenceProgramPackage.ROOM: return createRoom();
      case ConferenceProgramPackage.KEYNOTE: return createKeynote();
      case ConferenceProgramPackage.COFFE_BREAK: return createCoffeBreak();
      case ConferenceProgramPackage.LUNCH: return createLunch();
      case ConferenceProgramPackage.SOCIAL_EVENT: return createSocialEvent();
      case ConferenceProgramPackage.GOOGLE_MAPS_DIRECTIONS: return createGoogleMapsDirections();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConferenceProgram createConferenceProgram()
  {
    ConferenceProgramImpl conferenceProgram = new ConferenceProgramImpl();
    return conferenceProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Track createTrack()
  {
    TrackImpl track = new TrackImpl();
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Session createSession()
  {
    SessionImpl session = new SessionImpl();
    return session;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResearchPaper createResearchPaper()
  {
    ResearchPaperImpl researchPaper = new ResearchPaperImpl();
    return researchPaper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndustryPaper createIndustryPaper()
  {
    IndustryPaperImpl industryPaper = new IndustryPaperImpl();
    return industryPaper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DemoAndPoster createDemoAndPoster()
  {
    DemoAndPosterImpl demoAndPoster = new DemoAndPosterImpl();
    return demoAndPoster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Panel createPanel()
  {
    PanelImpl panel = new PanelImpl();
    return panel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Room createRoom()
  {
    RoomImpl room = new RoomImpl();
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Keynote createKeynote()
  {
    KeynoteImpl keynote = new KeynoteImpl();
    return keynote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CoffeBreak createCoffeBreak()
  {
    CoffeBreakImpl coffeBreak = new CoffeBreakImpl();
    return coffeBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lunch createLunch()
  {
    LunchImpl lunch = new LunchImpl();
    return lunch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SocialEvent createSocialEvent()
  {
    SocialEventImpl socialEvent = new SocialEventImpl();
    return socialEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GoogleMapsDirections createGoogleMapsDirections()
  {
    GoogleMapsDirectionsImpl googleMapsDirections = new GoogleMapsDirectionsImpl();
    return googleMapsDirections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConferenceProgramPackage getConferenceProgramPackage()
  {
    return (ConferenceProgramPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConferenceProgramPackage getPackage()
  {
    return ConferenceProgramPackage.eINSTANCE;
  }

} //ConferenceProgramFactoryImpl
