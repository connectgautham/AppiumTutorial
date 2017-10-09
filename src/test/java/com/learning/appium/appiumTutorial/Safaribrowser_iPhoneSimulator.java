package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;


public class Safaribrowser_iPhoneSimulator {
	
	@Test
	public void LaunchSafariSimulator() throws MalformedURLException, InterruptedException 
		{
			
			IOSDriver driver;
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName","Appium");
			capabilities.setCapability("platformName","iOS");	
			capabilities.setCapability("platformVersion","11.0");
			capabilities.setCapability("deviceName","iPhone Simulator");
			capabilities.setCapability("browserName","Safari");
	
			URL url;
			url= new URL("http://127.0.0.1:4723/wd/hub");
	
			System.out.println("Execution starting to launch Safari Browser");
	
			driver = new IOSDriver(url,capabilities);
			
			Thread.sleep(2000);
			
			driver.get("http://google.com");
			Thread.sleep(2000);
			
			driver.quit();
	
	
	}
}
