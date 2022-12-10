package com.revision.patterns;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	private static Config config;
	private Properties properties;

	private Config() {

		try {
			if (properties == null) {
				properties = new Properties();

				InputStream io = this.getClass().getResourceAsStream("/com/revision/patterns/config.properties");
				properties.load(io);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
	
	 public static Config getInstance()
	 {
		 if(config==null)
		 {
			 config= new Config();
		 }
		 
		 return config;
	 }
	
	  public   String getValues(String key)
		 {
			 return properties.getProperty(key);
		 }


}
