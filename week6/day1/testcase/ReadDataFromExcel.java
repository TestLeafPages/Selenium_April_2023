package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	//static-common refference
	@Test
	public static String[][] readData() throws IOException {

		//step 1: open the workbook and set path
		//XSSF- Xml SpreadSheet Format
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		//Step 2: go into sheet
		
	    //index start with '0'
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		//header it will not consider
		//Step 3: i need get into row 
		int rowNum = sheetAt.getLastRowNum();
		System.out.println("total number of rows : "+rowNum);
		
		String data1 = sheetAt.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data From Excel" + data1);
		int cellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("total number of cell :"+cellNum);
		
		//to print all data from sheet
		
		
//step 1:Create 2D String array in excel prgm		
		String[][] data = new String[rowNum][cellNum];
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			
			for (int j = 0; j <cellNum; j++) {
				
				String stringCellValue = row.getCell(j).getStringCellValue();
				
				System.out.println(stringCellValue);
				//data[0][0]
				data[i-1][j]=stringCellValue;
			}
		}
		wb.close();
		return data;
		
	}

}
