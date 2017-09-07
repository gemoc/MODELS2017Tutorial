/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greater Than Number Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreaterThanNumberGuardTest extends NumberGuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreaterThanNumberGuardTest.class);
	}

	/**
	 * Constructs a new Greater Than Number Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanNumberGuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Greater Than Number Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GreaterThanNumberGuard getFixture() {
		return (GreaterThanNumberGuard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createGreaterThanNumberGuard());
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

} //GreaterThanNumberGuardTest
