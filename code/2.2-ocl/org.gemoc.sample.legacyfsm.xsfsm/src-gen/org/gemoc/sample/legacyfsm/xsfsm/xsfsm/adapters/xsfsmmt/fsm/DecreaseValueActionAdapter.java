package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable;

@SuppressWarnings("all")
public class DecreaseValueActionAdapter extends EObjectAdapter<DecreaseValueAction> implements org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.DecreaseValueAction {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public DecreaseValueActionAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getStepValue() {
    return adaptee.getStepValue();
  }
  
  @Override
  public void setStepValue(final int o) {
    adaptee.setStepValue(o);
  }
  
  @Override
  public NumberVariable getTarget() {
    return (NumberVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final NumberVariable o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.DecreaseValueActionAspect.execute(adaptee);
  }
  
  protected final static int STEP_VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getDecreaseValueAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__TARGET:
    		return getTarget();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__STEP_VALUE:
    		return new java.lang.Integer(getStepValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__STEP_VALUE:
    		return getStepValue() != STEP_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.DECREASE_VALUE_ACTION__STEP_VALUE:
    		setStepValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
