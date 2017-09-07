/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Increase Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.IncreaseValueActionImpl#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncreaseValueActionImpl extends ActionImpl implements IncreaseValueAction {
	/**
	 * The default value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected int stepValue = STEP_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncreaseValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.INCREASE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepValue() {
		return stepValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepValue(int newStepValue) {
		int oldStepValue = stepValue;
		stepValue = newStepValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.INCREASE_VALUE_ACTION__STEP_VALUE, oldStepValue, stepValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.INCREASE_VALUE_ACTION__STEP_VALUE:
				return getStepValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.INCREASE_VALUE_ACTION__STEP_VALUE:
				setStepValue((Integer)newValue);
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
			case FsmPackage.INCREASE_VALUE_ACTION__STEP_VALUE:
				setStepValue(STEP_VALUE_EDEFAULT);
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
			case FsmPackage.INCREASE_VALUE_ACTION__STEP_VALUE:
				return stepValue != STEP_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stepValue: ");
		result.append(stepValue);
		result.append(')');
		return result.toString();
	}

} //IncreaseValueActionImpl
