package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext {
  public final static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext INSTANCE = new GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext();
  
  public static GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties getSelf(final GreaterThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties>();
  
  public Map<GreaterThanNumberGuard, GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
