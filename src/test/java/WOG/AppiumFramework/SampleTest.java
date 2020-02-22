package WOG.AppiumFramework;

import java.io.IOException;

import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import OhJobsPHMobilePageObjects.HomePage;
import OhJobsPHMobilePageObjects.JobsPage;
import OhJobsPHMobilePageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SampleTest extends base {
	
	@BeforeTest
	public void Sample() throws IOException, InterruptedException
	{
		base base = new base();
		base.KillNode();
	}
	
	@Test
	public void Test() throws IOException, InterruptedException
	{
		
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities();
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		JobsPage jobsPage = new JobsPage(driver);
		
		homePage.login_Button.click();
		loginPage.username_Textbox.sendKeys("aronbraza");
		loginPage.password_Textbox.sendKeys("Wog123456");
		loginPage.login_Button.click();
		homePage.menu_Icon.click();
		homePage.jobs_Menu.click();
		jobsPage.getJobList();
		service.stop();
		
	}
	
	@Test
	public void Test2() throws IOException, InterruptedException
	{
		service = startServer();
		AndroidDriver<AndroidElement> driver = Capabilities();
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.login_Button.click();
		loginPage.username_Textbox.sendKeys("wog.aronbraza@gmail.com");
		loginPage.password_Textbox.sendKeys("Wo123");
		loginPage.login_Button.click();
		System.out.println(loginPage.ToastMessage.getText());
		service.stop();
	}
	
	

}
