package resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Utilities extends base{
	
	public Utilities(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void OpenNewTab(ExtentTest logger, String link) throws InterruptedException
	{
	    ((JavascriptExecutor) driver).executeScript("window.open('"+link+"')");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		logger.log(LogStatus.INFO, "Open a new tab on the browser and navigated to the <b>"+driver.getTitle()+"</b>");
	}
	
	public void switchToNextTab(ExtentTest logger) throws InterruptedException
	{
	    
	    //String winHandleBefore = driver.getWindowHandle();
		Set<String> allTab = driver.getWindowHandles();
		
		//close the other tab
		/* for(String winHandle : driver.getWindowHandles())
		{
			if(winHandle.equals(winHandleBefore))
			{
				driver.switchTo().window(winHandle);
				driver.close();
			}
		}
		//allTab.remove(winHandleBefore);
		*/
		
		for(String winHandle : allTab)
		{
			driver.switchTo().window(winHandle);
		}
		logger.log(LogStatus.INFO, "Switch to the other tab and navigated to the <b>"+driver.getTitle()+"</b>");
		
	}
	
	public void CloseNewTab(ExtentTest logger) throws InterruptedException
	{
		 Set<String> handlesSet = driver.getWindowHandles();
	     List<String> handlesList = new ArrayList<String>(handlesSet);
	     driver.switchTo().window(handlesList.get(1));
	     driver.close();
	     driver.switchTo().window(handlesList.get(0));
	     logger.log(LogStatus.INFO, "Other tab has been closed and back to the <b>"+driver.getTitle()+"</b>"); 		
	}
	
	
	public String ConvertDate(String Date) throws ParseException
	{
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		SimpleDateFormat format2 = new SimpleDateFormat("dd MMMM yyyy HH:mm");
		
		Date date = format1.parse(Date);
		String ConvertStartDate = format2.format(date);
		return ConvertStartDate;
	}
	
	public String ConvertDateToMMMMMyyyyy(String Date) throws ParseException
	{
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		SimpleDateFormat format2 = new SimpleDateFormat("MMMMM yyyy");
		
		Date date = format1.parse(Date);
		String ConvertStartDate = format2.format(date);
		return ConvertStartDate;
		
	}

}
