package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory;
import org.gemoc.models17.fsm.xfsm.model.Transition;
import org.gemoc.models17.fsm.xfsmmt.model.FSM;
import org.gemoc.models17.fsm.xfsmmt.model.State;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements org.gemoc.models17.fsm.xfsmmt.model.Transition {
  private XFSMMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public String getTrigger() {
    return adaptee.getTrigger();
  }
  
  @Override
  public void setTrigger(final String o) {
    adaptee.setTrigger(o);
  }
  
  @Override
  public String getAction() {
    return adaptee.getAction();
  }
  
  @Override
  public void setAction(final String o) {
    adaptee.setAction(o);
  }
  
  @Override
  public State getTgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getTgt(), eResource);
  }
  
  @Override
  public void setTgt(final State o) {
    if (o != null)
    	adaptee.setTgt(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter) o).getAdaptee());
    else adaptee.setTgt(null);
  }
  
  @Override
  public State getSrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getSrc(), eResource);
  }
  
  @Override
  public void setSrc(final State o) {
    if (o != null)
    	adaptee.setSrc(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter) o).getAdaptee());
    else adaptee.setSrc(null);
  }
  
  @Override
  public FSM getFsm() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getFsm(), eResource);
  }
  
  @Override
  public void setFsm(final FSM o) {
    if (o != null)
    	adaptee.setFsm(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter) o).getAdaptee());
    else adaptee.setFsm(null);
  }
  
  @Override
  public void fire() {
    org.gemoc.models17.fsm.xfsm.aspects.TransitionAspect.fire(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String TRIGGER_EDEFAULT = null;
  
  protected final static String ACTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TGT:
    		return getTgt();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__NAME:
    		return getName();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__SRC:
    		return getSrc();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__FSM:
    		return getFsm();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TRIGGER:
    		return getTrigger();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TGT:
    		return getTgt() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__SRC:
    		return getSrc() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__FSM:
    		return getFsm() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TRIGGER:
    		return getTrigger() != TRIGGER_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TGT:
    		setTgt(
    		(org.gemoc.models17.fsm.xfsmmt.model.State)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__SRC:
    		setSrc(
    		(org.gemoc.models17.fsm.xfsmmt.model.State)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__FSM:
    		setFsm(
    		(org.gemoc.models17.fsm.xfsmmt.model.FSM)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__TRIGGER:
    		setTrigger(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.TRANSITION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
