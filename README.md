# SeleniumAutomation
Java + Selenium Automation

# Hybrid Automation Framework 
Selenium + Maven + POM + TestNG + Data-Driven + Modular + Utilities

# Project folder structure
<img width="489" height="616" alt="Framework" src="https://github.com/user-attachments/assets/8252aaeb-798f-4704-92e9-733dcbd504f8" />

# What goes in each of the four folders
- src/main/java
•	driver package — DriverFactory, WebDriver management, browser capability builders.
•	config package — ConfigReader to read config.properties.
•	pages package — Page Object classes (POM).
•	utils package — WaitUtils, ScreenshotUtils, ExcelUtils, DBUtils, APIUtils.
•	listeners package — TestListener (ITestListener) to capture screenshots/logs on failure and for report attachments.

- src/main/resources
•	config.properties — URL, browser, timeouts, paths, credentials (if safe).
•	log4j2.xml — logging configuration.
•	Any global JSON templates or mapping files.

- src/test/java
•	BaseTest — setup/teardown that uses DriverFactory, registers listeners.
•	Test classes (e.g., LoginTest, LoanModuleTest).

- src/test/resources
•	testdata — Excel/CSV/JSON files used by DataProvider.
•	suites — testng.xml suite files and environment-specific suites.
•	sample data / sample stubs / mocks.

