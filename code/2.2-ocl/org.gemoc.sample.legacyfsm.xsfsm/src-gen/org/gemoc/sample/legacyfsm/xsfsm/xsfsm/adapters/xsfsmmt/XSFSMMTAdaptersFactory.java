package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.ActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.AssignValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.DecreaseValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.EqualNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GreaterThanNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.IncreaseValueActionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.LessThanNumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NamedElementAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberGuardAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberVariableAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateMachineAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.TransitionAdapter;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.VariableAdapter;
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
public class XSFSMMTAdaptersFactory implements AdaptersFactory {
  private static XSFSMMTAdaptersFactory instance;
  
  public static XSFSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XSFSMMTAdaptersFactory() {
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
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateMachineAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NamedElementAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.VariableAdapter) adapter;
    }
  }
  
  public NumberVariableAdapter createNumberVariableAdapter(final NumberVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberVariableAdapter) adapter;
    }
  }
  
  public GuardAdapter createGuardAdapter(final Guard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GuardAdapter) adapter;
    }
  }
  
  public NumberGuardAdapter createNumberGuardAdapter(final NumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberGuardAdapter) adapter;
    }
  }
  
  public EqualNumberGuardAdapter createEqualNumberGuardAdapter(final EqualNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.EqualNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.EqualNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.EqualNumberGuardAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.ActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.ActionAdapter) adapter;
    }
  }
  
  public AssignValueActionAdapter createAssignValueActionAdapter(final AssignValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.AssignValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.AssignValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.AssignValueActionAdapter) adapter;
    }
  }
  
  public LessThanNumberGuardAdapter createLessThanNumberGuardAdapter(final LessThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.LessThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.LessThanNumberGuardAdapter) adapter;
    }
  }
  
  public GreaterThanNumberGuardAdapter createGreaterThanNumberGuardAdapter(final GreaterThanNumberGuard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GreaterThanNumberGuardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.GreaterThanNumberGuardAdapter) adapter;
    }
  }
  
  public IncreaseValueActionAdapter createIncreaseValueActionAdapter(final IncreaseValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.IncreaseValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.IncreaseValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.IncreaseValueActionAdapter) adapter;
    }
  }
  
  public DecreaseValueActionAdapter createDecreaseValueActionAdapter(final DecreaseValueAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.DecreaseValueActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.DecreaseValueActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.DecreaseValueActionAdapter) adapter;
    }
  }
}
