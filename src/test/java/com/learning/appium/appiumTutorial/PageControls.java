package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class PageControls {
	
	@Test
	public void pageControl() throws MalformedURLException, InterruptedException 
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
	
			System.out.println("Execution starting to Page Controls");
	
			driver = new IOSDriver(url,capabilities);
	
			WebElement UICatalog = (WebElement) driver.findElements(By.className("UIAButton")).get(0);
			
			UICatalog.click();
			driver.findElement(By.name("Page Control")).click();
			System.out.println("Clicked Page Controls");

			
		//	driver.findElement(By.xpath("//*[@type ='XCUIElementTypePageIndicator']")).sendKeys("page 5 of 10");
			
			//driver.findElementByClassName("XCUIElementTypePageIndicator").sendKeys("page 5 of 10");
			
			//driver.findElementByClassName("XCUIElementTypePageIndicator").getAttribute("value");
			
			System.out.println("The Current page number is : "+driver.findElementByClassName("XCUIElementTypePageIndicator").getAttribute("value"));
			
			//driver.findElementByClassName("XCUIElementTypePageIndicator").sendKeys(7);
			
			System.out.println("The changed page number is : "+driver.findElementByClassName("XCUIElementTypePageIndicator").getAttribute("value"));

		

			Thread.sleep(2000);
			
			driver.quit();
	
	
	}



}
