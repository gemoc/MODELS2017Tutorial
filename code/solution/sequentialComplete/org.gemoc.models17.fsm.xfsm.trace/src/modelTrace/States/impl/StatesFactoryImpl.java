/**
 */
package modelTrace.States.impl;

import modelTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE: return createBuffer_currentValues_Value();
			case StatesPackage.FSM_CONSUMMED_STRING_VALUE: return createFSM_consummedString_Value();
			case StatesPackage.FSM_CURRENT_STATE_VALUE: return createFSM_currentState_Value();
			case StatesPackage.FSM_PRODUCED_STRING_VALUE: return createFSM_producedString_Value();
			case StatesPackage.FSM_UNDER_PROCESS_TRIGGER_VALUE: return createFSM_underProcessTrigger_Value();
			case StatesPackage.STATE: return createState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer_currentValues_Value createBuffer_currentValues_Value() {
		Buffer_currentValues_ValueImpl buffer_currentValues_Value = new Buffer_currentValues_ValueImpl();
		return buffer_currentValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM_consummedString_Value createFSM_consummedString_Value() {
		FSM_consummedString_ValueImpl fsM_consummedString_Value = new FSM_consummedString_ValueImpl();
		return fsM_consummedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM_currentState_Value createFSM_currentState_Value() {
		FSM_currentState_ValueImpl fsM_currentState_Value = new FSM_currentState_ValueImpl();
		return fsM_currentState_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM_producedString_Value createFSM_producedString_Value() {
		FSM_producedString_ValueImpl fsM_producedString_Value = new FSM_producedString_ValueImpl();
		return fsM_producedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM_underProcessTrigger_Value createFSM_underProcessTrigger_Value() {
		FSM_underProcessTrigger_ValueImpl fsM_underProcessTrigger_Value = new FSM_underProcessTrigger_ValueImpl();
		return fsM_underProcessTrigger_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
