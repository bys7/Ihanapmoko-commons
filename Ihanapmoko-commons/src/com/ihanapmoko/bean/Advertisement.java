package com.ihanapmoko.bean;

import java.util.Date;

public class Advertisement {

	private int id;
	private String advertisement;
	private int category_id;
	private String contact_number;
	private String number_is_private;
	private String email_address;
	private Date date_created;
	private int location_id;
	private String budget;
	private String password;
	private String description;
	private String active_status;
	private String picture_id;
	private int views;
	private String item_condition;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdvertisement() {
		return advertisement;
	}
	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getNumber_is_private() {
		return number_is_private;
	}
	public void setNumber_is_private(String number_is_private) {
		this.number_is_private = number_is_private;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive_status() {
		return active_status;
	}
	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(String picture_id) {
		this.picture_id = picture_id;
	}
	public String getItem_condition() {
		return item_condition;
	}
	public void setItem_condition(String item_condition) {
		this.item_condition = item_condition;
	}
	
}
