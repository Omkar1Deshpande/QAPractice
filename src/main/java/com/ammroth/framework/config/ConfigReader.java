package com.ammroth.framework.config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

	public class ConfigReader {
	    private static Properties prop = new Properties();

	    static {
	        FileInputStream fis = null;
			try {
				fis = new FileInputStream("src/main/resources/config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	            try {
					prop.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       
	    }

	    public static String get(String key) {
	        return prop.getProperty(key);
	    }
	}

