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
	def public void initialize(EList<String> p){
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
	
		//TODO :)
		
	}
}


@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
	
		// TODO :)
	
	}
}




@Aspect(className=Buffer)
class BufferAspect {
	
	public String currentValues //values are separated by comma
	
	public def void initialize(){
		println("initialize buffer "+_self.name)
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



