package com.ammroth.tests;

import org.testng.annotations.Test;

import com.ammroth.framework.config.ConfigReader;

public class CampaignsTest extends BaseTest{
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login");
		loginPage.enterUsername(ConfigReader.getProp("username"))
		 .enterPassword(ConfigReader.getProp("password"))
		 .clickSignIn();
	}

	@Test(priority=2)
	public void addCampaign() throws InterruptedException {
		System.out.println("Add Campaign");
		Thread.sleep(5000);
		db.clickOnCreateCampaigns();
		System.out.println("Done");
		cm.enterCampaignName("DEDE1");
		cm.enterTargetSize(10);
		cm.clickOnCreateCampaigns();
		

		
	}

}
