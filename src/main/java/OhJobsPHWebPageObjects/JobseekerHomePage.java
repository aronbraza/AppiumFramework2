package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JobseekerHomePage {
	
	public JobseekerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[class=\"nav navbar-nav navbar-right\"] li:nth-child(1)")
	private WebElement home_Button;
	
	@FindBy(css = "[class=\"nav navbar-nav navbar-right\"] li:nth-child(2)")
	private WebElement jobs_Button;
	
	@FindBy(css = "[class=\"nav navbar-nav navbar-right\"] li:nth-child(3)")
	private WebElement howItWorks_Button;
	
	@FindBy(css = "[class=\"nav navbar-nav navbar-right\"] li:nth-child(4)")
	private WebElement login_Button;
	
	@FindBy(css = "[class*='sign-up-btn']")
	private WebElement signUp_Button;
	
	@FindBy(className = "employers-btn  ")
	private WebElement employer_Button;
	
	@FindBy(className = "drop-d")
	private WebElement userIcon_Dropdown;
	
	@FindBy(css = "[class='dropdown-menu'] li:nth-child(1)")
	private WebElement userProfile_Menu;
	
	@FindBy(css = "[class='dropdown-menu'] li:nth-child(2)")
	private WebElement myApplications_Menu;
	
	@FindBy(css = "[class='dropdown-menu'] li:nth-child(3)")
	private WebElement savedJobs_Menu;
	
	@FindBy(css = "[class='dropdown-menu'] li:nth-child(4)")
	private WebElement logOut_Menu;
	
	
	public void clickHome(ExtentTest logger)
	{
		home_Button.click();
		logger.log(LogStatus.INFO, "<b>Home button</b> has been clicked.");
	}
	
	public void clickJobs(ExtentTest logger)
	{
		jobs_Button.click();
		logger.log(LogStatus.INFO, "<b>Jobs button</b> has been clicked.");
	}
	
	public void clickHowItWorks(ExtentTest logger)
	{
		howItWorks_Button.click();
		logger.log(LogStatus.INFO, "<b>How It Works button</b> has been clicked.");
	}
	
	public void clickLogin(ExtentTest logger)
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>Login button</b> has been clicked.");
	}
	
	public void clickSignUp(ExtentTest logger)
	{
		signUp_Button.click();
		logger.log(LogStatus.INFO, "<b>Sign Up button</b> has been clicked.");
	}
	
	public void clickEmployer(ExtentTest logger)
	{
		employer_Button.click();
		logger.log(LogStatus.INFO, "<b>Employer button</b> has been clicked.");

	}
	
	public void clickUserDropdown(ExtentTest logger)
	{
		userIcon_Dropdown.click();
		logger.log(LogStatus.INFO, "<b>User Icon Dropdown</b> has been clicked.");
	}
	
	public void clickUserProfile(ExtentTest logger)
	{
		userProfile_Menu.click();
		logger.log(LogStatus.INFO, "<b>USER PROFILE</b> has been clicked.");
	}
	
	public void clickMyApplications(ExtentTest logger)
	{
		myApplications_Menu.click();
		logger.log(LogStatus.INFO, "<b>MY APPLICATIONS</b> has been clicked.");
	}
	
	public void clickSavedJobs(ExtentTest logger)
	{
		savedJobs_Menu.click();
		logger.log(LogStatus.INFO, "<b>SAVED JOBS</b> has been clicked.");
	}
	
	public void clickLogout(ExtentTest logger)
	{
		logOut_Menu.click();
		logger.log(LogStatus.INFO, "<b>LOG OUT</b> has been clicked.");
	}
}
