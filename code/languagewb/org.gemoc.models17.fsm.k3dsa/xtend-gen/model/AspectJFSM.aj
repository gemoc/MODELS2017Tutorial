// AspectJ classes that have been aspectized and name
package model;
public aspect AspectJFSM{
void around (model.FSM self)  :target (self) && (call ( void model.FSM.run(  ) ) ) { org.gemoc.models17.fsm.semantics.model.aspects.FSMAspect.run(self );}

}
