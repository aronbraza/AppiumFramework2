package OhJobsPHMobilePageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.security.auth.kerberos.KerberosKey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;import io.appium.java_client.functions.ExpectedCondition;
import resources.base;

public class WebSamplePage extends base {
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public WebSamplePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Job List Page//
	@FindBy(css = "[class*=\"jobs-list-containers\"]")
	private List<WebElement> job_List;
	
	@FindBy(className = "job-title-link")
	private List<WebElement> jobTitle_List;
	
	@FindBy(className = "[class*=\"nextbutton\"]")
	private WebElement next_Button;
	
	@FindBy(className = "[class*=\"prevbutton\"]")
	private WebElement previous_Button;
	
	@FindBy(css  = "tr")
	private List<WebElement> location_Text;
	
	@FindBy(className = "main-desc-content")
	private List<WebElement> mainContent_Text;
	
	//Login//
	@FindBy(id = "email")
	private WebElement emailAddress_Textbox;
	
	@FindBy(id = "password")
	private WebElement password_Textbox;
	
	@FindBy(id = "login")
	private WebElement login_Button;
	//Login//
	
	//Home//
	
	@FindBy(className = "drop-down")
	private WebElement dropdown;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	@FindBy(className = "company-name")
	private WebElement companyName_Text;
	
	@FindBy(xpath ="//a[@href=\"job-posting\"] //div[text()=\"Job Posting\"]")
	private WebElement jobPosting_Menu;
	//Home//
	
	//Job Posting//
	
	@FindBy(id = "add_job")
	private WebElement addJob_Button;
	//Job Posting//
	
	//Add Job//
	
	@FindBy(xpath = "//*[text()[contains(.,'Submitting')]]")
	private WebElement submittingMessage_Text;
	
	@FindBy(xpath = "//*[text()[contains(.,'Please wait for Oh! Jobs approval.')]]")
	private WebElement waitForApprovalMessage_Text;
	
	@FindBy(id = "j-name")
	private WebElement jobTitle_Textbox;
	
	@FindBy(id = "country")
	private WebElement country_Dropdown;
	
	@FindBy(id = "j-vacancy")
	private WebElement numberOfVancies_Textbox;
	
	@FindBy(id = "edit_region_info")
	private WebElement region_Dropdown;
	
	@FindBy(id = "edit_province_info")
	private WebElement province_Dropdown;
	
	@FindBy(id = "edit_city_info")
	private WebElement city_Dropdown;
	
	@FindBy(id = "address")
	private WebElement jobLocation_Textbox;
	
	@FindBy(id = "j-salary")
	private WebElement salary_Textbox;
	
	@FindBy(css="iframe[class*='cke_wysiwyg_frame']")
	private WebElement jobDetails_Iframe;
	
	@FindBy(tagName = "body")
	private WebElement jobDetails_Body;
	
	@FindBy(id = "y-experience")
	private WebElement yearsOfExperience_Dropdown;
	
	@FindBy(id = "e-level")
	private WebElement educationalLevel_Dropdown;
	
	@FindBy(className = "employer-job-type")
	private WebElement industry_Dropdown;
	
	@FindBy(className = "select2-search__field")
	private WebElement industry_Textbox;
	
	@FindBy(css = "[class*=\"choose_avatar\"]")
	private List<WebElement> industry_Avatar;
	
	@FindBy(css = "[class=\"bootstrap-tagsinput\"] [type=\"text\"]")
	private List<WebElement> Tags;
	
	@FindBy(id = "[class=\"employer-required-skills\"] [type=\"text\"] ")
	private WebElement requiredSkills_Textbox;
	
	@FindBy(id = "j-tags")
	private WebElement jobTags_Textbox;
	
	@FindBy(className = "job-duration-option")
	private List<WebElement> jobDuration_Radiobutton;
	
	@FindBy(id = "j-open")
	private WebElement openingDate_Field;
	
	@FindBy(id = "j-close")
	private WebElement closingDate_Field;
	
	@FindBy(id = "save-job")
	private WebElement submitJob_Button;
	
