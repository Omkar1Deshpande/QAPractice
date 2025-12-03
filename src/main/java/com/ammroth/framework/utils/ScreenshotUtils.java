package com.ammroth.framework.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ammroth.framework.config.ConfigReader;

public class ScreenshotUtils {
	
	public String captureScreenshot(WebDriver driver) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = timestamp + "_" + ConfigReader.getProp("screenshotPath");

        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }

}
