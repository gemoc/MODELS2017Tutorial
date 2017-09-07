package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspect;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Main
  public static void main(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @Step
  public static void step(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "StateMachine", "step");
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
  
  @Step
  @InitializeModel
  public static void assignInitialValues(final StateMachine _self, final EList<String> arguments) {
    final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_assignInitialValues(_self_, _self,arguments);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","assignInitialValues");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  public static State currentState(final StateMachine _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentState(_self_, _self);
	;
	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) result;
}
  
  public static void currentState(final StateMachine _self, final State currentState) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectContext
			.getSelf(_self);
	_privk3_currentState(_self_, _self, currentState);
	;
}
  
  protected static void _privk3_main(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    InputOutput.<String>println("Start the main");
    try {
      while (true) {
        StateMachineAspect.step(_self);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static void _privk3_step(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    State _currentState = StateMachineAspect.currentState(_self);
    EList<Transition> _outgoingTransitions = _currentState.getOutgoingTransitions();
    for (final Transition t : _outgoingTransitions) {
      if ((((!Objects.equal(t.getGuard(), null)) && GuardAspect.holds(t.getGuard())) || Objects.equal(t.getGuard(), null))) {
        TransitionAspect.fire(t);
        State _target = t.getTarget();
        StateMachineAspect.currentState(_self, _target);
      }
    }
  }
  
  protected static void _privk3_assignInitialValues(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EList<String> arguments) {
    State _initialState = _self.getInitialState();
    StateMachineAspect.currentState(_self, _initialState);
    EList<Variable> _variables = _self.getVariables();
    for (final Variable v : _variables) {
      if ((v instanceof NumberVariable)) {
        final NumberVariable ref = ((NumberVariable) v);
        int _initialValue = ref.getInitialValue();
        NumberVariableAspect.value(ref, _initialValue);
      } else {
        throw new Error("Found unsupported variable subtype");
      }
    }
  }
  
  protected static State _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State currentState) {
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
}
