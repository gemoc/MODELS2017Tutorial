package org.gemoc.models17.fsm.xfsm.aspects;

import java.util.Map;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties;

@SuppressWarnings("all")
public class BufferAspectBufferAspectContext {
  public final static BufferAspectBufferAspectContext INSTANCE = new BufferAspectBufferAspectContext();
  
  public static BufferAspectBufferAspectProperties getSelf(final Buffer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Buffer, BufferAspectBufferAspectProperties> map = new java.util.WeakHashMap<org.gemoc.models17.fsm.xfsm.model.Buffer, org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties>();
  
  public Map<Buffer, BufferAspectBufferAspectProperties> getMap() {
    return map;
  }
}
