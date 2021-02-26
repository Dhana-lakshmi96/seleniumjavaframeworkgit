package com.selenium.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_hover {
	
	@Test
	public static void mouseAction() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int count=links.size();
		System.out.println("total no of links are:"+count);
		
		for(int i=0;i<count;i++) {
			
			WebElement element=links.get(i);
			
			String text=element.getAttribute("innerHTML");
			
			System.out.println("link name is:"+text);
			
			if(text.equalsIgnoreCase("testng")) {
				
				element.click();
				break;
			}
		}
		
		driver.close();
	}
}
