package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utility.BrowserFactory;
import com.wordpress.pages.Loginpage;

public class VerifyValidLogin {
	
	
	@Test
	public void checklogin() {
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		Loginpage lpage=PageFactory.initElements(driver, Loginpage.class);
		
		lpage.login_wordpress("admin", "demo123");	
		
	}

}
