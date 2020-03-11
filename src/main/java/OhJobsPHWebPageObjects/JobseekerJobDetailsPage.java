package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.Utilities;
import resources.base;




public class JobseekerJobDetailsPage extends base {
	
	public JobseekerJobDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "main-job-title")
	private WebElement jobTitle_Text;
	
	@FindBy(css  = "td:nth-child(2)")
	private List<WebElement> tableJobDetails_Text;
	
	@FindBy(className = "main-desc-content")
	private List<WebElement> mainContent_Text;
	
	@FindBy(className = "main-btn-apply")
	private WebElement applyNow_Button;
	
	@FindBy(css = "[class*='pop-up-field-pitch']")
	private WebElement pitch_Textbox;
	
	@FindBy(id = "submit-application")
	private WebElement submit_Button;
	
	@FindBy(css = "[class*='alert-success']")
	private List<WebElement> successMessage_Text;
	

	public void clickApplyNow(ExtentTest logger)
	{
		applyNow_Button.click();
		logger.log(LogStatus.INFO, "<b>Apply Now button</b> has been clicked.");
	}
	
	public void setWriteYouPitch(ExtentTest logger, String pitch)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(pitch_Textbox));
		pitch_Textbox.sendKeys(pitch);
		logger.log(LogStatus.INFO, "<b>"+pitch+"</b> has been entered on the Write your pitch field.");
	}
	
	public void clickSubmit(ExtentTest logger)
	{
		submit_Button.click();
		logger.log(LogStatus.INFO, "<b>Submit button</b> has been clicked.");
	}
	
	public void verifySuccessMessage()
	{
		
		
		Utilities utilities = new Utilities(driver);
	
		String a = utilities.getVisibleElement(successMessage_Text).getText();
		String b = utilities.getVisibleElement(successMessage_Text).getText();
		
		System.out.println(a);
		System.out.println(b);
		webDriverWait().until(ExpectedConditions.invisibilityOf(utilities.getVisibleElement(successMessage_Text)));
	}
	
	
	public boolean verifyJobTitle(String jobTitle)
	{
		boolean a = false;
		
		if(jobTitle_Text.getText().equalsIgnoreCase(jobTitle))
		{
			a = true;
			System.out.println(jobTitle_Text.getText());
		}
		return a;
	}
	
	public boolean getLocation(ExtentTest logger ,String jobLocation, String educationalLevel, String yearsOfExperience, String salary, String jobTtype)
	{
		boolean a = false;
		
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobLocation, educationalLevel, yearsOfExperience, salary, jobTtype));
		
		for(int i=0; i<tableJobDetails_Text.size(); i++)
		{
			for(int j=0; j<data.size(); j++)
			{
				if(tableJobDetails_Text.get(i).getText().contains(data.get(j).toString()))
				{
					a = true;
					System.out.println(tableJobDetails_Text.get(i).getText());
					logger.log(LogStatus.INFO, "<b>"+data.get(i).toString()+"</b> is present on the Job Details page.");
					break;
				}
			}
		}
		return a;

	}
	
	public boolean getMainContent(ExtentTest logger ,String jobAddress, String jobDetails, String requiredSkills )
	{
		boolean a = false;
		
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobAddress, jobDetails, requiredSkills));
		
		for(int i=0; i<mainContent_Text.size(); i++)
		{
			for(int j= 0; j<data.size(); j++)
			{
				if(mainContent_Text.get(i).getText().equalsIgnoreCase(data.get(j).toString()))
				{					
					a = true;
					System.out.println(mainContent_Text.get(i).getText());
					logger.log(LogStatus.INFO, "<b>"+data.get(i).toString()+"</b> is present on the Job Details page.");
					break;
				}
			}
		}
		return a;
	}
	
	

}
