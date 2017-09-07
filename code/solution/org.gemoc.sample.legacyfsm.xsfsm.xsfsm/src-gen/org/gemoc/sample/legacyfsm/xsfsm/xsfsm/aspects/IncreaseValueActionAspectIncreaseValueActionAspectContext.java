package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectProperties;

@SuppressWarnings("all")
public class IncreaseValueActionAspectIncreaseValueActionAspectContext {
  public final static IncreaseValueActionAspectIncreaseValueActionAspectContext INSTANCE = new IncreaseValueActionAspectIncreaseValueActionAspectContext();
  
  public static IncreaseValueActionAspectIncreaseValueActionAspectProperties getSelf(final IncreaseValueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IncreaseValueAction, IncreaseValueActionAspectIncreaseValueActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectProperties>();
  
  public Map<IncreaseValueAction, IncreaseValueActionAspectIncreaseValueActionAspectProperties> getMap() {
    return map;
  }
}
