package com.selenium.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {
	@Test
	public static void bootStrap_dialougewindow() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg']")).click();
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/input[1]")).sendKeys("dhanalakshmi");
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/input[2]")).sendKeys("lava@123");
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/input[3]")).click();

	}
}
