package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_demo {
	
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		}
	@Test
	public void google_search() {
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dhanatene4e2");
		driver.findElement(By.name("pass")).sendKeys("23456");
		driver.findElement(By.id("u_0_b")).click();
		
		
	}
	@AfterTest
	public void tearDown_Test() {
		
		driver.close();
		
		
	}

	
}
