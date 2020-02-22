package OhJobsPHWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EmployerSignUpPage {
	
	public EmployerSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[class*='alert-success']")
	private WebElement successMessage_Text;
	
	@FindBy(xpath = "//*[text()[contains(.,'Please wait')]]")
	private WebElement successMessage1_Text;
	
	@FindBy(xpath = "//*[text()[contains(.,'Your information has been registered.')]]")
	private WebElement successMessage2_Text;
	
	@FindBy(name = "emp-name")
	private WebElement employerName_Textbox;
	
	@FindBy(name = "emp-type")
	private WebElement employerType_Dropdown;
	
	@FindBy(name = "emp-industry")
	private WebElement employerIndustry_Dropdown;
	
	@FindBy(name = "emp-representative")
	private WebElement representative_Textbox;
	
	@FindBy(name = "emp-country")
	private WebElement country_Dropdown;
	
	@FindBy(name = "emp-address")
	private WebElement address_Textbox;
	
	@FindBy(name = "emp-email")
	private WebElement emailAddress_Textbox;
	
	@FindBy(name = "emp-password")
	private WebElement password_Textbox;
	
	@FindBy(name = "emp-conf-password")
	private WebElement confirmPassword_Textbox;
	
	@FindBy(id = "read-tc-pp-box-employer")
	private WebElement iAgree_Checkbox;
	
	@FindBy(css = "[class*='employer-sign-up-btn']")
	private WebElement signUp_Button;
	
	@FindBy(className = "link-to-emp-login")
	private WebElement clickHereToLogin_Linktext;
	
	public void setEmployerName(ExtentTest logger, String employerName)
	{
		employerName_Textbox.clear();
		employerName_Textbox.sendKeys(employerName);
		logger.log(LogStatus.INFO, "<b>"+employerName+"</b> has been entered on the Employer Name field.");
	}
	
	public void setEmployerType(ExtentTest logger, String employerType)
	{
		Select select = new Select(employerType_Dropdown);
		select.selectByVisibleText(employerType);
		logger.log(LogStatus.INFO, "<b>"+employerType+"</b> has been selected on the Employer Type field.");
	}
	
	public void setEmployerIndustry(ExtentTest logger, String employerIndustry)
	{
		Select select = new Select(employerIndustry_Dropdown);
		select.selectByVisibleText(employerIndustry);
		logger.log(LogStatus.INFO, "<b>"+employerIndustry+"</b> has been selected on the Employer Industry field.");
	}
	
	public void setRepresentative(ExtentTest logger, String representative)
	{
		representative_Textbox.clear();
		representative_Textbox.sendKeys(representative);
		logger.log(LogStatus.INFO, "<b>"+representative+"</b> has been entered on the Representative field.");
	}
	
	public void setCountry(ExtentTest logger, String country)
	{
		Select select = new Select(country_Dropdown);
		select.selectByVisibleText(country);
		logger.log(LogStatus.INFO, "<b>"+country+"</b> has been selected on the Country field.");
	}
	
	public void setAddress(ExtentTest logger, String address)
	{
		address_Textbox.clear();
		address_Textbox.sendKeys(address);
		logger.log(LogStatus.INFO, "<b>"+address+"</b> has been entered on the Address field.");
	}
	
	public void setEmailAddress(ExtentTest logger, String emailAddress)
	{
		emailAddress_Textbox.clear();
		emailAddress_Textbox.sendKeys(emailAddress);
		logger.log(LogStatus.INFO, "<b>"+emailAddress+"</b> has been entered on the Email Address field.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
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
	
	public void clickSignUp(ExtentTest logger)
	{
		signUp_Button.click();
		logger.log(LogStatus.INFO, "<b>SIGN UP button</b> has been clicked.");
	}
	
	public void clickHereToLogin(ExtentTest logger)
	{
		clickHereToLogin_Linktext.click();
		logger.log(LogStatus.INFO, "<b>Already have an account? Click here to login link text</b> has been clicked.");
	}

}
