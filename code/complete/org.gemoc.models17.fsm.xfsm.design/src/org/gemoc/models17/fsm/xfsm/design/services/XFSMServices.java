package org.gemoc.models17.fsm.xfsm.design.services;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.models17.fsm.xfsm.model.Buffer; 
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsm.model.Transition;

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

		//res.append(transition.getName());
		//res.append("\n");	
		res.append("");
		res.append(transition.getTrigger());
		res.append(" / ");
		res.append(transition.getAction());	
		return res.toString();
	}
	
	public String getTypeString(EObject o) {
		return o.getClass().toString();
	}
	
	
	
	public boolean isCurrentState(EObject o){
		if(o instanceof State){
			return ((State)o).getFsm().getCurrentState() == o;
		} else {
			return false;
		}
	}
	
	public String getBufferLabel(EObject o){
		if(o instanceof Buffer){
			return ((Buffer)o).getCurrentValues().toString();
		} else {
			return "";
		}
	}
	
	
	
	

}
