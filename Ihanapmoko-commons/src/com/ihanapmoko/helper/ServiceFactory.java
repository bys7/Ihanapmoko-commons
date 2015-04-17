package com.ihanapmoko.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.ws.rs.core.MediaType;

import org.apache.commons.httpclient.NameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class ServiceFactory {

	public ServiceFactory() {
	}
	
	public <T> JSONObject HttpClientGetJSON(AuthBean authBean,NameValuePair[] params, String serviceMethodURL){
		JSONObject json = new JSONObject();
		
		try{
			
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getProperties().put(ClientConfig.PROPERTY_READ_TIMEOUT,30000); //30000 = 30 seconds read timeout
			clientConfig.getProperties().put(ClientConfig.PROPERTY_CONNECT_TIMEOUT,30000); //30000 = 30 seconds for connection timeout
			
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		    Client jerseyClient = Client.create(clientConfig);
		    
//		    jerseyClient.setConnectTimeout(10000);
//		    jerseyClient.setReadTimeout(10000);
		    
		    System.out.println("Connecting to : " + Configurator.getConfig("IHANAPMOKO.SERVICE.URL") + serviceMethodURL);
		    
		    WebResource webResource = jerseyClient.resource(Configurator.getConfig("IHANAPMOKO.SERVICE.URL") + serviceMethodURL);
		    
		    ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
		    						.header("apiLogin", authBean.getUsername())
		    						.header("apiPassword", authBean.getPassword())
		    						.header("hashValue", authBean.getHashValue())
		    						.type(MediaType.APPLICATION_JSON)
		    						.post(ClientResponse.class, parseObject(params));
		    
		    String errorMessage = "";
		    
		    if(response!=null){
		    	if (response.getStatus() != 200) {
					System.out.println("Failed : HTTP error code : " + response.getStatus());
				
					if(response.getStatus() == 401){
						
						errorMessage = "API Authentication Failed!";
						
					}else if(response.getStatus() == 402){
						
						errorMessage = "No Such Algorithm Exception.";
					
					}else if(response.getStatus() == 403){
						
						errorMessage = "Unsupported Encoding Exception.";
						
					}
					
					else{
						errorMessage = "Server Busy. Please try again later.";
					}
				}else{
					json = new JSONObject(response.getEntity(String.class));
				}
		    	
		    	
		    	
		    }
		    
		    if(json.toString().equals("{}")){
		    	
				ServiceResult sr = new ServiceResult();
				sr.setStatus(-1);
				sr.setDescription(errorMessage);
				sr.setObj(null);
				
				json = new JSONObject(this.parseObject(sr));
				
			}
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	    
	    return json;
	}

	@SuppressWarnings("deprecation")
	public Object getMapper(Class<?> c, String jSOnObjStr){

		ObjectMapper om = new ObjectMapper();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S",Locale.ENGLISH);

		om.getDeserializationConfig().setDateFormat(df);
		om.getSerializationConfig().setDateFormat(df);
		Object obj = new Object();
		try {
			obj = om.readValue(jSOnObjStr, c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	@SuppressWarnings("deprecation")
	public String parseObject(Object o){

		ObjectMapper om = new ObjectMapper();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S",Locale.ENGLISH);

		om.getDeserializationConfig().setDateFormat(df);
		om.getSerializationConfig().setDateFormat(df);
		String resultStr = "";
    	try {
			resultStr = om.writeValueAsString(o);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return resultStr;
	}
	
}
