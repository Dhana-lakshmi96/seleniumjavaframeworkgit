package com.selenium.realproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_example {
	
	@Test
	public static void Select_Date() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='rb-calendar']//table//td"));
		
		int dates_count=alldates.size();
		System.out.println(dates_count);
		
		for(WebElement ele:alldates) {
			
			String Sel_date=ele.getText();
			
			System.out.println(Sel_date);
			
			if(Sel_date.equals("26")) {
				
				ele.click();

				break;
			
		}
		
		//driver.close();
		
	}
	}
		
 }
