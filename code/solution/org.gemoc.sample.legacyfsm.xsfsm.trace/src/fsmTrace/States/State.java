/**
 */
package fsmTrace.States;

import fsmTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fsmTrace.States.State#getNumberVariable_value_Values <em>Number Variable value Values</em>}</li>
 *   <li>{@link fsmTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link fsmTrace.States.State#getStateMachine_currentState_Values <em>State Machine current State Values</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_EndedSteps()
	 * @see fsmTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Number Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.NumberVariable_value_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.NumberVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Variable value Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_NumberVariable_value_Values()
	 * @see fsmTrace.States.NumberVariable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<NumberVariable_value_Value> getNumberVariable_value_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_StartedSteps()
	 * @see fsmTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>State Machine current State Values</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.StateMachine_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.StateMachine_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine current State Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine current State Values</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getState_StateMachine_currentState_Values()
	 * @see fsmTrace.States.StateMachine_currentState_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<StateMachine_currentState_Value> getStateMachine_currentState_Values();

} // State
