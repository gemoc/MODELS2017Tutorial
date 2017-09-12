/**
 */
package modelTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import modelTrace.ModelTracePackage;
import modelTrace.SpecificTrace;

import modelTrace.States.State;

import modelTrace.States.model.TracedBuffer;
import modelTrace.States.model.TracedFSM;

import modelTrace.Steps.Model_FSM_Run;
import modelTrace.Steps.Model_State_Step;
import modelTrace.Steps.Model_Transition_Fire;
import modelTrace.Steps.Root_Initialize;
import modelTrace.Steps.SpecificStep;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getModel_FSM_Run_Sequence <em>Model FSM Run Sequence</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getModel_State_Step_Sequence <em>Model State Step Sequence</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getModel_Transition_Fire_Sequence <em>Model Transition Fire Sequence</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getRoot_Initialize_Sequence <em>Root Initialize Sequence</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getModel_tracedBuffers <em>Model traced Buffers</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getModel_tracedFSMs <em>Model traced FS Ms</em>}</li>
 *   <li>{@link modelTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getModel_FSM_Run_Sequence() <em>Model FSM Run Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_FSM_Run_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_FSM_Run> model_FSM_Run_Sequence;

	/**
	 * The cached value of the '{@link #getModel_State_Step_Sequence() <em>Model State Step Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_State_Step_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_State_Step> model_State_Step_Sequence;

	/**
	 * The cached value of the '{@link #getModel_Transition_Fire_Sequence() <em>Model Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_Transition_Fire> model_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getRoot_Initialize_Sequence() <em>Root Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Root_Initialize> root_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getModel_tracedBuffers() <em>Model traced Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_tracedBuffers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBuffer> model_tracedBuffers;

	/**
	 * The cached value of the '{@link #getModel_tracedFSMs() <em>Model traced FS Ms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel_tracedFSMs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedFSM> model_tracedFSMs;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model_FSM_Run> getModel_FSM_Run_Sequence() {
		if (model_FSM_Run_Sequence == null) {
			model_FSM_Run_Sequence = new EObjectResolvingEList<Model_FSM_Run>(Model_FSM_Run.class, this, ModelTracePackage.SPECIFIC_TRACE__MODEL_FSM_RUN_SEQUENCE);
		}
		return model_FSM_Run_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model_State_Step> getModel_State_Step_Sequence() {
		if (model_State_Step_Sequence == null) {
			model_State_Step_Sequence = new EObjectResolvingEList<Model_State_Step>(Model_State_Step.class, this, ModelTracePackage.SPECIFIC_TRACE__MODEL_STATE_STEP_SEQUENCE);
		}
		return model_State_Step_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model_Transition_Fire> getModel_Transition_Fire_Sequence() {
		if (model_Transition_Fire_Sequence == null) {
			model_Transition_Fire_Sequence = new EObjectResolvingEList<Model_Transition_Fire>(Model_Transition_Fire.class, this, ModelTracePackage.SPECIFIC_TRACE__MODEL_TRANSITION_FIRE_SEQUENCE);
		}
		return model_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Root_Initialize> getRoot_Initialize_Sequence() {
		if (root_Initialize_Sequence == null) {
			root_Initialize_Sequence = new EObjectResolvingEList<Root_Initialize>(Root_Initialize.class, this, ModelTracePackage.SPECIFIC_TRACE__ROOT_INITIALIZE_SEQUENCE);
		}
		return root_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBuffer> getModel_tracedBuffers() {
		if (model_tracedBuffers == null) {
			model_tracedBuffers = new EObjectContainmentEList<TracedBuffer>(TracedBuffer.class, this, ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS);
		}
		return model_tracedBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedFSM> getModel_tracedFSMs() {
		if (model_tracedFSMs == null) {
			model_tracedFSMs = new EObjectContainmentEList<TracedFSM>(TracedFSM.class, this, ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS);
		}
		return model_tracedFSMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS:
				return ((InternalEList<?>)getModel_tracedBuffers()).basicRemove(otherEnd, msgs);
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS:
				return ((InternalEList<?>)getModel_tracedFSMs()).basicRemove(otherEnd, msgs);
			case ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_FSM_RUN_SEQUENCE:
				return getModel_FSM_Run_Sequence();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_STATE_STEP_SEQUENCE:
				return getModel_State_Step_Sequence();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRANSITION_FIRE_SEQUENCE:
				return getModel_Transition_Fire_Sequence();
			case ModelTracePackage.SPECIFIC_TRACE__ROOT_INITIALIZE_SEQUENCE:
				return getRoot_Initialize_Sequence();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS:
				return getModel_tracedBuffers();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS:
				return getModel_tracedFSMs();
			case ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_FSM_RUN_SEQUENCE:
				getModel_FSM_Run_Sequence().clear();
				getModel_FSM_Run_Sequence().addAll((Collection<? extends Model_FSM_Run>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_STATE_STEP_SEQUENCE:
				getModel_State_Step_Sequence().clear();
				getModel_State_Step_Sequence().addAll((Collection<? extends Model_State_Step>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRANSITION_FIRE_SEQUENCE:
				getModel_Transition_Fire_Sequence().clear();
				getModel_Transition_Fire_Sequence().addAll((Collection<? extends Model_Transition_Fire>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__ROOT_INITIALIZE_SEQUENCE:
				getRoot_Initialize_Sequence().clear();
				getRoot_Initialize_Sequence().addAll((Collection<? extends Root_Initialize>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS:
				getModel_tracedBuffers().clear();
				getModel_tracedBuffers().addAll((Collection<? extends TracedBuffer>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS:
				getModel_tracedFSMs().clear();
				getModel_tracedFSMs().addAll((Collection<? extends TracedFSM>)newValue);
				return;
			case ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_FSM_RUN_SEQUENCE:
				getModel_FSM_Run_Sequence().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_STATE_STEP_SEQUENCE:
				getModel_State_Step_Sequence().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRANSITION_FIRE_SEQUENCE:
				getModel_Transition_Fire_Sequence().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__ROOT_INITIALIZE_SEQUENCE:
				getRoot_Initialize_Sequence().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS:
				getModel_tracedBuffers().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS:
				getModel_tracedFSMs().clear();
				return;
			case ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_FSM_RUN_SEQUENCE:
				return model_FSM_Run_Sequence != null && !model_FSM_Run_Sequence.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_STATE_STEP_SEQUENCE:
				return model_State_Step_Sequence != null && !model_State_Step_Sequence.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRANSITION_FIRE_SEQUENCE:
				return model_Transition_Fire_Sequence != null && !model_Transition_Fire_Sequence.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__ROOT_INITIALIZE_SEQUENCE:
				return root_Initialize_Sequence != null && !root_Initialize_Sequence.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_BUFFERS:
				return model_tracedBuffers != null && !model_tracedBuffers.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__MODEL_TRACED_FS_MS:
				return model_tracedFSMs != null && !model_tracedFSMs.isEmpty();
			case ModelTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
