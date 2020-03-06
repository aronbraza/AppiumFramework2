package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import resources.base;

public class JobseekerSignUpPage extends base  {
	
	public JobseekerSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='alert alert-success' and contains(text(),'Creating your Oh Jobs account')]")
	public List<WebElement> pleaseWait_Text;
	
	@FindBy(xpath = "//div[@class='alert alert-success' and contains(text(),'Your Oh! Jobs PH account has been successfully created')]")
	public List<WebElement> successfullyCreated_Text;
	
	@FindBy(id = "first_name")
	private WebElement firstName_Textbox;
	
	@FindBy(id = "last_name")
	private WebElement lastName_Textbox;
	
	@FindBy(id = "gender")
	private WebElement gender_Dropdown;
	
	@FindBy(name = "date_[month]")
	private WebElement month_Dropdown;
	
	@FindBy(name = "date_[day]")
	private WebElement day_Dropdown;
	
	@FindBy(name = "date_[year]")
	private WebElement year_Dropdown;
	
	@FindBy(id = "email")
	private WebElement emailAddress_Textbox;
	
	@FindBy(id = "username")
	private WebElement userName_Textbox;
	
	@FindBy(id = "password")
	private WebElement passWord_Textbox;
	
	@FindBy(id = "confirm-password")
	private WebElement confirmPassword_Textbox;
	
	@FindBy(id = "read-tc-pp-box")
	private WebElement iAgree_Checkbox;
	
	@FindBy(id = "register")
	private WebElement registerNow_Button;
	
	@FindBy(xpath = "//a[text()='Are you an Employer? Click here to sign up.']")
	private WebElement employerSignUp_Linktext;
	
	
	
	public void setFirstName(ExtentTest logger, String firstName) throws InterruptedException
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(firstName_Textbox));
		firstName_Textbox.clear();
		firstName_Textbox.sendKeys(firstName);
		logger.log(LogStatus.INFO, "<b>"+firstName+"</b> has been entered on the First Name field.");
	}
	
	public void setLastName(ExtentTest logger, String lastName)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(lastName_Textbox));
		lastName_Textbox.clear();
		lastName_Textbox.sendKeys(lastName);
		logger.log(LogStatus.INFO, "<b>"+lastName+"</b> has been entered on the Lirst Name field.");
	}
	
	public void selectGender(ExtentTest logger, String gender)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(gender_Dropdown));
		Select select = new Select(gender_Dropdown);
		select.selectByVisibleText(gender);
		logger.log(LogStatus.INFO, "<b>"+gender+"</b> has been selected on the Gender field.");
	}
	
	public void selectBirthday(ExtentTest logger, String birthday)
	{
		webDriverWait().until(ExpectedConditions.visibilityOfAllElements(month_Dropdown, day_Dropdown, year_Dropdown));
		List<String> getBday = Arrays.asList(birthday.split(","));
		
		Select selectMonth = new Select(month_Dropdown);
		Select selectDay = new Select(day_Dropdown);
		Select selectYear = new Select(year_Dropdown);
		for(int i=0; i<getBday.size(); i++)
		{
			selectMonth.selectByVisibleText(getBday.get(0).toString());
			selectDay.selectByVisibleText(getBday.get(1).toString());
			selectYear.selectByVisibleText(getBday.get(2).toString());
		}
		//selectMonth.selectByVisibleText(month);
		logger.log(LogStatus.INFO, "<b>"+birthday.toString().replaceAll(",", "/")+"</b> has been selected on the Birthday field.");
	}
	
	
	public void setEmailAddress(ExtentTest logger, String emailAddress)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(emailAddress_Textbox));
		emailAddress_Textbox.clear();
		emailAddress_Textbox.sendKeys(emailAddress);
		logger.log(LogStatus.INFO, "<b>"+emailAddress+"</b> has been entered on the Email Address field.");
	}
	
	public void setUsername(ExtentTest logger, String userName)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(userName_Textbox));
		userName_Textbox.clear();
		userName_Textbox.sendKeys(userName);
		logger.log(LogStatus.INFO, "<b>"+userName+"</b> has been entered on the Username field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(passWord_Textbox));
		passWord_Textbox.clear();
		passWord_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}

	public void setConfirmPassword(ExtentTest logger, String confirmPassword)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(confirmPassword_Textbox));
		confirmPassword_Textbox.clear();
		confirmPassword_Textbox.sendKeys(confirmPassword);
		logger.log(LogStatus.INFO, "<b>"+confirmPassword+"</b> has been entered on the Confirm Password field.");
	}
	
	public void clickIAgree(ExtentTest logger)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(iAgree_Checkbox));
		iAgree_Checkbox.click();
		logger.log(LogStatus.INFO, "<b>I agree to the Privacy Policy and Term of Use checkbox</b> has been clicked.");
	}
	
	public void clickRegisterNow(ExtentTest logger)
	{
		
		webDriverWait().until(ExpectedConditions.visibilityOf(registerNow_Button));
		registerNow_Button.click();
		logger.log(LogStatus.INFO, "<b>Register Now button</b> has been clicked.");
	}
	
	public void clickEmployerSignUp(ExtentTest logger)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(employerSignUp_Linktext));
		employerSignUp_Linktext.click();
		logger.log(LogStatus.INFO, "<b>Are you an Employer? Click here to sign up.</b> link text has been clicked.");
	}

	
	//VERIFICATION//
	
	public boolean verifySuccessMessage(String message)
	{
		String firstMessage = pleaseWait_Text.get(1).getText().replace("×"+"\n", "");
		String secondMessage = successfullyCreated_Text.get(1).getText().replace("×"+"\n", "");
		System.out.println(firstMessage);
		System.out.println(secondMessage);
		boolean a= false;
		
		List<String> successMessage = Arrays.asList(message.split(","));
		
		
		for(int i=0; i<successMessage.size(); i++)
		{
			
			if(firstMessage.equalsIgnoreCase(successMessage.get(0).toString()) && secondMessage.equalsIgnoreCase(successMessage.get(1).toString()))
			{
				a = true;
				System.out.println(successMessage.get(i));
			}
			
		}
		return a;
	}
}
