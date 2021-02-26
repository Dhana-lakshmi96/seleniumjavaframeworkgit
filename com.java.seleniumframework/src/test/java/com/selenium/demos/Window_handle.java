package com.selenium.demos;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handle {
	
	
	@Test
	public static void Multiple_WindowHanle() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='Bgzgmd']//li[2]//a")).click();
		
		String parent_window=driver.getWindowHandle();
		System.out.println("before switching title is:"+driver.getTitle());
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while (i1.hasNext()) {
			
			String child_window=i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window)) {
				
				driver.switchTo().window(child_window);
				Thread.sleep(3000);
				System.out.println("after switching title is:"+driver.getTitle());				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("parent window title is:"+driver.getTitle());
		
	}

	

}
