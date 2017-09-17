package org.gemoc.models17.fsm;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.models17.fsm.xfsmmt.model.ModelFactory;

@SuppressWarnings("all")
public interface XFSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ModelFactory getModelFactory();
  
  public abstract void save(final String uri) throws IOException;
}
