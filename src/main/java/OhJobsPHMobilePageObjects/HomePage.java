package OhJobsPHMobilePageObjects;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Factory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.base;

public class HomePage extends base {
	
	public HomePage(AndroidDriver<WebElement> androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	JavascriptExecutor js =  (JavascriptExecutor)androidDriver;
	
	@FindBy(css = "[class*='btn-find-job']")
	private WebElement findAJob_Button;
	
	@FindBy(xpath = "//*[@data-popup='.popup-login']")
	public WebElement login_Button;
	
	@FindBy(xpath = "//*[@data-popup='.popup-signup']")
	public WebElement join_Button;
	
	
	@FindBy(className = "left")
	public WebElement menu_Icon;
	
	@FindBy(id = "index")
	private WebElement home_Menu;
	
	@FindBy(id = "PageJobList")
	public WebElement jobs_Menu;
	
	@FindBy(id = "PageEmployerList")
	private WebElement employers_Menu;
	
	@FindBy(id = "PageHow")
	private WebElement howItWork_Menu;
	
	@FindBy(id = "PageSettings")
	private WebElement settings_Menu;
	
	@FindBy(id = "PageInbox")
	private WebElement inbox_Menu;
	
	@FindBy(id = "PageNotificationList")
	private WebElement notification_Menu;
	
	@FindBy(id = "PageMyJobsApplied")
	private WebElement myApplications_Menu;
	
	@FindBy(id = "PageMyJobsSave")
	private WebElement savedJobs_Menu;
	
	@FindBy(id = "ChangePassword")
	private WebElement changePassword_Menu;
	
	@FindBy(css =  "[class='item-link profile-sub']")
	private WebElement shareOhJobsPH_Menu;
	
	@FindBy(xpath  = "//*[@ng-click='logout()']")
	private WebElement logout_Menu;
	
	@FindBy(xpath = "//span[@class='modal-button' and contains(text(),'Okay')]")
	private WebElement okay_Button;
	
	WebDriverWait wait = new WebDriverWait(androidDriver, 30);
	
	public void clickFindAJob(ExtentTest logger)
	{
		findAJob_Button.click();
		logger.log(LogStatus.INFO, "<b>FIND A JOB button</b> has been clicked.");
	}

	public void clickLogin(ExtentTest logger)
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>LOGIN button</b> on the home page has been clicked.");
		
	}
	
	public void clickJoin(ExtentTest logger)
	{
		join_Button.click();
		logger.log(LogStatus.INFO, "<b>JOIN button</b> has been clicked.");
	}
	
	public void clickMenu(ExtentTest logger)
	{
		menu_Icon.click();
		logger.log(LogStatus.INFO, "<b>Menu icon</b> has been clicked.");
	}
	
	public void clickHome(ExtentTest logger)
	{
		home_Menu.click();
		logger.log(LogStatus.INFO, "<b>Home menu</b> has been clicked.");
	}
	
	public void clickJobs(ExtentTest logger)
	{
		jobs_Menu.click();
		logger.log(LogStatus.INFO, "<b>Jobs menu</b> has been clicked");
	}
	
	public void clickEmployers(ExtentTest logger)
	{
		employers_Menu.click();
		logger.log(LogStatus.INFO, "<b>Employers menu</b> has been clicked");
	}
	
	
	public void clickLogout(ExtentTest logger)
	{
		logout_Menu.click();
		logger.log(LogStatus.INFO, "<b>Logout menu</b> has been clicked.");
	}
	
	public void clickOkay(ExtentTest logger)
	{
		okay_Button.click();
		logger.log(LogStatus.INFO, "<b>Okay button</b> has been clicked.");
	}
	
}
