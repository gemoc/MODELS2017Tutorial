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

		res.append(transition.getName());
		res.append(" ");	
		if (transition.getGuard() != null) {
			res.append("[");
			if (transition.getGuard() instanceof EqualNumberGuard) {
				NumberGuard ng = (EqualNumberGuard) transition.getGuard();
				String sourceName = "N/A";
				if (ng.getSource() != null) {
					sourceName = ng.getSource().getName();
				}
				res.append(sourceName);
				res.append(" == ");
				res.append(ng.getValue());
			}
			else if (transition.getGuard() instanceof LessThanNumberGuard) {
				NumberGuard ng = (LessThanNumberGuard) transition.getGuard();
				String sourceName = "N/A";
				if (ng.getSource() != null) {
					sourceName = ng.getSource().getName();
				}
				res.append(sourceName);
				res.append(" < ");
				res.append(ng.getValue());
			}
			else if (transition.getGuard() instanceof GreaterThanNumberGuard) {
				NumberGuard ng = (GreaterThanNumberGuard) transition.getGuard();
				String sourceName = "N/A";
				if (ng.getSource() != null) {
					sourceName = ng.getSource().getName();
				}
				res.append(sourceName);
				res.append(" > ");
				res.append(ng.getValue());
			}
			res.append("]");
		}
		if (transition.getAction() != null) {
			res.append(" / ");
			if (transition.getAction() instanceof AssignValueAction) {
				AssignValueAction ac = (AssignValueAction) transition.getAction();
				String targetName = "N/A";
				if (ac.getTarget() != null) {
					targetName = ac.getTarget().getName();
				}
				res.append(targetName);
				res.append(" := ");
				res.append(ac.getValue());
			}
			else if (transition.getAction() instanceof IncreaseValueAction) {
				IncreaseValueAction ac = (IncreaseValueAction) transition.getAction();
				String targetName = "N/A";
				if (ac.getTarget() != null) {
					targetName = ac.getTarget().getName();
				}
				res.append(targetName);
				res.append(" += ");
				res.append(ac.getStepValue());
			}
			else if (transition.getAction() instanceof DecreaseValueAction) {
				DecreaseValueAction ac = (DecreaseValueAction) transition.getAction();
				String targetName = "N/A";
				if (ac.getTarget() != null) {
					targetName = ac.getTarget().getName();
				}
				res.append(targetName);
				res.append(" -= ");
				res.append(ac.getStepValue());
			}
		}
		
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
