package OhJobsPHMobilePageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.image.SampleModel;
import java.io.IOException;

import org.apache.tools.ant.taskdefs.optional.clearcase.CCCheckin;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Utilities;
import resources.base;

public class WebAndMobileTest extends base{
	
	@BeforeTest
	public void initializeBrowser() throws IOException, InterruptedException
	{
		ExtentTest logger = extent.startTest("Open Browser");
		navigateTest(logger);
		KillNode();
		extent.endTest(logger);
		extent.flush();
	}
	
	@Test(priority = 1)
	public void loginAsEmployer()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Login", "Login");
		try 
		{
		WebSamplePage sample = new WebSamplePage(driver);
		sample.setEmailAddress(logger, "info@weboutsourcing-gateway.com");
		sample.setPassword(logger, "qwertyui");
		sample.clickLogin(logger);
		}
		catch (Exception | AssertionError e) 
		{
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "Exception encountered due to: <b style='color:red'>" + e.getClass() + "<br>"
					+ e.getMessage() + "</b>");
		}
		extent.endTest(logger);
		extent.flush();
	}
	
	@Test(priority = 2)
	public void AddJob()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Add Job");
		try 
		{
			WebSamplePage sample = new WebSamplePage(driver);
			sample.clickJobPosting(logger);
			sample.clickAddJob(logger);
			sample.setJobTitle(logger, "Quality Assurance Tester");
			sample.setCountry(logger, "Philippines");
			sample.setNumberOfVacancies(logger, "3");
			sample.setRegion(logger, "NCR");
			sample.setProvince(logger, "Metro Manila");
			sample.setCity(logger, "Pasig");
			sample.setJobLocation(logger, "Ortigas Center, Pasig City");
			sample.setSalary(logger, "26,000");
			sample.setJobDetails(logger, "Test website and mobile app.");
			sample.setYearsOfExperience(logger, "1 Year or less");
			sample.setEducationalLevel(logger, "Bachelor's / College Degree");
			sample.setIndustry(logger, "Information Technology");
			sample.setRequiredSkills(logger, "Manual and Automation Testing");
			sample.setJobTags(logger, "IT JOB");
			sample.setOpeningDate(logger, "02/11/2020");
			sample.setClosingDate(logger, "02/14/2020");
			sample.clickSubmitJob(logger);
			sample.clickYes(logger);
			assertTrue(sample.verifySuccessMessageOnAddJobs("Submitting your job post...", "Your Job has been submitted. Please wait for Oh! Jobs approval."));
			
		}
		catch (Exception | AssertionError e) 
		{
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "Exception encountered due to: <b style='color:red'>" + e.getClass() + "<br>"
					+ e.getMessage() + "</b>");
		}
		extent.endTest(logger);
		extent.flush();
	}
	
	@Test(priority = 3)
	public void ApproveJobPost()
	{
		ExtentTest logger = extent.startTest("<b>Webmaster</b>: Approved Job Post");
		try 
		{
		
		WebSamplePage sample = new WebSamplePage(driver);
		Utilities util = new Utilities(driver);
		String companyName = sample.getCompanyName();
		sample.clickDropdown(logger);
		sample.clickLogout(logger);
		sample.setEmailAddress(logger, "info@ohjobs.ph");
		sample.setPassword(logger, "secret123Q");
		sample.clickLogin(logger);
		sample.clickManageJobPosts(logger);
		sample.approveJobPost(logger, "Quality Assurance Tester");
		//sample.getMessage();
		System.out.println(companyName);
		//assertEquals(wait.until(ExpectedConditions.visibilityOf(sample.sendingEmailMessage_Text)).getText(), "Sending email notification to "+companyName+" ");
		//assertTrue(sample.verifyNotificationOnApprovedJob("Sending email notification to "+companyName+" ", "You have successfully approved the job. The employer will be notified of this action."));
		util.OpenNewTab(logger, "http://178.128.53.73/jobs-list");
		sample.findApprovedJob("Quality Assurance Tester");
		}
		catch (Exception | AssertionError e) 
		{
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "Exception encountered due to: <b style='color:red'>" + e.getClass() + "<br>"
					+ e.getMessage() + "</b>");
		}
		extent.endTest(logger);
		extent.flush();
		
	}
	
	@Test
	public void check() throws InterruptedException
	{
		WebSamplePage sample = new WebSamplePage(driver);
		sample.findApprovedJob("Quality Assurance Tester");
		sample.getLocation("NCR, Metro Manila, Pasig, Philippines", "Bachelor's / College Degree", "1 Year or less", "26,000", "Full-time");
		sample.getMainContent("Ortigas Center, Pasig City", "Test website and mobile app.", "Manual and Automation Testing");
	}
	


	@AfterTest
	public void tearDown()
	{
		driver.quit();
		driver = null;
	}
	
}
