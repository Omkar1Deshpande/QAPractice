package com.ammroth.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver initDriver(String browser) {
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			driver = new ChromeDriver();
		}
		
		return driver;
	}

}
