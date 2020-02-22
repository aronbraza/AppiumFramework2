package WOG.AppiumFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {
	
	public static AndroidDriver<AndroidElement>  driver;
	 public static AppiumDriverLocalService service;
	
	public void KillNode() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);	
	}
	
	public static void getScreenshot(String s) throws IOException
	{
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(scrfile, new File(System.getProperty("user.dir")+"\\"+s+".png"));
		
	}

	 
	public AppiumDriverLocalService startServer()
	{

		boolean flag = checkIfServerIsRunnning(4723);
		if(!flag)
		{
		
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		}
		return service;
		
	}
	
	public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {

			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
	public static void startEmulator() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator.bat");
		Thread.sleep(100000);
	}
	
	public static AndroidDriver<AndroidElement> Capabilities() throws IOException, InterruptedException {

		InputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\WOG\\AppiumFramework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		File appDir = new File("src");
		//File app = new File(appDir, (String) prop.get(appName));
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String device=(String) prop.get("device");
		//String device = System.getProperty("deviceName");
		if(device.contains("Nexus"))
		{
		  startEmulator();
		}
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");;
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		capabilities.setCapability("appPackage", "com.WebOutsourcingGatewayInc.ohjobsph");
		capabilities.setCapability("appActivity", "com.WebOutsourcingGatewayInc.ohjobsph.MainActivity");
		capabilities.setCapability("autoGrantPermissions", true);
		//capabilities.setCapability("unicodeKeyboard", true);
		//capabilities.setCapability("resetKeyboard", true);
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	    Set<String> contextNames = driver.getContextHandles();
	    for (String contextName : contextNames) 
	    {
	        System.out.println(contextName);
	        if (contextName.contains("WEBVIEW"))
	        {
	            driver.context(contextName);
	        }
	    }
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	

	
	

}
