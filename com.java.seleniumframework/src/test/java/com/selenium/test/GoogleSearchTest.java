package com.selenium.test;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.webpages.GoogleSearchpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		googleSearch();

	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://google.com/");
		
		GoogleSearchpage.textbox_search(driver).sendKeys("automation testing");
		
		GoogleSearchpage.buttonclick(driver).sendKeys(Keys.RETURN);;
		
		driver.close();
		System.out.println("test completed successfully");
		
	}

}
