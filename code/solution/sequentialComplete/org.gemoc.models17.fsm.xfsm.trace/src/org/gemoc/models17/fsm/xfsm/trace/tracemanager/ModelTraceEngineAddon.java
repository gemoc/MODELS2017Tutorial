package org.gemoc.models17.fsm.xfsm.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class ModelTraceEngineAddon extends AbstractTraceAddon {

	private ModelTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new ModelTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		ModelTraceExplorer explorer = new ModelTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof modelTrace.SpecificTrace) {
			explorer.loadTrace((modelTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		ModelTraceExplorer explorer = new ModelTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof modelTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (modelTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		ModelTraceExtractor extractor = new ModelTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof modelTrace.SpecificTrace) {
			extractor.loadTrace((modelTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
	}

	@Override
	public ITraceNotifier constructTraceNotifier(BatchModelChangeListener traceListener) {
		return new ModelTraceNotifier(traceListener);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ModelTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof modelTrace.SpecificTrace;
	}

}