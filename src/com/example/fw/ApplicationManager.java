package com.example.fw;

import java.util.Properties;

public class ApplicationManager {
	
	private Properties properties;
	
	public  ApplicationManager(Properties properties) {
		this.properties = properties;
	}

	public void stop() {
		
	}

	public void setProperties(Properties properties){
			this.properties = properties;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	public String getProperty(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}
		
//	public FolderHelper getFolderHelper() {
//		if (folderHelper == null) {
//			folderHelper = new FolderHelper(this);
			
//		}
//		return folderHelper;
//	}
}
