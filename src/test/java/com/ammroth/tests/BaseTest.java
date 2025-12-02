package com.ammroth.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.ammroth.framework.config.ConfigReader;
import com.ammroth.framework.driver.DriverFactory;
import com.ammroth.framework.pages.Campaigns;
import com.ammroth.framework.pages.Dashboards;
import com.ammroth.framework.pages.LoginPage;

public class BaseTest {
	
	protected WebDriver driver = null;
	protected LoginPage loginPage;
	protected Dashboards db;
	protected Campaigns cm;
	
	@BeforeSuite
	public void beforeSuite() {
		//Done - Load config files, 
		ConfigReader.loadConfig();
		//Remaining - Setup logging, reporting, database connection, servers
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		//<==============Initialize WebDriver==============>
		driver = DriverFactory.initDriver(ConfigReader.getProp("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProp("implicitWait"))));
		
		//<==============Open application URL==============>
		driver.get(ConfigReader.getProp("baseURL"));
		driver.manage().window().maximize();
		
		//<==============Load Page objects==============>
		loginPage = new LoginPage(driver);		
		db = new Dashboards(driver);
		cm = new Campaigns(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//Login to app
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		//Done - logout
		//driver.findElement(By.xpath("//div[@class='user-icon']")).click();
		//driver.findElement(By.xpath("//div[@class='dropdown-item logout']")).click();
		
		//Remaining - Take Screenshot, clear cookies & sessions
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.quit();
		//Quit web browser, 
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		//Remaining - Setup logging, write test reporting, stop database connection, stop servers
	}
	
}
