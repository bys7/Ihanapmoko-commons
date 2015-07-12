package com.ihanapmoko.bean;

import java.util.Date;

public class Bidding {

	private int id;
	private int advertisement_id;
	private int user_id;	
	private int picture_id;
	private String message;	
	private Date date_posted;	
	
	public Date getDate_posted() {
		return date_posted;
	}
	public void setDate_posted(Date date_posted) {
		this.date_posted = date_posted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdvertisement_id() {
		return advertisement_id;
	}
	public void setAdvertisement_id(int advertisement_id) {
		this.advertisement_id = advertisement_id;
	}	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(int picture_id) {
		this.picture_id = picture_id;
	}
	
}
