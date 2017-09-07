package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Variable;

@SuppressWarnings("all")
public class StateMachineAdapter extends EObjectAdapter<StateMachine> implements org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public StateMachineAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
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
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<Transition> ownedTransitions_;
  
  @Override
  public EList<Transition> getOwnedTransitions() {
    if (ownedTransitions_ == null)
    	ownedTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTransitions(), adaptersFactory, eResource);
    return ownedTransitions_;
  }
  
  private EList<Variable> variables_;
  
  @Override
  public EList<Variable> getVariables() {
    if (variables_ == null)
    	variables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariables(), adaptersFactory, eResource);
    return variables_;
  }
  
  @Override
  public void assignInitialValues(final org.eclipse.emf.common.util.EList<java.lang.String> arguments) {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect.assignInitialValues(adaptee, arguments
    );
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect.currentState(adaptee, (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void main() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect.main(adaptee);
  }
  
  @Override
  public void step() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect.step(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		return getName();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		return getOwnedStates();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		return getInitialState();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__VARIABLES:
    		return getVariables();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		return getCurrentState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__VARIABLES:
    		return getVariables() != null && !getVariables().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		return getCurrentState() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		setInitialState(
    		(org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__VARIABLES:
    		getVariables().clear();
    		getVariables().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		setCurrentState(
    		(org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
