package ExcelTestData;



import org.testng.annotations.DataProvider;

public class HomeTestDataStatus {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	
	@DataProvider (name = "Home_0001")
	public Object[][] Home_0001() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0001";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider(name = "Home_0002")
	public Object [][] Home_0002() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0002";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);	
	}
	
	@DataProvider(name = "Home_0003")
	public Object [][] Home_0003() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0003";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider(name = "Home_0004")
	public Object [][] Home_0004() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0004";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider(name = "Home_0005")
	public Object [][] Home_0005() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0005";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider (name = "Home_0006")
	public Object[][] Home_0006() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0006";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0007")
	public Object[][] Home_0007() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0007";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0008")
	public Object[][] Home_0008() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0008";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	
	@DataProvider (name = "Home_0012")
	public Object[][] Home_0012() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0012";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0013")
	public Object[][] Home_0013() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0013";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0014")
	public Object[][] Home_0014() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0014";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0015")
	public Object[][] Home_0015() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0015";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0016")
	public Object[][] Home_0016() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0016";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0018")
	public Object[][] Home_0018() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Event Test Data");
	 	sTestCaseName = "Home_0018";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Event Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0019")
	public Object[][] Home_0019() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Event Test Data");
	 	sTestCaseName = "Home_0019";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Event Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Home_0020")
	public Object[][] Home_0020() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0020";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0021")
	public Object[][] Home_0021() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0021";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0022")
	public Object[][] Home_0022() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0022";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0023")
	public Object[][] Home_0023() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Event Test Data");
	 	sTestCaseName = "Home_0022";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Event Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0024")
	public Object[][] Home_0024() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0024";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Home_0025")
	public Object[][] Home_0025() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0025";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0027")
	public Object[][] Home_0027() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0027";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0028")
	public Object[][] Home_0028() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0028";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0029")
	public Object[][] Home_0029() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Like, Delete, etc. Test Data");
	 	sTestCaseName = "Home_0029";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Like, Delete, etc. Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0030")
	public Object[][] Home_0030() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Comment Test Data");
	 	sTestCaseName = "Home_0030";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Comment Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0031")
	public Object[][] Home_0031() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Comment Test Data");
	 	sTestCaseName = "Home_0031";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Comment Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0032")
	public Object[][] Home_0032() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Comment Test Data");
	 	sTestCaseName = "Home_0032";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Comment Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0033")
	public Object[][] Home_0033() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Comment Test Data");
	 	sTestCaseName = "Home_0033";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Comment Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0034")
	public Object[][] Home_0034() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Like, Delete, etc. Test Data");
	 	sTestCaseName = "Home_0034";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Like, Delete, etc. Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0041")
	public Object[][] Home_0041() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0041";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0044")
	public Object[][] Home_0044() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0044";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0045")
	public Object[][] Home_0045() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0045";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0046")
	public Object[][] Home_0046() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0046";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0047")
	public Object[][] Home_0047() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0047";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0048")
	public Object[][] Home_0048() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0048";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0049")
	public Object[][] Home_0049() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0049";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0050")
	public Object[][] Home_0050() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0050";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0051")
	public Object[][] Home_0051() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Event Test Data");
	 	sTestCaseName = "Home_0051";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Event Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Home_0056")
	public Object[][] Home_0056() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0056";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0057")
	public Object[][] Home_0057() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0057";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0058")
	public Object[][] Home_0058() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0058";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0059")
	public Object[][] Home_0059() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0059";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0060")
	public Object[][] Home_0060() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Del Category Test Data");
	 	sTestCaseName = "Home_0060";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Del Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0061")
	public Object[][] Home_0061() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0061";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0062")
	public Object[][] Home_0062() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0062";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0063")
	public Object[][] Home_0063() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0063";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	
	
	
	

}
