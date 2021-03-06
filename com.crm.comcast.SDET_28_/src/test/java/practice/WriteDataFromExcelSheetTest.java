package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcelSheetTest {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resource/TestData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		row.createCell(2).setCellValue("wipro");
		FileOutputStream fos = new FileOutputStream("./src/test/resource/TestData.xlsx");
		workbook.write(fos);
		workbook.close();
		
	}

}
