package com.crm.comcast.GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * 
 * @author PRIYAMKA
 *
 */

public class ExcelUtility {
	
	private int cellNo;

	/**
	 * This method will return string value from excel sheet
	 * @param sheetName
	 * @param  
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */


	public String getStringCellDate(String sheetName, int rowNo,int cellNo) throws Throwable, Throwable
	{
		FileInputStream file = new FileInputStream(IPathConstants.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(file);
		 Sheet sheet = workbook.getSheet(sheetName);
		 Row row = sheet.getRow(rowNo);
		 Cell cell = row.getCell(cellNo);
		 return cell.getStringCellValue();
			 
		 }
	
	/**
	 * This method will return numeric cell data
	 * @param sheetName
	 * @param rowNo
	 * @param celNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public double getNumeriCellData(String sheetName,int rowNo,int celNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(IPathConstants.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(file);
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
			
	}
	
	/**
	 * This method will return multiple set of data from excel sheet
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public Object[][]  getMultipleData(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(IPathConstants.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowNo=sheet.getLastRowNum();
		int cellNo=sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowNo][cellNo];
		for(int i=0;i<cellNo;i++)
		{
			for(int j=0;j<cellNo;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	/**
	 * This method will write the data to the excel sheet
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void writeDataIntoExcel(String sheetName,int rowNo,int cellNo,String value) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream readfile = new FileInputStream(IPathConstants.EXCEL_FILEPATH);
		Workbook workbook = WorkbookFactory.create(readfile);
		workbook.createSheet(sheetName).createRow(rowNo).createCell(cellNo).setCellValue(value);
		
		FileOutputStream writefile = new FileOutputStream(IPathConstants.EXCEL_FILEPATH);
		
		workbook.write(writefile);
		workbook.close();
		
		
	}
			 
		 
	}


