package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class Sliders {
	
	@Test
	public void sliders() throws MalformedURLException, InterruptedException 
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
	
			WebElement UICatalog = (WebElement) driver.findElements(By.className("UIAButton")).get(0);
			
			UICatalog.click();
			driver.findElement(By.name("Sliders")).click();
			System.out.println("Clicked Sliders");
			
			WebElement slider = (WebElement) driver.findElements(By.className("XCUIElementTypeSlider")).get(1);
			
			slider.sendKeys("0.09");
		
			System.out.println("Slider is set to: "+slider.getAttribute("value"));
			Thread.sleep(2000);
			
			driver.quit();
	
	
	}


}
