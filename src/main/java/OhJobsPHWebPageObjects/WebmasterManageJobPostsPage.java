package OhJobsPHWebPageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.base;

public class WebmasterManageJobPostsPage extends base {

	
	public WebmasterManageJobPostsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
		//Manage Job Posts//
		@FindBy(xpath = "//*[text()[contains(.,'Sending email')]]")
		public WebElement sendingEmailMessage_Text;
		
		@FindBy(xpath = "//*[text()[contains(.,'You have successfully approved the job.')]]")
		public WebElement approvedJobMessage_Text;
		
		@FindBy(css =  "#notie-alert-outer #notie-alert-inner #notie-alert-content >span")
		private WebElement notificationAlert_Text;
		
		@FindBy(className = "job-post-title")
		private List<WebElement> jobTitle_Text;
		
		@FindBy(css = "[class=\"master-approve-job-post master-approve-job-post-btn\"]")
		private List<WebElement> approve_Button;
		
		@FindBy(className = "ZebraDialog_Button_1")
		private WebElement yes_Button;
		
		@FindBy(className = "ZebraDialog_Button_0")
		private WebElement no_Button;
		
		//Manage Job Posts//
		
	
		
		public void approveJobPost(ExtentTest logger, String jobTitle)
		{
			for(int i=0; i<jobTitle_Text.size(); i++)
			{
				if(jobTitle_Text.get(i).getText().equalsIgnoreCase(jobTitle))
				{
					approve_Button.get(i).click();
					yes_Button.click();
					logger.log(LogStatus.INFO, "<b>"+jobTitle+"</b> has been approved by Webmaster.");
				}
			}
		}
		
		public boolean verifyNotificationOnApprovedJob(String message1)
		{
			boolean a = false;
			List<String>successMessages  = Arrays.asList(message1.split(","));
			
			String firstMessage = wait.until(ExpectedConditions.visibilityOf(sendingEmailMessage_Text)).getText();
			String secondMessage = wait.until(ExpectedConditions.visibilityOf(approvedJobMessage_Text)).getText();
			
			for(int i=0; i<successMessages.size(); i++)
			{
				if(firstMessage.equalsIgnoreCase(successMessages.get(0).toString()) && secondMessage.equalsIgnoreCase(successMessages.get(1).toString()))
				{
					a = true;
					System.out.println(successMessages.get(i).toString());
				}
			}
			
			
			return a;		
		}
}
