package org.gemoc.sample.legacyfsm.xsfsm.design.services;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable;

/** FSM services.
 * 
* @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * 
 */
public class XFSMServices {

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
				// TODO
			}
			res.append("]");
		}
		if (transition.getAction() != null) {
			res.append(" / ");
			if (transition.getAction() instanceof AssignValueAction) {
				// TODO
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
			res.append(((NumberVariable) var).getValue());
		}
		return res.toString();
	}
	
	public String getTypeString(EObject o) {
		return o.getClass().toString();
	}
	
	
	
	public boolean isCurrentState(EObject o){
		if(o instanceof State){
			return ((State)o).getOwningFSM().getCurrentState() == o;
		} else {
			return false;
		}
	}

}
