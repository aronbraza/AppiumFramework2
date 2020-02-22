package ExcelTestData;

import org.testng.annotations.DataProvider;

public class LoginTestData {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	
	
	@DataProvider (name = "Login_0001")
	  public Object[][] Login_0001() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0001";
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	@DataProvider(name = "Login_0002")
	  public Object[][] Login_0002() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0002";		 			
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	@DataProvider(name = "Login_0003")
	  public Object[][] Login_0003() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0003";		 			
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	@DataProvider(name = "Login_0004")
	  public Object[][] Login_0004() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0004";		 			
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	@DataProvider(name = "Login_0005")
	  public Object[][] Login_0005() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0005";		 			
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	@DataProvider(name = "Login_0006")
	  public Object[][] Login_0006() throws Exception{

		 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data");
		 	sTestCaseName = "Login_0006";		 			
		  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
		    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Login Test Data",iTestCaseRow);

		    	return (testObjArray);

			}
	
	

}
