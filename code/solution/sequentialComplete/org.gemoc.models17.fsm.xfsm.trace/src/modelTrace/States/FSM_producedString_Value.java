/**
 */
package modelTrace.States;

import modelTrace.States.model.TracedFSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM produced String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.FSM_producedString_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.FSM_producedString_Value#getProducedString <em>Produced String</em>}</li>
 *   <li>{@link modelTrace.States.FSM_producedString_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getFSM_producedString_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface FSM_producedString_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.model.TracedFSM#getProducedStringSequence <em>Produced String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedFSM)
	 * @see modelTrace.States.StatesPackage#getFSM_producedString_Value_Parent()
	 * @see modelTrace.States.model.TracedFSM#getProducedStringSequence
	 * @model opposite="producedStringSequence" required="true" transient="false"
	 * @generated
	 */
	TracedFSM getParent();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_producedString_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedFSM value);

	/**
	 * Returns the value of the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String</em>' attribute.
	 * @see #setProducedString(String)
	 * @see modelTrace.States.StatesPackage#getFSM_producedString_Value_ProducedString()
	 * @model unique="false"
	 * @generated
	 */
	String getProducedString();

	/**
	 * Sets the value of the '{@link modelTrace.States.FSM_producedString_Value#getProducedString <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced String</em>' attribute.
	 * @see #getProducedString()
	 * @generated
	 */
	void setProducedString(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.State#getFSM_producedString_Values <em>FSM produced String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getFSM_producedString_Value_States()
	 * @see modelTrace.States.State#getFSM_producedString_Values
	 * @model opposite="fSM_producedString_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // FSM_producedString_Value
