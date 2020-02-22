package OhJobsPHWebPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailPage {
	
	public GmailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[type='email']")
	private WebElement emailOrPhone_Textbox;
	
	@FindBy(css = "[id*=Next]")
	private WebElement next_Button;
	
	@FindBy(css = "[type='password']")
	private WebElement password_Textbox;
	
	@FindBy(css = "table [class*='zA']")
	private List<WebElement> email_List;
	
	
	public void setEmailOrPhone(ExtentTest logger, String emailOrPhone)
	{
		emailOrPhone_Textbox.clear();
		emailOrPhone_Textbox.sendKeys(emailOrPhone);
		logger.log(LogStatus.INFO, "<b>"+emailOrPhone+"</b> has been entered on the Email or Phone field.");
	}
	
	public void clickNext(ExtentTest logger)
	{
		next_Button.click();
		logger.log(LogStatus.INFO, "<b>Next button</b> has been clicked.");
	}
	
	public void setPassword(ExtentTest logger, String password)
	{
		password_Textbox.clear();
		password_Textbox.sendKeys(password);
		logger.log(LogStatus.INFO, "<b>"+password+"</b> has been entered on the Password field.");
	}
	
	public void findAndClickOhJobsPHEmployer(ExtentTest logger, String emailName)
	{
		for(int i=0; i<email_List.size(); i++)
		{
			if(email_List.get(i).getText().contains(emailName))
			{
				email_List.get(i).click();
				logger.log(LogStatus.INFO, "<b>"+emailName+"</b> has been clicked.");
				break;
			}
		}
	}

}
