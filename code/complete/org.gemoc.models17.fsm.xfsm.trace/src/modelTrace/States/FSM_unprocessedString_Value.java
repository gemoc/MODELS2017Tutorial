/**
 */
package modelTrace.States;

import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM unprocessed String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.FSM_unprocessedString_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.FSM_unprocessedString_Value#getStates <em>States</em>}</li>
 *   <li>{@link modelTrace.States.FSM_unprocessedString_Value#getUnprocessedString <em>Unprocessed String</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getFSM_unprocessedString_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSM_unprocessedString_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.model.TracedFSM#getUnprocessedStringSequence <em>Unprocessed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFSM)
	 * @see modelTrace.States.StatesPackage#getFSM_unprocessedString_Value_Parent()
	 * @see modelTrace.States.model.TracedFSM#getUnprocessedStringSequence
	 * @model opposite="unprocessedStringSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFSM getParent();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_unprocessedString_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link modelTrace.States.State#getFSM_unprocessedString_Values <em>FSM unprocessed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getFSM_unprocessedString_Value_States()
	 * @see modelTrace.States.State#getFSM_unprocessedString_Values
	 * @model opposite="fSM_unprocessedString_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unprocessed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprocessed String</em>' attribute.
	 * @see #setUnprocessedString(String)
	 * @see modelTrace.States.StatesPackage#getFSM_unprocessedString_Value_UnprocessedString()
	 * @model unique="false"
	 * @generated
	 */
	String getUnprocessedString();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_unprocessedString_Value#getUnprocessedString <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unprocessed String</em>' attribute.
	 * @see #getUnprocessedString()
	 * @generated
	 */
	void setUnprocessedString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // FSM_unprocessedString_Value
