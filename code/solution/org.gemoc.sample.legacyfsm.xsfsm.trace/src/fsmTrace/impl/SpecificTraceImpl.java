/**
 */
package fsmTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import fsmTrace.FsmTracePackage;
import fsmTrace.SpecificTrace;

import fsmTrace.States.State;

import fsmTrace.States.fsm.TracedNumberVariable;
import fsmTrace.States.fsm.TracedState;
import fsmTrace.States.fsm.TracedStateMachine;
import fsmTrace.States.fsm.TracedTransition;

import fsmTrace.Steps.Fsm_AssignValueAction_Execute;
import fsmTrace.Steps.Fsm_DecreaseValueAction_Execute;
import fsmTrace.Steps.Fsm_EqualNumberGuard_Holds;
import fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds;
import fsmTrace.Steps.Fsm_Guard_Holds;
import fsmTrace.Steps.Fsm_IncreaseValueAction_Execute;
import fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds;
import fsmTrace.Steps.Fsm_NumberGuard_Holds;
import fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues;
import fsmTrace.Steps.Fsm_StateMachine_Step;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.SpecificStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_AssignValueAction_Execute_Sequence <em>Fsm Assign Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_DecreaseValueAction_Execute_Sequence <em>Fsm Decrease Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_EqualNumberGuard_Holds_Sequence <em>Fsm Equal Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_GreaterThanNumberGuard_Holds_Sequence <em>Fsm Greater Than Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_Guard_Holds_Sequence <em>Fsm Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_IncreaseValueAction_Execute_Sequence <em>Fsm Increase Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_LessThanNumberGuard_Holds_Sequence <em>Fsm Less Than Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_NumberGuard_Holds_Sequence <em>Fsm Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_StateMachine_AssignInitialValues_Sequence <em>Fsm State Machine Assign Initial Values Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_StateMachine_Step_Sequence <em>Fsm State Machine Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_tracedNumberVariables <em>Fsm traced Number Variables</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_tracedStateMachines <em>Fsm traced State Machines</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_tracedStates <em>Fsm traced States</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getFsm_tracedTransitions <em>Fsm traced Transitions</em>}</li>
 *   <li>{@link fsmTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getFsm_AssignValueAction_Execute_Sequence() <em>Fsm Assign Value Action Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_AssignValueAction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_AssignValueAction_Execute> fsm_AssignValueAction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_DecreaseValueAction_Execute_Sequence() <em>Fsm Decrease Value Action Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_DecreaseValueAction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_DecreaseValueAction_Execute> fsm_DecreaseValueAction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_EqualNumberGuard_Holds_Sequence() <em>Fsm Equal Number Guard Holds Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_EqualNumberGuard_Holds_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_EqualNumberGuard_Holds> fsm_EqualNumberGuard_Holds_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_GreaterThanNumberGuard_Holds_Sequence() <em>Fsm Greater Than Number Guard Holds Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_GreaterThanNumberGuard_Holds_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_GreaterThanNumberGuard_Holds> fsm_GreaterThanNumberGuard_Holds_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_Guard_Holds_Sequence() <em>Fsm Guard Holds Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_Guard_Holds_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_Guard_Holds> fsm_Guard_Holds_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_IncreaseValueAction_Execute_Sequence() <em>Fsm Increase Value Action Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_IncreaseValueAction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_IncreaseValueAction_Execute> fsm_IncreaseValueAction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_LessThanNumberGuard_Holds_Sequence() <em>Fsm Less Than Number Guard Holds Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_LessThanNumberGuard_Holds_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_LessThanNumberGuard_Holds> fsm_LessThanNumberGuard_Holds_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_NumberGuard_Holds_Sequence() <em>Fsm Number Guard Holds Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_NumberGuard_Holds_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_NumberGuard_Holds> fsm_NumberGuard_Holds_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_StateMachine_AssignInitialValues_Sequence() <em>Fsm State Machine Assign Initial Values Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_StateMachine_AssignInitialValues_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_StateMachine_AssignInitialValues> fsm_StateMachine_AssignInitialValues_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_StateMachine_Step_Sequence() <em>Fsm State Machine Step Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_StateMachine_Step_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_StateMachine_Step> fsm_StateMachine_Step_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_Transition_Fire_Sequence() <em>Fsm Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Fsm_Transition_Fire> fsm_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getFsm_tracedNumberVariables() <em>Fsm traced Number Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_tracedNumberVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedNumberVariable> fsm_tracedNumberVariables;

	/**
	 * The cached value of the '{@link #getFsm_tracedStateMachines() <em>Fsm traced State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_tracedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedStateMachine> fsm_tracedStateMachines;

	/**
	 * The cached value of the '{@link #getFsm_tracedStates() <em>Fsm traced States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_tracedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedState> fsm_tracedStates;

	/**
	 * The cached value of the '{@link #getFsm_tracedTransitions() <em>Fsm traced Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm_tracedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTransition> fsm_tracedTransitions;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_AssignValueAction_Execute> getFsm_AssignValueAction_Execute_Sequence() {
		if (fsm_AssignValueAction_Execute_Sequence == null) {
			fsm_AssignValueAction_Execute_Sequence = new EObjectResolvingEList<Fsm_AssignValueAction_Execute>(Fsm_AssignValueAction_Execute.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE);
		}
		return fsm_AssignValueAction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_DecreaseValueAction_Execute> getFsm_DecreaseValueAction_Execute_Sequence() {
		if (fsm_DecreaseValueAction_Execute_Sequence == null) {
			fsm_DecreaseValueAction_Execute_Sequence = new EObjectResolvingEList<Fsm_DecreaseValueAction_Execute>(Fsm_DecreaseValueAction_Execute.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE);
		}
		return fsm_DecreaseValueAction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_EqualNumberGuard_Holds> getFsm_EqualNumberGuard_Holds_Sequence() {
		if (fsm_EqualNumberGuard_Holds_Sequence == null) {
			fsm_EqualNumberGuard_Holds_Sequence = new EObjectResolvingEList<Fsm_EqualNumberGuard_Holds>(Fsm_EqualNumberGuard_Holds.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE);
		}
		return fsm_EqualNumberGuard_Holds_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_GreaterThanNumberGuard_Holds> getFsm_GreaterThanNumberGuard_Holds_Sequence() {
		if (fsm_GreaterThanNumberGuard_Holds_Sequence == null) {
			fsm_GreaterThanNumberGuard_Holds_Sequence = new EObjectResolvingEList<Fsm_GreaterThanNumberGuard_Holds>(Fsm_GreaterThanNumberGuard_Holds.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE);
		}
		return fsm_GreaterThanNumberGuard_Holds_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_Guard_Holds> getFsm_Guard_Holds_Sequence() {
		if (fsm_Guard_Holds_Sequence == null) {
			fsm_Guard_Holds_Sequence = new EObjectResolvingEList<Fsm_Guard_Holds>(Fsm_Guard_Holds.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE);
		}
		return fsm_Guard_Holds_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_IncreaseValueAction_Execute> getFsm_IncreaseValueAction_Execute_Sequence() {
		if (fsm_IncreaseValueAction_Execute_Sequence == null) {
			fsm_IncreaseValueAction_Execute_Sequence = new EObjectResolvingEList<Fsm_IncreaseValueAction_Execute>(Fsm_IncreaseValueAction_Execute.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE);
		}
		return fsm_IncreaseValueAction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_LessThanNumberGuard_Holds> getFsm_LessThanNumberGuard_Holds_Sequence() {
		if (fsm_LessThanNumberGuard_Holds_Sequence == null) {
			fsm_LessThanNumberGuard_Holds_Sequence = new EObjectResolvingEList<Fsm_LessThanNumberGuard_Holds>(Fsm_LessThanNumberGuard_Holds.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE);
		}
		return fsm_LessThanNumberGuard_Holds_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_NumberGuard_Holds> getFsm_NumberGuard_Holds_Sequence() {
		if (fsm_NumberGuard_Holds_Sequence == null) {
			fsm_NumberGuard_Holds_Sequence = new EObjectResolvingEList<Fsm_NumberGuard_Holds>(Fsm_NumberGuard_Holds.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE);
		}
		return fsm_NumberGuard_Holds_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_StateMachine_AssignInitialValues> getFsm_StateMachine_AssignInitialValues_Sequence() {
		if (fsm_StateMachine_AssignInitialValues_Sequence == null) {
			fsm_StateMachine_AssignInitialValues_Sequence = new EObjectResolvingEList<Fsm_StateMachine_AssignInitialValues>(Fsm_StateMachine_AssignInitialValues.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE);
		}
		return fsm_StateMachine_AssignInitialValues_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_StateMachine_Step> getFsm_StateMachine_Step_Sequence() {
		if (fsm_StateMachine_Step_Sequence == null) {
			fsm_StateMachine_Step_Sequence = new EObjectResolvingEList<Fsm_StateMachine_Step>(Fsm_StateMachine_Step.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE);
		}
		return fsm_StateMachine_Step_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence() {
		if (fsm_Transition_Fire_Sequence == null) {
			fsm_Transition_Fire_Sequence = new EObjectResolvingEList<Fsm_Transition_Fire>(Fsm_Transition_Fire.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE);
		}
		return fsm_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedNumberVariable> getFsm_tracedNumberVariables() {
		if (fsm_tracedNumberVariables == null) {
			fsm_tracedNumberVariables = new EObjectContainmentEList<TracedNumberVariable>(TracedNumberVariable.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES);
		}
		return fsm_tracedNumberVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedStateMachine> getFsm_tracedStateMachines() {
		if (fsm_tracedStateMachines == null) {
			fsm_tracedStateMachines = new EObjectContainmentEList<TracedStateMachine>(TracedStateMachine.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES);
		}
		return fsm_tracedStateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedState> getFsm_tracedStates() {
		if (fsm_tracedStates == null) {
			fsm_tracedStates = new EObjectContainmentEList<TracedState>(TracedState.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES);
		}
		return fsm_tracedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTransition> getFsm_tracedTransitions() {
		if (fsm_tracedTransitions == null) {
			fsm_tracedTransitions = new EObjectContainmentEList<TracedTransition>(TracedTransition.class, this, FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS);
		}
		return fsm_tracedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES:
				return ((InternalEList<?>)getFsm_tracedNumberVariables()).basicRemove(otherEnd, msgs);
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES:
				return ((InternalEList<?>)getFsm_tracedStateMachines()).basicRemove(otherEnd, msgs);
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES:
				return ((InternalEList<?>)getFsm_tracedStates()).basicRemove(otherEnd, msgs);
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS:
				return ((InternalEList<?>)getFsm_tracedTransitions()).basicRemove(otherEnd, msgs);
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case FsmTracePackage.SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE:
				return getFsm_AssignValueAction_Execute_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				return getFsm_DecreaseValueAction_Execute_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE:
				return getFsm_EqualNumberGuard_Holds_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				return getFsm_GreaterThanNumberGuard_Holds_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE:
				return getFsm_Guard_Holds_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				return getFsm_IncreaseValueAction_Execute_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				return getFsm_LessThanNumberGuard_Holds_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE:
				return getFsm_NumberGuard_Holds_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE:
				return getFsm_StateMachine_AssignInitialValues_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE:
				return getFsm_StateMachine_Step_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				return getFsm_Transition_Fire_Sequence();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES:
				return getFsm_tracedNumberVariables();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES:
				return getFsm_tracedStateMachines();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES:
				return getFsm_tracedStates();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS:
				return getFsm_tracedTransitions();
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case FsmTracePackage.SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_AssignValueAction_Execute_Sequence().clear();
				getFsm_AssignValueAction_Execute_Sequence().addAll((Collection<? extends Fsm_AssignValueAction_Execute>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_DecreaseValueAction_Execute_Sequence().clear();
				getFsm_DecreaseValueAction_Execute_Sequence().addAll((Collection<? extends Fsm_DecreaseValueAction_Execute>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_EqualNumberGuard_Holds_Sequence().clear();
				getFsm_EqualNumberGuard_Holds_Sequence().addAll((Collection<? extends Fsm_EqualNumberGuard_Holds>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_GreaterThanNumberGuard_Holds_Sequence().clear();
				getFsm_GreaterThanNumberGuard_Holds_Sequence().addAll((Collection<? extends Fsm_GreaterThanNumberGuard_Holds>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE:
				getFsm_Guard_Holds_Sequence().clear();
				getFsm_Guard_Holds_Sequence().addAll((Collection<? extends Fsm_Guard_Holds>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_IncreaseValueAction_Execute_Sequence().clear();
				getFsm_IncreaseValueAction_Execute_Sequence().addAll((Collection<? extends Fsm_IncreaseValueAction_Execute>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_LessThanNumberGuard_Holds_Sequence().clear();
				getFsm_LessThanNumberGuard_Holds_Sequence().addAll((Collection<? extends Fsm_LessThanNumberGuard_Holds>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_NumberGuard_Holds_Sequence().clear();
				getFsm_NumberGuard_Holds_Sequence().addAll((Collection<? extends Fsm_NumberGuard_Holds>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE:
				getFsm_StateMachine_AssignInitialValues_Sequence().clear();
				getFsm_StateMachine_AssignInitialValues_Sequence().addAll((Collection<? extends Fsm_StateMachine_AssignInitialValues>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE:
				getFsm_StateMachine_Step_Sequence().clear();
				getFsm_StateMachine_Step_Sequence().addAll((Collection<? extends Fsm_StateMachine_Step>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				getFsm_Transition_Fire_Sequence().clear();
				getFsm_Transition_Fire_Sequence().addAll((Collection<? extends Fsm_Transition_Fire>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES:
				getFsm_tracedNumberVariables().clear();
				getFsm_tracedNumberVariables().addAll((Collection<? extends TracedNumberVariable>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES:
				getFsm_tracedStateMachines().clear();
				getFsm_tracedStateMachines().addAll((Collection<? extends TracedStateMachine>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES:
				getFsm_tracedStates().clear();
				getFsm_tracedStates().addAll((Collection<? extends TracedState>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS:
				getFsm_tracedTransitions().clear();
				getFsm_tracedTransitions().addAll((Collection<? extends TracedTransition>)newValue);
				return;
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case FsmTracePackage.SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_AssignValueAction_Execute_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_DecreaseValueAction_Execute_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_EqualNumberGuard_Holds_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_GreaterThanNumberGuard_Holds_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE:
				getFsm_Guard_Holds_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				getFsm_IncreaseValueAction_Execute_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_LessThanNumberGuard_Holds_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE:
				getFsm_NumberGuard_Holds_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE:
				getFsm_StateMachine_AssignInitialValues_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE:
				getFsm_StateMachine_Step_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				getFsm_Transition_Fire_Sequence().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES:
				getFsm_tracedNumberVariables().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES:
				getFsm_tracedStateMachines().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES:
				getFsm_tracedStates().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS:
				getFsm_tracedTransitions().clear();
				return;
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case FsmTracePackage.SPECIFIC_TRACE__FSM_ASSIGN_VALUE_ACTION_EXECUTE_SEQUENCE:
				return fsm_AssignValueAction_Execute_Sequence != null && !fsm_AssignValueAction_Execute_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_DECREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				return fsm_DecreaseValueAction_Execute_Sequence != null && !fsm_DecreaseValueAction_Execute_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_EQUAL_NUMBER_GUARD_HOLDS_SEQUENCE:
				return fsm_EqualNumberGuard_Holds_Sequence != null && !fsm_EqualNumberGuard_Holds_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GREATER_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				return fsm_GreaterThanNumberGuard_Holds_Sequence != null && !fsm_GreaterThanNumberGuard_Holds_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_GUARD_HOLDS_SEQUENCE:
				return fsm_Guard_Holds_Sequence != null && !fsm_Guard_Holds_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_INCREASE_VALUE_ACTION_EXECUTE_SEQUENCE:
				return fsm_IncreaseValueAction_Execute_Sequence != null && !fsm_IncreaseValueAction_Execute_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_LESS_THAN_NUMBER_GUARD_HOLDS_SEQUENCE:
				return fsm_LessThanNumberGuard_Holds_Sequence != null && !fsm_LessThanNumberGuard_Holds_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_NUMBER_GUARD_HOLDS_SEQUENCE:
				return fsm_NumberGuard_Holds_Sequence != null && !fsm_NumberGuard_Holds_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_ASSIGN_INITIAL_VALUES_SEQUENCE:
				return fsm_StateMachine_AssignInitialValues_Sequence != null && !fsm_StateMachine_AssignInitialValues_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_STATE_MACHINE_STEP_SEQUENCE:
				return fsm_StateMachine_Step_Sequence != null && !fsm_StateMachine_Step_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE:
				return fsm_Transition_Fire_Sequence != null && !fsm_Transition_Fire_Sequence.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_NUMBER_VARIABLES:
				return fsm_tracedNumberVariables != null && !fsm_tracedNumberVariables.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES:
				return fsm_tracedStateMachines != null && !fsm_tracedStateMachines.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_STATES:
				return fsm_tracedStates != null && !fsm_tracedStates.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS:
				return fsm_tracedTransitions != null && !fsm_tracedTransitions.isEmpty();
			case FsmTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
