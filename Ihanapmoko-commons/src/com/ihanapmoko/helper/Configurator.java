package com.ihanapmoko.helper;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Configurator {

	private static Properties config = null;
	private static boolean reloadable = true;
	private static long CONFIG_LAST_MODIFIED_TIME_MILLIS = 0;

//	private static final boolean configfilesystem = true;
//	private static final String CONF = "/appl/conf/ihanapmoko-commons.conf";
	private static final boolean configfilesystem = false;
	private static final String CONF = "/com/ihanapmoko/conf/ihanapmoko-commons.conf";

	static {
		Configurator.ReloadConfig();
		System.out.println("Ihanapmoko Commons Initialized");
	}

	private Configurator() {
	}

	public synchronized static void ReloadConfig() {

		if (reloadable) {
			long modifiedtime = 0;

			if(configfilesystem){
				try {
						File file = new File(CONF); //for linux
						modifiedtime = file.lastModified();

					if(true){
					//if (CONFIG_LAST_MODIFIED_TIME_MILLIS < modifiedtime) {
						CONFIG_LAST_MODIFIED_TIME_MILLIS = modifiedtime;
						InputStream conffile = file.toURI().toURL().openStream(); // for linux
						file = null; // for linux
						config = new Properties();
						config.load(conffile);

						if (config.getProperty("reloadable") != null
								&& config.getProperty("reloadable")
										.equalsIgnoreCase("true")) {
							reloadable = true;
						} else {
							reloadable = false;
						}

						conffile.close();
						conffile = null;

						System.out.println("Reloaded file ihanapmoko-commons.conf.conf @ " + new java.util.Date());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				}else{

				try {
					URL url = getResource(CONF); //for windows
					String externalForm = url.toExternalForm(); // for windows

					if (externalForm.startsWith("file:")) { //for windows
						File file = new File(externalForm.substring(5)); //for windows
						modifiedtime = file.lastModified();
						file = null; // for windows
					} // for windows

					//if (CONFIG_LAST_MODIFIED_TIME_MILLIS < modifiedtime) {
					if (true) {
						CONFIG_LAST_MODIFIED_TIME_MILLIS = modifiedtime;
						InputStream conffile = url.openStream(); //for windows
						config = new Properties();
						config.load(conffile);
						//AppLogger.info(ServicesProxyConstants.SP, "i think its gona rain when i die");

						if (config.getProperty("reloadable") != null
								&& config.getProperty("reloadable")
										.equalsIgnoreCase("true")) {
							reloadable = true;
						} else {
							reloadable = false;
						}

						conffile.close();
						conffile = null;

						System.out.println("Reloaded file ihanapmoko-commons.conf @ "
								+ new java.util.Date());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}


	public static URL getResource(String resource) throws Exception {
		String stripped = resource.startsWith("/") ? resource.substring(1)
				: resource;

		URL url = null;
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		if (classLoader != null) {
			url = classLoader.getResource(stripped);
		}
		if (url == null) {
			url = Configurator.class.getResource(resource);
		}
		if (url == null) {
			url = Configurator.class.getClassLoader().getResource(stripped);
		}
		if (url == null) {
			throw new Exception(resource + " not found");
		}
		return url;
	}

	public static String getConfig(String configname) {
		Configurator.ReloadConfig();
		return (String) config.get(configname);
	}
	
}
