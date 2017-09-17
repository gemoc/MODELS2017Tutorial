package org.gemoc.models17.fsm.xfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties;

@Aspect(className = Buffer.class)
@SuppressWarnings("all")
public class BufferAspect {
  public static void initialize(final Buffer _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  public static boolean isEmpty(final Buffer _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isEmpty(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void enqueue(final Buffer _self, final String v) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	_privk3_enqueue(_self_, _self, v);
	;
}
  
  public static String dequeue(final Buffer _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_dequeue(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static String currentValues(final Buffer _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentValues(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void currentValues(final Buffer _self, final String currentValues) {
	final org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	_privk3_currentValues(_self_, _self, currentValues);
	;
}
  
  protected static void _privk3_initialize(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    String _name = _self.getName();
    String _plus = ("initialize buffer " + _name);
    InputOutput.<String>println(_plus);
    String _initialValue = _self.getInitialValue();
    boolean _notEquals = (!Objects.equal(_initialValue, null));
    if (_notEquals) {
      String _initialValue_1 = _self.getInitialValue();
      BufferAspect.currentValues(_self, _initialValue_1);
    } else {
      BufferAspect.currentValues(_self, "\'empty\'");
    }
  }
  
  protected static boolean _privk3_isEmpty(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    return (BufferAspect.currentValues(_self).isEmpty() || (BufferAspect.currentValues(_self).compareTo("\'empty\'") == 0));
  }
  
  protected static void _privk3_enqueue(final BufferAspectBufferAspectProperties _self_, final Buffer _self, final String v) {
    boolean _isEmpty = BufferAspect.isEmpty(_self);
    if (_isEmpty) {
      BufferAspect.currentValues(_self, v);
    } else {
      String _currentValues = BufferAspect.currentValues(_self);
      String _plus = (_currentValues + ",");
      String _plus_1 = (_plus + v);
      BufferAspect.currentValues(_self, _plus_1);
    }
  }
  
  protected static String _privk3_dequeue(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    String res = "";
    String _currentValues = BufferAspect.currentValues(_self);
    int firstComma = _currentValues.indexOf(",");
    if ((firstComma < 0)) {
      String _currentValues_1 = BufferAspect.currentValues(_self);
      res = _currentValues_1;
      BufferAspect.currentValues(_self, "\'empty\'");
      return res;
    }
    String _currentValues_2 = BufferAspect.currentValues(_self);
    String _substring = _currentValues_2.substring(0, firstComma);
    res = _substring;
    String _currentValues_3 = BufferAspect.currentValues(_self);
    String _currentValues_4 = BufferAspect.currentValues(_self);
    int _length = _currentValues_4.length();
    String _substring_1 = _currentValues_3.substring((firstComma + 1), _length);
    BufferAspect.currentValues(_self, _substring_1);
    return res;
  }
  
  protected static String _privk3_currentValues(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValues") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValues;
  }
  
  protected static void _privk3_currentValues(final BufferAspectBufferAspectProperties _self_, final Buffer _self, final String currentValues) {
    _self_.currentValues = currentValues; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValues);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
