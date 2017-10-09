package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class SegmentedControls {
	
	@Test
	public void segmentedControl() throws MalformedURLException, InterruptedException 
		{
			
			IOSDriver driver;
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName","Appium");
			capabilities.setCapability("platformName","iOS");	
			capabilities.setCapability("platformVersion","11.0");
			capabilities.setCapability("deviceName","Gautham iPhone");

			capabilities.setCapability("udid", "6b4e2394fd5c534c240ffe2b488cf76e0ea9bf5d");
			capabilities.setCapability("bundleId","com.learning.apple-samplecode.UIKitCatalog");
	
			URL url;
			url= new URL("http://127.0.0.1:4723/wd/hub");
	
			System.out.println("Execution starting to Segmented Control ");
	
			driver = new IOSDriver(url,capabilities);
	
			WebElement UICatalog = (WebElement) driver.findElements(By.className("UIAButton")).get(0);
			
			UICatalog.click();
			driver.findElement(By.name("Segmented Controls")).click();
			System.out.println("Clicked Segmented Controls");
			
			System.out.println("The length is:");
			
			//driver.findElement(By.xpath("(//*[@name=\"Tools\"])[2]")).click();
			
			driver.findElement(By.xpath("(//*[@name = 'Tools'])[2]")).click();

			
			Thread.sleep(2000);

			driver.quit();
	
	
	}


}
