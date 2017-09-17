package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory;
import org.gemoc.models17.fsm.xfsm.model.Buffer;
import org.gemoc.models17.fsm.xfsmmt.model.FSM;

@SuppressWarnings("all")
public class BufferAdapter extends EObjectAdapter<Buffer> implements org.gemoc.models17.fsm.xfsmmt.model.Buffer {
  private XFSMMTAdaptersFactory adaptersFactory;
  
  public BufferAdapter() {
    super(org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final String o) {
    adaptee.setInitialValue(o);
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
  public FSM getOutgoingFSM() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getOutgoingFSM(), eResource);
  }
  
  @Override
  public void setOutgoingFSM(final FSM o) {
    if (o != null)
    	adaptee.setOutgoingFSM(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter) o).getAdaptee());
    else adaptee.setOutgoingFSM(null);
  }
  
  @Override
  public FSM getIncomingFSM() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getIncomingFSM(), eResource);
  }
  
  @Override
  public void setIncomingFSM(final FSM o) {
    if (o != null)
    	adaptee.setIncomingFSM(((org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model.FSMAdapter) o).getAdaptee());
    else adaptee.setIncomingFSM(null);
  }
  
  @Override
  public String getCurrentValues() {
    return org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.currentValues(adaptee);
  }
  
  @Override
  public void setCurrentValues(final String currentValues) {
    org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.currentValues(adaptee, currentValues
    );
  }
  
  @Override
  public String dequeue() {
    return org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.dequeue(adaptee);
  }
  
  @Override
  public void enqueue(final String v) {
    org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.enqueue(adaptee, v
    );
  }
  
  @Override
  public void initialize() {
    org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.initialize(adaptee);
  }
  
  @Override
  public boolean isEmpty() {
    return org.gemoc.models17.fsm.xfsm.aspects.BufferAspect.isEmpty(adaptee);
  }
  
  protected final static String INITIAL_VALUE_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String CURRENT_VALUES_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.eINSTANCE.getBuffer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__OUTGOING_FSM:
    		return getOutgoingFSM();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INCOMING_FSM:
    		return getIncomingFSM();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__NAME:
    		return getName();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__CURRENT_VALUES:
    		return getCurrentValues();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__OUTGOING_FSM:
    		return getOutgoingFSM() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INCOMING_FSM:
    		return getIncomingFSM() != null;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__CURRENT_VALUES:
    		return getCurrentValues() != CURRENT_VALUES_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INITIAL_VALUE:
    		setInitialValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__OUTGOING_FSM:
    		setOutgoingFSM(
    		(org.gemoc.models17.fsm.xfsmmt.model.FSM)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__INCOMING_FSM:
    		setIncomingFSM(
    		(org.gemoc.models17.fsm.xfsmmt.model.FSM)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.BUFFER__CURRENT_VALUES:
    		setCurrentValues(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
