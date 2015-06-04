package com.ihanapmoko.helper;

public class ServiceMethodNames {

	/*USER*/
	public static final String GET_EMAIL_AND_PASSWORD		=		"/user/getEmailAndPassword";
	public static final String CREATE_USER		            =		"/user/create";
	public static final String GET_USER_BY_ID		        =		"/user/getById";
	public static final String UPDATE_USER		            =		"/user/update";
	
	/*ADVERTISEMENT*/
	public static final String SEARCH_ADVERTISEMENT					=		"/advertisement/searchAdvertisement";
	public static final String CREATE_ADVERTISEMENT					=		"/advertisement/createAdvertisement";
	public static final String FETCH_ADVERTISEMENT_BY_ID			=		"/advertisement/fetchAdvertisementById";
	public static final String FETCH_ADVERTISEMENT_BY_PICTURE_ID	=		"/advertisement/fetchAdvertisementByPictureId";
	
	/*COMMENTS*/
	public static final String CREATE_COMMENT				=		"/comments/createComments";
		
	/*CATEGORY*/
	public static final String FETCH_ALL_CATEGORY			=		"/category/fetchAllCategory";
	public static final String FETCH_CATEGORY_BY_ID			=		"/category/fetchCategoryById";
	
	/*LOCATION*/
	public static final String FETCH_ALL_LOCATION			=		"/location/fetchAllLocation";
	public static final String FETCH_LOCATION_BY_ID			=		"/location/fetchLocationById";
	
	/*FILTER LOOKUP*/
	public static final String FETCH_ALL_FILTERLOOKUP		=		"/filterlookup/fetchFilterLookup";
	
	/*PICTURES*/
	public static final String FETCH_PICTURE_BY_ID			=		"/pictures/fetchPictureById";
	public static final String FETCH_PICTURE_BY_NAME		=		"/pictures/fetchPictureByName";
	public static final String FETCH_PICTURE_BY_AD_ID		=		"/pictures/fetchPictureByAdId";
	public static final String CREATE_PICTURES				=		"/pictures/createPictures";
	
	/*PICTURE SERVICES*/
	public static final String CREATE_PICTURES_SERVICES		=		"/picturesservices/createPicturesServices";
}
