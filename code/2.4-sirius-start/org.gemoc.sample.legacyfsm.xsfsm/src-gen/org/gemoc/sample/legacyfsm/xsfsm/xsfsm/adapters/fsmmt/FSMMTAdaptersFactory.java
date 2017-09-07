package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.ActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.AssignValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.DecreaseValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.IncreaseValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.VariableAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Action;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Guard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberGuard;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Variable;

@SuppressWarnings("all")
public class FSMMTAdaptersFactory implements AdaptersFactory {
  private static FSMMTAdaptersFactory instance;
  
  public static FSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine){
    	return createStateMachineAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State){
    	return createStateAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition){
    	return createTransitionAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable){
    	return createNumberVariableAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NumberVariable) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard){
    	return createEqualNumberGuardAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.EqualNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction){
    	return createAssignValueActionAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.AssignValueAction) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard){
    	return createLessThanNumberGuardAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.LessThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard){
    	return createGreaterThanNumberGuardAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.GreaterThanNumberGuard) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction){
    	return createIncreaseValueActionAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.IncreaseValueAction) o, res);
    }
    if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction){
    	return createDecreaseValueActionAdapter((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction) o, res);
    }
    
    return null;
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.VariableAdapter) adapter;
    }
  }
  
  public NumberVariableAdapter createNumberVariableAdapter(final NumberVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberVariableAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GuardAdapter) adapter;
    }
  }
  
  public NumberGuardAdapter createNumberGuardAdapter(final NumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NumberGuardAdapter) adapter;
    }
  }
  
  public EqualNumberGuardAdapter createEqualNumberGuardAdapter(final EqualNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.EqualNumberGuardAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.ActionAdapter) adapter;
    }
  }
  
  public AssignValueActionAdapter createAssignValueActionAdapter(final AssignValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.AssignValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.AssignValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.AssignValueActionAdapter) adapter;
    }
  }
  
  public LessThanNumberGuardAdapter createLessThanNumberGuardAdapter(final LessThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterThanNumberGuardAdapter createGreaterThanNumberGuardAdapter(final GreaterThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    }
  }
  
  public IncreaseValueActionAdapter createIncreaseValueActionAdapter(final IncreaseValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.IncreaseValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.IncreaseValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.IncreaseValueActionAdapter) adapter;
    }
  }
  
  public DecreaseValueActionAdapter createDecreaseValueActionAdapter(final DecreaseValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.DecreaseValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.DecreaseValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.DecreaseValueActionAdapter) adapter;
    }
  }
}
