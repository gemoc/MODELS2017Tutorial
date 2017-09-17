package org.gemoc.models17.fsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.models17.fsm.XFSMMT;

@SuppressWarnings("all")
public class XFSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XFSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XFSM mm = new XFSM();
    mm.setResource(res);
    return mm ;
  }
  
  public XFSMMT toXFSMMT() {
    org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMAdapter adaptee = new org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
