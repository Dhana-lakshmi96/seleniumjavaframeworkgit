package com.wordpress.pages;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement username;
	

	@FindBy(how=How.ID,using="user_pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="id=\"wp-submit\"")
	@CacheLookup
	WebElement button;
	
	@FindBy(linkText = "Lost your password?")
	@CacheLookup
	WebElement lostpassword;
	

	
	public void login_wordpress(String uid, String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
