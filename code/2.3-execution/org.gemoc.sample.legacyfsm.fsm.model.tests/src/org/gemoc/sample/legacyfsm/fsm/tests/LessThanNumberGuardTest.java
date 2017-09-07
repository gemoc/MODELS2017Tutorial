/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less Than Number Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessThanNumberGuardTest extends NumberGuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LessThanNumberGuardTest.class);
	}

	/**
	 * Constructs a new Less Than Number Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanNumberGuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Less Than Number Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LessThanNumberGuard getFixture() {
		return (LessThanNumberGuard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createLessThanNumberGuard());
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

} //LessThanNumberGuardTest
