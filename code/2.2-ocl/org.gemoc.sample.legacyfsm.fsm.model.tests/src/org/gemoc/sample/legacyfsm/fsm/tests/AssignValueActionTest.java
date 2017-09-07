/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assign Value Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignValueActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssignValueActionTest.class);
	}

	/**
	 * Constructs a new Assign Value Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignValueActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assign Value Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssignValueAction getFixture() {
		return (AssignValueAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createAssignValueAction());
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

} //AssignValueActionTest
