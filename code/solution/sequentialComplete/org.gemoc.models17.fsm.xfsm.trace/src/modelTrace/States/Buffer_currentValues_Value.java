/**
 */
package modelTrace.States;

import modelTrace.States.model.TracedBuffer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer current Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.States.Buffer_currentValues_Value#getCurrentValues <em>Current Values</em>}</li>
 *   <li>{@link modelTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link modelTrace.States.Buffer_currentValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see modelTrace.States.StatesPackage#getBuffer_currentValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Buffer_currentValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Values</em>' attribute.
	 * @see #setCurrentValues(String)
	 * @see modelTrace.States.StatesPackage#getBuffer_currentValues_Value_CurrentValues()
	 * @model unique="false"
	 * @generated
	 */
	String getCurrentValues();

	/**
	 * Sets the value of the '{@link modelTrace.States.Buffer_currentValues_Value#getCurrentValues <em>Current Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Values</em>' attribute.
	 * @see #getCurrentValues()
	 * @generated
	 */
	void setCurrentValues(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.model.TracedBuffer#getCurrentValuesSequence <em>Current Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBuffer)
	 * @see modelTrace.States.StatesPackage#getBuffer_currentValues_Value_Parent()
	 * @see modelTrace.States.model.TracedBuffer#getCurrentValuesSequence
	 * @model opposite="currentValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBuffer getParent();

	/**
	 * Sets the value of the '{@link modelTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBuffer value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link modelTrace.States.State#getBuffer_currentValues_Values <em>Buffer current Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see modelTrace.States.StatesPackage#getBuffer_currentValues_Value_States()
	 * @see modelTrace.States.State#getBuffer_currentValues_Values
	 * @model opposite="buffer_currentValues_Values" required="true"
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

} // Buffer_currentValues_Value
