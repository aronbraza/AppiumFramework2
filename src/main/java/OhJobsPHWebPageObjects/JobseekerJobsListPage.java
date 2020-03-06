package OhJobsPHWebPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JobseekerJobsListPage {
	
	public JobseekerJobsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		//Job List Page//
		@FindBy(css = "[class*=\"jobs-list-containers\"]")
		private List<WebElement> job_List;
		
		@FindBy(className = "job-title-link")
		private List<WebElement> jobTitle_List;
		
		@FindBy(className = "[class*=\"nextbutton\"]")
		private WebElement next_Button;
		
		@FindBy(className = "[class*=\"prevbutton\"]")
		private WebElement previous_Button;
		
		
	public void findApprovedJob(ExtentTest logger, String jobName) throws InterruptedException
	{
		for(int i=0; i<job_List.size(); i++)
		{
			if(job_List.get(i).getText().contains(jobName))
			{
				System.out.println(job_List.get(i).getText());
				jobTitle_List.get(i).click();
				logger.log(LogStatus.INFO, "<b>"+jobName+"</b> has been clicked on the Job List page.");
				break;
			}
		}
	}

}
