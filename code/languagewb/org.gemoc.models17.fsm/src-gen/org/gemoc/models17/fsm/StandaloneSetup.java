package org.gemoc.models17.fsm;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.gemoc.models17.fsm.xfsm.model.ModelPackage.eNS_URI,
    	org.gemoc.models17.fsm.xfsm.model.ModelPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xFSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.models17.fsm.XFSM", "", "http://org.gemoc.models17.fsm.xfsm/model/", "org.gemoc.models17.fsm.XFSMMT"
    );
    xFSM.addAdapter("org.gemoc.models17.fsm.XFSMMT", org.gemoc.models17.fsm.xfsm.adapters.xfsmmt.XFSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.models17.fsm.XFSM",
    	xFSM
    );
    MelangeRegistry.ModelTypeDescriptor xFSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.models17.fsm.XFSMMT", "", "http://org.gemoc.models17.fsm.xfsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.models17.fsm.XFSMMT",
    	xFSMMT
    );
  }
}
