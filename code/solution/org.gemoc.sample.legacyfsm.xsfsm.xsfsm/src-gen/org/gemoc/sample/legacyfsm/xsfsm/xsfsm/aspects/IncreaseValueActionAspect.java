package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.ActionAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = IncreaseValueAction.class)
@SuppressWarnings("all")
public class IncreaseValueActionAspect extends ActionAspect {
  @Step
  public static void execute(final IncreaseValueAction _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.IncreaseValueActionAspectIncreaseValueActionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "IncreaseValueAction", "execute");
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
  
  protected static void _privk3_execute(final IncreaseValueActionAspectIncreaseValueActionAspectProperties _self_, final IncreaseValueAction _self) {
    InputOutput.<String>println("execute numerical value");
    final NumberVariable target = _self.getTarget();
    int _value = NumberVariableAspect.value(target);
    int _stepValue = _self.getStepValue();
    int _plus = (_value + _stepValue);
    NumberVariableAspect.value(target, _plus);
  }
}
