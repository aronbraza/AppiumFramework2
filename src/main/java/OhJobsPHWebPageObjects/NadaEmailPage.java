package OhJobsPHWebPageObjects;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
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
	
	@FindBy(className = "msg_item")
	private List<WebElement> message_List;
	
	@FindBy(className = "button")
	private WebElement ohJobsLoginAs_Button;
	
	@FindBy(id = "idIframe")
	private WebElement iframe;
	
	public void clickAddInbox()
	{
		addInbox_Menu.click();
	}
	
	public void setName(String userName)
	{
		name_Textbox.clear();
		name_Textbox.sendKeys(userName);
	}
	
	public void setDomain(String domain)
	{
		Select select = new Select(domain_Dropdown);
		select.selectByVisibleText(domain);
	}
	
	public void clickAccept() 
	{
		accept_Button.click();
	}
	
	public void findAndClickTemEmail(String emailAddress)
	{
		for(int i=0; i<temp_Email.size(); i++)
		{
			if(temp_Email.get(i).getText().contains(emailAddress))
			{
				temp_Email.get(i).click();
				break;
			}
		}
	}
	
	public void findAndClickMessage(String message)
	{
		
		wait.until(ExpectedConditions.visibilityOfAllElements(message_List));
		for(int i=0; i<message_List.size(); i++)
		{
			if(message_List.get(i).getText().contains(message))
			{
				message_List.get(i).click();
				break;
			}
		}
	}
	
	public void clickLoginAs()
	{
		driver.switchTo().frame(iframe);
		ohJobsLoginAs_Button.click();
		driver.switchTo().defaultContent();

	}
}
