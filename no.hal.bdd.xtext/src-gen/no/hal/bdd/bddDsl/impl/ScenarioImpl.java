/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl.impl;

import no.hal.bdd.bddDsl.BddDslPackage;
import no.hal.bdd.bddDsl.Scenario;
import no.hal.bdd.bddDsl.ScenarioAction;
import no.hal.bdd.bddDsl.ScenarioState;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ScenarioImpl#getPreState <em>Pre State</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ScenarioImpl#getAction <em>Action</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ScenarioImpl#getPostState <em>Post State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
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
   * The cached value of the '{@link #getPreState() <em>Pre State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreState()
   * @generated
   * @ordered
   */
  protected ScenarioState preState;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ScenarioAction action;

  /**
   * The cached value of the '{@link #getPostState() <em>Post State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostState()
   * @generated
   * @ordered
   */
  protected ScenarioState postState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return BddDslPackage.Literals.SCENARIO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioState getPreState()
  {
    return preState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreState(ScenarioState newPreState, NotificationChain msgs)
  {
    ScenarioState oldPreState = preState;
    preState = newPreState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE, oldPreState, newPreState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreState(ScenarioState newPreState)
  {
    if (newPreState != preState)
    {
      NotificationChain msgs = null;
      if (preState != null)
        msgs = ((InternalEObject)preState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE, null, msgs);
      if (newPreState != null)
        msgs = ((InternalEObject)newPreState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE, null, msgs);
      msgs = basicSetPreState(newPreState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE, newPreState, newPreState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioAction getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ScenarioAction newAction, NotificationChain msgs)
  {
    ScenarioAction oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(ScenarioAction newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioState getPostState()
  {
    return postState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostState(ScenarioState newPostState, NotificationChain msgs)
  {
    ScenarioState oldPostState = postState;
    postState = newPostState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__POST_STATE, oldPostState, newPostState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPostState(ScenarioState newPostState)
  {
    if (newPostState != postState)
    {
      NotificationChain msgs = null;
      if (postState != null)
        msgs = ((InternalEObject)postState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__POST_STATE, null, msgs);
      if (newPostState != null)
        msgs = ((InternalEObject)newPostState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__POST_STATE, null, msgs);
      msgs = basicSetPostState(newPostState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__POST_STATE, newPostState, newPostState));
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
      case BddDslPackage.SCENARIO__PRE_STATE:
        return basicSetPreState(null, msgs);
      case BddDslPackage.SCENARIO__ACTION:
        return basicSetAction(null, msgs);
      case BddDslPackage.SCENARIO__POST_STATE:
        return basicSetPostState(null, msgs);
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
      case BddDslPackage.SCENARIO__NAME:
        return getName();
      case BddDslPackage.SCENARIO__PRE_STATE:
        return getPreState();
      case BddDslPackage.SCENARIO__ACTION:
        return getAction();
      case BddDslPackage.SCENARIO__POST_STATE:
        return getPostState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.SCENARIO__NAME:
        setName((String)newValue);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE:
        setPreState((ScenarioState)newValue);
        return;
      case BddDslPackage.SCENARIO__ACTION:
        setAction((ScenarioAction)newValue);
        return;
      case BddDslPackage.SCENARIO__POST_STATE:
        setPostState((ScenarioState)newValue);
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
      case BddDslPackage.SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE:
        setPreState((ScenarioState)null);
        return;
      case BddDslPackage.SCENARIO__ACTION:
        setAction((ScenarioAction)null);
        return;
      case BddDslPackage.SCENARIO__POST_STATE:
        setPostState((ScenarioState)null);
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
      case BddDslPackage.SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BddDslPackage.SCENARIO__PRE_STATE:
        return preState != null;
      case BddDslPackage.SCENARIO__ACTION:
        return action != null;
      case BddDslPackage.SCENARIO__POST_STATE:
        return postState != null;
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

} //ScenarioImpl
