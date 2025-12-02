package com.ammroth.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ammroth.framework.config.ConfigReader;

public class TestDeleteLater {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ConfigReader.loadConfig();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(ConfigReader.getProp("baseURL"));
		driver.findElement(By.id("username")).sendKeys(ConfigReader.getProp("username"));
		driver.findElement(By.id("inputPassword")).sendKeys(ConfigReader.getProp("password"));
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Create Campaign')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'campaignName')]")).sendKeys("xyz");
		WebElement we = driver.findElement(By.xpath("//input[contains(@name,'targetSize')]"));
		we.clear();
		we.sendKeys("10");
		driver.findElement(By.xpath("//button[contains(text(),'Create Campaign')]")).click();
		
		driver.close();
	}

}
