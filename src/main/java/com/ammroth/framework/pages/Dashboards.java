package com.ammroth.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboards {
	
	private WebDriver driver;
	public Dashboards(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
	}

	//<==================Create Campaign - Button=====================>
	@FindBy(xpath="//span[contains(text(),'Create Campaign')]")
	private WebElement createCampaignButton;

	public WebElement getCreateCampaignButton() {
		return createCampaignButton;
	}
	
	public void clickOnCreateCampaigns() {
		createCampaignButton.click();
	}

}
