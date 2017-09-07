package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberGuardAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = LessThanNumberGuard.class)
@SuppressWarnings("all")
public class LessThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessThanNumberGuard _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_, final LessThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final int value = _self.getValue();
    int _value = NumberVariableAspect.value(source);
    return (_value < value);
  }
}
