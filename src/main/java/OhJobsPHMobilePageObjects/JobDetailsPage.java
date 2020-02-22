package OhJobsPHMobilePageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import resources.base;

public class JobDetailsPage extends base {
	
	public JobDetailsPage(AndroidDriver<WebElement> androidDriver)
	{
		PageFactory.initElements(androidDriver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(androidDriver, 60);
	
	//page-content infinite-scroll-jobs
	//@FindBy(className = "preloader")
	@FindBy(xpath = "//div[@class='page-content infinite-scroll-jobs active-state']")
	private WebElement loading_Icon;
	
	@FindBy(className = "bookmark")
	private WebElement saveJob_Icon;
	
	@FindBy(className = "my-jobs")
	private WebElement jobDetails_Text;
	
	@FindBy(css = "[class*='details add-ons']")
	private List<WebElement> jd;
	
	public void getJD() throws InterruptedException
	{
		Thread.sleep(10000);
		for(int i=0; i<jd.size(); i++)
		{
			System.out.println(jd.get(i).getText());
		}
	}

}
