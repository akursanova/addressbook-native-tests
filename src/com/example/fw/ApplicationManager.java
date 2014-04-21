package com.example.fw;

import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {
	
	protected final ApplicationManager manager;
	private Properties properties;
	private Process process;
	
	public  ApplicationManager(Properties properties) {
		this.properties = properties;
	}

	public void stop() {
		process.destroy();
	}
	
	public void start() throws IOException {
		String command = manager.getProperty("app.path");
		process = Runtime.getRuntime().exec(command);
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