	@FindBy(className = "ZebraDialog_Button_1")
	private WebElement yes_Button;
	
	@FindBy(className = "ZebraDialog_Button_0")
	private WebElement no_Button;
	//Add Job//
	
	//Webmaster Home//
	@FindBy(xpath = "//a[@href=\"master-manage-job-posts\"] //div[text()=\"Manage Job Posts\"]")
	private WebElement manageJobPosts_Menu;
	//Webmaster Home//
	
	//Manage Job Posts//
	
	//@FindBy(xpath = "//span[contains(@id, 'notie-alert-text') and contains(text(), 'Sending email')]")
	@FindBy(xpath = "//*[text()[contains(.,'Sending email')]]")
	public WebElement sendingEmailMessage_Text;
	
	@FindBy(xpath = "//*[text()[contains(.,'You have successfully approved the job.')]]")
	//@FindBy(xpath = "//span[contains(@id, 'notie-alert-text') and contains(text(), 'You have successfully approved the job.')]")
	public WebElement approvedJobMessage_Text;
	
	@FindBy(css =  "#notie-alert-outer #notie-alert-inner #notie-alert-content >span")
	public WebElement notificationAlert_Text;
	
	@FindBy(className = "job-post-title")
	private List<WebElement> jobTitle_Text;
	
	@FindBy(css = "[class=\"master-approve-job-post master-approve-job-post-btn\"]")
	private List<WebElement> approve_Button;
	
