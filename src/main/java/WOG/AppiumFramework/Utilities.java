package WOG.AppiumFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	
	AndroidDriver<AndroidElement>driver;
	
	public Utilities(AndroidDriver<AndroidElement>driver)
	{
		this.driver = driver;
		
	}
	
	public void ScrollToText(String text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));").click();
	}
	
	public void ScrollToSelectCategory()
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('Select Category'));");
	}
	
	

}
