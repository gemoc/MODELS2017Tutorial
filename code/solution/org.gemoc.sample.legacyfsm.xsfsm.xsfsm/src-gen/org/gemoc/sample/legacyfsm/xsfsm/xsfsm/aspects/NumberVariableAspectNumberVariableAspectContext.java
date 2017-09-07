package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties;

@SuppressWarnings("all")
public class NumberVariableAspectNumberVariableAspectContext {
  public final static NumberVariableAspectNumberVariableAspectContext INSTANCE = new NumberVariableAspectNumberVariableAspectContext();
  
  public static NumberVariableAspectNumberVariableAspectProperties getSelf(final NumberVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties>();
  
  public Map<NumberVariable, NumberVariableAspectNumberVariableAspectProperties> getMap() {
    return map;
  }
}
