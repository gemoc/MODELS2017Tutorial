package org.gemoc.models17.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsm.model.Transition;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspect;
import org.gemoc.models17.fsm.xfsm.aspects.FSMAspect;
import org.gemoc.models17.fsm.xfsm.aspects.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.TransitionAspectTransitionAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
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
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    State _tgt = _self.getTgt();
    String _name_1 = _tgt.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    State _src = _self.getSrc();
    final FSM fsm = _src.getFsm();
    State _tgt_1 = _self.getTgt();
    FSMAspect.currentState(fsm, _tgt_1);
    String _action = _self.getAction();
    FSMAspect.producedString(fsm, _action);
    String _consummedString = FSMAspect.consummedString(fsm);
    String _underProcessTrigger = FSMAspect.underProcessTrigger(fsm);
    String _plus_3 = (_consummedString + _underProcessTrigger);
    FSMAspect.consummedString(fsm, _plus_3);
    Buffer _outputBuffer = fsm.getOutputBuffer();
    String _producedString = FSMAspect.producedString(fsm);
    BufferAspect.enqueue(_outputBuffer, _producedString);
  }
}
