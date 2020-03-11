package OhJobsPHWebPageObjects;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;import com.aventstack.extentreports.gherkin.model.IGherkinFormatterModel;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;

public class EmployerProfilePage extends base {
	
	public EmployerProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "employer-view-profile-name")
	private WebElement employerName_Text;
	
	@FindBy(xpath = "//*[text()[contains(.,'Saving changes')]]")
	//@FindBy(xpath = "//div[@class='success msg' and contains(text(),'Saving changes')]")
	private WebElement savingChanges_Text;
	
	
	@FindBy(className = "employer-edit-profile-btn")
	private WebElement editProfile_Button;
	
	@FindBy(id = "representative")
	private WebElement representative_Textbox;
	
	@FindBy(id = "details")
	private WebElement details_Textbox;
	
	@FindBy(id = "myULTags")
	private WebElement contactDetails1_Textbox;
	
	@FindBy(css = "[class='ui-widget-content ui-autocomplete-input']")
	private WebElement contactDetails_Textbox;
	
	@FindBy(id = "from")
	private WebElement businnessHoursFrom_Dropdown;
	
	@FindBy(id = "to")
	private WebElement businnessHoursTo_Dropdown;
	
	@FindBy(id = "faxno")
	private WebElement faxNumber_Textbox;
	
	@FindBy(id = "website")
	private WebElement website_Textbox;
	
	@FindBy(id = "country")
	private WebElement country_Dropdown;
	
	@FindBy(id = "address")
	private WebElement address_Textbox;
	
	@FindBy(id = "industry")
	private WebElement industry_Dropdown;
	
	@FindBy(css = "[class*='btn-upload']")
	private List<WebElement> chooseFile_Button;
	
	@FindBy(id = "sec-certificate-file")
	private WebElement secFileName;
	
	@FindBy(id = "save-profile")
	private WebElement updateProfile_Button;
	
	public void clickEditProfile(ExtentTest logger)
	{
		editProfile_Button.click();
		logger.log(LogStatus.INFO, "<b>Edit Profile button</b> has been selected.");
	}
	
	
	public void setRepresentative(ExtentTest logger, String representative)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(representative_Textbox));
		representative_Textbox.clear();
		representative_Textbox.sendKeys(representative);
		logger.log(LogStatus.INFO, "<b>"+representative+"</b> has been entered on the Representative field.");
	}
	
	public void setDetails(ExtentTest logger, String details)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(details_Textbox));
		details_Textbox.clear();
		details_Textbox.sendKeys(details);
		logger.log(LogStatus.INFO, "<b>"+details+"</b> has been entered on the Details field.");
	}
	
	public void setContactDetails(ExtentTest logger, String contactDetails)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(contactDetails_Textbox));
		//contactDetails_Textbox.clear();
		contactDetails_Textbox.sendKeys(contactDetails);
		logger.log(LogStatus.INFO, "<b>"+contactDetails+"</b> has been entered on the Contact Details field.");
	}
	
	public void setBusinessHours(ExtentTest logger, String businessHours)
	{
		webDriverWait().until(ExpectedConditions.visibilityOfAllElements(businnessHoursFrom_Dropdown, businnessHoursTo_Dropdown));
		List<String> getBusinnessHours = Arrays.asList(businessHours.split(" - "));
		
		Select selectFrom = new Select(businnessHoursFrom_Dropdown);
		Select selectTo = new Select(businnessHoursTo_Dropdown);
		
		selectFrom.selectByVisibleText(getBusinnessHours.get(0).toString());
		selectTo.selectByVisibleText(getBusinnessHours.get(1).toString());
		logger.log(LogStatus.INFO, "<b>"+getBusinnessHours.toString().replace(",", "-")+"</b> has been selected on the Business Hours field.");
	}
	
	public void setFaxNumber(ExtentTest logger, String faxNumber)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(faxNumber_Textbox));
		faxNumber_Textbox.clear();
		faxNumber_Textbox.sendKeys(faxNumber);
		logger.log(LogStatus.INFO, "<b>"+faxNumber+"</b> has been selected on the FAX Number field.");
	}
	
	public void setWebsite(ExtentTest logger, String website)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(website_Textbox));
		website_Textbox.clear();
		website_Textbox.sendKeys(website);
		logger.log(LogStatus.INFO, "<b>"+website+"</b> has been selected on the Website field.");
	}
	
	public void setCountry(ExtentTest logger, String country)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(country_Dropdown));
		Select select = new Select(country_Dropdown);
		select.selectByVisibleText(country);
		logger.log(LogStatus.INFO, "<b>"+country+"</b> has been selected on the Country field.");
	}
	
	public void setAddress(ExtentTest logger, String address)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(address_Textbox));
		address_Textbox.clear();
		address_Textbox.sendKeys(address+Keys.ARROW_DOWN+Keys.ENTER);
		logger.log(LogStatus.INFO, "<b>"+address+"</b> has been entered on the Address field.");
	}
	
	public void setIndustry(ExtentTest logger, String industry)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(industry_Dropdown));
		Select select = new Select(industry_Dropdown);
		select.selectByVisibleText(industry);
		logger.log(LogStatus.INFO, "<b>"+industry+"</b> has been selected on the Industry field.");
	}
	
	public void uploadSecCertificate(ExtentTest logger) throws IOException, InterruptedException
	{
		
		chooseFile_Button.get(0).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\autoIT script\\uploadSecFile.exe");
		webDriverWait().until(ExpectedConditions.textToBePresentInElement(secFileName, "sec.jpg"));
		//Thread.sleep(5000);
		logger.log(LogStatus.INFO, "<b>"+secFileName.getText()+" </b> has been uploaded on the Sec Cerificate upload field.");
	}
	
	public void clickUpdateProfile(ExtentTest logger)
	{
		updateProfile_Button.click();
		logger.log(LogStatus.INFO, "<b>Update Profile button</b> has been clicked.");
	}
	
	public boolean verifySuccessMessage(String successMessage)
	{
		boolean a=true;
		
		String firstSuccessMessage = webDriverWait().until(ExpectedConditions.visibilityOf(savingChanges_Text)).getText();
		if(firstSuccessMessage.equalsIgnoreCase(successMessage))
		{
			a = true;
			System.out.println(successMessage);
			webDriverWait().until(ExpectedConditions.visibilityOf(employerName_Text));
		}
		return a;
	}
}
