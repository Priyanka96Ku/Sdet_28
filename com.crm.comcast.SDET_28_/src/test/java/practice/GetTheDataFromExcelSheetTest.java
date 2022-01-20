package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTheDataFromExcelSheetTest {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		// java object representation for physical excel sheet
		FileInputStream fis = new FileInputStream("./src/test/resource/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		//get the control of sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(2);
		
		String orgname = cell.getStringCellValue();
		System.out.println(orgname);
		
		workbook.close();
		
		//
	}

}
