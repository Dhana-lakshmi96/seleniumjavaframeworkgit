package com.java.seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestusingWebdrivermanager {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		
							
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
