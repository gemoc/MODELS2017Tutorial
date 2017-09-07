package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;

@SuppressWarnings("all")
public class EqualNumberGuardAspectEqualNumberGuardAspectContext {
  public final static EqualNumberGuardAspectEqualNumberGuardAspectContext INSTANCE = new EqualNumberGuardAspectEqualNumberGuardAspectContext();
  
  public static EqualNumberGuardAspectEqualNumberGuardAspectProperties getSelf(final EqualNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties>();
  
  public Map<EqualNumberGuard, EqualNumberGuardAspectEqualNumberGuardAspectProperties> getMap() {
    return map;
  }
}
