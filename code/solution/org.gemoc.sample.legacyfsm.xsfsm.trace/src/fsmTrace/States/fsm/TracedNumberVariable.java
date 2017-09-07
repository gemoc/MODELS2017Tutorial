/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.NumberVariable_value_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Number Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedNumberVariable#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedNumberVariable#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedNumberVariable()
 * @model
 * @generated
 */
public interface TracedNumberVariable extends TracedVariable {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(NumberVariable)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedNumberVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	NumberVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedNumberVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(NumberVariable value);

	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.NumberVariable_value_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.NumberVariable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedNumberVariable_ValueSequence()
	 * @see fsmTrace.States.NumberVariable_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<NumberVariable_value_Value> getValueSequence();

} // TracedNumberVariable
