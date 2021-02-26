package com.selenium.demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
	@Test
	public static void Take_ss() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		UtilityScreenShot.capturescreenshot(driver,"browserstarted");
		driver.get("https://facebook.com");
		
		UtilityScreenShot.capturescreenshot(driver,"typeUname");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automation");
		
		}

}
