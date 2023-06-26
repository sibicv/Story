package com.framework.pageobjectmodel.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePagePageObjectModel  extends AndroidGestures{

	AndroidDriver driver;
	//first creating constructor
	public HomePagePageObjectModel(AndroidDriver driver)
	{
		//to tell the driver from where it is coming
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver) , this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement female;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement male;
	
	@AndroidFindBy(id="android:id/text1")
	private WebElement country;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement button;

	public void setName(String name)
	{
		nameField.sendKeys(name);
		driver.hideKeyboard();
	}
	
	public void chooseGender(String gender)
	{
		if(gender.contains("female"))
		{
			female.click();
		}else {
			male.click();
		}	
	}
	
	public void setCountry(String countryName)
	{
	    country.click();	
	    scrollText("India");
	    driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
	}
	
	public void clickingShopButton()
	{
		button.click();
	}
	
	
	
	
	
}
