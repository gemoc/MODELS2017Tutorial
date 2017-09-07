package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.VariableAspectVariableAspectProperties;

@SuppressWarnings("all")
public class VariableAspectVariableAspectContext {
  public final static VariableAspectVariableAspectContext INSTANCE = new VariableAspectVariableAspectContext();
  
  public static VariableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.VariableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, VariableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.VariableAspectVariableAspectProperties>();
  
  public Map<Variable, VariableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
