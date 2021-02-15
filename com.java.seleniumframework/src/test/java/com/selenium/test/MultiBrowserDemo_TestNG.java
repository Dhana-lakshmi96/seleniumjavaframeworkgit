package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo_TestNG {

	WebDriver driver=null;
	String projectpath = System.getProperty("user.dir");	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver(); 
					
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectpath+"/drivers/iedriver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test() throws Exception {

		driver.get("https://google.com");
		Thread.sleep(4000);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("browserName");

	}

}
