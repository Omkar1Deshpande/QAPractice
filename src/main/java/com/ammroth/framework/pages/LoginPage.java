package com.ammroth.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	@SuppressWarnings("unused")
	private WebDriver driver;

	public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); 
	}
	//<==========Username - Text field============>
	@FindBy(id="username")
	private WebElement user_name;

	public WebElement getUser_name() {
		return user_name;
	}
	
	public LoginPage enterUsername(String un) {
		user_name.sendKeys(un);
		return this;
	}
	
	//<==========Password - Text field============>
	@FindBy(id="inputPassword")
	private WebElement password;

	public WebElement enterPassword() {
		return password;
	}
	
	public LoginPage enterPassword(String pw) {
		password.sendKeys(pw);
		return this;
	}
	
	//<==========Sign In - Button============>
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement sign_in;

	public WebElement getSignInButton() {
		return sign_in;
	}
	
	public LoginPage clickSignIn() {
		sign_in.click();
		return this;
	}
	
}
