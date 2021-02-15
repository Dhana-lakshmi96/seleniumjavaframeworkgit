package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.webpages.Google_Search_page1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Search_test1 {

	public static void main(String[] args) {
		googlepage();

	}
	
	public static void googlepage() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		
		Google_Search_page1 obj=new Google_Search_page1(driver);
		
		obj.setTextIn_textbox("automation testing");
		obj.click_button();
		
		driver.close();
		System.out.println("test completed");
		
	}

}
