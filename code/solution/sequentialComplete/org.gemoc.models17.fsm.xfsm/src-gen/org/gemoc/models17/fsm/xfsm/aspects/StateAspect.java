package org.gemoc.models17.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsm.model.Transition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspect;
import org.gemoc.models17.fsm.xfsm.aspects.StateAspectStateAspectProperties;
import org.gemoc.models17.fsm.xfsm.aspects.TransitionAspect;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString) {
	final org.gemoc.models17.fsm.xfsm.aspects.StateAspectStateAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self, inputString);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "step");
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
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString) {
    try {
      EList<Transition> _outgoing = _self.getOutgoing();
      final Function1<Transition, Boolean> _function = (Transition t) -> {
        String _trigger = t.getTrigger();
        int _compareTo = inputString.compareTo(_trigger);
        return Boolean.valueOf((_compareTo == 0));
      };
      final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_outgoing, _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
      if (_isEmpty) {
        FSM _fsm = _self.getFsm();
        Buffer _outputBuffer = _fsm.getOutputBuffer();
        BufferAspect.enqueue(_outputBuffer, inputString);
      }
      int _size = IterableExtensions.size(validTransitions);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("Non Determinism");
      }
      int _size_1 = IterableExtensions.size(validTransitions);
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        Transition _get = ((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0];
        TransitionAspect.fire(_get);
        return;
      }
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
