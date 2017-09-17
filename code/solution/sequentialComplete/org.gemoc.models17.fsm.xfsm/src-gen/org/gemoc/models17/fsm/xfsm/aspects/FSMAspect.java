package org.gemoc.models17.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspect;
import org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties;
import org.gemoc.models17.fsm.xfsm.aspects.StateAspect;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  public static void initializeFSM(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_initializeFSM(_self_, _self);
	;
}
  
  @Step
  public static void run(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_run(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FSM", "run");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  public static State currentState(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.gemoc.models17.fsm.xfsm.model.State) result;
}
  
  public static void currentState(final FSM _self, final State currentState) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  public static String underProcessTrigger(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_underProcessTrigger(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void underProcessTrigger(final FSM _self, final String underProcessTrigger) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_underProcessTrigger(_self_, _self, underProcessTrigger);
	;
}
  
  public static String consummedString(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_consummedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void consummedString(final FSM _self, final String consummedString) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_consummedString(_self_, _self, consummedString);
	;
}
  
  public static String producedString(final FSM _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_producedString(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void producedString(final FSM _self, final String producedString) {
	final org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.FSMAspectFSMAspectContext
			.getSelf(_self);
	_privk3_producedString(_self_, _self, producedString);
	;
}
  
  protected static void _privk3_initializeFSM(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    InputOutput.<String>println("init FSM");
    State _initialState = _self.getInitialState();
    FSMAspect.currentState(_self, _initialState);
    FSMAspect.underProcessTrigger(_self, "");
    FSMAspect.consummedString(_self, "");
    FSMAspect.producedString(_self, "");
  }
  
  protected static void _privk3_run(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    Buffer _inputBuffer = _self.getInputBuffer();
    boolean _isEmpty = BufferAspect.isEmpty(_inputBuffer);
    if (_isEmpty) {
      String _name = _self.getName();
      String _plus = (_name + "ran erroneously with empty buffer ! :-/");
      InputOutput.<String>println(_plus);
      return;
    }
    Buffer _inputBuffer_1 = _self.getInputBuffer();
    String _dequeue = BufferAspect.dequeue(_inputBuffer_1);
    FSMAspect.underProcessTrigger(_self, _dequeue);
    String _name_1 = _self.getName();
    String _plus_1 = ("run SM" + _name_1);
    String _plus_2 = (_plus_1 + " step on ");
    String _underProcessTrigger = FSMAspect.underProcessTrigger(_self);
    String _plus_3 = (_plus_2 + _underProcessTrigger);
    InputOutput.<String>println(_plus_3);
    try {
      State _currentState = FSMAspect.currentState(_self);
      String _underProcessTrigger_1 = FSMAspect.underProcessTrigger(_self);
      StateAspect.step(_currentState, _underProcessTrigger_1);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus_4 = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus_4);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    FSMAspect.producedString(_self, "");
    FSMAspect.underProcessTrigger(_self, "");
  }
  
  protected static State _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.models17.fsm.xfsm.model.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State currentState) {
    _self_.currentState = currentState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_underProcessTrigger(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnderProcessTrigger") &&
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
    return _self_.underProcessTrigger;
  }
  
  protected static void _privk3_underProcessTrigger(final FSMAspectFSMAspectProperties _self_, final FSM _self, final String underProcessTrigger) {
    _self_.underProcessTrigger = underProcessTrigger; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnderProcessTrigger")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, underProcessTrigger);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_consummedString(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getConsummedString") &&
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
    return _self_.consummedString;
  }
  
  protected static void _privk3_consummedString(final FSMAspectFSMAspectProperties _self_, final FSM _self, final String consummedString) {
    _self_.consummedString = consummedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setConsummedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, consummedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_producedString(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProducedString") &&
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
    return _self_.producedString;
  }
  
  protected static void _privk3_producedString(final FSMAspectFSMAspectProperties _self_, final FSM _self, final String producedString) {
    _self_.producedString = producedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProducedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, producedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
