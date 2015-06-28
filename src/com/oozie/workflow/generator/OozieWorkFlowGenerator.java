package com.oozie.workflow.generator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.oozie.workflow.beans.ACTION;
import com.oozie.workflow.beans.ACTIONTRANSITION;
import com.oozie.workflow.beans.CREDENTIALS;
import com.oozie.workflow.beans.END;
import com.oozie.workflow.beans.FLAG;
import com.oozie.workflow.beans.JAVA;
import com.oozie.workflow.beans.ObjectFactory;
import com.oozie.workflow.beans.PARAMETERS;
import com.oozie.workflow.beans.START;
import com.oozie.workflow.beans.WORKFLOWAPP;
import com.workflow.transform.TransformWorkFlowException;
import com.workflow.transform.WorkFlowTransformationFactory;
import com.workflow.transform.WorkFlowTransformer;
import com.workflow.transform.WorkFlowType;
import com.workflowprocessor.beans.JavaJob;
import com.workflowprocessor.beans.TransformationJob;

public class OozieWorkFlowGenerator {
	public static void main(String[] args) {

		WorkFlowTransformationFactory workFlowTransformationFactory = new WorkFlowTransformationFactory();
		
		WorkFlowTransformer workFlowTransformer = workFlowTransformationFactory.getWorkFlowTransformer(WorkFlowType.OOZIE);	
		
		JavaJob javaJob = new JavaJob();
		javaJob.setClassPath("classpath string");
		javaJob.setMainClass("main class string");
		List<String> paramsList = new ArrayList<String>();
		paramsList.add("parameter1");
		paramsList.add("parameter2");
		javaJob.setParams(paramsList);
		javaJob.setPropertyMap("arg1", "arg1");
		
		TransformationJob transformationJob = new TransformationJob();
		transformationJob.setJavaJob(javaJob);
		
		try {
			String outputWorkFlow = workFlowTransformer.transform(transformationJob, WorkFlowType.WORKFLOW_PROCESSOR, WorkFlowType.OOZIE);
		} catch (TransformWorkFlowException e) {
			System.out.println("WorkFlow Transformation failed.");
			e.printStackTrace();
		} 
	}
}