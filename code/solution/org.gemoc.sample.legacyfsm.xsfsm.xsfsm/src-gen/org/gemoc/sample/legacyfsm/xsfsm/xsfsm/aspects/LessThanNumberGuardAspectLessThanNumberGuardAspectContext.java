package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;

@SuppressWarnings("all")
public class LessThanNumberGuardAspectLessThanNumberGuardAspectContext {
  public final static LessThanNumberGuardAspectLessThanNumberGuardAspectContext INSTANCE = new LessThanNumberGuardAspectLessThanNumberGuardAspectContext();
  
  public static LessThanNumberGuardAspectLessThanNumberGuardAspectProperties getSelf(final LessThanNumberGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties>();
  
  public Map<LessThanNumberGuard, LessThanNumberGuardAspectLessThanNumberGuardAspectProperties> getMap() {
    return map;
  }
}
