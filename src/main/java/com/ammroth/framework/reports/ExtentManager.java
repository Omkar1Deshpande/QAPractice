package com.ammroth.framework.reports;

import com.ammroth.framework.config.ConfigReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if(extent == null) {
			setupReport();
		}
		return extent;
	}

	public static void setupReport() {
	
		ExtentSparkReporter spark = new ExtentSparkReporter(ConfigReader.getProp("extentReportPath"));

		spark.config().setReportName("Automation Execution Report");
		spark.config().setDocumentTitle("Extent Report");

		extent = new ExtentReports();
		extent.attachReporter(spark);

		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Omkar");

	}
}
