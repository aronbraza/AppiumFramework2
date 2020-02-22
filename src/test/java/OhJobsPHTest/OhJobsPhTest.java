package OhJobsPHTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Checkbox;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import OhJobsPHMobilePageObjects.HomePage;
import OhJobsPHMobilePageObjects.JobDetailsPage;
import OhJobsPHMobilePageObjects.JobsPage;
import OhJobsPHMobilePageObjects.LoginPage;
import OhJobsPHWebPageObjects.AdminLoginPage;
import OhJobsPHWebPageObjects.EmployerHomePage;
import OhJobsPHWebPageObjects.EmployerJobPostingPage;
import OhJobsPHWebPageObjects.EmployerSignUpPage;
import OhJobsPHWebPageObjects.GmailPage;
import OhJobsPHWebPageObjects.JobseekerHomePage;
import OhJobsPHWebPageObjects.JobseekerJobDetailsPage;
import OhJobsPHWebPageObjects.JobseekerJobsListPage;
import OhJobsPHWebPageObjects.JobseekerLoginPage;
import OhJobsPHWebPageObjects.JobseekerSignUpPage;
import OhJobsPHWebPageObjects.JobseekerUserProfilePage;
import OhJobsPHWebPageObjects.NadaEmailPage;
import OhJobsPHWebPageObjects.WebmasterHomePage;
import OhJobsPHWebPageObjects.WebmasterManageJobPostsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Utilities;
import resources.base;

public class OhJobsPhTest extends base {
	
	SoftAssert softAssert = new SoftAssert();
			
	
	@BeforeTest
	public void initializeDriver() throws IOException, InterruptedException
	{
		ExtentTest logger = extent.startTest("Open Browser");
		//navigateToOhJobsPhAdminPage(logger);
		navigateTest(logger);
		//KillNode();
		extent.endTest(logger);
		extent.flush();
	}
	
	@Test(priority = 1)
	public void jobseekerSignUpWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Sign Up");
		try 
		{
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerSignUpPage jobseekerSignUpPage = new JobseekerSignUpPage(driver);
			NadaEmailPage nadaEmailPage = new NadaEmailPage(driver);
			Utilities utilities = new Utilities(driver);
			
			
			String firstName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) First Name");
			String lastName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Last Name");
			String gender = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Gender");
			String birthday = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Birthday");
			String emailAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Email Address");
			String userName = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Username");
			String password = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Password");
			String confirmPassword = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Confirm Password");
			//String successMessage = inputData.get("Oh Jobs PH Test Data").get("Jobseeker (Sign Up) Sign Up Success Message");
			
			
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
			utilities.OpenNewTab(logger, "https://getnada.com/msg");
			nadaEmailPage.clickAddInbox();
			nadaEmailPage.setName(emailAddress.replaceAll("@zetmail.com", ""));
			nadaEmailPage.setDomain(emailAddress.substring(emailAddress.length() - 11));
			nadaEmailPage.clickAccept();
			nadaEmailPage.findAndClickMessage("Your Oh! Jobs.ph account has been successfully created");
			nadaEmailPage.clickLoginAs();
			utilities.switchToNextTab(logger);
			
			
			
