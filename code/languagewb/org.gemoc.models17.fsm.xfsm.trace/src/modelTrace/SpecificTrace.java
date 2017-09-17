/**
 */
package modelTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import modelTrace.States.State;

import modelTrace.States.model.TracedBuffer;
import modelTrace.States.model.TracedFSM;

import modelTrace.Steps.Model_FSM_Run;
import modelTrace.Steps.Model_State_Step;
import modelTrace.Steps.Model_Transition_Fire;
import modelTrace.Steps.Root_Initialize;
import modelTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.SpecificTrace#getModel_FSM_Run_Sequence <em>Model FSM Run Sequence</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getModel_State_Step_Sequence <em>Model State Step Sequence</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getModel_Transition_Fire_Sequence <em>Model Transition Fire Sequence</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getRoot_Initialize_Sequence <em>Root Initialize Sequence</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getModel_tracedBuffers <em>Model traced Buffers</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getModel_tracedFSMs <em>Model traced FS Ms</em>}</li>
 *   <li>{@link modelTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see modelTrace.ModelTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Model FSM Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.Model_FSM_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model FSM Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model FSM Run Sequence</em>' reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Model_FSM_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<Model_FSM_Run> getModel_FSM_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Model State Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.Model_State_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model State Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model State Step Sequence</em>' reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Model_State_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Model_State_Step> getModel_State_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Model Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.Model_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Transition Fire Sequence</em>' reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Model_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Model_Transition_Fire> getModel_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Root Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link modelTrace.Steps.Root_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Initialize Sequence</em>' reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Root_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Root_Initialize> getRoot_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Model traced Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.model.TracedBuffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model traced Buffers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model traced Buffers</em>' containment reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Model_tracedBuffers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBuffer> getModel_tracedBuffers();

	/**
	 * Returns the value of the '<em><b>Model traced FS Ms</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.model.TracedFSM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model traced FS Ms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model traced FS Ms</em>' containment reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_Model_tracedFSMs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedFSM> getModel_tracedFSMs();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link modelTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see modelTrace.ModelTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
