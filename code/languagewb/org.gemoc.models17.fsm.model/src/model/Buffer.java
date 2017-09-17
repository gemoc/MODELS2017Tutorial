/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Buffer#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link model.Buffer#getOutgoingFSM <em>Outgoing FSM</em>}</li>
 *   <li>{@link model.Buffer#getIncomingFSM <em>Incoming FSM</em>}</li>
 *   <li>{@link model.Buffer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see model.ModelPackage#getBuffer_InitialValue()
	 * @model
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link model.Buffer#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing FSM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.FSM#getInputBuffer <em>Input Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing FSM</em>' reference.
	 * @see #setOutgoingFSM(FSM)
	 * @see model.ModelPackage#getBuffer_OutgoingFSM()
	 * @see model.FSM#getInputBuffer
	 * @model opposite="inputBuffer"
	 * @generated
	 */
	FSM getOutgoingFSM();

	/**
	 * Sets the value of the '{@link model.Buffer#getOutgoingFSM <em>Outgoing FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing FSM</em>' reference.
	 * @see #getOutgoingFSM()
	 * @generated
	 */
	void setOutgoingFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Incoming FSM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.FSM#getOutputBuffer <em>Output Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming FSM</em>' reference.
	 * @see #setIncomingFSM(FSM)
	 * @see model.ModelPackage#getBuffer_IncomingFSM()
	 * @see model.FSM#getOutputBuffer
	 * @model opposite="outputBuffer"
	 * @generated
	 */
	FSM getIncomingFSM();

	/**
	 * Sets the value of the '{@link model.Buffer#getIncomingFSM <em>Incoming FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming FSM</em>' reference.
	 * @see #getIncomingFSM()
	 * @generated
	 */
	void setIncomingFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getBuffer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.Buffer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Buffer
