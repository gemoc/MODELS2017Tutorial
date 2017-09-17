/**
 */
package modelTrace.States;

import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM under Process Trigger Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.FSM_underProcessTrigger_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.FSM_underProcessTrigger_Value#getStates <em>States</em>}</li>
 *   <li>{@link modelTrace.States.FSM_underProcessTrigger_Value#getUnderProcessTrigger <em>Under Process Trigger</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getFSM_underProcessTrigger_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSM_underProcessTrigger_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.model.TracedFSM#getUnderProcessTriggerSequence <em>Under Process Trigger Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFSM)
	 * @see modelTrace.States.StatesPackage#getFSM_underProcessTrigger_Value_Parent()
	 * @see modelTrace.States.model.TracedFSM#getUnderProcessTriggerSequence
	 * @model opposite="underProcessTriggerSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFSM getParent();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_underProcessTrigger_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link modelTrace.States.State#getFSM_underProcessTrigger_Values <em>FSM under Process Trigger Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getFSM_underProcessTrigger_Value_States()
	 * @see modelTrace.States.State#getFSM_underProcessTrigger_Values
	 * @model opposite="fSM_underProcessTrigger_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Under Process Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Process Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Process Trigger</em>' attribute.
	 * @see #setUnderProcessTrigger(String)
	 * @see modelTrace.States.StatesPackage#getFSM_underProcessTrigger_Value_UnderProcessTrigger()
	 * @model unique="false"
	 * @generated
	 */
	String getUnderProcessTrigger();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_underProcessTrigger_Value#getUnderProcessTrigger <em>Under Process Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under Process Trigger</em>' attribute.
	 * @see #getUnderProcessTrigger()
	 * @generated
	 */
	void setUnderProcessTrigger(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // FSM_underProcessTrigger_Value
