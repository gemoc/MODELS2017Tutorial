package org.gemoc.models17.fsm.xfsm.aspects;

import java.util.Map;
import org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final org.gemoc.models17.fsm.xfsm.model.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.gemoc.models17.fsm.xfsm.model.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<org.gemoc.models17.fsm.xfsm.model.System, org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<org.gemoc.models17.fsm.xfsm.model.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
