package org.gemoc.models17.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.models17.fsm.xfsm.aspects.BufferAspect;
import org.gemoc.models17.fsm.xfsm.aspects.FSMAspect;
import org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties;

@Aspect(className = org.gemoc.models17.fsm.xfsm.model.System.class)
@SuppressWarnings("all")
public class SystemAspect {
  @Step
  @InitializeModel
  public static void initialize(final org.gemoc.models17.fsm.xfsm.model.System _self, final EList<String> p) {
    final org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,p);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","initialize");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Main
  public static void main(final org.gemoc.models17.fsm.xfsm.model.System _self) {
	final org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectProperties _self_ = org.gemoc.models17.fsm.xfsm.aspects.SystemAspectSystemAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  protected static void _privk3_initialize(final SystemAspectSystemAspectProperties _self_, final org.gemoc.models17.fsm.xfsm.model.System _self, final EList<String> p) {
    InputOutput.<String>println("init");
    EList<FSM> _ownedFsms = _self.getOwnedFsms();
    for (final FSM sm : _ownedFsms) {
      FSMAspect.initializeFSM(sm);
    }
    EList<Buffer> _ownedBuffers = _self.getOwnedBuffers();
    for (final Buffer b : _ownedBuffers) {
      BufferAspect.initialize(b);
    }
    InputOutput.<String>println("finish init");
  }
  
  protected static void _privk3_main(final SystemAspectSystemAspectProperties _self_, final org.gemoc.models17.fsm.xfsm.model.System _self) {
    boolean anFSMRan = true;
    while (anFSMRan) {
      {
        anFSMRan = false;
        try {
          EList<FSM> _ownedFsms = _self.getOwnedFsms();
          for (final FSM sm : _ownedFsms) {
            Buffer _inputBuffer = sm.getInputBuffer();
            boolean _isEmpty = BufferAspect.isEmpty(_inputBuffer);
            boolean _not = (!_isEmpty);
            if (_not) {
              FSMAspect.run(sm);
              anFSMRan = true;
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception nt = (Exception)_t;
            String _message = nt.getMessage();
            String _plus = ("Stopped due to " + _message);
            InputOutput.<String>println(_plus);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
}
