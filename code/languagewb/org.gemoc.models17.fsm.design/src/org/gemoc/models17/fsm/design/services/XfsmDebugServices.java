package org.gemoc.models17.fsm.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XfsmDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("SystemDiagram", "Debug"));

		return res;
	}
	
	@Override
	public String getModelIdentifier() {
		return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.DEBUG_MODEL_ID;
	}
}
