package com.framework;

import org.testng.annotations.Test;

import com.framework.pageobjectmodel.android.HomePagePageObjectModel;

public class GenaralHomePage extends AndroidFrameworkBaseTest{

	
	@Test
	public void homepageFormFilling()
	{
		HomePagePageObjectModel homePagePageObjectModel = new HomePagePageObjectModel(driver);
		homePagePageObjectModel.setName("Amma");
		homePagePageObjectModel.chooseGender("female");
		homePagePageObjectModel.setCountry("India");
		homePagePageObjectModel.clickingShopButton();
		
	}
}
