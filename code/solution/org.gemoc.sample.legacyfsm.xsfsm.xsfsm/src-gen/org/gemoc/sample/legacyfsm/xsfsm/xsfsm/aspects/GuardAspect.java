package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectProperties;

@Aspect(className = Guard.class)
@SuppressWarnings("all")
public abstract class GuardAspect {
  @Step
  @Abstract
  public static boolean holds(final Guard _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspectGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.EqualNumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard) {
		result = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspect
				.holds((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard) _self);
	} else if (_self instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				addToResult(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GuardAspect._privk3_holds(_self_,
						(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard) _self));
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Guard", "holds");
		} else {
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager(null);
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		result = command.getResult();
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GuardAspectGuardAspectProperties _self_, final Guard _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
