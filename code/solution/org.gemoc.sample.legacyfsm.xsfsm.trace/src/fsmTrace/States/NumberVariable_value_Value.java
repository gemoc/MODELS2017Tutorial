/**
 */
package fsmTrace.States;

import fsmTrace.States.fsm.TracedNumberVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Variable value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.NumberVariable_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fsmTrace.States.NumberVariable_value_Value#getStates <em>States</em>}</li>
 *   <li>{@link fsmTrace.States.NumberVariable_value_Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getNumberVariable_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface NumberVariable_value_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.fsm.TracedNumberVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedNumberVariable)
	 * @see fsmTrace.States.StatesPackage#getNumberVariable_value_Value_Parent()
	 * @see fsmTrace.States.fsm.TracedNumberVariable#getValueSequence
	 * @model opposite="valueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedNumberVariable getParent();

	/**
	 * Sets the value of the '{@link fsmTrace.States.NumberVariable_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedNumberVariable value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.State#getNumberVariable_value_Values <em>Number Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getNumberVariable_value_Value_States()
	 * @see fsmTrace.States.State#getNumberVariable_value_Values
	 * @model opposite="numberVariable_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fsmTrace.States.StatesPackage#getNumberVariable_value_Value_Value()
	 * @model unique="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fsmTrace.States.NumberVariable_value_Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // NumberVariable_value_Value
