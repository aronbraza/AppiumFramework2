package WOG.AppiumFramework;

import java.io.IOException;


public class ExcelUtilsDemo {
	
	public static void main(String args[]) throws IOException
	{
		ExcelUtils excel = new ExcelUtils(System.getProperty("user.dir")+"\\excel\\data.xlsx", "Login Test Data");
		
		excel.getRowCount();
		excel.getColumnCount();
		excel.getCellDataString(0, 0);
		
		
	}

}

