package OhJobsPHTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Checkbox;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import OhJobsPHMobilePageObjects.HomePage;
import OhJobsPHMobilePageObjects.JobDetailsPage;
import OhJobsPHMobilePageObjects.JobsPage;
import OhJobsPHMobilePageObjects.LoginPage;
import OhJobsPHMobilePageObjects.SignUpPage;
import OhJobsPHMobilePageObjects.UserProfilePage;
import OhJobsPHWebPageObjects.AdminLoginPage;
import OhJobsPHWebPageObjects.DatabaseQuery;
import OhJobsPHWebPageObjects.EmployerHomePage;
import OhJobsPHWebPageObjects.EmployerJobPostingPage;
import OhJobsPHWebPageObjects.EmployerManageApplicants;
import OhJobsPHWebPageObjects.EmployerProfilePage;
import OhJobsPHWebPageObjects.EmployerSignUpPage;
import OhJobsPHWebPageObjects.GmailPage;
import OhJobsPHWebPageObjects.JobseekerHomePage;
import OhJobsPHWebPageObjects.JobseekerInboxPage;
import OhJobsPHWebPageObjects.JobseekerJobDetailsPage;
import OhJobsPHWebPageObjects.JobseekerJobsListPage;
import OhJobsPHWebPageObjects.JobseekerLoginPage;
import OhJobsPHWebPageObjects.JobseekerNotificationPage;
import OhJobsPHWebPageObjects.JobseekerSignUpPage;
import OhJobsPHWebPageObjects.JobseekerUserProfilePage;
import OhJobsPHWebPageObjects.NadaEmailPage;
import OhJobsPHWebPageObjects.WebmasterHomePage;
import OhJobsPHWebPageObjects.WebmasterManageEmployers;
import OhJobsPHWebPageObjects.WebmasterManageJobPostsPage;
import OhJobsPHWebPageObjects.db_Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Utilities;
import resources.base;

public class OhJobsPhTest extends base {
	
	SoftAssert softAssert = new SoftAssert();
			
	
	@BeforeTest
	//@Parameters("browserName")
	public void initializeDriver() throws IOException, InterruptedException, ClassNotFoundException, SQLException
	{
		ExtentTest logger = extent.startTest("Open Browser");
		navigateTest(logger);
		//initializeDriverForCrossBrowsing(logger, browserName);
		//KillNode();
		extent.endTest(logger);
		extent.flush();
	}
	
	@Test(priority = 7)
	public void jobseekerSignUpWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Sign Up");
		try 
		{
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerSignUpPage jobseekerSignUpPage = new JobseekerSignUpPage(driver);
			JobseekerLoginPage jobseekerLoginPage = new JobseekerLoginPage(driver);
			NadaEmailPage nadaEmailPage = new NadaEmailPage(driver);
			Utilities utilities = new Utilities(driver);
			
			String getNadaURL = inputData.get("Oh Jobs PH Test Data").get("Get Nada URL");
			String firstName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) First Name");
			String lastName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Last Name");
			String gender = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Gender");
			String birthday = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Birthday");
			String emailAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Email Address");
			String userName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Username");
			String password = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Password");
			String confirmPassword = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Confirm Password");
			String successMessage = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Success Message");
			
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/");
			jobseekerHomePage.clickSignUp(logger);
			jobseekerSignUpPage.setFirstName(logger, firstName);
			jobseekerSignUpPage.setLastName(logger, lastName);
			jobseekerSignUpPage.selectGender(logger, gender);
			jobseekerSignUpPage.selectBirthday(logger, birthday);
			jobseekerSignUpPage.setEmailAddress(logger, emailAddress);
			jobseekerSignUpPage.setUsername(logger, userName);
			jobseekerSignUpPage.setPassword(logger, password);
			jobseekerSignUpPage.setConfirmPassword(logger, confirmPassword);
			jobseekerSignUpPage.clickIAgree(logger);
			jobseekerSignUpPage.clickRegisterNow(logger);
			softAssert.assertTrue(jobseekerSignUpPage.verifySuccessMessage(successMessage));
			utilities.OpenNewTab(logger, getNadaURL);
			nadaEmailPage.clickAddInbox();
			nadaEmailPage.setTempEmail(emailAddress.replaceAll("@zetmail.com", ""), emailAddress.substring(emailAddress.length() - 11));
			//nadaEmailPage.setDomain(emailAddress.substring(emailAddress.length() - 11));
			nadaEmailPage.clickAccept();
			nadaEmailPage.findAndClickMessage(logger,"Your Oh! Jobs.ph account has been successfully created.");
			nadaEmailPage.clickLoginAs(logger);
			utilities.switchNextTab(logger);
			
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
	
