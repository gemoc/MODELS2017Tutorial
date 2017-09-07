/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Equal Number Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EqualNumberGuardTest extends NumberGuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EqualNumberGuardTest.class);
	}

	/**
	 * Constructs a new Equal Number Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualNumberGuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Equal Number Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EqualNumberGuard getFixture() {
		return (EqualNumberGuard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createEqualNumberGuard());
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

} //EqualNumberGuardTest
