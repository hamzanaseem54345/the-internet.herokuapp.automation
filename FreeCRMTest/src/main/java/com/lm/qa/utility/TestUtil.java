package com.lm.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	public static String filepath="C:\\Users\\Hamza\\git\\the-internet.herokuapp.automation\\FreeCRMTest\\Testdata\\SpreadSheetData.xlsx";
	static String testdata;
	static File src= new File("C:\\Users\\Hamza\\git\\the-internet.herokuapp.automation\\FreeCRMTest\\Testdata\\SpreadSheetData.xlsx");

	public void takeScreenShot(String screename) throws IOException {
		TakesScreenshot ts;
		ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Screenshot/" + screename + ".jpg");
		FileUtils.copyFile(srcfile, destfile);

	}

	public static String readExcel(int sheetNum, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetNum);
		Row row = sheet.getRow(rowNum);
		testdata = row.getCell(cellNum).getStringCellValue();
		wb.close();

		return testdata;

	}

	public void writeExcel(int sheetNum, int rowNum, int cellNum, String testResult)
			throws EncryptedDocumentException, Exception {
		FileInputStream fis = new FileInputStream(src);
		 XSSFWorkbook wb1 = new XSSFWorkbook(fis);
		 
		 XSSFSheet sheet = wb1.getSheetAt(sheetNum);
		 //XSSFSheet sheet = workbook.getSheetAt(0);
		 //Now create a row number and a cell where we want to enter a value. 
		 //Here im about to write my test data in the cell B2. It reads Column B as 1 and Row 2 as 1. Column and Row values start from 0.
		 //The below line of code will search for row number 2 and column number 2 (i.e., B) and will create a space. 
		                //The createCell() method is present inside Row class.
		 Row row = sheet.createRow(rowNum);
		 Cell cell = row.createCell(cellNum);
		 //Now we need to find out the type of the value we want to enter. 
		                //If it is a string, we need to set the cell type as string 
		                //if it is numeric, we need to set the cell type as number
		 cell.setCellType(cell.getCellType());
		 cell.setCellValue(testResult);
		 FileOutputStream fos = new FileOutputStream(src);
		 wb1.write(fos);
		 fos.close();
		 System.out.println("END OF WRITING DATA IN EXCEL");

	}
}
