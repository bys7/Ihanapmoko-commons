package com.ihanapmoko.helper;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class AuthBean {

	private String username;
	private String password;
	private String hashValue;
	
	public AuthBean(String username, String password, String secretKey) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		this.username = username;
		this.password = password;
		this.hashValue= SecurityHelper.generateSecureHashAuthentication(username, password, secretKey);
		
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getHashValue() {
		return hashValue;
	}
	
}
