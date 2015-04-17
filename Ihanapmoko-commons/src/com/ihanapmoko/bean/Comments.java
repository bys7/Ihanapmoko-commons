package com.ihanapmoko.bean;

import java.util.Date;

public class Comments {

	private int id;
	private String fullname;
	private String email_address;
	private String message;
	private int read_marker;
	private Date date_sent;
	
	
	public Date getDate_sent() {
		return date_sent;
	}
	public void setDate_sent(Date date_sent) {
		this.date_sent = date_sent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setRead_marker(int read_marker) {
		this.read_marker = read_marker;
	}
	public int getRead_marker() {
		return read_marker;
	}
	
}
