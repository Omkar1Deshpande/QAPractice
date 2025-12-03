package com.ammroth.tests;

import org.testng.annotations.Test;

import com.ammroth.BaseTest.BaseTest;
import com.ammroth.framework.config.ConfigReader;
import com.ammroth.framework.reports.ExtentTestManager;

public class CampaignsTest extends BaseTest{
	
	@Test(priority=1)
	public void login() {
		ExtentTestManager.startTest("Login Test");
		ExtentTestManager.getTest().info("Entering username");
		loginPage.enterUsername(ConfigReader.getProp("username"));
		ExtentTestManager.getTest().info("Entering password");
		loginPage.enterPassword(ConfigReader.getProp("password"));
		loginPage.clickSignIn();
		
		ExtentTestManager.getTest().pass("Login successful");
	}

	@Test(priority=2)
	public void addCampaign() throws InterruptedException {
		ExtentTestManager.startTest("Add Campaign Test");
		Thread.sleep(5000);
		db.clickOnCreateCampaigns();
		System.out.println("Done");
		cm.enterCampaignName("DEDE1");
		cm.enterTargetSize(10);
		cm.clickOnCreateCampaigns();
		su.captureScreenshot(driver);
		ExtentTestManager.getTest().pass("Campaign added successful");
		
	}

}
