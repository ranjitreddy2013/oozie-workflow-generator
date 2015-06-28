package com.workflowprocessor.beans;
/*
 * Class to store server related configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
public class RuntimeConfig {
	
	private HiveConfig hiveConfig;
	private MapReduceConfig mapReduceConfig;
	private EmailConfig emailConfig;
	
	public HiveConfig getHiveConfig() {
		return hiveConfig;
	}

	public void setHiveConfig(HiveConfig hiveConfig) {
		this.hiveConfig = hiveConfig;
	}

	public MapReduceConfig getMapReduceConfig() {
		return mapReduceConfig;
	}

	public void setMapReduceConfig(MapReduceConfig mapReduceConfig) {
		this.mapReduceConfig = mapReduceConfig;
	}

	public EmailConfig getEmailConfig() {
		return emailConfig;
	}

	public void setEmailConfig(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}

}