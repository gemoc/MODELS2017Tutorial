/**
 */
package org.gemoc.models17.fsm.xfsmmt.model;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getOutgoingFSM <em>Outgoing FSM</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getIncomingFSM <em>Incoming FSM</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getCurrentValues <em>Current Values</em>}</li>
 * </ul>
 *
 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer()
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
	 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer_InitialValue()
	 * @model
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing FSM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.models17.fsm.xfsmmt.model.FSM#getInputBuffer <em>Input Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing FSM</em>' reference.
	 * @see #setOutgoingFSM(FSM)
	 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer_OutgoingFSM()
	 * @see org.gemoc.models17.fsm.xfsmmt.model.FSM#getInputBuffer
	 * @model opposite="inputBuffer"
	 * @generated
	 */
	FSM getOutgoingFSM();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getOutgoingFSM <em>Outgoing FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing FSM</em>' reference.
	 * @see #getOutgoingFSM()
	 * @generated
	 */
	void setOutgoingFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Incoming FSM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.models17.fsm.xfsmmt.model.FSM#getOutputBuffer <em>Output Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming FSM</em>' reference.
	 * @see #setIncomingFSM(FSM)
	 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer_IncomingFSM()
	 * @see org.gemoc.models17.fsm.xfsmmt.model.FSM#getOutputBuffer
	 * @model opposite="outputBuffer"
	 * @generated
	 */
	FSM getIncomingFSM();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getIncomingFSM <em>Incoming FSM</em>}' reference.
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
	 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Values</em>' attribute.
	 * @see #setCurrentValues(String)
	 * @see org.gemoc.models17.fsm.xfsmmt.model.ModelPackage#getBuffer_CurrentValues()
	 * @model unique="false"
	 * @generated
	 */
	String getCurrentValues();

	/**
	 * Sets the value of the '{@link org.gemoc.models17.fsm.xfsmmt.model.Buffer#getCurrentValues <em>Current Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Values</em>' attribute.
	 * @see #getCurrentValues()
	 * @generated
	 */
	void setCurrentValues(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enqueue(String v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String dequeue();

} // Buffer
