package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;

public class WebmasterHomePage extends base {
	
	public WebmasterHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Web master Home//
	
	@FindBy(css = "[class*='master-drop-down']")
	private WebElement dropdown;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	
	@FindBy(css = "[href='master-dashboard']")
	private WebElement dashBoard_Menu;
	
	@FindBy(css = "[href='master-notification']")
	private WebElement notifications_Menu;
	
	@FindBy(css = "[href='master-manage-employees']")
	private WebElement manageEmployers_Menu;
	
	@FindBy(css = "[href='master-manage-job-posts']")
	private WebElement manageJobPosts_Menu;
	
	@FindBy(css = "[href='master-manage-jobseeker']")
	private WebElement manageJobseeker_Menu;
	
	@FindBy(css = "[href='master-manage-blogs']")
	private WebElement manageBlogs_Menu;
	
	@FindBy(css = "[href='master-subscribers']")
	private WebElement subscribers_Menu;
	

	
	public void clickDropdown(ExtentTest logger)
	{
		webDriverWait().until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		logger.log(LogStatus.INFO, "<b>Dropdown</b> has been clicked.");
	}
	
	public void clickLogout(ExtentTest logger)
	{
		logout.click();
		logger.log(LogStatus.INFO, "<b>Logout</b> has been clicked.");
	}
	
	
	//Web master Home//
	
	public void clickDashboard(ExtentTest logger)
	{
		dashBoard_Menu.click();
		logger.log(LogStatus.INFO, "<b>Dashboard</b> has been clicked.");
	}
	
	public void clickNotifications(ExtentTest logger)
	{
		notifications_Menu.click();
		logger.log(LogStatus.INFO, "<b>Notifications</b> has been clicked.");
	}
	
	public void clickManageEmployers(ExtentTest logger)
	{
		manageEmployers_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Employers</b> has been clicked.");
	}
	
	public void clickManageJobPosts(ExtentTest logger)
	{
		manageJobPosts_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Job Posts</b> has been clicked.");
	}
	
	public void clickManageJobseekers(ExtentTest logger)
	{
		manageJobseeker_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Jobseekers</b> has been clicked.");
	}
	
	public void clickManageBlogs(ExtentTest logger)
	{
		manageBlogs_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Blogs</b> has been clicked.");
	}
	
	public void clickSubscribers(ExtentTest logger)
	{
		subscribers_Menu.click();
		logger.log(LogStatus.INFO, "<b>Subscribers</b> has been clicked.");
	}
	
}
