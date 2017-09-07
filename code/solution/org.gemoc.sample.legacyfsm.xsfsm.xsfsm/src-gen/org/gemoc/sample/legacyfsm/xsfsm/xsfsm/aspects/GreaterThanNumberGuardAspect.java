package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = GreaterThanNumberGuard.class)
@SuppressWarnings("all")
public class GreaterThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final GreaterThanNumberGuard _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_, final GreaterThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final int value = _self.getValue();
    int _value = NumberVariableAspect.value(source);
    return (_value > value);
  }
}
