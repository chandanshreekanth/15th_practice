package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public void getDatafromExcel(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(".//Testdata1.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet Sheet = Book.createSheet();
		Row Row = Sheet.createRow(rowNum);
		Cell Cell = Row.createCell(cellNum);
		String Value = Cell.getStringCellValue();
		System.out.println("Value");
		
		
		
	}
	

}
