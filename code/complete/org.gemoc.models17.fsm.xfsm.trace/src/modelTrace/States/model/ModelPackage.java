/**
 */
package modelTrace.States.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelTrace.States.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "modelTrace_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = modelTrace.States.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelTrace.States.model.impl.TracedBufferImpl <em>Traced Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.States.model.impl.TracedBufferImpl
	 * @see modelTrace.States.model.impl.ModelPackageImpl#getTracedBuffer()
	 * @generated
	 */
	int TRACED_BUFFER = 0;

	/**
	 * The feature id for the '<em><b>Current Values Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUFFER__CURRENT_VALUES_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUFFER__ORIGINAL_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Traced Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUFFER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link modelTrace.States.model.impl.TracedFSMImpl <em>Traced FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelTrace.States.model.impl.TracedFSMImpl
	 * @see modelTrace.States.model.impl.ModelPackageImpl#getTracedFSM()
	 * @generated
	 */
	int TRACED_FSM = 1;

	/**
	 * The feature id for the '<em><b>Consummed String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__CONSUMMED_STRING_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__CURRENT_STATE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__ORIGINAL_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Produced String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__PRODUCED_STRING_SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Unprocessed String Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM__UNPROCESSED_STRING_SEQUENCE = 4;

	/**
	 * The number of structural features of the '<em>Traced FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FSM_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link modelTrace.States.model.TracedBuffer <em>Traced Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Buffer</em>'.
	 * @see modelTrace.States.model.TracedBuffer
	 * @generated
	 */
	EClass getTracedBuffer();

	/**
	 * Returns the meta object for the containment reference list '{@link modelTrace.States.model.TracedBuffer#getCurrentValuesSequence <em>Current Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Values Sequence</em>'.
	 * @see modelTrace.States.model.TracedBuffer#getCurrentValuesSequence()
	 * @see #getTracedBuffer()
	 * @generated
	 */
	EReference getTracedBuffer_CurrentValuesSequence();

	/**
	 * Returns the meta object for the reference '{@link modelTrace.States.model.TracedBuffer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see modelTrace.States.model.TracedBuffer#getOriginalObject()
	 * @see #getTracedBuffer()
	 * @generated
	 */
	EReference getTracedBuffer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link modelTrace.States.model.TracedFSM <em>Traced FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced FSM</em>'.
	 * @see modelTrace.States.model.TracedFSM
	 * @generated
	 */
	EClass getTracedFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link modelTrace.States.model.TracedFSM#getConsummedStringSequence <em>Consummed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consummed String Sequence</em>'.
	 * @see modelTrace.States.model.TracedFSM#getConsummedStringSequence()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_ConsummedStringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link modelTrace.States.model.TracedFSM#getCurrentStateSequence <em>Current State Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current State Sequence</em>'.
	 * @see modelTrace.States.model.TracedFSM#getCurrentStateSequence()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_CurrentStateSequence();

	/**
	 * Returns the meta object for the reference '{@link modelTrace.States.model.TracedFSM#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see modelTrace.States.model.TracedFSM#getOriginalObject()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link modelTrace.States.model.TracedFSM#getProducedStringSequence <em>Produced String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produced String Sequence</em>'.
	 * @see modelTrace.States.model.TracedFSM#getProducedStringSequence()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_ProducedStringSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link modelTrace.States.model.TracedFSM#getUnprocessedStringSequence <em>Unprocessed String Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unprocessed String Sequence</em>'.
	 * @see modelTrace.States.model.TracedFSM#getUnprocessedStringSequence()
	 * @see #getTracedFSM()
	 * @generated
	 */
	EReference getTracedFSM_UnprocessedStringSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelTrace.States.model.impl.TracedBufferImpl <em>Traced Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.States.model.impl.TracedBufferImpl
		 * @see modelTrace.States.model.impl.ModelPackageImpl#getTracedBuffer()
		 * @generated
		 */
		EClass TRACED_BUFFER = eINSTANCE.getTracedBuffer();

		/**
		 * The meta object literal for the '<em><b>Current Values Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BUFFER__CURRENT_VALUES_SEQUENCE = eINSTANCE.getTracedBuffer_CurrentValuesSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BUFFER__ORIGINAL_OBJECT = eINSTANCE.getTracedBuffer_OriginalObject();

		/**
		 * The meta object literal for the '{@link modelTrace.States.model.impl.TracedFSMImpl <em>Traced FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelTrace.States.model.impl.TracedFSMImpl
		 * @see modelTrace.States.model.impl.ModelPackageImpl#getTracedFSM()
		 * @generated
		 */
		EClass TRACED_FSM = eINSTANCE.getTracedFSM();

		/**
		 * The meta object literal for the '<em><b>Consummed String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__CONSUMMED_STRING_SEQUENCE = eINSTANCE.getTracedFSM_ConsummedStringSequence();

		/**
		 * The meta object literal for the '<em><b>Current State Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__CURRENT_STATE_SEQUENCE = eINSTANCE.getTracedFSM_CurrentStateSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__ORIGINAL_OBJECT = eINSTANCE.getTracedFSM_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Produced String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__PRODUCED_STRING_SEQUENCE = eINSTANCE.getTracedFSM_ProducedStringSequence();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FSM__UNPROCESSED_STRING_SEQUENCE = eINSTANCE.getTracedFSM_UnprocessedStringSequence();

	}

} //ModelPackage
