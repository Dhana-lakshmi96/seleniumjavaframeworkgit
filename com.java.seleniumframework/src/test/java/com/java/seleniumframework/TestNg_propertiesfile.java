package com.java.seleniumframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_propertiesfile {
		public static String browsername;
		static WebDriver driver;
	
		
	@BeforeClass
	public static void setup() throws IOException {
		
		String projectpath=System.getProperty("user.dir");
		PropertiesFileDemo.getproperties();
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie_explorer")){
			System.setProperty("webdriver.ie.driver", projectpath+"/drivers/iedriver/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
			
	}
	
	@Test
	public static void google_search() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dhanatene4e2");
		driver.findElement(By.name("pass")).sendKeys("23456");
		driver.findElement(By.id("u_0_b")).click();
		
	}
	
	@AfterSuite
	public static void teardown() {
		
		driver.close();
		
	}

}
