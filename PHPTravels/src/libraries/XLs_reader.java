package libraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLs_reader {
	
	String path;
	
	/*
	 * public XLs_reader(String path) { this.path=path; }
	 */
	
	public XLs_reader(String testdatapath) {
			this.path=path; 
		// TODO Auto-generated constructor stub
	}

	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException
	{
		
		FileInputStream file= new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(file); //Workbook		
		
		XSSFSheet sheet=wb.getSheet(sheetName); //Sheet
		
		XSSFRow row=sheet.getRow(rowNum);
		
		XSSFCell cell=row.getCell(colNum);
		
		String data=cell.getStringCellValue();
		
		wb.close();
		return data;
		
	}

}

