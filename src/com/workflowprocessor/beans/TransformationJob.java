package com.workflowprocessor.beans;

/*
 * Class to store the transformation job details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.ArrayList;
import java.util.List;

public class TransformationJob {
	private String contextID;
	private String jobName;
	private String jobCategory;
	private String jobType;
	private String jobStatus;
	private long startTime;
	private long endTime;
	private boolean isTransientPath;
	private String location;
	private RuntimeConfig runtimeConfig;
	private List<String> dependencies;
	private HiveQLJob hiveQLJob;
	private MapReduceJob mapReduceJob;
	private UnixJob unixJob;
	private JavaJob javaJob;
	
	public String getContextID() {
		return contextID;
	}
	public void setContextID(String contextID) {
		this.contextID = contextID;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public boolean isTransientPath() {
		return isTransientPath;
	}
	public void setTransientPath(boolean isTransientPath) {
		this.isTransientPath = isTransientPath;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public RuntimeConfig getRuntimeConfig() {
		return runtimeConfig;
	}
	public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
		this.runtimeConfig = runtimeConfig;
	}
	public List<String> getDependencies() {
		return dependencies;
	}
	public void addDependencies(String dependencies) {
		if (this.dependencies == null) {
			this.dependencies = new ArrayList<String>();
		}
		this.dependencies.add(dependencies);
	}
	public HiveQLJob getHiveQLJob() {
		return hiveQLJob;
	}
	public void setHiveQLJob(HiveQLJob hiveQLJob) {
		this.hiveQLJob = hiveQLJob;
	}
	public MapReduceJob getMapReduceJob() {
		return mapReduceJob;
	}
	public void setMapReduceJob(MapReduceJob mapReduceJob) {
		this.mapReduceJob = mapReduceJob;
	}
	public UnixJob getUnixJob() {
		return unixJob;
	}
	public void setUnixJob(UnixJob unixJob) {
		this.unixJob = unixJob;
	}
	public JavaJob getJavaJob() {
		return javaJob;
	}
	public void setJavaJob(JavaJob javaJob) {
		this.javaJob = javaJob;
	}
	
}
