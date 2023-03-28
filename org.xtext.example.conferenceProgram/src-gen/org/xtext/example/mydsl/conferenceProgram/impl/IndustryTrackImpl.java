/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.conferenceProgram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.conferenceProgram.ConferenceProgramPackage;
import org.xtext.example.mydsl.conferenceProgram.IndustrySession;
import org.xtext.example.mydsl.conferenceProgram.IndustryTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Industry Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.impl.IndustryTrackImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.conferenceProgram.impl.IndustryTrackImpl#getIndutrysession <em>Indutrysession</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndustryTrackImpl extends MinimalEObjectImpl.Container implements IndustryTrack
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndutrysession() <em>Indutrysession</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndutrysession()
   * @generated
   * @ordered
   */
  protected EList<IndustrySession> indutrysession;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndustryTrackImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ConferenceProgramPackage.Literals.INDUSTRY_TRACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConferenceProgramPackage.INDUSTRY_TRACK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IndustrySession> getIndutrysession()
  {
    if (indutrysession == null)
    {
      indutrysession = new EObjectContainmentEList<IndustrySession>(IndustrySession.class, this, ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION);
    }
    return indutrysession;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION:
        return ((InternalEList<?>)getIndutrysession()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ConferenceProgramPackage.INDUSTRY_TRACK__NAME:
        return getName();
      case ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION:
        return getIndutrysession();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConferenceProgramPackage.INDUSTRY_TRACK__NAME:
        setName((String)newValue);
        return;
      case ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION:
        getIndutrysession().clear();
        getIndutrysession().addAll((Collection<? extends IndustrySession>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ConferenceProgramPackage.INDUSTRY_TRACK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION:
        getIndutrysession().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ConferenceProgramPackage.INDUSTRY_TRACK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConferenceProgramPackage.INDUSTRY_TRACK__INDUTRYSESSION:
        return indutrysession != null && !indutrysession.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IndustryTrackImpl