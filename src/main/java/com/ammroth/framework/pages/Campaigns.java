package com.ammroth.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	public Campaigns(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
	}

	//<==================Campaign Name - Textfield=====================>
	@FindBy(xpath="//input[contains(@name,'campaignName')]")
	private WebElement campaignName;

	public WebElement getCampaignName() {
		return campaignName;
	}
	
	public void enterCampaignName(String cn) {
		campaignName.sendKeys(cn);
	}

	//<==================Target Size - Textfield=====================>
	@FindBy(xpath="//input[contains(@name,'targetSize')]")
	private WebElement targetSize;

	public WebElement getTargetSize() {
		return targetSize;
	}
	
	public void enterTargetSize(int tz) {
		targetSize.clear();
		targetSize.sendKeys(Integer.toString(tz));;
	}
	
	//<==================Create Campaign - Button=====================>
		@FindBy(xpath="//button[contains(text(),'Create Campaign')]")
		private WebElement createCampaignButton;

		public WebElement getCreateCampaignButton() {
			return createCampaignButton;
		}
		
		public void clickOnCreateCampaigns() {
			createCampaignButton.click();
		}

}
