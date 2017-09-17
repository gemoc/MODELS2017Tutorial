package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsmmt.model.FSM;
import org.gemoc.models17.fsm.xfsmmt.model.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.gemoc.models17.fsm.xfsmmt.model.State {
  private XFSMMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  private EList<Transition> incoming_;
  
  @Override
  public EList<Transition> getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private EList<Transition> outgoing_;
  
  @Override
  public EList<Transition> getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
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
  public void step(final String inputString) {
    org.gemoc.models17.fsm.xfsm.aspects.StateAspect.step(adaptee, inputString
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__INCOMING:
    		return getIncoming();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__NAME:
    		return getName();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__FSM:
    		return getFsm();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__FSM:
    		return getFsm() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.STATE__FSM:
    		setFsm(
    		(org.gemoc.models17.fsm.xfsmmt.model.FSM)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
