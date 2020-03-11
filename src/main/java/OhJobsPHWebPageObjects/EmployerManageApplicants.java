package OhJobsPHWebPageObjects;

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

public class EmployerManageApplicants extends base {
	
	public EmployerManageApplicants(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[class*='employer-applicants-actions']")
	private List<WebElement> applicantName_List;
	
	@FindBy(css = "[class*='employer-view-application']")
	private List<WebElement> viewApplication_Button;
	
	@FindBy(className = "employer-app-value")
	private List<WebElement> applyingFor_Text;
	
	@FindBy(className = "employer-view-app-value")
	private List<WebElement> applyingViewFor_Text;
	
	@FindBy(id = "view-application-approve")
	private WebElement approve_Button;
	
	@FindBy(id =  "view-application-reject")
	private WebElement decline_Button;
	
	@FindBy(id = "view-application-delete")
	private WebElement delete_Button;
	
	@FindBy(id = "application-textarea-message")
	private List<WebElement> message_Textbox;
	
	@FindBy(id = "submit-application-message")
	private WebElement submit_Button;
	
	@FindBy(id = "open-private-message-btn")
	private WebElement sendMessage_Button;
	
	@FindBy(id = "private-message-textarea")
	private WebElement sendMessageToJobseeker_Textbox;

	@FindBy(id = "send-private-message-button")
	private WebElement send_Button;
	
	@FindBy(id = "view-application-hire")
	private WebElement hire_Button;
	
	
	
	public WebElement getVisibleMessageTextbox(List<WebElement> messageTextbox_List)
	{
		WebElement ele = null;
		
		
		for(WebElement elements: messageTextbox_List)
		{
			if(elements.isDisplayed())
			{
				 ele = elements;
			}
		}
		return ele;
		
	}
	public void approveJobseekserApplication(ExtentTest logger ,String applicantName, String message) throws InterruptedException 
	{
		for(int i=0; i<applicantName_List.size(); i++)
		{
			if(applicantName_List.get(i).getText().contains(applicantName))
			{
				System.out.println(applicantName_List.get(i).getText());
				viewApplication_Button.get(i).click();
				approve_Button.click();
				setApprove(logger ,message);
				submit_Button.click();
				logger.log(LogStatus.INFO, "<b>"+applicantName+"</b> has been approved for the <b>"+applyingViewFor_Text.get(0).getText()+"</b> position.");
				break;
			}
		}
	}
	
	public void setApprove(ExtentTest logger, String message) throws InterruptedException 
	{
		Utilities utilities = new Utilities(driver);
		String employerMessage = utilities.getVisibleElement(message_Textbox).getText();
		utilities.getVisibleElement(message_Textbox).clear();
		utilities.getVisibleElement(message_Textbox).sendKeys(employerMessage.replace("< Employer Message >", message));
		logger.log(LogStatus.INFO, "<b>"+message+"</b> has been entered on the Message field.");
	}
	
	public void clickSendMessage(ExtentTest logger)
	{
		sendMessage_Button.click();
		logger.log(LogStatus.INFO, "<b>Send Message</b> button has been clicked.");
	}
	
	public void setSendMessageToJobseeker(ExtentTest logger, String message)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(sendMessageToJobseeker_Textbox));
		sendMessageToJobseeker_Textbox.sendKeys(message);
		logger.log(LogStatus.INFO, "<b>"+message+"</b> has been entered on the Message field (Send Message to Jobseeker).");
	}
	
	public void clickSend(ExtentTest logger)
	{
		send_Button.click();
		logger.log(LogStatus.INFO, "<b>Send</b> button has been clicked.");
	}
}
