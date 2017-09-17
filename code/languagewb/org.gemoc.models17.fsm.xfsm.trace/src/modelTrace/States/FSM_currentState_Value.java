/**
 */
package modelTrace.States;

import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.util.EList;

import org.gemoc.models17.fsm.xfsm.model.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM current State Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.FSM_currentState_Value#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link modelTrace.States.FSM_currentState_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.FSM_currentState_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getFSM_currentState_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSM_currentState_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see modelTrace.States.StatesPackage#getFSM_currentState_Value_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_currentState_Value#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.model.TracedFSM#getCurrentStateSequence <em>Current State Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFSM)
	 * @see modelTrace.States.StatesPackage#getFSM_currentState_Value_Parent()
	 * @see modelTrace.States.model.TracedFSM#getCurrentStateSequence
	 * @model opposite="currentStateSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFSM getParent();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_currentState_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedFSM value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.State#getFSM_currentState_Values <em>FSM current State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getFSM_currentState_Value_States()
	 * @see modelTrace.States.State#getFSM_currentState_Values
	 * @model opposite="fSM_currentState_Values" required="true"
	 * @generated
	 */
	EList<modelTrace.States.State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<modelTrace.States.State> getStatesNoOpposite();

} // FSM_currentState_Value
