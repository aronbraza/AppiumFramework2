package resources;

import static resources.base.currentPath;
import static resources.base.suiteFolderPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {
	
	
	
	
	// Variables for taking Data from Excel
		public Map<String, Map<String, String>> inputData;
		private Xls_Reader xl;
		private int startRow = 1;
		private int headerRow = 1;
		private int endRow = 2;
	
	
	public static WebDriver driver;
	public Properties prop;
	
	public ExtentReports extent;
	public DateFormat dateFormat;
	public Date date;
	static String currentPath = "";
	static String suiteFolderPath = "";
	
	// Constructor
	public base() {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd hh_mm_ss a");

		// Current Project Path
		currentPath = System.getProperty("user.dir");

		// Creating Map object for storing the Excel data
		inputData = new HashMap<String, Map<String, String>>();

		// Initialize Browser class
		
	}
	
	public void getinputsheetname(String inputsheet) {
		xl = new Xls_Reader(currentPath + "\\Test Data\\" + inputsheet);
	}
	
	/**
	 * This method for displaying inputData map values
	 * 
	 * @param testcaseName
	 */
	public void printMap(String testcaseName) {
		System.out.println("*************************************** " + testcaseName
				+ "  test case INPUT DATA *************************************** ");

		for (Map.Entry entry : inputData.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
			System.out.println();
		}

		System.out.println("*************************************** " + testcaseName
				+ "  test case INPUT DATA *************************************** ");
	}
	
	public void getInputDataFromExcel(String testcaseName) {
		System.out.println("----------------- This is " + testcaseName + " Data Info -----------------");
		int rowCount = xl.getRowCount("Testdata");
		int colCount = xl.getColumnCount("Testdata");
		System.out.println("rowcount  :" + rowCount + "  colCount  :" + colCount);
		for (int r = 0; r <= rowCount; r++) {

			if (xl.getCellData("Testdata", 0, r).toString().equals(testcaseName)) {
				startRow = r + 1;
				headerRow = r;
				System.out.println("StartRow  : " + startRow);
				break;
			}
		}

		for (int e = startRow; e <= rowCount; e++) {
			if (xl.getCellData("Testdata", 0, e).toString().equals("End")) {
				endRow = e - 1;
				System.out.println("EndRow  :" + endRow);
				break;
			}
		}

		Map<String, String> testCaseValues;

		for (int row = startRow; row <= endRow; row++) {

			testCaseValues = new HashMap<String, String>();

			for (int colValue = 0; colValue < colCount; colValue++) {
				if (!(xl.getCellData("Testdata", colValue, row).isEmpty())) {
					testCaseValues.put(xl.getCellData("Testdata", colValue, headerRow),
							xl.getCellData("Testdata", colValue, row));
				} else {
					testCaseValues.put(xl.getCellData("Testdata", colValue, headerRow),
							xl.getCellData("Testdata", colValue, row));
				}

				inputData.put(xl.getCellData("Testdata", 0, row), testCaseValues);
			}

		}

		System.out.println("Getting input data from  " + "Testdata" + " sheet is SUCCESS");
		System.out.println();
		printMap(testcaseName);
	}
	


	@Parameters({ "inputsheetname" })
	@BeforeTest
	public void setInputSheetName(String testsheetName) {
		getinputsheetname(testsheetName);

		System.out.println("@@@ Test Sheet Name: " + testsheetName);
	}

	@Parameters({ "testcaseName" })
	@BeforeTest
	public void setUp(String testcaseName, ITestContext context) throws IOException {
		// Reading Data from Excel
		getInputDataFromExcel(testcaseName);

		// Getting Test name from XML
		String testName = context.getName();

		// Reports configuration
		reportsConfig(testName);

		System.out.println("@@@ Test Case Name: " + testcaseName);
		System.out.println("@@@ Test  Name: " + testName);

	}


	
	public void reportsConfig(String testName) {
		try {
			// Extent reports creation for every test
			extent = new ExtentReports(
					suiteFolderPath + "//" + testName + "_Report_" + dateFormat.format(date) + ".html",
					NetworkMode.ONLINE);
			extent.addSystemInfo("Selenium Version", "3.14.0");
			extent.addSystemInfo("Environment", " ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	@BeforeSuite
	public void getSuiteName(ITestContext context) {
		String suiteName = context.getCurrentXmlTest().getSuite().getName();

		suiteConfig(suiteName);
		// Print suite Name
		System.out.println("@@@ Suite Name : " + suiteName);
	}
	
	public void suiteConfig(String suiteName) {
		suiteFolderPath = currentPath + "//Reports//" + suiteName + "_" + dateFormat.format(date);
		// Create new Directory for Reports with SuiteName
		new File(suiteFolderPath).mkdir();

	}
	
	
	public WebDriver initializeDriver(ExtentTest logger,String browserName) throws IOException
	{
		// prop = new Properties();
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
			//prop.load(fis);
			
			//String browserName =  System.getProperty("browser");
			//String browserName = prop.getProperty("browser");
			
		try 
		{
			if(browserName.contains("Chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				//Run test in headless mode.
				if(browserName.contains("Headless")) 
				{
					options.addArguments("headless");
				}
				driver = new ChromeDriver(options);
				logger.log(LogStatus.INFO, "<b>Chrome </b>browser is opened.");
			}
			
			else if(browserName.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				logger.log(LogStatus.INFO, "<b>Mozilla </b>browser is opened.");
				
			}
			
			else if(browserName.equals("Internet Explorer"))
			{
				
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "Failed to lunch browser due to <b style='color:red'>" + e.getClass() + "<br>"
					+ e.getMessage() + "</b>");
			return null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void navigateToOhJobsPhAdminPage(ExtentTest logger) throws IOException
	{
		driver = initializeDriver(logger,inputData.get("Oh Jobs PH Test Data").get("Browser").toString());
		//driver.get(inputData.get("Oh Jobs PH Test Data").get("Oh Jobs PH Admin URL").toString());
		//driver.get("http://beta-ohjobsph.ml/admin");
		driver.get("https://mail.google.com");
		logger.log(LogStatus.INFO, "Navigated to <b>"+driver.getTitle()+" </b>");
	}
	
	public void navigateTest(ExtentTest logger) throws IOException
	{
		driver = initializeDriver(logger,inputData.get("Oh Jobs PH Test Data").get("Browser").toString());
		//driver.get("http://beta-ohjobsph.ml/");
		driver.get("https://ohjobs.ph/");
	}
	
	
	
	public void getScreenShotWeb(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshotWeb\\"+result+" Screenshot.png"));
		
	}
	
	
	//APPIUM BASE//
	
	public static AndroidDriver<WebElement>  androidDriver;
	 public static AppiumDriverLocalService service;
	
	public void KillNode() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);	
	}
	
	public static void getScreenshotAppium(String s) throws IOException
	{
		File scrfile = ((TakesScreenshot)androidDriver).getScreenshotAs(OutputType.FILE);
		FileUtil.copyFile(scrfile, new File(System.getProperty("user.dir")+"\\screenshotWeb\\"+s+" Screenshot.png"));
		
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
	
	public static AndroidDriver<WebElement> Capabilities() throws IOException, InterruptedException {

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
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20);
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.WebOutsourcingGatewayInc.ohjobsph");
		capabilities.setCapability("appActivity", "com.WebOutsourcingGatewayInc.ohjobsph.MainActivity");
		capabilities.setCapability("autoGrantPermissions", true);
		//capabilities.setCapability("autoWebview", true);
		//capabilities.setCapability("unicodeKeyboard", true);
		//capabilities.setCapability("resetKeyboard", true);
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	    Set<String> contextNames = androidDriver.getContextHandles();
	    for (String contextName : contextNames) 
	    {
	        System.out.println(contextName);
	        if (contextName.contains("WEBVIEW"))
	        {
	        	androidDriver.context(contextName);
	        }
	    }
	    androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   // androidDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return androidDriver;
	}
	
	public WebDriverWait webDriverWait()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait;
	}

	public WebDriverWait appiumWait()
	{
		WebDriverWait wait = new WebDriverWait(androidDriver, 30);
		return wait;
	}

}
