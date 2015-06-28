package com.workflow.transform;

public abstract class TransformationFactory {
	public abstract WorkFlowTransformer getWorkFlowTransformer(WorkFlowType workFlowType);
}
