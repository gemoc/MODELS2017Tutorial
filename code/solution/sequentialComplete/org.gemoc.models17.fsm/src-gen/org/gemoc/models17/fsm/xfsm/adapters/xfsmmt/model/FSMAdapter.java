package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsmmt.model.Buffer;
import org.gemoc.models17.fsm.xfsmmt.model.State;
import org.gemoc.models17.fsm.xfsmmt.model.Transition;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements org.gemoc.models17.fsm.xfsmmt.model.FSM {
  private XFSMMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
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
  
  private EList<State> ownedStates_;
  
  @Override
  public EList<State> getOwnedStates() {
    if (ownedStates_ == null)
    	ownedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStates(), adaptersFactory, eResource);
    return ownedStates_;
  }
  
  private EList<Transition> ownedTransitions_;
  
  @Override
  public EList<Transition> getOwnedTransitions() {
    if (ownedTransitions_ == null)
    	ownedTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTransitions(), adaptersFactory, eResource);
    return ownedTransitions_;
  }
  
  @Override
  public Buffer getInputBuffer() {
    return (Buffer) adaptersFactory.createAdapter(adaptee.getInputBuffer(), eResource);
  }
  
  @Override
  public void setInputBuffer(final Buffer o) {
    if (o != null)
    	adaptee.setInputBuffer(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter) o).getAdaptee());
    else adaptee.setInputBuffer(null);
  }
  
  @Override
  public Buffer getOutputBuffer() {
    return (Buffer) adaptersFactory.createAdapter(adaptee.getOutputBuffer(), eResource);
  }
  
  @Override
  public void setOutputBuffer(final Buffer o) {
    if (o != null)
    	adaptee.setOutputBuffer(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter) o).getAdaptee());
    else adaptee.setOutputBuffer(null);
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  @Override
  public String getConsummedString() {
    return org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.consummedString(adaptee);
  }
  
  @Override
  public void setConsummedString(final String consummedString) {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.consummedString(adaptee, consummedString
    );
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.currentState(adaptee, (org.gemoc.models17.fsm.xfsm.model.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void initializeFSM() {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.initializeFSM(adaptee);
  }
  
  @Override
  public String getProducedString() {
    return org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.producedString(adaptee);
  }
  
  @Override
  public void setProducedString(final String producedString) {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.producedString(adaptee, producedString
    );
  }
  
  @Override
  public void run() {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.run(adaptee);
  }
  
  @Override
  public String getUnderProcessTrigger() {
    return org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.underProcessTrigger(adaptee);
  }
  
  @Override
  public void setUnderProcessTrigger(final String underProcessTrigger) {
    org.gemoc.models17.fsm.xfsm.aspects.FSMAspect.underProcessTrigger(adaptee, underProcessTrigger
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String UNDER_PROCESS_TRIGGER_EDEFAULT = null;
  
  protected final static String CONSUMMED_STRING_EDEFAULT = null;
  
  protected final static String PRODUCED_STRING_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__NAME:
    		return getName();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_STATES:
    		return getOwnedStates();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INPUT_BUFFER:
    		return getInputBuffer();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OUTPUT_BUFFER:
    		return getOutputBuffer();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CURRENT_STATE:
    		return getCurrentState();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
    		return getUnderProcessTrigger();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CONSUMMED_STRING:
    		return getConsummedString();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__PRODUCED_STRING:
    		return getProducedString();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INPUT_BUFFER:
    		return getInputBuffer() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OUTPUT_BUFFER:
    		return getOutputBuffer() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CURRENT_STATE:
    		return getCurrentState() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
    		return getUnderProcessTrigger() != UNDER_PROCESS_TRIGGER_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CONSUMMED_STRING:
    		return getConsummedString() != CONSUMMED_STRING_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__PRODUCED_STRING:
    		return getProducedString() != PRODUCED_STRING_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INPUT_BUFFER:
    		setInputBuffer(
    		(org.gemoc.models17.fsm.xfsmmt.model.Buffer)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__OUTPUT_BUFFER:
    		setOutputBuffer(
    		(org.gemoc.models17.fsm.xfsmmt.model.Buffer)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__INITIAL_STATE:
    		setInitialState(
    		(org.gemoc.models17.fsm.xfsmmt.model.State)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CURRENT_STATE:
    		setCurrentState(
    		(org.gemoc.models17.fsm.xfsmmt.model.State)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__UNDER_PROCESS_TRIGGER:
    		setUnderProcessTrigger(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__CONSUMMED_STRING:
    		setConsummedString(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.FSM__PRODUCED_STRING:
    		setProducedString(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
