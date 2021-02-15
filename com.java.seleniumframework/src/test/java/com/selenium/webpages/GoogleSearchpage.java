package com.selenium.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchpage {
	 
	static WebElement element=null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element=driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement buttonclick(WebDriver driver) {
		
		element=driver.findElement(By.name("btnK"));
		return element;
		
	}

}
