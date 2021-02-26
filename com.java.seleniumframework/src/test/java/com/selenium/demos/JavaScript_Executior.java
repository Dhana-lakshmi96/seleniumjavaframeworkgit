package com.selenium.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executior {
	
	@Test
	public static void script_executor() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("alert('Welcome to Selenium')");	
		
		WebElement email=driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='dhanatene4e2@gmail'", email);
		//js.executeScript("arguments[0].value=arguments[1]", email,"dhanatene4e2@gmail");
		Thread.sleep(3000);
		
		
		driver.close();
		
		
		
	}
}
