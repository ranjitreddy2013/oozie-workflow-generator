package com.workflowprocessor.beans;
/*
 * Class to store Shell Job configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnixJob {
	private List<String> commands;
	private Map<String, String> params = new HashMap<String, String>();
	
	public List<String> getCommands() {
		return commands;
	}
	public void setCommands(List<String> commands) {
		this.commands = commands;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
