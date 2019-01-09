
package com.hub.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsercodings{
	
	
	public static WebDriver driver;

	public static  WebDriver Browserfact(String browserName,String url) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
      driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.get(url);
	  driver.manage().window().maximize();
		

	     return driver;

		}}