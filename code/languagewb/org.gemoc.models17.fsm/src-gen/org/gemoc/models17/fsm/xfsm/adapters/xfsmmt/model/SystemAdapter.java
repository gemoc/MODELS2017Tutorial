package org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory;
import org.gemoc.models17.fsm.xfsmmt.model.Buffer;
import org.gemoc.models17.fsm.xfsmmt.model.FSM;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<org.gemoc.models17.fsm.xfsm.model.System> implements org.gemoc.models17.fsm.xfsmmt.model.System {
  private XFSMMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
    super(org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMMTAdaptersFactory.getInstance();
  }
  
  private EList<FSM> ownedFsms_;
  
  @Override
  public EList<FSM> getOwnedFsms() {
    if (ownedFsms_ == null)
    	ownedFsms_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFsms(), adaptersFactory, eResource);
    return ownedFsms_;
  }
  
  private EList<Buffer> ownedBuffers_;
  
  @Override
  public EList<Buffer> getOwnedBuffers() {
    if (ownedBuffers_ == null)
    	ownedBuffers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedBuffers(), adaptersFactory, eResource);
    return ownedBuffers_;
  }
  
  @Override
  public void initialize(final org.eclipse.emf.common.util.EList<java.lang.String> p) {
    org.gemoc.models17.fsm.xfsm.aspects.SystemAspect.initialize(adaptee, p
    );
  }
  
  @Override
  public void main() {
    org.gemoc.models17.fsm.xfsm.aspects.SystemAspect.main(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_FSMS:
    		return getOwnedFsms();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_BUFFERS:
    		return getOwnedBuffers();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_FSMS:
    		return getOwnedFsms() != null && !getOwnedFsms().isEmpty();
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_BUFFERS:
    		return getOwnedBuffers() != null && !getOwnedBuffers().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_FSMS:
    		getOwnedFsms().clear();
    		getOwnedFsms().addAll((Collection) newValue);
    		return;
    	case org.gemoc.models17.fsm.xfsmmt.model.ModelPackage.SYSTEM__OWNED_BUFFERS:
    		getOwnedBuffers().clear();
    		getOwnedBuffers().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
