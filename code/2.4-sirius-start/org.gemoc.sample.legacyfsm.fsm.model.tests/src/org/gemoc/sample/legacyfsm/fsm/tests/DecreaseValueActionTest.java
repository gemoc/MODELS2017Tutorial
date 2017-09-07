/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decrease Value Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecreaseValueActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecreaseValueActionTest.class);
	}

	/**
	 * Constructs a new Decrease Value Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecreaseValueActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decrease Value Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DecreaseValueAction getFixture() {
		return (DecreaseValueAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createDecreaseValueAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DecreaseValueActionTest
