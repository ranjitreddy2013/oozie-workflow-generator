package com.workflowprocessor.beans;
/*
 * Class to store hive related parameters
 *
 * @author Ramasamy Karuppannan (ramasamy.karuppannan@aexp.com)   
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HiveQLJob {
	private String query;
	private List<String> queryList;
	private String hiveDB;
	private Map<String, String> params = new HashMap<String, String>();
	private WriterBean writerBean;
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public List<String> getQueryList() {
		return queryList;
	}
	public void setQueryList(List<String> queryList) {
		this.queryList = queryList;
	}
	public String getHiveDB() {
		return hiveDB;
	}
	public void setHiveDB(String hiveDB) {
		this.hiveDB = hiveDB;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	public WriterBean getWriterBean() {
		return writerBean;
	}
	public void setWriterBean(WriterBean writerBean) {
		this.writerBean = writerBean;
	}
}
