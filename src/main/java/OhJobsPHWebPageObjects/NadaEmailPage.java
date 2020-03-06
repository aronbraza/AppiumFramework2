package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.mail.handlers.image_gif;

import resources.base;

public class NadaEmailPage extends base {
	
	public NadaEmailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@FindBy(className = "icon-plus")
	private WebElement addInbox_Menu;
	
	@FindBy(className = "user_name")
	private WebElement name_Textbox;
	
	@FindBy(id = "domain")
	private WebElement domain_Dropdown;
	
	@FindBy(css = "[class*='success']")
	private WebElement accept_Button;
	
	@FindBy(css =  "[class='']")
	private List<WebElement> temp_Email;
	
	@FindBy(className = "waiting") 
	private WebElement waiting;
	
	@FindBy(className = "panel-body")
	private WebElement body;
	
	@FindBy(className = "msg_list")
	private WebElement messageList;
	
	@FindBy(className = "msg_item")
	private List<WebElement> messageItem_List;
	
	@FindBy(className = "button")
	private WebElement ohJobsLoginAs_Button;
	
	@FindBy(id = "idIframe")
	private WebElement iframe;
	
	public void clickAddInbox()
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(addInbox_Menu));
		addInbox_Menu.click();
	}
	
	public void setName(String userName)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(name_Textbox));
		name_Textbox.sendKeys(Keys.chord(Keys.CONTROL+"a"+Keys.DELETE));
		name_Textbox.sendKeys(userName);
	}
	
	public void setDomain(String domain)
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(domain_Dropdown));
		Select select = new Select(domain_Dropdown);
		select.selectByVisibleText(domain);
	}
	
	public void clickAccept() 
	{
		webDriverWait().until(ExpectedConditions.visibilityOf(accept_Button));
		accept_Button.click();
	}
	
	public void findAndClickTempEmail(String emailAddress)
	{
		webDriverWait().until(ExpectedConditions.visibilityOfAllElements(temp_Email));
		for(int i=0; i<temp_Email.size(); i++)
		{
			if(temp_Email.get(i).getText().contains(emailAddress))
			{
				temp_Email.get(i).click();
				break;
			}
		}
	}
	
	public void findAndClickMessage(ExtentTest logger, String message) throws InterruptedException
	{
		Thread.sleep(5000);

		//webDriverWait().until(ExpectedConditions.visibilityOfAllElements(messageItem_List));
	
		
		for(int i=0; i<messageItem_List.size(); i++)
		{
			if(messageItem_List.get(i).getText().contains(message))
			{
				messageItem_List.get(i).click();
				break;
			}
			logger.log(LogStatus.INFO, messageItem_List.get(i).getText()+" has been clicked.");
			
		}
	}

	public void clickLoginAs(ExtentTest logger)
	{
		driver.switchTo().frame(iframe);
		ohJobsLoginAs_Button.click();
		System.out.println("Clicked on Login As");
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO, "Email verification button has been clicked.");

	}
}