	//Manage Job Posts//
	
	
	//Jobseeker//
	
	
	public void getLocation(String jobLocation, String educationalLevel, String yearsOfExperience, String salary, String jobTtype)
	{
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobLocation, educationalLevel, yearsOfExperience, salary, jobTtype));
		
		for(int i=0; i<location_Text.size(); i++)
		{
			for(int j=0; j<data.size(); j++)
			{
				if(location_Text.get(i).getText().contains(data.get(j).toString()))
				{
					System.out.println(location_Text.get(i).getText());
					break;
				}
			}
		}
			
		
	}
	
	public void getMainContent(String jobAddress, String jobDetails, String requiredSkills )
	{
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobAddress, jobDetails, requiredSkills));
		
		for(int i=0; i<mainContent_Text.size(); i++)
		{
			for(int j= 0; j<data.size(); j++)
			{
				if(mainContent_Text.get(i).getText().equalsIgnoreCase(data.get(j).toString()))
				{					
					System.out.println(mainContent_Text.get(i).getText());
					break;
				}
			}
		}
	}
	
	public void findApprovedJob(String jobName) throws InterruptedException
	{
		for(int i=0; i<job_List.size(); i++)
		{
			if(job_List.get(i).getText().contains(jobName))
			{
				//System.out.println(job_List.get(i).getText());
				jobTitle_List.get(i).click();
				break;
			}
			
		}
	}
	
	
	
	//Employer//
	
	public String getCompanyName()
	{
		return companyName_Text.getText();
	}
	
	public void setEmailAddress(com.relevantcodes.extentreports.ExtentTest logger, String email)
	{
		emailAddress_Textbox.clear();
		emailAddress_Textbox.sendKeys(email);
		logger.log(LogStatus.INFO, "<b>"+email+"</b> has been entered on the Email Address field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void clickLogin(ExtentTest logger) 
	{
		login_Button.click();
		logger.log(LogStatus.INFO, "<b>Login button</b> has been clicked.");
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
	
	public void clickJobPosting(ExtentTest logger)
	{
		jobPosting_Menu.click();
		logger.log(LogStatus.INFO, "<b>Job Posting</b> has been clicked.");
	}
	
	public void clickAddJob(ExtentTest logger)
	{
		addJob_Button.click();
		logger.log(LogStatus.INFO, "<b>Add Job button</b> has been clicked.");
	}
	
	public void setJobTitle(ExtentTest logger, String jobTitle)
	{
		jobTitle_Textbox.clear();
		jobTitle_Textbox.sendKeys(jobTitle);
		logger.log(LogStatus.INFO, "<b>"+jobTitle+"</b> has been entered on the Job Title field.");
	}
	
	public void setCountry(ExtentTest logger, String country)
	{
		Select select = new Select(country_Dropdown);
		select.selectByVisibleText(country);
		logger.log(LogStatus.INFO, "<b>"+country+"</b> has been selected on the Country dropdown field.");
	}
	
	public void setNumberOfVacancies(ExtentTest logger, String numberOfVancies)
	{
		numberOfVancies_Textbox.clear();
		numberOfVancies_Textbox.sendKeys(numberOfVancies);
		logger.log(LogStatus.INFO, "<b>"+numberOfVancies+"</b> has been entered on the Number of Vacancies field.");
	}
	
	public void setRegion(ExtentTest logger, String region)
	{
		Select select = new Select(region_Dropdown);
		select.selectByVisibleText(region);
		logger.log(LogStatus.INFO, "<b>"+region+"</b> has been selected on the Region dropdown.");
	}
	
	public void setProvince(ExtentTest logger, String province)
	{
		Select select = new Select(province_Dropdown);
		select.selectByVisibleText(province);
		logger.log(LogStatus.INFO, "<b>"+province+"</b> has been selected on the Province dropdown.");
	}
	
	public void setCity(ExtentTest logger, String city)
	{
		Select select = new Select(city_Dropdown);
		select.selectByVisibleText(city);
		logger.log(LogStatus.INFO, "<b>"+city+"</b> has been selected on the City dropdown.");
	}
	
	public void setJobLocation(ExtentTest logger, String jobLocation)
	{
		jobLocation_Textbox.clear();
		jobLocation_Textbox.sendKeys(jobLocation);
		logger.log(LogStatus.INFO, "<b>"+jobLocation+"</b> has been entered on the Job Location field.");
	}
	
	public void setSalary(ExtentTest logger, String salary)
	{
		salary_Textbox.clear();
		salary_Textbox.sendKeys(salary);
		logger.log(LogStatus.INFO, "<b>"+salary+"</b> has been entered on the Salary field.");
	}
	
	public void setJobDetails(ExtentTest logger, String jobDetails)
	{
		driver.switchTo().frame(jobDetails_Iframe);
		jobDetails_Body.clear();
		jobDetails_Body.sendKeys(jobDetails);
		logger.log(LogStatus.INFO, "<b>"+jobDetails+"</b> has been entered on the Job Details field.");
		driver.switchTo().defaultContent();
	}
	
	public void setYearsOfExperience(ExtentTest logger, String yearsOfExperience)
	{
		Select select = new Select(yearsOfExperience_Dropdown);
		select.selectByVisibleText(yearsOfExperience);
		logger.log(LogStatus.INFO, "<b>"+yearsOfExperience+"</b> has been selected on the Years of Experience dropdown field.");
	}
	
	public void setEducationalLevel(ExtentTest logger, String educationalLevel)
	{
		Select select = new Select(educationalLevel_Dropdown);
		select.selectByVisibleText(educationalLevel);
		logger.log(LogStatus.INFO, "<b>"+educationalLevel+"</b> has been selected on the Educational Level dropdown field.");
	}
	
	public void setIndustry(ExtentTest logger, String industry)
	{
		industry_Dropdown.click();
		industry_Textbox.sendKeys(industry+Keys.ENTER);
		logger.log(LogStatus.INFO, "<b>"+industry+"</b> has been selected on the Industry dropdown field.");
	}
	
	public void clickAvatar(ExtentTest logger)
	{
		
	}
	
	public void setRequiredSkills(ExtentTest logger, String skills)
	{
		Tags.get(0).click();
		Tags.get(0).sendKeys(skills+Keys.ENTER);
		logger.log(LogStatus.INFO, "<b>"+skills+"</b> has been entered on the Required Skills field.");
	}
	
	public void setJobTags(ExtentTest logger, String jobTags)
	{
		Tags.get(1).click();
		Tags.get(1).sendKeys(jobTags+Keys.ENTER);
		logger.log(LogStatus.INFO, "<b>"+jobTags+"</b> has been entered on the Job Tags field.");
	}
	
	public void setOpeningDate(ExtentTest logger, String openingDate)
	{
		openingDate_Field.clear();
		openingDate_Field.sendKeys(openingDate);
		logger.log(LogStatus.INFO, "<b>"+openingDate+"</b> has been selected on the Opening Date field.");
	}
	
	public void setClosingDate(ExtentTest logger, String closingDate)
	{
		closingDate_Field.clear();
		closingDate_Field.sendKeys(closingDate);
		logger.log(LogStatus.INFO, "<b>"+closingDate+"</b> has been selected on the Closing Date field.");
	}
	
	public void clickSubmitJob(ExtentTest logger)
	{
		submitJob_Button.click();
		logger.log(LogStatus.INFO, "<b>Submit Job button</b> has been clicked.");
	}
	
	public void clickYes(ExtentTest logger)
	{
		yes_Button.click();
		logger.log(LogStatus.INFO, "<b>Yes button</b> has been clicked.");
	}
	
	public void clickNo(ExtentTest logger)
	{
		no_Button.click();
		logger.log(LogStatus.INFO, "<b>No button</b> has been clicked.");
	}
	
	
	//WebMaster//
	
	public void clickManageJobPosts(ExtentTest logger)
	{
		manageJobPosts_Menu.click();
		logger.log(LogStatus.INFO, "<b>Manage Job Posts</b> has been clicked.");
	}
	
	public void approveJobPost(ExtentTest logger, String jobTitle)
	{
		for(int i=0; i<jobTitle_Text.size(); i++)
		{
			if(jobTitle_Text.get(i).getText().equalsIgnoreCase(jobTitle))
			{
				approve_Button.get(i).click();
				yes_Button.click();
				logger.log(LogStatus.INFO, "<b>"+jobTitle+"</b> has been approved by Webmaster.");
			}
		}
	}
	
	
	
	//Verification//
	public boolean verifySuccessMessageOnAddJobs(String message1, String message2)
	{
		boolean a = false;
		
		String firstMessage = submittingMessage_Text.getText();
		String secondMessage = waitForApprovalMessage_Text.getText();
		
		if(firstMessage.equalsIgnoreCase(message1) && secondMessage.equalsIgnoreCase(message2))
		{
			a = true;
		}
		return a;
	}
	
	public void getMessage()
	{
		//String a = driver.findElement(By.xpath("//div[contains(@id, 'notie-alert-content') and contains(text(), 'Sending email')]")).getText();
		//String b = driver.findElement(By.xpath("//div[contains(@id, 'notie-alert-content') and contains(text(), 'You have successfully approved the job.')]")).getText();
		
		//System.out.println(wait.until(ExpectedConditions.visibilityOf(notificationAlert_Text)).getText());
		System.out.println(wait.until(ExpectedConditions.visibilityOf(sendingEmailMessage_Text)).getText());
		System.out.println(wait.until(ExpectedConditions.visibilityOf(approvedJobMessage_Text)).getText());
		//System.out.println(driver.findElement(By.xpath("//span[contains(@id, 'notie-alert-text') and contains(text(), 'Sending email')]")).getText());
		//System.out.println(driver.findElement(By.xpath("//span[contains(@id, 'notie-alert-text') and contains(text(), 'You have successfully approved the job.')]")).getText());
	}
	
	
	public boolean verifyNotificationOnApprovedJob(String message1)
	{
		boolean a = false;
		List<String>successMessages  = Arrays.asList(message1.split(","));
		
		String firstMessage = sendingEmailMessage_Text.getText();
		String secondMessage = approvedJobMessage_Text.getText();
		
		for(int i=0; i<successMessages.size(); i++)
		{
			if(firstMessage.equalsIgnoreCase(successMessages.get(0).toString()) && secondMessage.equalsIgnoreCase(successMessages.get(1).toString()))
			{
				a = true;
				System.out.println(successMessages.get(i).toString());
			}
		}
		
		
		return a;		
	}


}
