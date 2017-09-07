/**
 */
package org.gemoc.sample.legacyfsm.fsm.tests;

import junit.textui.TestRunner;

import org.gemoc.sample.legacyfsm.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberVariableTest.class);
	}

	/**
	 * Constructs a new Number Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberVariable getFixture() {
		return (NumberVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FsmFactory.eINSTANCE.createNumberVariable());
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

} //NumberVariableTest
