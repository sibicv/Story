package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PhoneDialer {

	
	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");		
		desiredCapabilities.setCapability("appPackage","com.google.android.dialer");
		desiredCapabilities.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
	
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "//Users//abdulrahuman//Downloads//National_General_0.1.87.apk");
	    URL url = new URL("http://localhost:4723/wd/hub");
	    
	    AndroidDriver driver = new AndroidDriver(url,desiredCapabilities);
	    	
	}
}
