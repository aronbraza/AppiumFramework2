package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	
	public FormPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement Country_DropDown;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Argentina']")
	public WebElement Argentina_Country;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/nameField")
	public WebElement Name_TextBox;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/radioFemale")
	public WebElement Female_RadioButton;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	public WebElement LetsShop_Button;
	
	public WebElement getNameTextbox()
	{
		System.out.println("Trying to find Name Textbox");
		return Name_TextBox;
	}
	
	public WebElement getCountryDropdown()
	{
		System.out.println("Trying to find Name Textbox");
		return Country_DropDown;
	}
	
}
