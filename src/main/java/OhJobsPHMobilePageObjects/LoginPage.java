package OhJobsPHMobilePageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
	
	public  LoginPage(AndroidDriver<WebElement> androidDriver) {
		PageFactory.initElements(androidDriver, this);
	}
	
	
	@FindBy(className =  "item-text")
	public WebElement ToastMessage;
	
	@FindBy(id = "luname")
	public WebElement username_Textbox;
	
	@FindBy(id = "lupass")
	public WebElement password_Textbox;
	
	@FindBy(xpath = "//*[@ng-click='onAccountLogin()']")
	public WebElement login_Button;
	
	
	public void setUsername(ExtentTest logger, String userName)
	{
		username_Textbox.clear();
		username_Textbox.sendKeys(userName);
		logger.log(LogStatus.INFO, "<b>"+userName+"</b> has been entered on the Username field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void clickLogin_Button(ExtentTest logger)
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>Login button</b> has been clicked.");
	}
	
	
	
	
	

	
	

}
