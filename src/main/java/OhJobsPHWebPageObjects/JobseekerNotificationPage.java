package OhJobsPHWebPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JobseekerNotificationPage {
	
	public JobseekerNotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[href*='employer-profile'] strong")
	private WebElement employerName_Text;
	
	@FindBy(css = "[class*='notif-content']")
	private List<WebElement> notification_List;
	
	public void getApprovedJobApplicationNotif(ExtentTest logger, String jobTitle)
	{
		for(int i=0; i<notification_List.size(); i++)
		{
			if(notification_List.get(i).getText().contains("approved your Job Application for "+"\""+jobTitle+"\""+"."))
			{
				System.out.println(notification_List.get(i).getText());
				logger.log(LogStatus.INFO, "<b>"+notification_List.get(i).getText()+"</b>");
				break;
			}
		}
	}

}
