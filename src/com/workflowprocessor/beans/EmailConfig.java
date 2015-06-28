package com.workflowprocessor.beans;
/*
 * Class to store Email configuration details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.List;

public class EmailConfig {

	private List<String> toEmailAddress;	

	public List<String> getToEmailAddress() {
		return toEmailAddress;
	}
	public void setToEmailAddress(List<String> toEmailAddress) {
		this.toEmailAddress = toEmailAddress;
	}
	
}