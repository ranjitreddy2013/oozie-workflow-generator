package com.workflowprocessor.beans;
/*
 * Class to store map reduce job details
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;

public class MapReduceJob {
	private Configuration conf;
	private String inputFormatClass;
	private String outputFormatClass;
	private List<MapperBean> mapperObj;
	private String groupComparatorClass;
	private String sortComparatorClass;
	private String partitionerClass;
	private String combinerClass;
	private String reducerClass;	
	private String mapOutputKeyClass;
	private String mapOutputValuelass;
	private String outputKeyClass;
	private String outputValuelass;
	private Map<String, String> params = new HashMap<String, String>();
	private Map<String, String> properties = new HashMap<String, String>();
	private WriterBean writerBean;
	
	public Configuration getConf() {
		return conf;
	}
	public void setConf(Configuration conf) {
		this.conf = conf;
	}
	public String getInputFormatClass() {
		return inputFormatClass;
	}
	public void setInputFormatClass(String inputFormatClass) {
		this.inputFormatClass = inputFormatClass;
	}
	public String getOutputFormatClass() {
		return outputFormatClass;
	}
	public void setOutputFormatClass(String outputFormatClass) {
		this.outputFormatClass = outputFormatClass;
	}
	public List<MapperBean> getMapperObj() {
		return mapperObj;
	}
	public void addMapperObj(MapperBean mapperBean) {
		if (mapperObj == null) {
			mapperObj = new ArrayList<MapperBean>();
		}
		this.mapperObj.add(mapperBean);
	}
	public String getGroupComparatorClass() {
		return groupComparatorClass;
	}
	public void setGroupComparatorClass(String groupComparatorClass) {
		this.groupComparatorClass = groupComparatorClass;
	}
	public String getSortComparatorClass() {
		return sortComparatorClass;
	}
	public void setSortComparatorClass(String sortComparatorClass) {
		this.sortComparatorClass = sortComparatorClass;
	}
	public String getPartitionerClass() {
		return partitionerClass;
	}
	public void setPartitionerClass(String partitionerClass) {
		this.partitionerClass = partitionerClass;
	}
	public String getCombinerClass() {
		return combinerClass;
	}
	public void setCombinerClass(String combinerClass) {
		this.combinerClass = combinerClass;
	}
	public String getReducerClass() {
		return reducerClass;
	}
	public void setReducerClass(String reducerClass) {
		this.reducerClass = reducerClass;
	}
	public String getMapOutputKeyClass() {
		return mapOutputKeyClass;
	}
	public void setMapOutputKeyClass(String mapOutputKeyClass) {
		this.mapOutputKeyClass = mapOutputKeyClass;
	}
	public String getMapOutputValuelass() {
		return mapOutputValuelass;
	}
	public void setMapOutputValuelass(String mapOutputValuelass) {
		this.mapOutputValuelass = mapOutputValuelass;
	}
	public String getOutputKeyClass() {
		return outputKeyClass;
	}
	public void setOutputKeyClass(String outputKeyClass) {
		this.outputKeyClass = outputKeyClass;
	}
	public String getOutputValuelass() {
		return outputValuelass;
	}
	public void setOutputValuelass(String outputValuelass) {
		this.outputValuelass = outputValuelass;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	public WriterBean getWriterBean() {
		return writerBean;
	}
	public void setWriterBean(WriterBean writerBean) {
		this.writerBean = writerBean;
	}
}
