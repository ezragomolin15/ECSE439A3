/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.conferenceProgram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage
 * @generated
 */
public class ConferenceProgramAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ConferenceProgramPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConferenceProgramAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ConferenceProgramPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConferenceProgramSwitch<Adapter> modelSwitch =
    new ConferenceProgramSwitch<Adapter>()
    {
      @Override
      public Adapter caseConferenceProgram(ConferenceProgram object)
      {
        return createConferenceProgramAdapter();
      }
      @Override
      public Adapter caseResearchTrack(ResearchTrack object)
      {
        return createResearchTrackAdapter();
      }
      @Override
      public Adapter caseIndustryTrack(IndustryTrack object)
      {
        return createIndustryTrackAdapter();
      }
      @Override
      public Adapter caseDemosAndPosterTrack(DemosAndPosterTrack object)
      {
        return createDemosAndPosterTrackAdapter();
      }
      @Override
      public Adapter casePanelTrack(PanelTrack object)
      {
        return createPanelTrackAdapter();
      }
      @Override
      public Adapter caseResearchSession(ResearchSession object)
      {
        return createResearchSessionAdapter();
      }
      @Override
      public Adapter caseIndustrySession(IndustrySession object)
      {
        return createIndustrySessionAdapter();
      }
      @Override
      public Adapter caseDemoSession(DemoSession object)
      {
        return createDemoSessionAdapter();
      }
      @Override
      public Adapter casePanelSession(PanelSession object)
      {
        return createPanelSessionAdapter();
      }
      @Override
      public Adapter caseResearchPaper(ResearchPaper object)
      {
        return createResearchPaperAdapter();
      }
      @Override
      public Adapter caseIndustryPaper(IndustryPaper object)
      {
        return createIndustryPaperAdapter();
      }
      @Override
      public Adapter caseDemoAndPoster(DemoAndPoster object)
      {
        return createDemoAndPosterAdapter();
      }
      @Override
      public Adapter casePanel(Panel object)
      {
        return createPanelAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseRoom(Room object)
      {
        return createRoomAdapter();
      }
      @Override
      public Adapter caseKeynote(Keynote object)
      {
        return createKeynoteAdapter();
      }
      @Override
      public Adapter caseCoffeBreak(CoffeBreak object)
      {
        return createCoffeBreakAdapter();
      }
      @Override
      public Adapter caseLunch(Lunch object)
      {
        return createLunchAdapter();
      }
      @Override
      public Adapter caseSocialEvent(SocialEvent object)
      {
        return createSocialEventAdapter();
      }
      @Override
      public Adapter caseGoogleMapsDirections(GoogleMapsDirections object)
      {
        return createGoogleMapsDirectionsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.ConferenceProgram <em>Conference Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.ConferenceProgram
   * @generated
   */
  public Adapter createConferenceProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.ResearchTrack <em>Research Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.ResearchTrack
   * @generated
   */
  public Adapter createResearchTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.IndustryTrack <em>Industry Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.IndustryTrack
   * @generated
   */
  public Adapter createIndustryTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.DemosAndPosterTrack <em>Demos And Poster Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.DemosAndPosterTrack
   * @generated
   */
  public Adapter createDemosAndPosterTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.PanelTrack <em>Panel Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.PanelTrack
   * @generated
   */
  public Adapter createPanelTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.ResearchSession <em>Research Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.ResearchSession
   * @generated
   */
  public Adapter createResearchSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.IndustrySession <em>Industry Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.IndustrySession
   * @generated
   */
  public Adapter createIndustrySessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.DemoSession <em>Demo Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.DemoSession
   * @generated
   */
  public Adapter createDemoSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.PanelSession <em>Panel Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.PanelSession
   * @generated
   */
  public Adapter createPanelSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.ResearchPaper <em>Research Paper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.ResearchPaper
   * @generated
   */
  public Adapter createResearchPaperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.IndustryPaper <em>Industry Paper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.IndustryPaper
   * @generated
   */
  public Adapter createIndustryPaperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.DemoAndPoster <em>Demo And Poster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.DemoAndPoster
   * @generated
   */
  public Adapter createDemoAndPosterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.Panel <em>Panel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.Panel
   * @generated
   */
  public Adapter createPanelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.Room <em>Room</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.Room
   * @generated
   */
  public Adapter createRoomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.Keynote <em>Keynote</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.Keynote
   * @generated
   */
  public Adapter createKeynoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.CoffeBreak <em>Coffe Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.CoffeBreak
   * @generated
   */
  public Adapter createCoffeBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.Lunch <em>Lunch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.Lunch
   * @generated
   */
  public Adapter createLunchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.SocialEvent <em>Social Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.SocialEvent
   * @generated
   */
  public Adapter createSocialEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.conferenceProgram.GoogleMapsDirections <em>Google Maps Directions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.conferenceProgram.GoogleMapsDirections
   * @generated
   */
  public Adapter createGoogleMapsDirectionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ConferenceProgramAdapterFactory
