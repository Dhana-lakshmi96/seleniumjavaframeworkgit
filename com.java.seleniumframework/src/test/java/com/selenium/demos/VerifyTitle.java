package com.selenium.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	@Test
	public static void verifyApplicationTitle() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");

		String actual=driver.getTitle();
		System.out.println("actual title is:"+actual);

		String expcted_title="google"; 
		//Assert.assertEquals(actual,expcted_title);
		Assert.assertTrue(actual.contains("gle"));

		System.out.println("test complited");



	}
}
