/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getNumberVariable()
 * @model
 * @generated
 */
public interface NumberVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getNumberVariable_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

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
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getNumberVariable_Value()
	 * @model unique="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NumberVariable
