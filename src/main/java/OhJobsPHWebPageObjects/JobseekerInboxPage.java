package OhJobsPHWebPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;

public class JobseekerInboxPage extends base {

	public JobseekerInboxPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "employer-name")
	private List<WebElement> employerContact_List;
	
	@FindBy(className = "main-message")
	private List<WebElement> employerMessage_List;
	
	@FindBy(className = "user-message")
	private List<WebElement> userMessage_List;
	
	@FindBy(css = "[class*='msg-text-area']")
	private WebElement message_Textbox;
	
	@FindBy(id = "send-msg")
	private WebElement send_Icon;
	
	
	public void findAndClickEmployer(ExtentTest logger, String employerName)
	{
		for(int i=0; i<employerContact_List.size(); i++)
		{
			if(employerContact_List.get(i).getText().equalsIgnoreCase(employerName))
			{
				employerContact_List.get(i).click();
				logger.log(LogStatus.INFO, "<b>"+employerName+"</b> has been clicked on the employer list.");
				break;
			}
		}
	}
	
	public void setMessage(ExtentTest logger, String message)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(message_Textbox));
		message_Textbox.sendKeys(message);
		logger.log(LogStatus.INFO, "<b>"+message+"</b> has been entered on the Message field.");
	}
	
	public void clickSend(ExtentTest logger)
	{
		send_Icon.click();
	}
	
}
