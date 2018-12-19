package com.hub.Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
WebDriver driver;
	public static void Capturescreenshot(WebDriver driver,String screenshotName)
	{try
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		System.out.println("Screenshot taken");
	}
	catch(Exception e) {
		System.out.println("Exception while taking screenshot"+e.getMessage());
		
	}
	}
}
