package WOG.AppiumFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	
	static XSSFWorkbook workbook; 
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException
	{
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	

	
	public static int getRowCount() 
	
	{
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: "+rowCount);		
		return rowCount;
	}
	
	public static int getColumnCount() throws IOException
	{
		 
		int columnCount = 0;
		columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns: "+columnCount);
		return columnCount;
	}
	
	public static String getCellDataString(int rowNumber, int columnNumber) throws IOException
	{
		String cellData = null;
		cellData = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
		 
	}
	
	public static void getCellDataNumber(int rowNumber, int columnNumber) throws IOException
	{
		
		double cellData = sheet.getRow(rowNumber).getCell(columnNumber).getNumericCellValue();
		//System.out.println(cellData);
		 
	}

}
