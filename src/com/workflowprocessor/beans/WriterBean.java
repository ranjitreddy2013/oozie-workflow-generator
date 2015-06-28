package com.workflowprocessor.beans;
/*
 * Class to store Writer configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
public class WriterBean {
	private String outputType;
	private String query;
	
	public String getOutputType() {
		return outputType;
	}
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
}