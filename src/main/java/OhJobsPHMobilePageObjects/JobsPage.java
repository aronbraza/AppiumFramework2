package OhJobsPHMobilePageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

import resources.base;

public class JobsPage extends base {
	
	public JobsPage(AndroidDriver<WebElement> androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(androidDriver, 30);
	
	
	//page-content infinite-scroll-jobs
	//page-content ng-hide
	@FindBy(className = "preloader")
	private WebElement loading_Icon;
	
	//@FindBy(css = "[class='color-black position ng-binding']")
	@FindBy(className =  "color-black")
	private List<WebElement> jobTitleName_List;
	


	public void findAndClickJob(ExtentTest logger, String jobTitle) throws InterruptedException
	{
	
		//Thread.sleep(10000);
		//waitForElement(driver, jobTitleName_List.get(0));
		appiumWait().until(ExpectedConditions.invisibilityOf(loading_Icon));
		for(int i=0; i<jobTitleName_List.size(); i++)
		{
			if(jobTitleName_List.get(i).getText().equalsIgnoreCase(jobTitle))
			{
				
				jobTitleName_List.get(i).click();
				logger.log(LogStatus.INFO, "<b>"+jobTitle+"</b> has been clicked.");
				break;
			}
		}
		
	}
	
		
}