			//assertTrue(jobseekerSignUpPage.verifySuccessMessage(successMessage));
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
	public void jobseekerLoginWeb()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Login");
		try 
		{
			String emailAddress = inputData.get("Oh Jobs PH Test Data").get("Jobseeker Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Jobseeker Password");
			
			JobseekerLoginPage jobseekerLoginPage = new JobseekerLoginPage(driver);
			
			jobseekerLoginPage.setUsernameOrEmail(logger, emailAddress);
			jobseekerLoginPage.setPassword(logger, password);
			jobseekerLoginPage.clickLogin(logger);
			
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
	
	@Test
	public void obseekerEditIntroductionWeb() 
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Edit Introduction");
		try 
		{
			//Test Data//
			String intro = inputData.get("Oh Jobs PH Test Data").get("Jobseeker(Introduction) Introduction");
			
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
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
			
			JobseekerLoginPage jobseekerLoginPage = new JobseekerLoginPage(driver);
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			
			jobseekerHomePage.clickLogin(logger);
			jobseekerLoginPage.setUsernameOrEmail(logger, "aronbraza");
			jobseekerLoginPage.setPassword(logger, "Wog12345");
			jobseekerLoginPage.clickLogin(logger);
			
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			jobseekerUserProfilePage.clickEditJobPreference(logger);
			jobseekerUserProfilePage.selectJobPreference(logger, jobPreference);
			jobseekerUserProfilePage.updateJobPreference(logger);
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
	
	
	@Test(priority = 1)
	public void loginAsEmployer()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Login");
		try 
		{
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			
			String email = inputData.get("Oh Jobs PH Test Data").get("Employer Username");
			String password = inputData.get("Oh Jobs PH Test Data").get("Employer Password");
			
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
	
	
	@Test(priority = 2)
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
			String openingDate = inputData.get("Oh Jobs PH Test Data").get("Opening Date");
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
			assertTrue(employerJobPostingPage.verifySuccessMessageOnAddJobs(addJobSuccessMessages));
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
	
	
	@Test(priority = 3)
	public void webmasterApproveJobPost()
	{
		ExtentTest logger = extent.startTest("<b>Webmaster</b>: Approved Job Post");
		try 
		{
			String email = inputData.get("Oh Jobs PH Test Data").get("Webmaster Email Address");
			String password = inputData.get("Oh Jobs PH Test Data").get("Webmaster Password");
			String jobTitle = inputData.get("Oh Jobs PH Test Data").get("Job Title");
			String jobseekerURL = inputData.get("Oh Jobs PH Test Data").get("Oh Jobs PH Jobseeker URL");
			String approvedJobSuccessMessage = inputData.get("Oh Jobs PH Test Data").get("Approve Job Success Message");
			
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			WebmasterHomePage webMasterHomePage = new WebmasterHomePage(driver);
			WebmasterManageJobPostsPage webMasterManageJobPostsPage = new WebmasterManageJobPostsPage(driver);
			JobseekerJobsListPage jobseekerJobsListPage = new JobseekerJobsListPage(driver);
			JobseekerJobDetailsPage jobseekerJobDetailsPage = new JobseekerJobDetailsPage(driver);
			Utilities utilities = new Utilities(driver);
			
			adminLoginPage.setEmailAddress(logger, email);
			adminLoginPage.setPassword(logger, password);
			adminLoginPage.clickLogin(logger);
			webMasterHomePage.clickManageJobPosts(logger);
			webMasterManageJobPostsPage.approveJobPost(logger, jobTitle);
			assertTrue(webMasterManageJobPostsPage.verifyNotificationOnApprovedJob(approvedJobSuccessMessage));
			utilities.OpenNewTab(logger, jobseekerURL);
			jobseekerJobsListPage.findApprovedJob(jobTitle);
			
			
			
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
			//homePage.clickLogin(logger);
			//loginPage.setUsername(logger, "aronbraza");
			//loginPage.setPassword(logger, "Wog12345");
			//loginPage.clickLogin_Button(logger);
			homePage.clickFindAJob(logger);
			jobsPage.findAndClickJob(logger,"IT Application Support");
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
	
	
	
	@Test
	public void Check() throws InterruptedException
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Apply on one of the job using Oh Jobs PH Mobile app");
		try 
		{
		//String email = inputData.get("Oh Jobs PH Test Data").get("Webmaster Email Address");
		
		JobseekerJobsListPage jobseekerJobsListPage = new JobseekerJobsListPage(driver);
		JobseekerJobDetailsPage jobseekerJobDetailsPage = new JobseekerJobDetailsPage(driver);
		jobseekerJobsListPage.findApprovedJob("Quality Assurance Tester");
		assertTrue(jobseekerJobDetailsPage.getLocation(logger,"NCR, Metro Manila, Pasig, Philippines", "Bachelor's / College Degree", "1 Year or less", "PHP 26,000", "Full-time") && jobseekerJobDetailsPage.getMainContent(logger,"Ortigas Center, Pasig City", "Test website and mobile app.", "Manual and Automation Testing") );
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
	public void testlang()
	{
		ExtentTest logger = extent.startTest("<b>Jobseeker</b>: Apply on one of the job using Oh Jobs PH Mobile app");
		try 
		{
			JobseekerLoginPage jobseekerLoginPage = new JobseekerLoginPage(driver);
			JobseekerHomePage jobseekerHomePage = new JobseekerHomePage(driver);
			JobseekerUserProfilePage jobseekerUserProfilePage = new JobseekerUserProfilePage(driver);
			jobseekerHomePage.clickLogin(logger);
			jobseekerLoginPage.setUsernameOrEmail(logger, "aronbraza");
			jobseekerLoginPage.setPassword(logger, "Wog12345");
			jobseekerLoginPage.clickLogin(logger);
			jobseekerHomePage.clickUserDropdown(logger);
			jobseekerHomePage.clickUserProfile(logger);
			//jobseekerUserProfilePage.clickEditEducationalBackground(logger, "Test");
			//jobseekerUserProfilePage.setEditFieldOfStudy(logger, "Test", "Sample lang to");
			//jobseekerUserProfilePage.clickEditJobPreference(logger);
			//jobseekerUserProfilePage.selectJobPreference(logger, "Sea-Based Jobs,Agriculture,Telecommunications/Consulting");
			jobseekerUserProfilePage.clickEditPersonalInformation(logger);
			//jobseekerUserProfilePage.setCountry(logger, "Japan", "", "", "");
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
	
	@Test
	public void employerSignUp()
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Sign Up");
		try 
		{
			AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
			EmployerSignUpPage employerSignUpPage = new EmployerSignUpPage(driver);
			employerSignUpPage.setEmployerName(logger, "Sample Employer");
			employerSignUpPage.setEmployerType(logger, "Company / Local Agency");
			employerSignUpPage.setEmployerIndustry(logger, "Information Technology");
			employerSignUpPage.setRepresentative(logger, "Aron Paul G. Braza");
			employerSignUpPage.setCountry(logger, "Philippines");
			employerSignUpPage.setAddress(logger, "Ortigas Center, Pasig City");
			employerSignUpPage.setEmailAddress(logger, "wog.aron@zetmail.com");
			employerSignUpPage.setPassword(logger, "Wog12345");
			employerSignUpPage.setConfirmPassword(logger, "Wog12345");
			employerSignUpPage.clickIAgree(logger);
			employerSignUpPage.clickSignUp(logger);
			
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
	public void verifyEmail() throws InterruptedException 
	{
		ExtentTest logger = extent.startTest("<b>Employer</b>: Verify Email");
		try 
		{
		
		Utilities utilities = new Utilities(driver);
		NadaEmailPage nadaEmailPage = new NadaEmailPage(driver);
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		
		utilities.OpenNewTab(logger, "https://getnada.com/");
		nadaEmailPage.clickAddInbox();
		nadaEmailPage.setName("wog.aron");
		nadaEmailPage.setDomain("zetmail.com");
		nadaEmailPage.clickAccept();
		nadaEmailPage.findAndClickTemEmail("wog.aron@zetmail.com");
		nadaEmailPage.findAndClickMessage("Oh! Jobs.ph: Employer Sign Up");
		nadaEmailPage.clickLoginAs();
		utilities.switchToNextTab(logger);
		adminLoginPage.setEmailAddress(logger, "wog.aron@zetmail.com");
		adminLoginPage.setPassword(logger, "Wog12345");
		adminLoginPage.clickLogin(logger);
		Thread.sleep(6000);
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
	public void tearDown()
	{
		driver.quit();
	}

}
