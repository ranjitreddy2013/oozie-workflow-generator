package com.workflowprocessor.beans;
/*
 * Class to store Hive configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.Map;

public class HiveConfig {
	
	private Map<String, String> properties;
	private String jdbcURL;
	private String userName;
	private String password;

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
	public String getJdbcURL() {
		return jdbcURL;
	}
	
	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
