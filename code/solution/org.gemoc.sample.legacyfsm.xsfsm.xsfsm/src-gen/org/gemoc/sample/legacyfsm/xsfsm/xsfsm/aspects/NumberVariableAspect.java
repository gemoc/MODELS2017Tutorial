package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties;

@Aspect(className = NumberVariable.class)
@SuppressWarnings("all")
public class NumberVariableAspect {
  public static int value(final NumberVariable _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (int) result;
}
  
  public static void value(final NumberVariable _self, final int value) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspectNumberVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static int _privk3_value(final NumberVariableAspectNumberVariableAspectProperties _self_, final NumberVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final NumberVariableAspectNumberVariableAspectProperties _self_, final NumberVariable _self, final int value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
