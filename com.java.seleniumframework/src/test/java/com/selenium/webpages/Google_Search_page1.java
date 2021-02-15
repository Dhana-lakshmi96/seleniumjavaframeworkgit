package com.selenium.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Search_page1 {
	
	
	WebDriver driver=null;
	
	By textbox_search=By.name("q");
	By button_search=By.name("btnK");
	
	
	public Google_Search_page1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextIn_textbox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
		}
	
	public void click_button() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}

}
