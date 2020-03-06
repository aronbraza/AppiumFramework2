package OhJobsPHWebPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobseekerNotificationPage {
	
	public JobseekerNotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[href*='employer-profile'] strong")
	private WebElement employerName_Text;
	
	@FindBy(css = "[class*='notif-content']")
	private List<WebElement> notification_List;
	
	public void getApprovedJobApplicationNotif(String jobTitle)
	{
		for(int i=0; i<notification_List.size(); i++)
		{
			if(notification_List.get(i).getText().contains("approved your Job Application for "+"+jobTitle"+"."));
			{
				System.out.println(notification_List.get(i).getText());
				break;
			}
		}
	}

}
