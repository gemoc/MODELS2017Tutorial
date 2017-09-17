package org.gemoc.models17.fsm.xfsm.trace.tracemanager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange;

import fr.inria.diverse.trace.gemoc.api.ITraceListener;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;

public class ModelTraceNotifier implements ITraceNotifier {

	private BatchModelChangeListener traceListener;

	private final List<ITraceListener> listeners = new ArrayList<>();

	public ModelTraceNotifier(BatchModelChangeListener traceListener) {
		this.traceListener = traceListener;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			notifyListener(listener);
		}
	}

	@Override
	public void notifyListener(ITraceListener listener) {
		final List<ModelChange> changes = traceListener.getChanges(listener);
		if (!changes.isEmpty()) {
			final List<EObject> startedSteps = new ArrayList<>();
			final List<EObject> endedSteps = new ArrayList<>();
			final List<EObject> newStates = new ArrayList<>();
			final List<EObject> newValues = new ArrayList<>();
			final List<List<? extends EObject>> newDimensions = new ArrayList<>();
			changes.forEach(c -> {
				if (c instanceof NewObjectModelChange) {
					final EObject o = c.getChangedObject();
					if (o instanceof modelTrace.States.Value) {
						newValues.add((modelTrace.States.Value) o);
					} else if (o instanceof modelTrace.Steps.SpecificStep) {
						startedSteps.add((modelTrace.Steps.SpecificStep) o);
					} else if (o instanceof modelTrace.States.State) {
						final modelTrace.States.State newState = (modelTrace.States.State) o;
						newStates.add(newState);
						endedSteps.addAll(newState.getEndedSteps());
					} else if (o instanceof modelTrace.States.model.TracedBuffer) {
						newDimensions.add(((modelTrace.States.model.TracedBuffer) o).getCurrentValuesSequence());
					} else if (o instanceof modelTrace.States.model.TracedFSM) {
						newDimensions.add(((modelTrace.States.model.TracedFSM) o).getConsummedStringSequence());
						newDimensions.add(((modelTrace.States.model.TracedFSM) o).getCurrentStateSequence());
						newDimensions.add(((modelTrace.States.model.TracedFSM) o).getProducedStringSequence());
						newDimensions.add(((modelTrace.States.model.TracedFSM) o).getUnderProcessTriggerSequence());
					}
				}
			});
			listener.valuesAdded(newValues);
			listener.dimensionsAdded(newDimensions);
			listener.statesAdded(newStates);
			listener.stepsStarted(startedSteps);
			listener.stepsEnded(endedSteps);
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		listeners.add(listener);
		traceListener.registerObserver(listener);
	}

	@Override
	public void removeListener(ITraceListener listener) {
		listeners.remove(listener);
		traceListener.removeObserver(listener);
	}
}
