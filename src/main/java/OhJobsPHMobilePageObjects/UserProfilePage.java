package OhJobsPHMobilePageObjects;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import resources.base;

public class UserProfilePage extends base {
	
	public UserProfilePage(AndroidDriver<WebElement> androidDriver)
	{
		//PageFactory.initElements(androidDriver, this);
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);


	}
	JavascriptExecutor executor = (JavascriptExecutor)androidDriver;
	
	//INTRODUCTION//
	@FindBy(css = "[ng-click='edit('about', null)']")
	private WebElement editIntroduction_Icon;
	
	@FindBy(css = "[ng-model='about_me']")
	private WebElement introduction_Textbox;
	
	@FindBy(css = "[ng-model='save_aboutme()']")
	private WebElement saveIntro_Button;
	
	//PERSONAL INFORMATION

	@FindBy(xpath =  "//div[@class='n-edit']")
	private WebElement editPersonalInformation_Icon;
	
	@FindBy(css = "[ng-model='form.fname']")
	private WebElement firstName_Textbox;
	
	@FindBy(css = "[ng-model='form.lname']")
	private WebElement lastName_Textbox;
	
	@FindBy(css  = "[ng-model='form.birthday']")
	private WebElement birthdate_Textbox;
	
	//*[@class='picker-items-col-left picker-items-col-absolute'] //*class[class='picker-item']
	//@FindBy(xpath = "[class*='picker-items-col-left picker-items-col-absolute'] [class='picker-item']")
	@FindBy(xpath = "//*[@class='picker-items-col-left picker-items-col-absolute'] //*[@class='picker-item']")
	private List<WebElement> monthPicker;
	
	//@FindBy(css = "[class*='picker-items-col-left picker-items-col-absolute'] [class*='picker-selected']")
	@FindBy(xpath = "//*[@class='picker-items-col-left picker-items-col-absolute'] //*[@class='picker-item picker-selected']")
	private WebElement monthPickerSelected;
	
	@FindBy(css = "[class*='picker-items-col-center']")
	private List<WebElement> dayPicker;
	
	@FindBy(css = "[class*='picker-items-col-right']")
	private List<WebElement> yearPicker;
	
	@FindBy(id = "picker-country")
	private WebElement country_Textbox;
	
	@FindBy(id = "location")
	private WebElement completeAddress_Textbox;
	
	@FindBy(id = "picker-experience_level")
	private WebElement jobExperienceLevel_Textbox;
	
	@FindBy(css = "[id*='hasLicense']")
	private WebElement hasLicense_Radiobutton;
	
	@FindBy(id = "phone")
	private WebElement phoneNumber_Textbox;
	
	@FindBy(css = "[ng-hide='isCompleteProfile']")
	private WebElement update_Button;
	
	public void clickEditPersonalInformationIcon()
	{
		appiumWait().until(ExpectedConditions.elementToBeClickable(editPersonalInformation_Icon));
		editPersonalInformation_Icon.click();
		
	}
	
	public void setFirstName(ExtentTest logger, String firstName)
	{
		//appiumWait().until(ExpectedConditions.visibilityOf(firstName_Textbox));
		firstName_Textbox.clear();
		firstName_Textbox.sendKeys(firstName);
		logger.log(LogStatus.INFO, "<b>"+firstName+"</b> has been entered on the First Name field.");
	}
	
	public void setBirthdate(ExtentTest logger) throws IOException, InterruptedException
	{
		birthdate_Textbox.click();
		for(int i=0; i<monthPicker.size(); i++)
		{
			if(monthPicker.get(i).getText().equalsIgnoreCase("November"))
			{
				
		
				JavascriptExecutor je = (JavascriptExecutor) androidDriver;
				je.executeScript("arguments[0].scrollIntoView(true);",monthPicker.get(i));
				je.executeScript("window.scrollBy(0,1000)");
				break;
			}
			
		}
		
		
		logger.log(LogStatus.INFO, " has been entered on the Birthdate field.");
	}
	
}
