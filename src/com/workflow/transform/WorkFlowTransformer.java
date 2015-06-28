package com.workflow.transform;

import com.workflowprocessor.beans.TransformationJob;

public interface WorkFlowTransformer {
	public String transform(TransformationJob inputWorkFlow, WorkFlowType src, WorkFlowType dst) throws TransformWorkFlowException;
}
