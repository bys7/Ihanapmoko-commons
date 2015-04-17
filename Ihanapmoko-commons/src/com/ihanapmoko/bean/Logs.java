package com.ihanapmoko.bean;

import java.util.Date;

public class Logs {

	private int id;
	private String activity;
	private String definition;
	private Date date_log;
	
	
	public Date getDate_log() {
		return date_log;
	}
	public void setDate_log(Date date_log) {
		this.date_log = date_log;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
}