	@Test(priority = 8)
	public void jobseekerLoginWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Login");
		try 
		{
			String emailAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Password");
			String successMessage = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Login) Success Message");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerLoginPage jobseekerLoginPage = new JobseekerLoginPage(driver);
			Utilities utilities = new Utilities(driver);
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/");
			
			jobseekerHomePage.clickLogin(logger);
			jobseekerLoginPage.setUsernameOrEmail(logger, "aronbraza");
			jobseekerLoginPage.setPassword(logger, "Wog12345");
			jobseekerLoginPage.clickLogin(logger);
			softAssert.assertTrue(jobseekerLoginPage.verifySuccessMessage(successMessage));
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
	public void jobseekerEditPersonalInformationWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Edit Personal Information");
		try 
		{
			//Test Data//
			String firstName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) First Name");
			String lastName =  inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Last Name");
			String birthday = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Birthday");
			String gender = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Gender");
			String country = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Country");
			String RPC = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) RPC");
			String completeAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Complete Address");
			String jobExperience = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Job Experience");
			String educationalAttainment = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Educational Attainment");
			String license = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) With Professional License");
			String phoneNumber = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Personal Information) Phone Number");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);

			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickEditPersonalInformation(logger);
			jobseekerUserProfilePage.setFirstName(logger, firstName);
			jobseekerUserProfilePage.setLastName(logger, lastName);
			jobseekerUserProfilePage.setBirthday(logger, birthday);
			jobseekerUserProfilePage.setGender(logger, gender);
			jobseekerUserProfilePage.setCountry(logger, country,RPC);
			jobseekerUserProfilePage.setCompleteAddress(logger, completeAddress);
			jobseekerUserProfilePage.setJobExperience(logger, jobExperience);
			jobseekerUserProfilePage.setEducationalAttainment(logger, educationalAttainment, license);
			jobseekerUserProfilePage.setPhoneNumber(logger, phoneNumber);
			jobseekerUserProfilePage.clickSavePersonalInformation(logger);
			
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
	public void jobseekerEditIntroductionWeb() 
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Edit Introduction");
		try 
		{
			//Test Data//
			String intro = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Introduction) Introduction");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			Utilities utilities = new Utilities(driver);
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/");
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickEditIntroduction(logger);
			jobseekerUserProfilePage.setIntroduction(logger, intro);
			jobseekerUserProfilePage.clickSaveIntroduction(logger);
			
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
	public void jobseekerAddEducationalBackgroundWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Add Educational Background");
		try 
		{
			//Test Data
			String fieldOfStudy = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Educational Background) Field Of Study");
			String school = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Educational Background) University / School");
			String schoolAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Educational Background) University / School Address");
			String classAttended = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Educational Background) Class Attended From and Until");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);

			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickAddEducational(logger);
			jobseekerUserProfilePage.setFieldOfStudy(logger, fieldOfStudy);
			jobseekerUserProfilePage.setSchool(logger, school);
			jobseekerUserProfilePage.setSchoolAddress(logger, schoolAddress);
			jobseekerUserProfilePage.setClassAttended(logger, classAttended);
			jobseekerUserProfilePage.clickSaveEducationalBackground(logger);
			
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
	public void jobseekerAddWorkExperience()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Add Work Experience");
		try 
		{
			//Test Data//
			String positionTitle = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Work Experience) Position Title");
			String companyName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Work Experience) Company Name");
			String companyLocation = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Work Experience) Company Location");
			String workDuration = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Work Experience) Work Duration");
			String aboutWork = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Work Experience) Tell us more about your work");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickAddWorkExperience(logger);
			jobseekerUserProfilePage.setPositionTitle(logger, positionTitle);
			jobseekerUserProfilePage.setCompanyName(logger, companyName);
			jobseekerUserProfilePage.setCompanyLocation(logger, companyLocation);
			jobseekerUserProfilePage.setWorkDuration(logger, workDuration);
			jobseekerUserProfilePage.setAboutWork(logger, aboutWork);
			jobseekerUserProfilePage.clickSaveWorkExperience(logger);

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
	public void jobseekerAddSkillsWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Add Work Skills");
		try 
		{
			String proficiency = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Skills) Proficiency");
			String skills = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Skills) Skills");
		
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickAddSkills(logger);
			jobseekerUserProfilePage.setProficiency(logger, proficiency);
			jobseekerUserProfilePage.setSkills(logger, skills);
			jobseekerUserProfilePage.clickSaveSkills(logger);
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
	public void jobseekerSelectJobPreferenceWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Edit Job Preference");
		try 
		{
			//Test Data
			String jobPreference = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Job Prerference) Job Preference");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickEditJobPreference(logger);
			jobseekerUserProfilePage.selectJobPreference(logger, jobPreference);
			jobseekerUserProfilePage.updateJobPreference(logger);
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
	public void jobseekerAddOtherInformation()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Add Other Information");
		try 
		{
			String otherInformation = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Other Information) Other Information");
			String aboutOtherInformation = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Other Information) About Other Information");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickAddOtherInformation_Icon(logger);
			jobseekerUserProfilePage.setOtherInformation(logger, otherInformation);
			jobseekerUserProfilePage.setAboutOtherInformation(logger, aboutOtherInformation);
			jobseekerUserProfilePage.clickSaveOtherInformation(logger);
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
	
	@Test(priority = 10)
	public void jobseekerSendMessageToEmployer()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Approved Jobseeker Application");
		try 
		{
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerInboxPage jobseekerInboxPage = new JobseekerInboxPage(driver);
			Utilities utilities = new Utilities(driver);
			
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/admin");
			jobseekerHomePage.clickMessage(logger);
			jobseekerInboxPage.findAndClickEmployer(logger, "Web Outsourcing Gateway Inc.");
			jobseekerInboxPage.setMessage(logger, "Test lang din");
			jobseekerInboxPage.clickSend(logger);
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
	public void jobseekerEditPersonalInformationMobile()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Edit Personal Information (Mobile App)");
		try 
		{
			service = startServer();
			AndroidDriver<WebElement> androidDriver = Capabilities();
			HomePage homePage = new HomePage(androidDriver);
			LoginPage loginPage = new LoginPage(androidDriver);
			UserProfilePage userProfilePage = new UserProfilePage(androidDriver);
			
			homePage.clickLogin(logger);
			loginPage.setUsername(logger, "aronbraza");
			loginPage.setPassword(logger, "Wog12345");
			loginPage.clickLogin_Button(logger);
			homePage.clickMenu(logger);
			homePage.clickUserProfile(logger);
			userProfilePage.clickEditPersonalInformationIcon();
			//userProfilePage.setFirstName(logger, "WOG WOG WOG");
			userProfilePage.setBirthdate(logger);
			Thread.sleep(5000);
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
	
	@Test(priority = 11)
	public void jobseekerCheckApprovedJobNotification()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Check Approved Job Notification");
		try 
		{
			String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerNotificationPage jobseekerNotificationPage = new JobseekerNotificationPage(driver);
			Utilities utilities = new Utilities(driver);
			
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/");
			jobseekerHomePage.clickNotification(logger);
			jobseekerNotificationPage.getApprovedJobApplicationNotif(logger,jobTitle);
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
	
	
	
	@Test(priority = 9)
	public void jobseekerApplyJobOnWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Apply Jobs");
		try 
		{
		String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
		 JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
		 JobseekerJobsListPage jobseekerJobsListPage = new JobseekerJobsListPage(driver);
		 JobseekerJobDetailsPage jobseekerJobDetailsPage = new JobseekerJobDetailsPage(driver);
		 
		 jobseekerHomePage.clickJobs(logger);
		 jobseekerJobsListPage.findApprovedJob(logger,jobTitle);
		 jobseekerJobDetailsPage.clickApplyNow(logger);
		 jobseekerJobDetailsPage.setWriteYouPitch(logger, "Good morning test apply lang.");
		 jobseekerJobDetailsPage.clickSubmit(logger);
		 
		 
		 
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
	
	@Test(priority = 4)
	public void jobseekerApplyJobOnMobile() throws InterruptedException, IOException
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Apply on one of the job using Oh Jobs PH Mobile app");
		try 
		{
			service = startServer();
			AndroidDriver<WebElement> androidDriver = Capabilities();
			HomePage homePage = new HomePage(androidDriver);
			LoginPage loginPage = new LoginPage(androidDriver);
			JobsPage jobsPage = new JobsPage(androidDriver);
			JobDetailsPage jobDetailsPage = new JobDetailsPage(androidDriver);
			SignUpPage signUpPage = new SignUpPage(androidDriver);
			//homePage.clickLogin(logger);
			//loginPage.setUsername(logger, "aronbraza");
			//loginPage.setPassword(logger, "Wog12345");
			//loginPage.clickLogin_Button(logger);
			homePage.clickFindAJob(logger);
			jobsPage.findAndClickJob(logger,"C# Developer");
			jobDetailsPage.getJD();
			
			
			
			//jobsPage.getJobList();
			service.stop();
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
	
	
	
	@Test(priority = 1)
	public void employerSignUp()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Sign Up");
		try 
		{
			String getNadaURL = inputData.get("Oh Jobs PH Test Data").get("Get Nada URL");
			String employerName = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Employer Name");
			String employerType = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Employer Type");
			String employerIndustry = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Employer Industry");
			String representative = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Representative");
			String country = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Country");
			String address = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Address");
			String emailAddress = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Password");
			String confirmPassword = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Confirm Password");
			
			JobseekerSignUpPage jobseekerSignUpPage = new JobseekerSignUpPage(driver);
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			EmployerSignUpPage employerSignUpPage = new EmployerSignUpPage(driver);
			NadaEmailPage nadaEmailPage = new NadaEmailPage(driver);
			Utilities utilities = new Utilities(driver);
			
			//utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/employers-signup");
			jobseekerHomePage.clickSignUp(logger);
			jobseekerSignUpPage.clickEmployerSignUp(logger);
			employerSignUpPage.setEmployerName(logger, employerName);
			employerSignUpPage.setEmployerType(logger, employerType);
			employerSignUpPage.setEmployerIndustry(logger, employerIndustry);
			employerSignUpPage.setRepresentative(logger, representative);
			employerSignUpPage.setCountry(logger, country);
			employerSignUpPage.setAddress(logger, address);
			employerSignUpPage.setEmailAddress(logger, emailAddress);
			employerSignUpPage.setPassword(logger, password);
			employerSignUpPage.setConfirmPassword(logger, confirmPassword);
			employerSignUpPage.clickIAgree(logger);
			employerSignUpPage.clickSignUp(logger);
			employerSignUpPage.verifySuccessMessage();
			employerSignUpPage.getSuccessMessage();
			//softAssert.assertTrue(employerSignUpPage.verifySuccessMessage("Signing up...Please wait  ,Your information has been registered. You can now login to your account. Thank you."));
	
			utilities.OpenNewTab(logger, getNadaURL);
			nadaEmailPage.clickAddInbox();
			nadaEmailPage.setTempEmail(emailAddress.replaceAll("@zetmail.com", ""), emailAddress.substring(emailAddress.length() - 11));
			//nadaEmailPage.setDomain(emailAddress.substring(emailAddress.length() - 11));
			nadaEmailPage.clickAccept();
			nadaEmailPage.findAndClickMessage(logger,"Oh! Jobs.ph: Sign up Confirmation");
			nadaEmailPage.clickLoginAs(logger);
			utilities.switchNextTab(logger);
			
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
	public void employerLoginWeb()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Login");
		try 
		{
			
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			Utilities utilities = new Utilities(driver);
			String email = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Password");
			//utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/admin");
			adminLoginPage.setEmailAddress(logger, email);
			adminLoginPage.setPassword(logger, password);
			adminLoginPage.clickLogin(logger);
			
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
	public void employerEditProfile()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Edit Profile");
		try 
		{
		
		//Test Data//
		String representative = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Representative");
		String details = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Details");
		String contactDetails = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Contact Details");
		String businessHours = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Business Hours");
		String faxNumber = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Fax Number");
		String website = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Website");
		String country = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Country");
		String address = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Address");
		String industry = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Industry");
		String successMessage = inputData.get("Oh Jobs PH Test Data").get("Employer (Edit Profile) Success Message");
			
		
		EmployerHomePage employerHomePage = new EmployerHomePage(driver);
		EmployerProfilePage employerProfilePage = new EmployerProfilePage(driver);
		
		employerHomePage.setAmount(logger, "5000");
		employerHomePage.clickSubmit(logger);
		employerHomePage.verifyModalMessage();
		employerHomePage.clickDropdown(logger);
		employerHomePage.clickProfile(logger);
		employerProfilePage.clickEditProfile(logger);
		employerProfilePage.setRepresentative(logger, representative);
		employerProfilePage.setDetails(logger, details);
		employerProfilePage.setContactDetails(logger, contactDetails);
		employerProfilePage.setBusinessHours(logger, businessHours);
		employerProfilePage.setFaxNumber(logger, faxNumber);
		employerProfilePage.setWebsite(logger, website);
		employerProfilePage.setCountry(logger, country);
		employerProfilePage.setAddress(logger, address);
		employerProfilePage.setIndustry(logger, industry);
		employerProfilePage.uploadSecCertificate(logger);
		employerProfilePage.clickUpdateProfile(logger);
		softAssert.assertTrue(employerProfilePage.verifySuccessMessage(successMessage));
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
	
	
	@Test(priority = 4)
	public void employerAddJob()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Add Job");
		try 
		{
			String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
			String country = inputData.get("Oh Jobs PH Test Data").get("Country");
			String numberOfVancies = inputData.get("Oh Jobs PH Test Data").get("Number of Vacancies");
			String region = inputData.get("Oh Jobs PH Test Data").get("Region");
			String province = inputData.get("Oh Jobs PH Test Data").get("Province");
			String city = inputData.get("Oh Jobs PH Test Data").get("City");
			String jobLocation = inputData.get("Oh Jobs PH Test Data").get("Job Location");
			String salary = inputData.get("Oh Jobs PH Test Data").get("Salary");
			String jobDetails = inputData.get("Oh Jobs PH Test Data").get("Job Details");
			String yearsOfExperience = inputData.get("Oh Jobs PH Test Data").get("Years of Experience");
			String educationalLevel = inputData.get("Oh Jobs PH Test Data").get("Educational Level");
			String industry = inputData.get("Oh Jobs PH Test Data").get("Industry");
			String skills = inputData.get("Oh Jobs PH Test Data").get("Required Skills");
			String jobTags = inputData.get("Oh Jobs PH Test Data").get("Job Tags");
			String openingDate = inputData.get("Oh Jobs PH Test Data").get("Opening Date").toString();
			String closingDate = inputData.get("Oh Jobs PH Test Data").get("Closing Date");
			String addJobSuccessMessages = inputData.get("Oh Jobs PH Test Data").get("Add Job Success Message");
			
			EmployerHomePage employerHomePage = new EmployerHomePage(driver);
			EmployerJobPostingPage employerJobPostingPage = new EmployerJobPostingPage(driver);
		
			employerHomePage.clickJobPosting(logger);
			employerJobPostingPage.clickAddJob(logger);
			employerJobPostingPage.setJobTitle(logger, jobTitle);
			employerJobPostingPage.setCountry(logger, country);
			employerJobPostingPage.setNumberOfVacancies(logger, numberOfVancies);
			employerJobPostingPage.setRegion(logger, region);
			employerJobPostingPage.setProvince(logger, province);
			employerJobPostingPage.setCity(logger, city);
			employerJobPostingPage.setJobLocation(logger, jobLocation);
			employerJobPostingPage.setSalary(logger, salary);
			employerJobPostingPage.setJobDetails(logger, jobDetails);
			employerJobPostingPage.setYearsOfExperience(logger, yearsOfExperience);
			employerJobPostingPage.setEducationalLevel(logger, educationalLevel);
			employerJobPostingPage.setIndustry(logger, industry);
			employerJobPostingPage.setRequiredSkills(logger, skills);
			employerJobPostingPage.setJobTags(logger, jobTags);
			employerJobPostingPage.setOpeningDate(logger, openingDate);
			employerJobPostingPage.setClosingDate(logger, closingDate);
			employerJobPostingPage.clickSubmitJob(logger);
			employerJobPostingPage.clickYes(logger);
			softAssert.assertTrue(employerJobPostingPage.verifySuccessMessageOnAddJobs(addJobSuccessMessages));
			employerHomePage.clickDropdown(logger);
			employerHomePage.clickLogout(logger);
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
	
	
	@Test(priority = 10)
	public void employerApproveJobseekerApplicationAndSendMessageToJobseeker()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Approved Jobseeker Application");
		
		try 
		{
			
			String email = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Password");
			String firstName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) First Name");
			String lastName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Last Name");
			String employerMessage = inputData.get("Oh Jobs PH Test Data").get("Employer(Approve Jobseeker) Approve Jobseeker Application Message");
			
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			EmployerHomePage employerHomePage = new EmployerHomePage(driver);
			EmployerManageApplicants employerManageApplicants = new EmployerManageApplicants(driver);
			Utilities utilities = new Utilities(driver);
			
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/admin");
			adminLoginPage.setEmailAddress(logger, email);
			adminLoginPage.setPassword(logger, password);
			adminLoginPage.clickLogin(logger);
			employerHomePage.clickManageApplicants(logger);
			employerManageApplicants.approveJobseekserApplication(logger, "Aron Braza",employerMessage);
			//employerManageApplicants.clickSendMessage(logger);
			//employerManageApplicants.setSendMessageToJobseeker(logger, "Hello sample lang to");
			//employerManageApplicants.clickSend(logger);
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
	
	
	
	@Test(priority = 6)
	public void webmasterApproveJobPost()
	{
		ExtentTest logger = extent.startTest("<b>Webmaster</b>: Approved Job Post");
		try 
		{
			String email = inputData.get("Oh Jobs PH Test Data").get("Webmaster Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Webmaster Password");
			String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
			String approvedJobSuccessMessage = inputData.get("Oh Jobs PH Test Data").get("Approve Job Success Message");
			
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			WebmasterHomePage webMasterHomePage = new WebmasterHomePage(driver);
			WebmasterManageJobPostsPage webMasterManageJobPostsPage = new WebmasterManageJobPostsPage(driver);
			
			webMasterHomePage.clickManageJobPosts(logger);
			webMasterManageJobPostsPage.approveJobPost(logger, jobTitle);
			softAssert.assertTrue(webMasterManageJobPostsPage.verifyNotificationOnApprovedJob(approvedJobSuccessMessage));
			webMasterHomePage.clickDropdown(logger);
			webMasterHomePage.clickLogout(logger);

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
	
	@Test(priority = 5)
	public void webmasterApproveSupportingDocuments()
	{
		ExtentTest logger = extent.startTest("<b>Webmaster:</b> Approve Supporting Documents of the employer");
		try
		{
			String email = inputData.get("Oh Jobs PH Test Data").get("Webmaster Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Webmaster Password");
			String employerName = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Employer Name");
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			WebmasterHomePage webmasterHomePage = new WebmasterHomePage(driver);
			WebmasterManageEmployers webmasterManageEmployers = new WebmasterManageEmployers(driver);
			Utilities utilities = new Utilities(driver);
			
			utilities.OpenNewTab(logger, "http://beta-ohjobsph.ml/admin");
			adminLoginPage.setEmailAddress(logger, email);
			adminLoginPage.setPassword(logger, password);
			adminLoginPage.clickLogin(logger);
			webmasterHomePage.clickManageEmployers(logger);
			webmasterManageEmployers.approvedSupportingDocuments(logger, employerName);
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
		
	
	
	@AfterTest
	public void tearDown() throws ClassNotFoundException, SQLException
	{
		String jobseekerEmailAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Email Address");
		String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
		String employerEmailAddress = inputData.get("Oh Jobs PH Test Data").get("Employer (Sign Up) Email Address");
		DatabaseQuery db = new DatabaseQuery();
		db.deleteQueryJobseekerAccount(jobseekerEmailAddress, db.getIDJobseeker(jobseekerEmailAddress));
		db.deleteQueryJob(jobTitle, db.getIDJob(jobTitle));
		db.deleteQueryEmployerAccount(employerEmailAddress, db.getIDEmployer(employerEmailAddress));
		driver.quit();
	}

}
