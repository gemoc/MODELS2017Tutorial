/**
 */
package fsmTrace.States.fsm.impl;

import fsmTrace.States.StateMachine_currentState_Value;
import fsmTrace.States.StatesPackage;

import fsmTrace.States.fsm.FsmPackage;
import fsmTrace.States.fsm.TracedStateMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedStateMachineImpl extends TracedNamedElementImpl implements TracedStateMachine {
	/**
	 * The cached value of the '{@link #getCurrentStateSequence() <em>Current State Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStateSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine_currentState_Value> currentStateSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected StateMachine originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRACED_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine_currentState_Value> getCurrentStateSequence() {
		if (currentStateSequence == null) {
			currentStateSequence = new EObjectContainmentWithInverseEList<StateMachine_currentState_Value>(StateMachine_currentState_Value.class, this, FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE, StatesPackage.STATE_MACHINE_CURRENT_STATE_VALUE__PARENT);
		}
		return currentStateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (StateMachine)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(StateMachine newOriginalObject) {
		StateMachine oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentStateSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<?>)getCurrentStateSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return getCurrentStateSequence();
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				getCurrentStateSequence().addAll((Collection<? extends StateMachine_currentState_Value>)newValue);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((StateMachine)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				return;
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((StateMachine)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE:
				return currentStateSequence != null && !currentStateSequence.isEmpty();
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedStateMachineImpl
