package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport_TestNG {
	ExtentReports extent=null;
	WebDriver driver=null;
	ExtentTest test=null;
	
	@BeforeSuite
	public void setUp() {
		ExtentSparkReporter spark=new ExtentSparkReporter("external.html");
		extent=new ExtentReports();
		extent.attachReporter(spark);
		
	}
	
	@Test
	public void test() {
		
		test=extent.createTest("googlr search page");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		test.log(Status.INFO, "navigated to google page");
		test.pass("loaded the page");
		test.log(Status.PASS, "page is loaded");
		test.log(Status.FAIL, "test is failed");
		test.addScreenCaptureFromPath("screenshot.png");
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
		test.pass("browser is closed");
		extent.flush();
		
	}

}
