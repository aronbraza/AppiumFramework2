package WOG.AppiumFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTestData {
	
	
	
	@Test(dataProvider = "Login_0001TestData")
	public void test1(String CompanyEmail, String Password)
	{
		System.out.println(CompanyEmail+" | "+Password);
	}
	
	@DataProvider(name = "Login_0001TestData")
	public Object[][] getLogin_0001TestData() throws IOException
	{
		Object data[][] = testdata(System.getProperty("user.dir")+"\\excel\\data.xlsx", "Login Test Data");
		return data;
	}
	
	public static Object[][] testdata(String excelPath, String sheetName) throws IOException
	{
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int columnCount = excel.getColumnCount();
		
		Object data [][] = new Object[rowCount-1][columnCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<columnCount; j++)
			{
				String cellData = excel.getCellDataString(i , j);
				System.out.print(cellData+ " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}

}
