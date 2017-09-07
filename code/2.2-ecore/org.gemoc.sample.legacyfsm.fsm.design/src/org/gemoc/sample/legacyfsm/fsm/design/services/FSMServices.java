package org.gemoc.sample.legacyfsm.fsm.design.services;

import org.gemoc.sample.legacyfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.fsm.NumberGuard;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.fsm.Variable;

/** FSM services.
 * 
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class FSMServices {

	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();

		// TODO
		
		return res.toString();
	}
	
	public String printVariableState(Variable var) {
		final StringBuilder res = new StringBuilder();

		res.append("var: ");
		res.append(var.getName());
		if (var instanceof NumberVariable) {
			res.append(" = ");
			res.append(((NumberVariable) var).getInitialValue());
		}
		return res.toString();
	}

}
