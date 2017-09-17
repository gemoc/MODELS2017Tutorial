/**
 */
package modelTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import modelTrace.ModelTracePackage;

import modelTrace.States.Buffer_currentValues_Value;
import modelTrace.States.FSM_consummedString_Value;
import modelTrace.States.FSM_currentState_Value;
import modelTrace.States.FSM_producedString_Value;
import modelTrace.States.FSM_underProcessTrigger_Value;
import modelTrace.States.State;
import modelTrace.States.StatesFactory;
import modelTrace.States.StatesPackage;
import modelTrace.States.Value;

import modelTrace.States.model.impl.ModelPackageImpl;

import modelTrace.Steps.StepsPackage;

import modelTrace.Steps.impl.StepsPackageImpl;

import modelTrace.impl.ModelTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.models17.fsm.xfsm.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buffer_currentValues_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsM_consummedString_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsM_currentState_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsM_producedString_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsM_underProcessTrigger_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modelTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelTracePackageImpl theModelTracePackage = (ModelTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelTracePackage.eNS_URI) instanceof ModelTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelTracePackage.eNS_URI) : ModelTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ModelPackageImpl theModelPackage_1 = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI) : modelTrace.States.model.ModelPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theModelTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theModelPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theModelTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theModelPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer_currentValues_Value() {
		return buffer_currentValues_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_currentValues_Value_CurrentValues() {
		return (EAttribute)buffer_currentValues_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_currentValues_Value_Parent() {
		return (EReference)buffer_currentValues_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_currentValues_Value_States() {
		return (EReference)buffer_currentValues_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM_consummedString_Value() {
		return fsM_consummedString_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSM_consummedString_Value_ConsummedString() {
		return (EAttribute)fsM_consummedString_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_consummedString_Value_Parent() {
		return (EReference)fsM_consummedString_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_consummedString_Value_States() {
		return (EReference)fsM_consummedString_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM_currentState_Value() {
		return fsM_currentState_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_currentState_Value_CurrentState() {
		return (EReference)fsM_currentState_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_currentState_Value_Parent() {
		return (EReference)fsM_currentState_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_currentState_Value_States() {
		return (EReference)fsM_currentState_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM_producedString_Value() {
		return fsM_producedString_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_producedString_Value_Parent() {
		return (EReference)fsM_producedString_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSM_producedString_Value_ProducedString() {
		return (EAttribute)fsM_producedString_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_producedString_Value_States() {
		return (EReference)fsM_producedString_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM_underProcessTrigger_Value() {
		return fsM_underProcessTrigger_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_underProcessTrigger_Value_Parent() {
		return (EReference)fsM_underProcessTrigger_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_underProcessTrigger_Value_States() {
		return (EReference)fsM_underProcessTrigger_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSM_underProcessTrigger_Value_UnderProcessTrigger() {
		return (EAttribute)fsM_underProcessTrigger_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Buffer_currentValues_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FSM_consummedString_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FSM_currentState_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FSM_producedString_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FSM_underProcessTrigger_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buffer_currentValues_ValueEClass = createEClass(BUFFER_CURRENT_VALUES_VALUE);
		createEAttribute(buffer_currentValues_ValueEClass, BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES);
		createEReference(buffer_currentValues_ValueEClass, BUFFER_CURRENT_VALUES_VALUE__PARENT);
		createEReference(buffer_currentValues_ValueEClass, BUFFER_CURRENT_VALUES_VALUE__STATES);

		fsM_consummedString_ValueEClass = createEClass(FSM_CONSUMMED_STRING_VALUE);
		createEAttribute(fsM_consummedString_ValueEClass, FSM_CONSUMMED_STRING_VALUE__CONSUMMED_STRING);
		createEReference(fsM_consummedString_ValueEClass, FSM_CONSUMMED_STRING_VALUE__PARENT);
		createEReference(fsM_consummedString_ValueEClass, FSM_CONSUMMED_STRING_VALUE__STATES);

		fsM_currentState_ValueEClass = createEClass(FSM_CURRENT_STATE_VALUE);
		createEReference(fsM_currentState_ValueEClass, FSM_CURRENT_STATE_VALUE__CURRENT_STATE);
		createEReference(fsM_currentState_ValueEClass, FSM_CURRENT_STATE_VALUE__PARENT);
		createEReference(fsM_currentState_ValueEClass, FSM_CURRENT_STATE_VALUE__STATES);

		fsM_producedString_ValueEClass = createEClass(FSM_PRODUCED_STRING_VALUE);
		createEReference(fsM_producedString_ValueEClass, FSM_PRODUCED_STRING_VALUE__PARENT);
		createEAttribute(fsM_producedString_ValueEClass, FSM_PRODUCED_STRING_VALUE__PRODUCED_STRING);
		createEReference(fsM_producedString_ValueEClass, FSM_PRODUCED_STRING_VALUE__STATES);

		fsM_underProcessTrigger_ValueEClass = createEClass(FSM_UNDER_PROCESS_TRIGGER_VALUE);
		createEReference(fsM_underProcessTrigger_ValueEClass, FSM_UNDER_PROCESS_TRIGGER_VALUE__PARENT);
		createEReference(fsM_underProcessTrigger_ValueEClass, FSM_UNDER_PROCESS_TRIGGER_VALUE__STATES);
		createEAttribute(fsM_underProcessTrigger_ValueEClass, FSM_UNDER_PROCESS_TRIGGER_VALUE__UNDER_PROCESS_TRIGGER);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__BUFFER_CURRENT_VALUES_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__FSM_CONSUMMED_STRING_VALUES);
		createEReference(stateEClass, STATE__FSM_CURRENT_STATE_VALUES);
		createEReference(stateEClass, STATE__FSM_PRODUCED_STRING_VALUES);
		createEReference(stateEClass, STATE__FSM_UNDER_PROCESS_TRIGGER_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		modelTrace.States.model.ModelPackage theModelPackage_1 = (modelTrace.States.model.ModelPackage)EPackage.Registry.INSTANCE.getEPackage(modelTrace.States.model.ModelPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theModelPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buffer_currentValues_ValueEClass.getESuperTypes().add(this.getValue());
		fsM_consummedString_ValueEClass.getESuperTypes().add(this.getValue());
		fsM_currentState_ValueEClass.getESuperTypes().add(this.getValue());
		fsM_producedString_ValueEClass.getESuperTypes().add(this.getValue());
		fsM_underProcessTrigger_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(buffer_currentValues_ValueEClass, Buffer_currentValues_Value.class, "Buffer_currentValues_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuffer_currentValues_Value_CurrentValues(), ecorePackage.getEString(), "currentValues", null, 0, 1, Buffer_currentValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuffer_currentValues_Value_Parent(), theModelPackage_1.getTracedBuffer(), theModelPackage_1.getTracedBuffer_CurrentValuesSequence(), "parent", null, 1, 1, Buffer_currentValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuffer_currentValues_Value_States(), this.getState(), this.getState_Buffer_currentValues_Values(), "states", null, 1, -1, Buffer_currentValues_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(buffer_currentValues_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsM_consummedString_ValueEClass, FSM_consummedString_Value.class, "FSM_consummedString_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSM_consummedString_Value_ConsummedString(), ecorePackage.getEString(), "consummedString", null, 0, 1, FSM_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_consummedString_Value_Parent(), theModelPackage_1.getTracedFSM(), theModelPackage_1.getTracedFSM_ConsummedStringSequence(), "parent", null, 1, 1, FSM_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_consummedString_Value_States(), this.getState(), this.getState_FSM_consummedString_Values(), "states", null, 1, -1, FSM_consummedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fsM_consummedString_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsM_currentState_ValueEClass, FSM_currentState_Value.class, "FSM_currentState_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSM_currentState_Value_CurrentState(), theModelPackage.getState(), null, "currentState", null, 0, 1, FSM_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_currentState_Value_Parent(), theModelPackage_1.getTracedFSM(), theModelPackage_1.getTracedFSM_CurrentStateSequence(), "parent", null, 1, 1, FSM_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_currentState_Value_States(), this.getState(), this.getState_FSM_currentState_Values(), "states", null, 1, -1, FSM_currentState_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fsM_currentState_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsM_producedString_ValueEClass, FSM_producedString_Value.class, "FSM_producedString_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSM_producedString_Value_Parent(), theModelPackage_1.getTracedFSM(), theModelPackage_1.getTracedFSM_ProducedStringSequence(), "parent", null, 1, 1, FSM_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFSM_producedString_Value_ProducedString(), ecorePackage.getEString(), "producedString", null, 0, 1, FSM_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_producedString_Value_States(), this.getState(), this.getState_FSM_producedString_Values(), "states", null, 1, -1, FSM_producedString_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fsM_producedString_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsM_underProcessTrigger_ValueEClass, FSM_underProcessTrigger_Value.class, "FSM_underProcessTrigger_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSM_underProcessTrigger_Value_Parent(), theModelPackage_1.getTracedFSM(), theModelPackage_1.getTracedFSM_UnderProcessTriggerSequence(), "parent", null, 1, 1, FSM_underProcessTrigger_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_underProcessTrigger_Value_States(), this.getState(), this.getState_FSM_underProcessTrigger_Values(), "states", null, 1, -1, FSM_underProcessTrigger_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFSM_underProcessTrigger_Value_UnderProcessTrigger(), ecorePackage.getEString(), "underProcessTrigger", null, 0, 1, FSM_underProcessTrigger_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fsM_underProcessTrigger_ValueEClass, this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Buffer_currentValues_Values(), this.getBuffer_currentValues_Value(), this.getBuffer_currentValues_Value_States(), "buffer_currentValues_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_FSM_consummedString_Values(), this.getFSM_consummedString_Value(), this.getFSM_consummedString_Value_States(), "fSM_consummedString_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FSM_currentState_Values(), this.getFSM_currentState_Value(), this.getFSM_currentState_Value_States(), "fSM_currentState_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FSM_producedString_Values(), this.getFSM_producedString_Value(), this.getFSM_producedString_Value_States(), "fSM_producedString_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_FSM_underProcessTrigger_Values(), this.getFSM_underProcessTrigger_Value(), this.getFSM_underProcessTrigger_Value_States(), "fSM_underProcessTrigger_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (buffer_currentValues_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsM_consummedString_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsM_currentState_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsM_producedString_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (fsM_underProcessTrigger_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getBuffer_currentValues_Value_CurrentValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSM_consummedString_Value_ConsummedString(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSM_currentState_Value_CurrentState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSM_producedString_Value_ProducedString(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFSM_underProcessTrigger_Value_UnderProcessTrigger(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
