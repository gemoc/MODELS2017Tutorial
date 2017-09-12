package org.gemoc.models17.fsm.semantics.model.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import model.FSM
import model.State
import model.Buffer
import model.Transition
import model.System

import static extension org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect.*
import static extension org.gemoc.models17.fsm.semantics.model.aspects.StateAspect.*
import static extension org.gemoc.models17.fsm.semantics.model.aspects.BufferAspect.*
import static extension org.gemoc.models17.fsm.semantics.model.aspects.TransitionAspect.*
import static extension org.gemoc.models17.fsm.semantics.model.aspects.SystemAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList

@Aspect(className=System)
class SystemAspect {
	
	@Step
	@InitializeModel
	def public void initialize(){
		println("init")
		for(FSM sm : _self.ownedFsms){
			sm.initializeFSM()
		}
		for(Buffer b : _self.ownedBuffers){
			b.initialize();
		}
		println("finish init")
	}
	
	@Main
    def public void main() {
    	
    	while(true){
	    	try{	
	   			for(FSM sm : _self.ownedFsms){
	   				sm.run()
	   			}
			}  catch (Exception nt){
				println("Stopped due to "+nt.message)
			}
		}

	}

}

@Aspect(className=FSM)
class FSMAspect {

	public State currentState
	
	public String unprocessedString
	public String consummedString
	public String producedString 

	def public void initializeFSM(){
		println("init FSM")
		_self.currentState = _self.initialState;
		_self.unprocessedString = ""
		_self.consummedString = ""
		_self.producedString = ""
	}
	
	@Step
    def public void run() {
    	if (_self.inputBuffer.currentValues.size == 0){
    		return
    	}
    	_self.unprocessedString = _self.unprocessedString + _self.inputBuffer.dequeue
    	
    	println("run SM"+_self.name+" step on "+_self.unprocessedString)
    	try{	
   			_self.currentState.step(_self.unprocessedString)
		} catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
	
		_self.outputBuffer.enqueue(_self.producedString)
    	_self.producedString = ""
    		
	}

}

@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoing.filter[t | inputString.startsWith(t.trigger)]
		if(validTransitions.empty) {
			//throw new NoTransition()
			throw new Exception("No Transition")
		}
		if(validTransitions.size > 1) {
			//throw new NonDeterminism()
			throw new Exception("Non Determinism")
			
		}
		// Fire transition
		validTransitions.get(0).fire
	}
}

@Aspect(className=Buffer)
class BufferAspect {
	
	public EList<String> currentValues
	
	public def void initialize(){
		println("initialize buffer "+_self.name)
		for(String s : _self.initialValue){
			_self.currentValues.add(s) 
		}
	}
	
	public def void enqueue(String v){
		_self.currentValues.add(v)
	}

	public def String dequeue(){
		var String res = _self.currentValues.get(0)
		_self.currentValues.remove(0)
		return res
	}

}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.tgt.name)
		val fsm = _self.src.fsm
		fsm.currentState = _self.tgt
		fsm.producedString = fsm.producedString + _self.action
		fsm.consummedString = fsm.consummedString + _self.trigger
		fsm.unprocessedString = fsm.unprocessedString.substring(_self.trigger.length)
	}
}





