/**
 */
package modelTrace.States.model;

import modelTrace.States.FSM_consummedString_Value;
import modelTrace.States.FSM_currentState_Value;
import modelTrace.States.FSM_producedString_Value;
import modelTrace.States.FSM_underProcessTrigger_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.models17.fsm.xfsm.model.FSM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.model.TracedFSM#getConsummedStringSequence <em>Consummed String Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.TracedFSM#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.TracedFSM#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link modelTrace.States.model.TracedFSM#getProducedStringSequence <em>Produced String Sequence</em>}</li>
 *   <li>{@link modelTrace.States.model.TracedFSM#getUnderProcessTriggerSequence <em>Under Process Trigger Sequence</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.model.ModelPackage#getTracedFSM()
 * @model
 * @generated
 */
public interface TracedFSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Consummed String Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_consummedString_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_consummedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consummed String Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consummed String Sequence</em>' containment reference list.
	 * @see modelTrace.States.model.ModelPackage#getTracedFSM_ConsummedStringSequence()
	 * @see modelTrace.States.FSM_consummedString_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSM_consummedString_Value> getConsummedStringSequence();

	/**
	 * Returns the value of the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State Sequence</em>' containment reference list.
	 * @see modelTrace.States.model.ModelPackage#getTracedFSM_CurrentStateSequence()
	 * @see modelTrace.States.FSM_currentState_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSM_currentState_Value> getCurrentStateSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(FSM)
	 * @see modelTrace.States.model.ModelPackage#getTracedFSM_OriginalObject()
	 * @model
	 * @generated
	 */
	FSM getOriginalObject();

	/**
	 * Sets the value of the '{@link modelTrace.States.model.TracedFSM#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(FSM value);

	/**
	 * Returns the value of the '<em><b>Produced String Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_producedString_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_producedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String Sequence</em>' containment reference list.
	 * @see modelTrace.States.model.ModelPackage#getTracedFSM_ProducedStringSequence()
	 * @see modelTrace.States.FSM_producedString_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSM_producedString_Value> getProducedStringSequence();

	/**
	 * Returns the value of the '<em><b>Under Process Trigger Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.FSM_underProcessTrigger_Value}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.FSM_underProcessTrigger_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Process Trigger Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Process Trigger Sequence</em>' containment reference list.
	 * @see modelTrace.States.model.ModelPackage#getTracedFSM_UnderProcessTriggerSequence()
	 * @see modelTrace.States.FSM_underProcessTrigger_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSM_underProcessTrigger_Value> getUnderProcessTriggerSequence();

} // TracedFSM
