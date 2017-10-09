package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class DatePicker {
	
	@Test(groups = {"Regression Appium"})
	public void datemethod() throws MalformedURLException, InterruptedException 
		{
			
			IOSDriver driver;
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName","Appium");
			capabilities.setCapability("platformName","iOS");	
			capabilities.setCapability("platformVersion","11.0");
			capabilities.setCapability("deviceName","Gautham iPhone");
			capabilities.setCapability("app","Users/gauthamanprakasam/Library/Developer/Xcode/DerivedData/UIKitCatalog-acdpwptlisjkkddfujxozpmvjist/Build/Products/Debug-iphoneos/UIKitCatalog.app");
			capabilities.setCapability("udid", "6b4e2394fd5c534c240ffe2b488cf76e0ea9bf5d");
			capabilities.setCapability("bundleId","com.learning.apple-samplecode.UIKitCatalog");
	
			URL url;
			url= new URL("http://127.0.0.1:4723/wd/hub");
	
			System.out.println("Execution starting to launch Date Picker");
	
			driver = new IOSDriver(url,capabilities);
	
			WebElement UICatalog = (WebElement) driver.findElements(By.className("UIAButton")).get(0);
			
			UICatalog.click();
			driver.findElement(By.name("Date Picker")).click();
			System.out.println("Clicked Date Picker View");
			
			WebElement datePickerday= (WebElement) driver.findElements(By.className("XCUIElementTypePickerWheel")).get(0);
			WebElement datePickerHour= (WebElement) driver.findElements(By.className("XCUIElementTypePickerWheel")).get(1);
			WebElement datePickerMin= (WebElement) driver.findElements(By.className("XCUIElementTypePickerWheel")).get(2);
			WebElement datePickerAmPm = (WebElement) driver.findElements(By.className("XCUIElementTypePickerWheel")).get(3);
			
			System.out.println("The Days is: "+datePickerday.getAttribute("value"));
			System.out.println("The Hour is: "+datePickerHour.getAttribute("value"));
			System.out.println("The Minutes is: "+datePickerMin.getAttribute("value"));
			System.out.println("The PM/AM is: "+datePickerAmPm.getAttribute("value"));
			
			datePickerday.sendKeys("Nov 10");
			datePickerHour.sendKeys("9");
			datePickerMin.sendKeys("30");
			datePickerAmPm.sendKeys("PM");
			
			System.out.println("The Days is changed to : "+datePickerday.getAttribute("value"));
			System.out.println("The Hour is changed to : "+datePickerHour.getAttribute("value"));
			System.out.println("The Minutes is changed to : "+datePickerMin.getAttribute("value"));
			System.out.println("The PM/AM is changed to : "+datePickerAmPm.getAttribute("value"));

			Thread.sleep(2000);
			
			driver.quit();
	}


}
