/**
 */
package modelTrace.States.model.impl;

import java.util.Collection;

import modelTrace.States.FSM_consummedString_Value;
import modelTrace.States.FSM_currentState_Value;
import modelTrace.States.FSM_producedString_Value;
import modelTrace.States.FSM_underProcessTrigger_Value;
import modelTrace.States.StatesPackage;

import modelTrace.States.model.ModelPackage;
import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.models17.fsm.xfsm.model.FSM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.model.impl.TracedFSMImpl#getConsummedStringSequence <em>Consummed String Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.impl.TracedFSMImpl#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.impl.TracedFSMImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link modelTrace.States.model.impl.TracedFSMImpl#getProducedStringSequence <em>Produced String Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.impl.TracedFSMImpl#getUnderProcessTriggerSequence <em>Under Process Trigger Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedFSMImpl extends MinimalEObjectImpl.Container implements TracedFSM {
	/**
	 * The cached value of the '{@link #getConsummedStringSequence() <em>Consummed String Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedStringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_consummedString_Value> consummedStringSequence;

	/**
	 * The cached value of the '{@link #getCurrentStateSequence() <em>Current State Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStateSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_currentState_Value> currentStateSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected FSM originalObject;

	/**
	 * The cached value of the '{@link #getProducedStringSequence() <em>Produced String Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedStringSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_producedString_Value> producedStringSequence;

	/**
	 * The cached value of the '{@link #getUnderProcessTriggerSequence() <em>Under Process Trigger Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderProcessTriggerSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_underProcessTrigger_Value> underProcessTriggerSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRACED_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_consummedString_Value> getConsummedStringSequence() {
		if (consummedStringSequence == null) {
			consummedStringSequence = new EObjectContainmentWithInverseEList<FSM_consummedString_Value>(FSM_consummedString_Value.class, this, ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE, StatesPackage.FSM_CONSUMMED_STRING_VALUE__PARENT);
		}
		return consummedStringSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_currentState_Value> getCurrentStateSequence() {
		if (currentStateSequence == null) {
			currentStateSequence = new EObjectContainmentWithInverseEList<FSM_currentState_Value>(FSM_currentState_Value.class, this, ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE, StatesPackage.FSM_CURRENT_STATE_VALUE__PARENT);
		}
		return currentStateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (FSM)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRACED_FSM__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(FSM newOriginalObject) {
		FSM oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRACED_FSM__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_producedString_Value> getProducedStringSequence() {
		if (producedStringSequence == null) {
			producedStringSequence = new EObjectContainmentWithInverseEList<FSM_producedString_Value>(FSM_producedString_Value.class, this, ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE, StatesPackage.FSM_PRODUCED_STRING_VALUE__PARENT);
		}
		return producedStringSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_underProcessTrigger_Value> getUnderProcessTriggerSequence() {
		if (underProcessTriggerSequence == null) {
			underProcessTriggerSequence = new EObjectContainmentWithInverseEList<FSM_underProcessTrigger_Value>(FSM_underProcessTrigger_Value.class, this, ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT);
		}
		return underProcessTriggerSequence;
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsummedStringSequence()).basicAdd(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentStateSequence()).basicAdd(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedStringSequence()).basicAdd(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnderProcessTriggerSequence()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				return ((InternalEList<?>)getConsummedStringSequence()).basicRemove(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				return ((InternalEList<?>)getCurrentStateSequence()).basicRemove(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				return ((InternalEList<?>)getProducedStringSequence()).basicRemove(otherEnd, msgs);
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				return ((InternalEList<?>)getUnderProcessTriggerSequence()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				return getConsummedStringSequence();
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				return getCurrentStateSequence();
			case ModelPackage.TRACED_FSM__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				return getProducedStringSequence();
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				return getUnderProcessTriggerSequence();
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				getConsummedStringSequence().clear();
				getConsummedStringSequence().addAll((Collection<? extends FSM_consummedString_Value>)newValue);
				return;
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				getCurrentStateSequence().addAll((Collection<? extends FSM_currentState_Value>)newValue);
				return;
			case ModelPackage.TRACED_FSM__ORIGINAL_OBJECT:
				setOriginalObject((FSM)newValue);
				return;
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				getProducedStringSequence().clear();
				getProducedStringSequence().addAll((Collection<? extends FSM_producedString_Value>)newValue);
				return;
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				getUnderProcessTriggerSequence().clear();
				getUnderProcessTriggerSequence().addAll((Collection<? extends FSM_underProcessTrigger_Value>)newValue);
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				getConsummedStringSequence().clear();
				return;
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				getCurrentStateSequence().clear();
				return;
			case ModelPackage.TRACED_FSM__ORIGINAL_OBJECT:
				setOriginalObject((FSM)null);
				return;
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				getProducedStringSequence().clear();
				return;
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				getUnderProcessTriggerSequence().clear();
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
			case ModelPackage.TRACED_FSM__CONSUMMED_STRING_SEQUENCE:
				return consummedStringSequence != null && !consummedStringSequence.isEmpty();
			case ModelPackage.TRACED_FSM__CURRENT_STATE_SEQUENCE:
				return currentStateSequence != null && !currentStateSequence.isEmpty();
			case ModelPackage.TRACED_FSM__ORIGINAL_OBJECT:
				return originalObject != null;
			case ModelPackage.TRACED_FSM__PRODUCED_STRING_SEQUENCE:
				return producedStringSequence != null && !producedStringSequence.isEmpty();
			case ModelPackage.TRACED_FSM__UNDER_PROCESS_TRIGGER_SEQUENCE:
				return underProcessTriggerSequence != null && !underProcessTriggerSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedFSMImpl
