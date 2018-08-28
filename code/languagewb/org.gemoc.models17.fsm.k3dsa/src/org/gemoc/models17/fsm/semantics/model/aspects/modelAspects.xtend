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
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod

@Aspect(className=System)
class SystemAspect {
	
	@Step
	@InitializeModel
	def public void initialize(EList<String> p){
		println("[INIT] Started")
		for(FSM sm : _self.ownedFsms){
			sm.initializeFSM()
		}
		for(Buffer b : _self.ownedBuffers){
			b.initialize();
		}
		println("[INIT] Completed")
	}
	
	@Main
    def public void main() {
    	var boolean anFSMRan = true
    	while(anFSMRan){
    		anFSMRan = false
	    	try{	
	   			for(FSM sm : _self.ownedFsms){
	   				if (! sm.inputBuffer.isEmpty){
	   					sm.run()
	   					anFSMRan = true	
	   				}
	   			}
			}  catch (Exception nt){
				println("Warning due to "+nt.message)
			}
		}
	println('no more FSM to run')
	}

}

@Aspect(className=FSM)
class FSMAspect {

	public State currentState
	
	public String underProcessTrigger
	public String consummedString
	
	
	def public void initializeFSM(){
		println("init FSM")
		_self.currentState = _self.initialState;
		_self.underProcessTrigger = ""
		_self.consummedString = ""
	}
	
	@Step
	@ReplaceAspectMethod
    def public void run() {
    	_self.underProcessTrigger = _self.inputBuffer.dequeue
    	println("run SM"+_self.name+" step on "+_self.underProcessTrigger)
		_self.currentState.step(_self.underProcessTrigger)
    	_self.underProcessTrigger = ""
	}

}

@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoing.filter[t | inputString.compareTo(t.trigger) == 0]
		
		if(validTransitions.empty) {
			//just copy the token to the output buffer
			_self.fsm.outputBuffer.enqueue(inputString)
		}
		
		if(validTransitions.size > 1) {
			throw new Exception("Non Determinism")
		}
		
		// Fire transition first transition (could be random%VT.size)
		if(validTransitions.size > 0){
			validTransitions.get(0).fire
			return
		}
		return
		
	}
}


@Aspect(className=Transition)
class TransitionAspect {
	@Step
def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.tgt.name)
		val fsm = _self.src.fsm
		fsm.currentState = _self.tgt
		fsm.outputBuffer.enqueue(_self.action)
		fsm.consummedString = fsm.consummedString + fsm.underProcessTrigger
	}
}




@Aspect(className=Buffer)
class BufferAspect {
	
	public String currentValues = "" //values are separated by comma
	
	public def void initialize(){
		println("[INITIALIZE] Buffer "+_self.name)
			if(_self.initialValue != null){
				_self.currentValues = _self.initialValue 
			}else{
				_self.currentValues = "\'empty\'"
			}
	}
	
	public def boolean isEmpty(){
		return _self.currentValues.empty || _self.currentValues.compareTo("\'empty\'")==0
	}
	
	public def void enqueue(String v){
		if(_self.isEmpty){
			_self.currentValues = v
		}else{
			_self.currentValues = _self.currentValues+','+v
		}
	}

	public def String dequeue(){
		var String res = ""
		var int firstComma = _self.currentValues.indexOf(',')
		if(firstComma < 0){
			res = _self.currentValues
			_self.currentValues = "\'empty\'"
			return res
		}
		res = _self.currentValues.substring(0, firstComma)
		_self.currentValues = _self.currentValues.substring(firstComma+1, _self.currentValues.length)
		return res
	}

}



