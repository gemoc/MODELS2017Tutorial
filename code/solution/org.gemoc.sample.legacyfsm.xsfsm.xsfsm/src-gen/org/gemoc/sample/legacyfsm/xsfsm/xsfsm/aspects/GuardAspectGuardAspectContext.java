package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectProperties;

@SuppressWarnings("all")
public class GuardAspectGuardAspectContext {
  public final static GuardAspectGuardAspectContext INSTANCE = new GuardAspectGuardAspectContext();
  
  public static GuardAspectGuardAspectProperties getSelf(final Guard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Guard, GuardAspectGuardAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectProperties>();
  
  public Map<Guard, GuardAspectGuardAspectProperties> getMap() {
    return map;
  }
}
