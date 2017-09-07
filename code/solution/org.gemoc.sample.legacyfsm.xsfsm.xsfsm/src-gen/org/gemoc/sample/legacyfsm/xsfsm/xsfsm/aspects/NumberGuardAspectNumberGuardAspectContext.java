package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties;

@SuppressWarnings("all")
public class NumberGuardAspectNumberGuardAspectContext {
  public final static NumberGuardAspectNumberGuardAspectContext INSTANCE = new NumberGuardAspectNumberGuardAspectContext();
  
  public static NumberGuardAspectNumberGuardAspectProperties getSelf(final NumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties>();
  
  public Map<NumberGuard, NumberGuardAspectNumberGuardAspectProperties> getMap() {
    return map;
  }
}
