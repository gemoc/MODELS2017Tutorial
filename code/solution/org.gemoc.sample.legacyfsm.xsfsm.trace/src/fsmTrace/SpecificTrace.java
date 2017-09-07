/**
 */
package fsmTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_AssignValueAction_Execute_Sequence <em>Fsm Assign Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_DecreaseValueAction_Execute_Sequence <em>Fsm Decrease Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_EqualNumberGuard_Holds_Sequence <em>Fsm Equal Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_GreaterThanNumberGuard_Holds_Sequence <em>Fsm Greater Than Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_Guard_Holds_Sequence <em>Fsm Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_IncreaseValueAction_Execute_Sequence <em>Fsm Increase Value Action Execute Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_LessThanNumberGuard_Holds_Sequence <em>Fsm Less Than Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_NumberGuard_Holds_Sequence <em>Fsm Number Guard Holds Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_StateMachine_AssignInitialValues_Sequence <em>Fsm State Machine Assign Initial Values Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_StateMachine_Step_Sequence <em>Fsm State Machine Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedNumberVariables <em>Fsm traced Number Variables</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedStateMachines <em>Fsm traced State Machines</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedStates <em>Fsm traced States</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedTransitions <em>Fsm traced Transitions</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see fsmTrace.FsmTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Fsm Assign Value Action Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_AssignValueAction_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Assign Value Action Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Assign Value Action Execute Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_AssignValueAction_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_AssignValueAction_Execute> getFsm_AssignValueAction_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Decrease Value Action Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_DecreaseValueAction_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Decrease Value Action Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Decrease Value Action Execute Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_DecreaseValueAction_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_DecreaseValueAction_Execute> getFsm_DecreaseValueAction_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Equal Number Guard Holds Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_EqualNumberGuard_Holds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Equal Number Guard Holds Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Equal Number Guard Holds Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_EqualNumberGuard_Holds_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_EqualNumberGuard_Holds> getFsm_EqualNumberGuard_Holds_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Greater Than Number Guard Holds Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_GreaterThanNumberGuard_Holds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Greater Than Number Guard Holds Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Greater Than Number Guard Holds Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_GreaterThanNumberGuard_Holds_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_GreaterThanNumberGuard_Holds> getFsm_GreaterThanNumberGuard_Holds_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Guard Holds Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_Guard_Holds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Guard Holds Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Guard Holds Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_Guard_Holds_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_Guard_Holds> getFsm_Guard_Holds_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Increase Value Action Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_IncreaseValueAction_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Increase Value Action Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Increase Value Action Execute Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_IncreaseValueAction_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_IncreaseValueAction_Execute> getFsm_IncreaseValueAction_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Less Than Number Guard Holds Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_LessThanNumberGuard_Holds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Less Than Number Guard Holds Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Less Than Number Guard Holds Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_LessThanNumberGuard_Holds_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_LessThanNumberGuard_Holds> getFsm_LessThanNumberGuard_Holds_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Number Guard Holds Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_NumberGuard_Holds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Number Guard Holds Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Number Guard Holds Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_NumberGuard_Holds_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_NumberGuard_Holds> getFsm_NumberGuard_Holds_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Machine Assign Initial Values Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_StateMachine_AssignInitialValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Machine Assign Initial Values Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Machine Assign Initial Values Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_StateMachine_AssignInitialValues_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_StateMachine_AssignInitialValues> getFsm_StateMachine_AssignInitialValues_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Machine Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_StateMachine_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Machine Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Machine Step Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_StateMachine_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_StateMachine_Step> getFsm_StateMachine_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Transition Fire Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm traced Number Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedNumberVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced Number Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced Number Variables</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedNumberVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedNumberVariable> getFsm_tracedNumberVariables();

	/**
	 * Returns the value of the '<em><b>Fsm traced State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced State Machines</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedStateMachines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedStateMachine> getFsm_tracedStateMachines();

	/**
	 * Returns the value of the '<em><b>Fsm traced States</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced States</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedStates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedState> getFsm_tracedStates();

	/**
	 * Returns the value of the '<em><b>Fsm traced Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced Transitions</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedTransitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTransition> getFsm_tracedTransitions();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
