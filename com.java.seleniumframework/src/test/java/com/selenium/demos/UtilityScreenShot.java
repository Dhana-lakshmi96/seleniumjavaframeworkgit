package com.selenium.demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenShot {
	
	public static void capturescreenshot(WebDriver driver, String screenshot) {
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshorts/"+screenshot+".png"));
			System.out.println("taken screen shot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
