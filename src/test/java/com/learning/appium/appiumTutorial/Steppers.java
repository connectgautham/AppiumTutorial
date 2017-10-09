package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class Steppers {
	
	@Test
	public void steppersnavigation() throws MalformedURLException, InterruptedException 
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
	
			System.out.println("Execution starting to launch Steppers");
	
			driver = new IOSDriver(url,capabilities);
			
			
			//WebElement UICatalog = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
			
			WebElement UICatalog = (WebElement) driver.findElements(By.className("UIAButton")).get(0);
			
			UICatalog.click();
			driver.findElement(By.name("Steppers")).click();
			System.out.println("Clicked Steppers");
			
			WebElement maxIncrement = (WebElement) driver.findElements(By.className("XCUIElementTypeStaticText")).get(0);
			
			while(!maxIncrement.getAttribute("value").equals("3"))
			{
				WebElement inc = (WebElement) driver.findElements(By.name("Increment")).get(0);
				inc.click();

			}
			
			Thread.sleep(2000);
			
			driver.quit();
	
	
	}

}
