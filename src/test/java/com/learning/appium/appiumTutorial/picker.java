package com.learning.appium.appiumTutorial;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class picker {

	@Test(groups = {"Regression Appium"})
	public void pickerLaunch() throws MalformedURLException, InterruptedException 
		{
			
			IOSDriver driver;
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName","Appium");
			capabilities.setCapability("platformName","iOS");	
			capabilities.setCapability("platformVersion","11.0");
			capabilities.setCapability("deviceName","Gautham iPhone");

			capabilities.setCapability("udid", "6b4e2394fd5c534c240ffe2b488cf76e0ea9bf5d");
			//capabilities.setCapability("app","Users/gauthamanprakasam/Library/Developer/Xcode/DerivedData/UIKitCatalog-acdpwptlisjkkddfujxozpmvjist/Build/Products/Debug-iphoneos/UIKitCatalog.app");
			capabilities.setCapability("bundleId","com.learning.apple-samplecode.UIKitCatalog");
			//capabilities.setCapability("updatedWDABundleId","io.appium.WebDriverAgentRunner");
	
	
			URL url;
			url= new URL("http://127.0.0.1:4723/wd/hub");
	
			System.out.println("Execution starting to launch Pickers");
	
			driver = new IOSDriver(url,capabilities);
	
			Object UICatalog = driver.findElements(By.className("UIAButton")).get(0);
			
			((WebElement) UICatalog).click();
			driver.findElement(By.name("Picker View")).click();
			System.out.println("Clicked Picker View");
			
			Object picker1 = driver.findElements(By.className("XCUIElementTypePickerWheel")).get(0);
			
			((WebElement) picker1).sendKeys("100");
		
			System.out.println("Slider is set to: "+((WebElement) picker1).getAttribute("value"));
			Thread.sleep(2000);
			
			driver.quit();
	
	
	}


}
