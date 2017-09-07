package org.gemoc.sample.legacyfsm.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.gemoc.sample.legacyfsm.fsm.State
import org.gemoc.sample.legacyfsm.fsm.StateMachine
import org.gemoc.sample.legacyfsm.fsm.Transition

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.NumberVariableAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.GuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.EqualNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.LessThanNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.GreaterThanNumberGuardAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.AssignValueActionAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.IncreaseValueActionAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspect.*

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.ActionAspect.*

import org.gemoc.sample.legacyfsm.fsm.Variable
import org.gemoc.sample.legacyfsm.fsm.NumberVariable

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.ArrayList
import org.eclipse.emf.common.util.BasicEList
import java.util.Random
import org.gemoc.sample.legacyfsm.fsm.Guard
import org.gemoc.sample.legacyfsm.fsm.NumberGuard
import org.gemoc.sample.legacyfsm.fsm.*

@Aspect(className=StateMachine)
class StateMachineAspect {

    public State currentState

    @Main
    def public void main() {

        println("Start the main")
        try {
            while (true) {
                _self.step
            }
        } catch (Exception nt) {
            println("Stopped due to " + nt.message)
        }
    }

    @Step
    def public void step() {
        // TODO
    }

    @Step
    @InitializeModel
    def public void assignInitialValues(EList<String> arguments) {
        _self.currentState = _self.initialState
        for (Variable v : _self.variables) {
            if (v instanceof NumberVariable) {
                val NumberVariable ref = v as NumberVariable
                ref.value = ref.initialValue
            } else {
                throw new Error("Found unsupported variable subtype")
            }
        }
    }

}

@Aspect(className=State)
class StateAspect {
}

@Aspect(className=Transition)
class TransitionAspect {

    @Step
    def public void fire() {
        println("Firing " + _self.name + " and entering " + _self.target.name)
        // TODO
    }
}

@Aspect(className=Variable)
class VariableAspect {
}

@Aspect(className=NumberVariable)
class NumberVariableAspect {
    public int value;
}

@Aspect(className=Guard)
abstract class GuardAspect {
    @Step
    def abstract boolean holds();

}

@Aspect(className=NumberGuard)
class NumberGuardAspect extends GuardAspect {
    def boolean holds() {
        return false
    }
}

@Aspect(className=EqualNumberGuard)
class EqualNumberGuardAspect extends NumberGuardAspect {
    def boolean holds() {
        val NumberVariable source = _self.source
        val int value = _self.value
        return value == source.value
    }
}

@Aspect(className=GreaterThanNumberGuard)
class GreaterThanNumberGuardAspect extends NumberGuardAspect {
    def boolean holds() {
        val NumberVariable source = _self.source
        val int value = _self.value
        return source.value > value
    }
}

@Aspect(className=LessThanNumberGuard)
class LessThanNumberGuardAspect extends NumberGuardAspect {
    def boolean holds() {
        val NumberVariable source = _self.source
        val int value = _self.value
        return source.value < value
    }
}

@Aspect(className=Action)
abstract class ActionAspect {
    def abstract void execute();
}

@Aspect(className=AssignValueAction)
class AssignValueActionAspect extends ActionAspect {
    @Step
    def void execute() {
        println("execute numerical value")
        val NumberVariable target = _self.target
        target.value = _self.value
    }
}

@Aspect(className=IncreaseValueAction)
class IncreaseValueActionAspect extends ActionAspect {
    @Step
    def void execute() {
        println("execute numerical value")
        val NumberVariable target = _self.target
        target.value = target.value + _self.stepValue
    }
}

@Aspect(className=DecreaseValueAction)
class DecreaseValueActionAspect extends ActionAspect {
    @Step
    def void execute() {
        println("execute numerical value")
        val NumberVariable target = _self.target
        target.value = target.value - _self.stepValue
    }
}
