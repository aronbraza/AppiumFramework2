package OhJobsPHMobilePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class SignUpPage {

	
	public SignUpPage(AndroidDriver<WebElement> androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	@FindBy(id = "fname")
	private WebElement firstName_Textbox;
	
	@FindBy(id = "lname")
	private WebElement lastName_Textbox;
	
	@FindBy(id = "bdate")
	private WebElement birthdate_Textbox;
	
	@FindBy(id = "email")
	private WebElement email_Textbox;
	
	@FindBy(id = "uname")
	private WebElement userName_Textbox;
	
	@FindBy(id = "pass")
	private WebElement password_Textbox;
	
	@FindBy(id = "cpass")
	private WebElement confirmPassword_Textbox;
	
	@FindBy(className = "checkboxSelect")
	private WebElement iAgree_Checkbox;
	
	@FindBy(id = "sigupbtn")
	private WebElement registerNow_Button;
	
	public void setFirstName(ExtentTest logger, String firstName)
	{
		
		firstName_Textbox.sendKeys(firstName);
		logger.log(LogStatus.INFO, "<b>"+firstName+"</b> has been entered on the First Name field.");
	}
	
	public void setLastName(ExtentTest logger, String lastName)
	{
		
		lastName_Textbox.sendKeys(lastName);
		logger.log(LogStatus.INFO, "<b>"+lastName+"</b> has been entered on the Last Name field.");
	}
	
	public void setBirthdate(ExtentTest logger, String birthdate)
	{
		
		birthdate_Textbox.sendKeys(birthdate);
		logger.log(LogStatus.INFO, "<b>"+birthdate+"</b> has been entered on the Birthdate field.");
	}
	
	public void setEmailAddress(ExtentTest logger, String emailAddress)
	{
		
		email_Textbox.sendKeys(emailAddress);
		logger.log(LogStatus.INFO, "<b>"+emailAddress+"</b> has been entered on the Email Address field.");
	}
	
	public void setUsername(ExtentTest logger, String userName)
	{
		
		userName_Textbox.sendKeys(userName);
		logger.log(LogStatus.INFO, "<b>"+userName+"</b> has been entered on the Username field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void setConfirmPassword(ExtentTest logger, String confirmPassword)
	{
		
		confirmPassword_Textbox.sendKeys(confirmPassword);
		logger.log(LogStatus.INFO, "<b>"+confirmPassword+"</b> has been entered on the Confirm Password field.");
	}
	
	
	public void clickIAgree(ExtentTest logger) throws InterruptedException
	{
		iAgree_Checkbox.click();
		logger.log(LogStatus.INFO, "<b>I agree to the Privacy Policy and Term of Use checkbox </b> has been clicked.");
	}
	
	public void clickRegisterNow(ExtentTest logger)
	{
		registerNow_Button.click();
		logger.log(LogStatus.INFO, "<b>Register Now button</b> has been clicked.");
	}
}
