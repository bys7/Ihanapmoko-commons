package com.ihanapmoko.bean;

import java.util.Date;

public class SearchResult {

	private int advertisementId;
	private String advertisement;
	private Date date_created;
	private String location;
	private String picture_destination;
	
	
	public String getPicture_destination() {
		return picture_destination;
	}
	public void setPicture_destination(String picture_destination) {
		this.picture_destination = picture_destination;
	}
	public int getAdvertisementId() {
		return advertisementId;
	}
	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}
	public String getAdvertisement() {
		return advertisement;
	}
	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
