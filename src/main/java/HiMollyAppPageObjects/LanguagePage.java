package HiMollyAppPageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LanguagePage {
	

	
	@AndroidFindBy (id = "com.wog.himolly:id/btn_en")
	public MobileElement EnglishLanguage_Button;
	
	public LanguagePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void ChooseEnglishLanguage()
	{
		EnglishLanguage_Button.click();
	}

}
