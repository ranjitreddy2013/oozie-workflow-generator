package com.workflowprocessor.beans;
/*
 * Class to store Map Reduce configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.Map;

public class MapReduceConfig {
	
	private Map<String, String> properties;

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

}