package com.selenium.demos;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authendication {
	@Test
	public static void handleAuthendication() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Runtime.getRuntime().exec("http://www.engprod-charter.net/");
		driver.get("http://www.engprod-charter.net/");
	
	
	}
}
