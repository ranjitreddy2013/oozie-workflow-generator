package com.workflowprocessor.beans;

/*
 * Class to store Java Job configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.HashMap;
import java.util.List;

public class JavaJob {
	private String mainClass;
	private String classPath;
	private List<String> params;
	private HashMap<String, String> propertyMap = new HashMap<String, String>();
	
	public String getMainClass() {
		return mainClass;
	}
	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
	}
	public String getClassPath() {
		return classPath;
	}
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	public List<String> getParams() {
		return params;
	}
	public void setParams(List<String> params) {
		this.params = params;
	}
	public HashMap<String, String> getPropertyMap() {
		return propertyMap;
	}
	public void setPropertyMap(String key, String value) {
		this.propertyMap.put(key, value);
	}
}