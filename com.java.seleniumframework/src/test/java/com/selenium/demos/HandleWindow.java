package com.selenium.demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {
	
	@Test
	public static void windowHandle() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://naukari.com");
		//driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		String parentW=driver.getWindowHandle();
		System.out.println("parent window is"+parentW);
		
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		 Set<String>all_windows=driver.getWindowHandles();
		 int count=all_windows.size();
		 System.out.println("all windows="+count);
		 
		 for(String child:all_windows) {
			 
			 if(!parentW.equalsIgnoreCase(child)) {
				 
				 driver.switchTo().window(child);
				 System.out.println("child window title is"+driver.getTitle());
				// driver.findElement(By.name("q")).sendKeys("automation");
				 Thread.sleep(3000);
				 driver.close();
			 }
		 }
		
		driver.switchTo().window(parentW);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
