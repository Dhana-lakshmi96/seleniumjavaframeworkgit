package com.java.seleniumframework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {

		
		  String projectpath = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("http://tinyupload.com/");
		  driver.findElement(By.name("uploaded_file")).click();
		
		//System.setProperty("webdriver.ie.driver", projectpath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		//driver.get("http://tinyupload.com/");
		driver.quit();
		
	}
}

