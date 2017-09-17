/**
 */
package org.gemoc.models17.fsm.xfsm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsm.model.ModelPackage;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsm.model.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getInputBuffer <em>Input Buffer</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getOutputBuffer <em>Output Buffer</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getUnderProcessTrigger <em>Under Process Trigger</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsm.model.impl.FSMImpl#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends EObjectImpl implements FSM {
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
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * The cached value of the '{@link #getInputBuffer() <em>Input Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBuffer()
	 * @generated
	 * @ordered
	 */
	protected Buffer inputBuffer;

	/**
	 * The cached value of the '{@link #getOutputBuffer() <em>Output Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBuffer()
	 * @generated
	 * @ordered
	 */
	protected Buffer outputBuffer;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The default value of the '{@link #getUnderProcessTrigger() <em>Under Process Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderProcessTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String UNDER_PROCESS_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderProcessTrigger() <em>Under Process Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderProcessTrigger()
	 * @generated
	 * @ordered
	 */
	protected String underProcessTrigger = UNDER_PROCESS_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMMED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected String consummedString = CONSUMMED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected String producedString = PRODUCED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this, ModelPackage.FSM__OWNED_STATES, ModelPackage.STATE__FSM);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, ModelPackage.FSM__OWNED_TRANSITIONS, ModelPackage.TRANSITION__FSM);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer getInputBuffer() {
		if (inputBuffer != null && inputBuffer.eIsProxy()) {
			InternalEObject oldInputBuffer = (InternalEObject)inputBuffer;
			inputBuffer = (Buffer)eResolveProxy(oldInputBuffer);
			if (inputBuffer != oldInputBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FSM__INPUT_BUFFER, oldInputBuffer, inputBuffer));
			}
		}
		return inputBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer basicGetInputBuffer() {
		return inputBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputBuffer(Buffer newInputBuffer, NotificationChain msgs) {
		Buffer oldInputBuffer = inputBuffer;
		inputBuffer = newInputBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__INPUT_BUFFER, oldInputBuffer, newInputBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputBuffer(Buffer newInputBuffer) {
		if (newInputBuffer != inputBuffer) {
			NotificationChain msgs = null;
			if (inputBuffer != null)
				msgs = ((InternalEObject)inputBuffer).eInverseRemove(this, ModelPackage.BUFFER__OUTGOING_FSM, Buffer.class, msgs);
			if (newInputBuffer != null)
				msgs = ((InternalEObject)newInputBuffer).eInverseAdd(this, ModelPackage.BUFFER__OUTGOING_FSM, Buffer.class, msgs);
			msgs = basicSetInputBuffer(newInputBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__INPUT_BUFFER, newInputBuffer, newInputBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer getOutputBuffer() {
		if (outputBuffer != null && outputBuffer.eIsProxy()) {
			InternalEObject oldOutputBuffer = (InternalEObject)outputBuffer;
			outputBuffer = (Buffer)eResolveProxy(oldOutputBuffer);
			if (outputBuffer != oldOutputBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FSM__OUTPUT_BUFFER, oldOutputBuffer, outputBuffer));
			}
		}
		return outputBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer basicGetOutputBuffer() {
		return outputBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputBuffer(Buffer newOutputBuffer, NotificationChain msgs) {
		Buffer oldOutputBuffer = outputBuffer;
		outputBuffer = newOutputBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__OUTPUT_BUFFER, oldOutputBuffer, newOutputBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputBuffer(Buffer newOutputBuffer) {
		if (newOutputBuffer != outputBuffer) {
			NotificationChain msgs = null;
			if (outputBuffer != null)
				msgs = ((InternalEObject)outputBuffer).eInverseRemove(this, ModelPackage.BUFFER__INCOMING_FSM, Buffer.class, msgs);
			if (newOutputBuffer != null)
				msgs = ((InternalEObject)newOutputBuffer).eInverseAdd(this, ModelPackage.BUFFER__INCOMING_FSM, Buffer.class, msgs);
			msgs = basicSetOutputBuffer(newOutputBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__OUTPUT_BUFFER, newOutputBuffer, newOutputBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnderProcessTrigger() {
		return underProcessTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderProcessTrigger(String newUnderProcessTrigger) {
		String oldUnderProcessTrigger = underProcessTrigger;
		underProcessTrigger = newUnderProcessTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__UNDER_PROCESS_TRIGGER, oldUnderProcessTrigger, underProcessTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsummedString() {
		return consummedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsummedString(String newConsummedString) {
		String oldConsummedString = consummedString;
		consummedString = newConsummedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__CONSUMMED_STRING, oldConsummedString, consummedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducedString() {
		return producedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedString(String newProducedString) {
		String oldProducedString = producedString;
		producedString = newProducedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FSM__PRODUCED_STRING, oldProducedString, producedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeFSM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ModelPackage.FSM__OWNED_STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStates()).basicAdd(otherEnd, msgs);
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTransitions()).basicAdd(otherEnd, msgs);
			case ModelPackage.FSM__INPUT_BUFFER:
				if (inputBuffer != null)
					msgs = ((InternalEObject)inputBuffer).eInverseRemove(this, ModelPackage.BUFFER__OUTGOING_FSM, Buffer.class, msgs);
				return basicSetInputBuffer((Buffer)otherEnd, msgs);
			case ModelPackage.FSM__OUTPUT_BUFFER:
				if (outputBuffer != null)
					msgs = ((InternalEObject)outputBuffer).eInverseRemove(this, ModelPackage.BUFFER__INCOMING_FSM, Buffer.class, msgs);
				return basicSetOutputBuffer((Buffer)otherEnd, msgs);
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
			case ModelPackage.FSM__OWNED_STATES:
				return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
			case ModelPackage.FSM__INPUT_BUFFER:
				return basicSetInputBuffer(null, msgs);
			case ModelPackage.FSM__OUTPUT_BUFFER:
				return basicSetOutputBuffer(null, msgs);
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
			case ModelPackage.FSM__NAME:
				return getName();
			case ModelPackage.FSM__OWNED_STATES:
				return getOwnedStates();
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				return getOwnedTransitions();
			case ModelPackage.FSM__INPUT_BUFFER:
				if (resolve) return getInputBuffer();
				return basicGetInputBuffer();
			case ModelPackage.FSM__OUTPUT_BUFFER:
				if (resolve) return getOutputBuffer();
				return basicGetOutputBuffer();
			case ModelPackage.FSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case ModelPackage.FSM__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
				return getUnderProcessTrigger();
			case ModelPackage.FSM__CONSUMMED_STRING:
				return getConsummedString();
			case ModelPackage.FSM__PRODUCED_STRING:
				return getProducedString();
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
			case ModelPackage.FSM__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.FSM__OWNED_STATES:
				getOwnedStates().clear();
				getOwnedStates().addAll((Collection<? extends State>)newValue);
				return;
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ModelPackage.FSM__INPUT_BUFFER:
				setInputBuffer((Buffer)newValue);
				return;
			case ModelPackage.FSM__OUTPUT_BUFFER:
				setOutputBuffer((Buffer)newValue);
				return;
			case ModelPackage.FSM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case ModelPackage.FSM__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
				setUnderProcessTrigger((String)newValue);
				return;
			case ModelPackage.FSM__CONSUMMED_STRING:
				setConsummedString((String)newValue);
				return;
			case ModelPackage.FSM__PRODUCED_STRING:
				setProducedString((String)newValue);
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
			case ModelPackage.FSM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.FSM__OWNED_STATES:
				getOwnedStates().clear();
				return;
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				return;
			case ModelPackage.FSM__INPUT_BUFFER:
				setInputBuffer((Buffer)null);
				return;
			case ModelPackage.FSM__OUTPUT_BUFFER:
				setOutputBuffer((Buffer)null);
				return;
			case ModelPackage.FSM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case ModelPackage.FSM__CURRENT_STATE:
				setCurrentState((State)null);
				return;
			case ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
				setUnderProcessTrigger(UNDER_PROCESS_TRIGGER_EDEFAULT);
				return;
			case ModelPackage.FSM__CONSUMMED_STRING:
				setConsummedString(CONSUMMED_STRING_EDEFAULT);
				return;
			case ModelPackage.FSM__PRODUCED_STRING:
				setProducedString(PRODUCED_STRING_EDEFAULT);
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
			case ModelPackage.FSM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.FSM__OWNED_STATES:
				return ownedStates != null && !ownedStates.isEmpty();
			case ModelPackage.FSM__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
			case ModelPackage.FSM__INPUT_BUFFER:
				return inputBuffer != null;
			case ModelPackage.FSM__OUTPUT_BUFFER:
				return outputBuffer != null;
			case ModelPackage.FSM__INITIAL_STATE:
				return initialState != null;
			case ModelPackage.FSM__CURRENT_STATE:
				return currentState != null;
			case ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
				return UNDER_PROCESS_TRIGGER_EDEFAULT == null ? underProcessTrigger != null : !UNDER_PROCESS_TRIGGER_EDEFAULT.equals(underProcessTrigger);
			case ModelPackage.FSM__CONSUMMED_STRING:
				return CONSUMMED_STRING_EDEFAULT == null ? consummedString != null : !CONSUMMED_STRING_EDEFAULT.equals(consummedString);
			case ModelPackage.FSM__PRODUCED_STRING:
				return PRODUCED_STRING_EDEFAULT == null ? producedString != null : !PRODUCED_STRING_EDEFAULT.equals(producedString);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", underProcessTrigger: ");
		result.append(underProcessTrigger);
		result.append(", consummedString: ");
		result.append(consummedString);
		result.append(", producedString: ");
		result.append(producedString);
		result.append(')');
		return result.toString();
	}

} //FSMImpl
