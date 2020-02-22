package ExcelTestData;

import org.testng.annotations.DataProvider;

public class ProfileTestData {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	
	@DataProvider (name = "Profile_0001")
	public Object[][] Profile_0001() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","ChangeProfile Picture Test Data");
	 	sTestCaseName = "Profile_0001";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "ChangeProfile Picture Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0002")
	public Object[][] Profile_0002() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0002";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Profile_0003")
	public Object[][] Profile_0003() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0003";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Profile_0004")
	public Object[][] Profile_0004() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0004";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0005")
	public Object[][] Profile_0005() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0005";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0006")
	public Object[][] Profile_0006() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0006";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0007")
	public Object[][] Profile_0007() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Profile_0007";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0013")
	public Object[][] Profile_0013() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Profile_0013";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0014")
	public Object[][] Profile_0014() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Profile_0014";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0030")
	public Object[][] Profile_0030() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Personal Information Test Data");
	 	sTestCaseName = "Profile_0030";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Personal Information Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Profile_0031")
	public Object[][] Profile_0031() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Contact Information Test Data");
	 	sTestCaseName = "Profile_0031";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Contact Information Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0032")
	public Object[][] Profile_0032() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Educational Attainment TestData");
	 	sTestCaseName = "Profile_0032";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Educational Attainment TestData",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0033")
	public Object[][] Profile_0033() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Educational Attainment TestData");
	 	sTestCaseName = "Profile_0033";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Educational Attainment TestData",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0034")
	public Object[][] Profile_0034() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Educational Attainment TestData");
	 	sTestCaseName = "Profile_0034";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Educational Attainment TestData",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0035")
	public Object[][] Profile_0035() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Professional Info Test Data");
	 	sTestCaseName = "Profile_0035";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Professional Info Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0036")
	public Object[][] Profile_0036() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Professional Info Test Data");
	 	sTestCaseName = "Profile_0036";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Professional Info Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0037")
	public Object[][] Profile_0037() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Professional Info Test Data");
	 	sTestCaseName = "Profile_0037";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Professional Info Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0038")
	public Object[][] Profile_0038() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Filter Files Test Data");
	 	sTestCaseName = "Profile_0038";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Filter Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0039")
	public Object[][] Profile_0039() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Filter Files Test Data");
	 	sTestCaseName = "Profile_0039";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Filter Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0040")
	public Object[][] Profile_0040() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Filter Files Test Data");
	 	sTestCaseName = "Profile_0040";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Filter Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}

	@DataProvider (name = "Profile_0041")
	public Object[][] Profile_0041() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Filter Files Test Data");
	 	sTestCaseName = "Profile_0041";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Filter Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0042")
	public Object[][] Profile_0042() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Filter Files Test Data");
	 	sTestCaseName = "Profile_0042";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Filter Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Profile_0043")
	public Object[][] Profile_0043() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Files Test Data");
	 	sTestCaseName = "Profile_0042";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Files Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0044")
	public Object[][] Profile_0044() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Rename File Test Data");
	 	sTestCaseName = "Profile_0044";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Rename File Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0045")
	public Object[][] Profile_0045() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Download File Test Data");
	 	sTestCaseName = "Profile_0045";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Download File Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0046")
	public Object[][] Profile_0046() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Share File Via Link Test Data");
	 	sTestCaseName = "Profile_0046";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Share File Via Link Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0047")
	public Object[][] Profile_0047() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Share File Via Email Test Data");
	 	sTestCaseName = "Profile_0047";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Share File Via Email Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0048")
	public Object[][] Profile_0048() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Delete File Test Data");
	 	sTestCaseName = "Profile_0048";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Delete File Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	
	

}
