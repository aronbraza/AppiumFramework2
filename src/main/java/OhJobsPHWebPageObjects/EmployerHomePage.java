package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EmployerHomePage {
	
	public EmployerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Home//
	@FindBy(className = "drop-down")
	private WebElement dropdown;
		
	@FindBy(id = "logout")
	private WebElement logout;
		
	@FindBy(className = "company-name")
	private WebElement companyName_Text;
	
	@FindBy(css = "[href='index'] li")
	private WebElement dashboard_Menu;
	
	@FindBy(css = "[href='notifications'] li")
	private WebElement notification_Menu;
	
	@FindBy(css = "[href='inbox'] li")
	private WebElement inbox_Menu;

	@FindBy(css = "[href='job-posting'] li")
	private WebElement jobPosting_Menu;
	
	@FindBy(css = "[href='manage-applicants'] li")
	private WebElement manageApplicants_Menu;
	
	@FindBy(css = "[href='followers'] li")
	private WebElement followers_Menu;
	
	//Home//
	
	
	public String getCompanyName()
	{
		return companyName_Text.getText();
	}
	
	public void clickDropdown(ExtentTest logger)
	{
		dropdown.click();
		logger.log(LogStatus.INFO, "<b>Dropdown</b> has been clicked.");
	}
	
	public void clickLogout(ExtentTest logger)
	{
		logout.click();
		logger.log(LogStatus.INFO, "<b>Logout</b> has been clicked.");
	}
	
	public void clickDashboard(ExtentTest logger)
	{
		dashboard_Menu.click();
		logger.log(LogStatus.INFO, "<b>Dashboard</b> has been clicked.");
	}
	
	public void clickNotfications(ExtentTest logger)
	{
		notification_Menu.click();
		logger.log(LogStatus.INFO, "<b>Notifications</b> has been clicked.");
	}
	
	public void clickInbox(ExtentTest logger)
	{
		inbox_Menu.click();
		logger.log(LogStatus.INFO, "<b>Inbox</b> has been clicked.");
	}
	
	public void clickJobPosting(ExtentTest logger)
	{
		jobPosting_Menu.click();
		logger.log(LogStatus.INFO, "<b>Job Posting</b> has been clicked.");
	}
	
	public void clickManageApplicants(ExtentTest logger)
	{
		manageApplicants_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Applicants</b> has been clicked.");
	}
	
	public void clickFollowers(ExtentTest logger)
	{
		followers_Menu.click();
		logger.log(LogStatus.INFO, "<b>Followers</b> has been clicked.");
	}

}
