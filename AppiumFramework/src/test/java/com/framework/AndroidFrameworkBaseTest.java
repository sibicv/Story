package com.framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidFrameworkBaseTest {

	public AndroidDriver driver;
	
	@BeforeClass
	public void appiumConfiguration() throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel");
		
		options.setApp("//Users//abdulrahuman//eclipse-workspace//AppiumFramework//src//test//java//resource//General-Store.apk");
		
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
}
