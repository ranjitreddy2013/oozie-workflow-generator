package com.oozie.workflow.generator;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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

public class OozieWorkFlowGenerator {
	public static void main(String[] args) {

		try {

			File file = new File(System.getProperty("user.home") + "/workflow.xml");
			JAXBContext jaxbContext = JAXBContext
					.newInstance(WORKFLOWAPP.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			ObjectFactory of = new ObjectFactory();
			
			WORKFLOWAPP wf = new WORKFLOWAPP();
			
			START st = of.createSTART();
			wf.setStart(st);
			
			ACTION action = of.createACTION();
			
			JAVA j = of.createJAVA();
			action.setJava(j);
			j.setJobTracker("jt:10999://jt");
			j.setNameNode("name-node string");
			j.setMainClass("main-class");
			j.getArg().add("arg1");
			j.getArg().add("arg2");
			FLAG f = of.createFLAG();
			j.setCaptureOutput(f);
			
			j.getJavaOpt().add("parameter1");
			j.getJavaOpt().add("parameter2");
			
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
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(wf, file);
			jaxbMarshaller.marshal(wf, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}