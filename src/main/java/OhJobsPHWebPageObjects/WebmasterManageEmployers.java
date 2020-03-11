package OhJobsPHWebPageObjects;

import java.util.List;

import javax.swing.text.View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebmasterManageEmployers {
	
	public WebmasterManageEmployers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[class*='ME-']")
	private List<WebElement> employer_List;
	
	@FindBy(css = "[class*='master-view-employer-btn']")
	private List<WebElement> viewEmployer_Button;
	
	@FindBy(id = "approve_certificate")
	private WebElement approve_Button;
	

	public void approvedSupportingDocuments(ExtentTest logger, String employerName)
	{
		for(int i=0; i<employer_List.size(); i++)
		{
			if(employer_List.get(i).getText().contains(employerName))
			{
				viewEmployer_Button.get(i).click();
				logger.log(LogStatus.INFO, "<b>View Employer button</b> has been clicked.");
				approve_Button.click();
				logger.log(LogStatus.INFO, "<b>Approve button</b> has been clicked. The supporting document of the employer has been approved.");
				break;
			}
		}
	}
	
}
