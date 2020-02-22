package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;



public class JobseekerLoginPage extends base {
	
	public JobseekerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login_username")
	private WebElement userNameOrEmail_Textbox;
	
	@FindBy(id = "login_password")
	private WebElement password_Textbox;
	
	@FindBy(id = "basic_login")
	private WebElement login_Button;
	
	@FindBy(className = "fb-login")
	private WebElement fbLogin_Button;
	
	@FindBy(className = "gplus-login")
	private WebElement gmailLogin_Button;
	
	@FindBy(linkText = "Are you an Employer? Click here to login.")
	private WebElement employerLogin_Linktext;
	
	@FindBy(className = "forgot-password")
	private WebElement forgetPassword_Linktext;
	
	@FindBy(className = "close")
	private WebElement close_Button;
	
	
	public void setUsernameOrEmail(ExtentTest logger, String userNameOrEmail)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(userNameOrEmail_Textbox));
		userNameOrEmail_Textbox.clear();
		userNameOrEmail_Textbox.sendKeys(userNameOrEmail);
		logger.log(LogStatus.INFO, "<b>"+userNameOrEmail+"</b> has been entered on the Username or Email Address field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(password_Textbox));
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void clickLogin(ExtentTest logger)
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>Login button</b> has been clicked.");
	}
	
	public void clickFBLogin(ExtentTest logger)
	{
		fbLogin_Button.click();
		logger.log(LogStatus.INFO, "<b>Facebook Login button</b> has been clicked.");
	}
	
	public void clickGmailLogin(ExtentTest logger)
	{
		gmailLogin_Button.click();
		logger.log(LogStatus.INFO, "<b>Gmail Login button</b> has been clicked.");
	}
	
	public void clickEmployerLogin(ExtentTest logger)
	{
		employerLogin_Linktext.click();
		logger.log(LogStatus.INFO, "<b>Are you an Emmployer? Click here to login link text</b> has been clicked.");
	}
	
	public void clickForgotPassword(ExtentTest logger)
	{
		forgetPassword_Linktext.click();
		logger.log(LogStatus.INFO, "<b>Forgot Password link text</b> has been clicked.");
	}
	
	public void clickClose(ExtentTest logger)
	{
		close_Button.click();
		logger.log(LogStatus.INFO, "<b>Close button</b> has been clicked.");
	}


}
