package com.workflow.transform;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

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
import com.workflowprocessor.beans.JavaJob;
import com.workflowprocessor.beans.TransformationJob;

public class OozieWorkFlowTransformer implements WorkFlowTransformer {

	@Override
	public String transform(TransformationJob transformationJob, WorkFlowType src,
			WorkFlowType dst) throws TransformWorkFlowException {
		
		File file = new File(System.getProperty("user.home") + "/workflow.xml");
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(WORKFLOWAPP.class);
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Marshaller jaxbMarshaller = null;
		try {
			jaxbMarshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		ObjectFactory of = new ObjectFactory();

		WORKFLOWAPP wf = new WORKFLOWAPP();

		START st = of.createSTART();
		wf.setStart(st);

		ACTION action = of.createACTION();

		JavaJob javaJob = transformationJob.getJavaJob();
		
		JAVA j = of.createJAVA();
		action.setJava(j);
		//j.setJobTracker("jt:10999://jt");
		//j.setNameNode("name-node string");
		j.setMainClass(javaJob.getMainClass());
		j.getArg().addAll(javaJob.getPropertyMap().values());
		j.getJavaOpt().addAll(javaJob.getParams());
		
		FLAG f = of.createFLAG();
		j.setCaptureOutput(f);

		

		ACTIONTRANSITION okTransition = of.createACTIONTRANSITION();
		okTransition.setTo("Ok");

		ACTIONTRANSITION failTransition = of.createACTIONTRANSITION();
		failTransition.setTo("fail");

		action.setOk(okTransition);
		action.setError(failTransition);
		wf.setAny((Object) action);

		CREDENTIALS c = of.createCREDENTIALS();
		wf.setCredentials(c);

		END end = of.createEND();
		wf.setEnd(end);

		PARAMETERS p = of.createPARAMETERS();
		wf.setParameters(p);

		wf.setName("oozie-wf");

		// output pretty printed
		try {
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (PropertyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			jaxbMarshaller.marshal(wf, file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			jaxbMarshaller.marshal(wf, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return file.toString();
	}

}
