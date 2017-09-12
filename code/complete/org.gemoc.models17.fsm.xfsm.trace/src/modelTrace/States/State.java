/**
 */
package modelTrace.States;

import modelTrace.Steps.SpecificStep;

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
 *   <li>{@link modelTrace.States.State#getBuffer_currentValues_Values <em>Buffer current Values Values</em>}</li>
 *   <li>{@link modelTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link modelTrace.States.State#getFSM_consummedString_Values <em>FSM consummed String Values</em>}</li>
 *   <li>{@link modelTrace.States.State#getFSM_currentState_Values <em>FSM current State Values</em>}</li>
 *   <li>{@link modelTrace.States.State#getFSM_producedString_Values <em>FSM produced String Values</em>}</li>
 *   <li>{@link modelTrace.States.State#getFSM_unprocessedString_Values <em>FSM unprocessed String Values</em>}</li>
 *   <li>{@link modelTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer current Values Values</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.Buffer_currentValues_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.Buffer_currentValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer current Values Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer current Values Values</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_Buffer_currentValues_Values()
	 * @see modelTrace.States.Buffer_currentValues_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Buffer_currentValues_Value> getBuffer_currentValues_Values();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link modelTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_EndedSteps()
	 * @see modelTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>FSM consummed String Values</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_consummedString_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_consummedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM consummed String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM consummed String Values</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_FSM_consummedString_Values()
	 * @see modelTrace.States.FSM_consummedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FSM_consummedString_Value> getFSM_consummedString_Values();

	/**
	 * Returns the value of the '<em><b>FSM current State Values</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM current State Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM current State Values</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_FSM_currentState_Values()
	 * @see modelTrace.States.FSM_currentState_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FSM_currentState_Value> getFSM_currentState_Values();

	/**
	 * Returns the value of the '<em><b>FSM produced String Values</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_producedString_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_producedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM produced String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM produced String Values</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_FSM_producedString_Values()
	 * @see modelTrace.States.FSM_producedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FSM_producedString_Value> getFSM_producedString_Values();

	/**
	 * Returns the value of the '<em><b>FSM unprocessed String Values</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_unprocessedString_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_unprocessedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM unprocessed String Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM unprocessed String Values</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_FSM_unprocessedString_Values()
	 * @see modelTrace.States.FSM_unprocessedString_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<FSM_unprocessedString_Value> getFSM_unprocessedString_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link modelTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getState_StartedSteps()
	 * @see modelTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

} // State
