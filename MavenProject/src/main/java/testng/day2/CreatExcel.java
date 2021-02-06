package testng.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatExcel {
	public String[][]readData() throws IOException{
		XSSFWorkbook wb = new XSSFWorkbook("./data/Creation.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		short cellCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];
		  for (int i = 1; i <= rowCount; i++) 
		  { 
			  for (int j = 0; j < cellCount; j++) 
			  {
		  String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();
		  data[i-1][j]= CellValue;
			  }
		  } 
		  wb.close();	
		  return data;
	}
}
		

