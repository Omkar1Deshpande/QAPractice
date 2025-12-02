package com.ammroth.framework.config;
import java.io.FileInputStream;
import java.util.Properties;

	public class ConfigReader {
	    private static Properties prop = new Properties();

	    public static void loadConfig(){
			try {
				FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
				prop.load(fis);

			} 
			catch (Exception e) {
				System.out.println("config.properties File Not loading!!");
				e.printStackTrace();
			}
	    }

	    public static String getProp(String key) {
	        return prop.getProperty(key);
	    }
	}

