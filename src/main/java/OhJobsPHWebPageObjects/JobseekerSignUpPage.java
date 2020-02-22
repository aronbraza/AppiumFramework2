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
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	
	
	@FindBy(xpath = "//span[contains(., 'Creating your Oh Jobs account')]")
	public WebElement pleaseWait_Text;
	
	
	@FindBy(xpath = "//span[contains(., 'Your Oh! Jobs PH account has been successfully created')]")
	public WebElement successfullyCreated_Text;
	
	@FindBy(css = "[class*='alert alert-success']")
	//@FindBy(xpath = "//*[text()[contains(.,'Creating your Oh Jobs account')]]")
	public WebElement success;
	
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
	
	
	
	public void setFirstName(ExtentTest logger, String firstName) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(firstName_Textbox)).clear();
		//firstName_Textbox.clear();
		firstName_Textbox.sendKeys(firstName);
		logger.log(LogStatus.INFO, "<b>"+firstName+"</b> has been entered on the First Name field.");
	}
	
	public void setLastName(ExtentTest logger, String lastName)
	{
		lastName_Textbox.clear();
		lastName_Textbox.sendKeys(lastName);
		logger.log(LogStatus.INFO, "<b>"+lastName+"</b> has been entered on the Lirst Name field.");
	}
	
	public void selectGender(ExtentTest logger, String gender)
	{
		Select select = new Select(gender_Dropdown);
		select.selectByVisibleText(gender);
		logger.log(LogStatus.INFO, "<b>"+gender+"</b> has been selected on the Gender field.");
	}
	
	public void selectBirthday(ExtentTest logger, String birthday)
	{
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
	
	public void selectDay(ExtentTest logger, String day)
	{
		Select select = new Select(day_Dropdown);
		select.selectByVisibleText(day);
		logger.log(LogStatus.INFO, "<b>"+day+"</b> has been selected on the Day field.");
	}
	
	public void selectYear(ExtentTest logger, String year)
	{
		Select select = new Select(year_Dropdown);
		select.selectByVisibleText(year);
		logger.log(LogStatus.INFO, "<b>"+year+"</b> has been selected on the Year field.");
	}
	
	public void setEmailAddress(ExtentTest logger, String emailAddress)
	{
		emailAddress_Textbox.clear();
		emailAddress_Textbox.sendKeys(emailAddress);
		logger.log(LogStatus.INFO, "<b>"+emailAddress+"</b> has been entered on the Email Address field.");
	}
	
	public void setUsername(ExtentTest logger, String userName)
	{
		userName_Textbox.clear();
		userName_Textbox.sendKeys(userName);
		logger.log(LogStatus.INFO, "<b>"+userName+"</b> has been entered on the Username field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		passWord_Textbox.clear();
		passWord_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}

	public void setConfirmPassword(ExtentTest logger, String confirmPassword)
	{
		confirmPassword_Textbox.clear();
		confirmPassword_Textbox.sendKeys(confirmPassword);
		logger.log(LogStatus.INFO, "<b>"+confirmPassword+"</b> has been entered on the Confirm Password field.");
	}
	
	public void clickIAgree(ExtentTest logger)
	{
		iAgree_Checkbox.click();
		logger.log(LogStatus.INFO, "<b>I agree to the Privacy Policy and Term of Use checkbox</b> has been clicked.");
	}
	
	public void clickRegisterNow(ExtentTest logger)
	{
		registerNow_Button.click();
		logger.log(LogStatus.INFO, "<b>Register Now button</b> has been clicked.");
	}
	
	
	//VERIFICATION//
	
	public boolean verifySuccessMessage(String message)
	{
		String firstMessage = pleaseWait_Text.getText();
		String secondMessage = successfullyCreated_Text.getText();
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
