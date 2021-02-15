package com.selenium.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit_Demo {
	
	
	public static void main(String...args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		
		//System.getProperty("user.dir");
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("E:\\fileuploadscript.exe");
		Thread.sleep(3000);
		

		
	}
}
