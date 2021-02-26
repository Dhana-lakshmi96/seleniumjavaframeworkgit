package com.selenium.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJs {
	@Test
	public static void PageTitle() {
		
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		UtilityScreenShot.capturescreenshot(driver, "phantomjsexample");
		
		//.NoSuchMethodError: no output
	}

}
