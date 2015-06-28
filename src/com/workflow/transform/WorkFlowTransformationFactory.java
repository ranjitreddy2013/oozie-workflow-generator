package com.workflow.transform;

public class WorkFlowTransformationFactory extends TransformationFactory {
	@Override
	public WorkFlowTransformer getWorkFlowTransformer(WorkFlowType workFlowType) {
		return new OozieWorkFlowTransformer();
	}
}
