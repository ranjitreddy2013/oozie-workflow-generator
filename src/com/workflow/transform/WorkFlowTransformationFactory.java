package com.workflow.transform;

public class WorkFlowTransformationFactory extends TransformationFactory {
	@Override
	public WorkFlowTransformer getWorkFlowTransformer(WorkFlowType workFlowType) {
		if (workFlowType == WorkFlowType.OOZIE) {
			return new OozieWorkFlowTransformer();
		}
		return null;
	}
}
