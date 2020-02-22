package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;

public class EmployerJobPostingPage extends base {
	
	public EmployerJobPostingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
		//Job Posting//
	
		@FindBy(id = "searched_job")
		private WebElement searchJob_Textbox;
		
		@FindBy(id = "search_job")
		private WebElement search_Button;
		
		@FindBy(id = "job-advance-filtering-btn")
		private WebElement advancedFilter_Button;
		
		
	
		@FindBy(id = "add_job")
		private WebElement addJob_Button;
		
		@FindBy(css = "[class*=\"employer-edit-job\"]")
		private List<WebElement> editJob_Button;
		
		@FindBy(css = "[class*=\"employer-delete-job\"]")
		private List<WebElement> deleteJob_Button;
		
		@FindBy(css = "[class*=\"employer-copy-job\"]")
		private List<WebElement> copyJob_Button;
		
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
		
		@FindBy(id = "edit-job")
		private WebElement updateJob_Button;
		
		@FindBy(className = "ZebraDialog_Button_1")
		private WebElement yes_Button;
		
		@FindBy(className = "ZebraDialog_Button_0")
		private WebElement no_Button;
		//Add Job//
	
		
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
		
		public void clickUpdateJob(ExtentTest logger)
		{
			updateJob_Button.click();
			logger.log(LogStatus.INFO, "<b>Update Job button</b> has been clicked.");
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
		
		
		//Verification//
		public boolean verifySuccessMessageOnAddJobs(String message1)
		{
			String A = submittingMessage_Text.getText();
			String B = waitForApprovalMessage_Text.getText();
			List<String> getMessage = Arrays.asList(message1.split(","));
			
			boolean a = false;
			for(int i=0; i<getMessage.size(); i++)
			{

				if(A.equalsIgnoreCase(getMessage.get(0).toString()) && B.equalsIgnoreCase(getMessage.get(1).toString()))
				{
					a = true;
					System.out.println(A);
					System.out.println(B);
					//System.out.println(getMessage.get(i).toString());
				}				
			}
			return a;
		}

}
