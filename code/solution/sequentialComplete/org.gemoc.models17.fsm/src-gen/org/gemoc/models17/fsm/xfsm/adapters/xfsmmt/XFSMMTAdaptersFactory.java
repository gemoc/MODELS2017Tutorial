package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.SystemAdapter;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.TransitionAdapter;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsm.model.FSM;
import org.gemoc.models17.fsm.xfsm.model.State;
import org.gemoc.models17.fsm.xfsm.model.Transition;

@SuppressWarnings("all")
public class XFSMMTAdaptersFactory implements AdaptersFactory {
  private static XFSMMTAdaptersFactory instance;
  
  public static XFSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XFSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.models17.fsm.xfsm.model.FSM){
    	return createFSMAdapter((org.gemoc.models17.fsm.xfsm.model.FSM) o, res);
    }
    if (o instanceof org.gemoc.models17.fsm.xfsm.model.State){
    	return createStateAdapter((org.gemoc.models17.fsm.xfsm.model.State) o, res);
    }
    if (o instanceof org.gemoc.models17.fsm.xfsm.model.Buffer){
    	return createBufferAdapter((org.gemoc.models17.fsm.xfsm.model.Buffer) o, res);
    }
    if (o instanceof org.gemoc.models17.fsm.xfsm.model.Transition){
    	return createTransitionAdapter((org.gemoc.models17.fsm.xfsm.model.Transition) o, res);
    }
    if (o instanceof org.gemoc.models17.fsm.xfsm.model.System){
    	return createSystemAdapter((org.gemoc.models17.fsm.xfsm.model.System) o, res);
    }
    
    return null;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter) adapter;
    else {
    	adapter = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.StateAdapter) adapter;
    }
  }
  
  public BufferAdapter createBufferAdapter(final Buffer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter) adapter;
    else {
    	adapter = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.BufferAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.TransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.TransitionAdapter) adapter;
    }
  }
  
  public SystemAdapter createSystemAdapter(final org.gemoc.models17.fsm.xfsm.model.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.SystemAdapter) adapter;
    else {
    	adapter = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.SystemAdapter) adapter;
    }
  }
}
