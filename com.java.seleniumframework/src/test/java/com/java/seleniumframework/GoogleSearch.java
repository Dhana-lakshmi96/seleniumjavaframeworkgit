package com.java.seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		googleSearch();

	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation testing");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		
	}

}
