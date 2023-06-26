package com.framework.pageobjectmodel.android;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidGestures {

	AndroidDriver driver;
	
	public AndroidGestures(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void longPressAction(WebElement element)
	{
		  
		// Java
		   ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		       "elementId", ((RemoteWebElement) element).getId(),
		       "duration",2000
		   ));
	}
	
	
	public void swiping(WebElement element,String string)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",element,
			    "direction", "left",
			    "percent", 0.75
			));
	}
	
	
	public void scrollTillEnd()
	{
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", 
			ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200,
		                    "direction", "down",
		                    "percent", 3.0));
		}while(canScrollMore);
	}
	
	public void scrollText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
	public void dragAndDrop(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement)element).getId(),
			    "endX", 836,
			    "endY", 729
			));
	}
}
