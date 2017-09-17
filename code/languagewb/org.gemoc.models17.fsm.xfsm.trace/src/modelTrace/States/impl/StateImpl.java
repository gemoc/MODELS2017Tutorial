/**
 */
package modelTrace.States.impl;

import java.util.Collection;

import modelTrace.States.Buffer_currentValues_Value;
import modelTrace.States.FSM_consummedString_Value;
import modelTrace.States.FSM_currentState_Value;
import modelTrace.States.FSM_producedString_Value;
import modelTrace.States.FSM_underProcessTrigger_Value;
import modelTrace.States.State;
import modelTrace.States.StatesPackage;

import modelTrace.Steps.SpecificStep;
import modelTrace.Steps.StepsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.impl.StateImpl#getBuffer_currentValues_Values <em>Buffer current Values Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getFSM_consummedString_Values <em>FSM consummed String Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getFSM_currentState_Values <em>FSM current State Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getFSM_producedString_Values <em>FSM produced String Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getFSM_underProcessTrigger_Values <em>FSM under Process Trigger Values</em>}</li>
 *   <li>{@link modelTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getBuffer_currentValues_Values() <em>Buffer current Values Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer_currentValues_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer_currentValues_Value> buffer_currentValues_Values;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getFSM_consummedString_Values() <em>FSM consummed String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSM_consummedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_consummedString_Value> fSM_consummedString_Values;

	/**
	 * The cached value of the '{@link #getFSM_currentState_Values() <em>FSM current State Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSM_currentState_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_currentState_Value> fSM_currentState_Values;

	/**
	 * The cached value of the '{@link #getFSM_producedString_Values() <em>FSM produced String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSM_producedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_producedString_Value> fSM_producedString_Values;

	/**
	 * The cached value of the '{@link #getFSM_underProcessTrigger_Values() <em>FSM under Process Trigger Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSM_underProcessTrigger_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<FSM_underProcessTrigger_Value> fSM_underProcessTrigger_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer_currentValues_Value> getBuffer_currentValues_Values() {
		if (buffer_currentValues_Values == null) {
			buffer_currentValues_Values = new EObjectWithInverseResolvingEList.ManyInverse<Buffer_currentValues_Value>(Buffer_currentValues_Value.class, this, StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES, StatesPackage.BUFFER_CURRENT_VALUES_VALUE__STATES);
		}
		return buffer_currentValues_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_consummedString_Value> getFSM_consummedString_Values() {
		if (fSM_consummedString_Values == null) {
			fSM_consummedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<FSM_consummedString_Value>(FSM_consummedString_Value.class, this, StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES, StatesPackage.FSM_CONSUMMED_STRING_VALUE__STATES);
		}
		return fSM_consummedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_currentState_Value> getFSM_currentState_Values() {
		if (fSM_currentState_Values == null) {
			fSM_currentState_Values = new EObjectWithInverseResolvingEList.ManyInverse<FSM_currentState_Value>(FSM_currentState_Value.class, this, StatesPackage.STATE__FSM_CURRENT_STATE_VALUES, StatesPackage.FSM_CURRENT_STATE_VALUE__STATES);
		}
		return fSM_currentState_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_producedString_Value> getFSM_producedString_Values() {
		if (fSM_producedString_Values == null) {
			fSM_producedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<FSM_producedString_Value>(FSM_producedString_Value.class, this, StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES, StatesPackage.FSM_PRODUCED_STRING_VALUE__STATES);
		}
		return fSM_producedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSM_underProcessTrigger_Value> getFSM_underProcessTrigger_Values() {
		if (fSM_underProcessTrigger_Values == null) {
			fSM_underProcessTrigger_Values = new EObjectWithInverseResolvingEList.ManyInverse<FSM_underProcessTrigger_Value>(FSM_underProcessTrigger_Value.class, this, StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES, StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES);
		}
		return fSM_underProcessTrigger_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuffer_currentValues_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFSM_consummedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFSM_currentState_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFSM_producedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFSM_underProcessTrigger_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				return ((InternalEList<?>)getBuffer_currentValues_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				return ((InternalEList<?>)getFSM_consummedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				return ((InternalEList<?>)getFSM_currentState_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				return ((InternalEList<?>)getFSM_producedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				return ((InternalEList<?>)getFSM_underProcessTrigger_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				return getBuffer_currentValues_Values();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				return getFSM_consummedString_Values();
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				return getFSM_currentState_Values();
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				return getFSM_producedString_Values();
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				return getFSM_underProcessTrigger_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				getBuffer_currentValues_Values().clear();
				getBuffer_currentValues_Values().addAll((Collection<? extends Buffer_currentValues_Value>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				getFSM_consummedString_Values().clear();
				getFSM_consummedString_Values().addAll((Collection<? extends FSM_consummedString_Value>)newValue);
				return;
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				getFSM_currentState_Values().clear();
				getFSM_currentState_Values().addAll((Collection<? extends FSM_currentState_Value>)newValue);
				return;
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				getFSM_producedString_Values().clear();
				getFSM_producedString_Values().addAll((Collection<? extends FSM_producedString_Value>)newValue);
				return;
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				getFSM_underProcessTrigger_Values().clear();
				getFSM_underProcessTrigger_Values().addAll((Collection<? extends FSM_underProcessTrigger_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				getBuffer_currentValues_Values().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				getFSM_consummedString_Values().clear();
				return;
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				getFSM_currentState_Values().clear();
				return;
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				getFSM_producedString_Values().clear();
				return;
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				getFSM_underProcessTrigger_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
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
			case StatesPackage.STATE__BUFFER_CURRENT_VALUES_VALUES:
				return buffer_currentValues_Values != null && !buffer_currentValues_Values.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__FSM_CONSUMMED_STRING_VALUES:
				return fSM_consummedString_Values != null && !fSM_consummedString_Values.isEmpty();
			case StatesPackage.STATE__FSM_CURRENT_STATE_VALUES:
				return fSM_currentState_Values != null && !fSM_currentState_Values.isEmpty();
			case StatesPackage.STATE__FSM_PRODUCED_STRING_VALUES:
				return fSM_producedString_Values != null && !fSM_producedString_Values.isEmpty();
			case StatesPackage.STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES:
				return fSM_underProcessTrigger_Values != null && !fSM_underProcessTrigger_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
