package week6.day5.marathon;
//uses testngmarathon3.xml
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSales {
	
	public static String[][] readData(String fileName) throws IOException {
		// To open the workbook  -XSSFWorkbook
		
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//To enter into the worksheet
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To get the row count  
		//getLastRowNum - excludes the header and 
		int rowCount = ws.getLastRowNum();
		System.out.println("Row Count is: "+rowCount);
		
		
		//Count the rows including header(if there is no header means we can use this)
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Physical row count: "+physicalNumberOfRows);
		
		
		//To count the number of columns
		//row with values only we should give..so given as getRow(1)
		//getLastCellNum()--to locate the last column
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println("Coulumn Count is: "+columnCount);
		
		
		//To retreive a particular value
		
//		String row1cell1Data = ws.getRow(1).getCell(1).getStringCellValue();
//		
//		System.out.println("Data is : "+row1cell1Data);
//		
		String[][] data=new String[rowCount][columnCount];
			//int i=1 is omiting the header row and so values come from 1st row
		for (int i = 1; i <= rowCount ; i++) {
			XSSFRow row = ws.getRow(i);
			
			   for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("All data are : "+allData);
				data[i-1][j]=allData;
				//because data[0][0] will give in sendDataExcel method(it is a two dimensional array)
				
				}
		}
		
		wb.close();
		return data;
		
	}
		


}
