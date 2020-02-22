package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class JobseekerJobDetailsPage {
	
	public JobseekerJobDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "main-job-title")
	private WebElement jobTitle_Text;
	
	@FindBy(css  = "td:nth-child(2)")
	private List<WebElement> tableJobDetails_Text;
	
	@FindBy(className = "main-desc-content")
	private List<WebElement> mainContent_Text;
	
	

	
	
	
	public boolean verifyJobTitle(String jobTitle)
	{
		boolean a = false;
		
		if(jobTitle_Text.getText().equalsIgnoreCase(jobTitle))
		{
			a = true;
			System.out.println(jobTitle_Text.getText());
		}
		return a;
	}
	
	public boolean getLocation(ExtentTest logger ,String jobLocation, String educationalLevel, String yearsOfExperience, String salary, String jobTtype)
	{
		boolean a = false;
		
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobLocation, educationalLevel, yearsOfExperience, salary, jobTtype));
		
		for(int i=0; i<tableJobDetails_Text.size(); i++)
		{
			for(int j=0; j<data.size(); j++)
			{
				if(tableJobDetails_Text.get(i).getText().contains(data.get(j).toString()))
				{
					a = true;
					System.out.println(tableJobDetails_Text.get(i).getText());
					logger.log(LogStatus.INFO, "<b>"+data.get(i).toString()+"</b> is present on the Job Details page.");
					break;
				}
			}
		}
		return a;

	}
	
	public boolean getMainContent(ExtentTest logger ,String jobAddress, String jobDetails, String requiredSkills )
	{
		boolean a = false;
		
		List<String> data = new ArrayList<String>();
		data.addAll(Arrays.asList(jobAddress, jobDetails, requiredSkills));
		
		for(int i=0; i<mainContent_Text.size(); i++)
		{
			for(int j= 0; j<data.size(); j++)
			{
				if(mainContent_Text.get(i).getText().equalsIgnoreCase(data.get(j).toString()))
				{					
					a = true;
					System.out.println(mainContent_Text.get(i).getText());
					logger.log(LogStatus.INFO, "<b>"+data.get(i).toString()+"</b> is present on the Job Details page.");
					break;
				}
			}
		}
		return a;
	}
	
	

}
