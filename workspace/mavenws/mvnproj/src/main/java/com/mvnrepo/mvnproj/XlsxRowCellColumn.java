package com.mvnrepo.mvnproj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxRowCellColumn {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		XSSFWorkbook wb =null;
		
		try {
			wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet();//creates "Sheet0" by default.
			Row row = sheet.createRow(0);// index starts from 0 for row and cells.
			Cell cell =row.createCell(1);
			cell.setCellValue("Hello there");
			//or 
			
			Cell cell1 = sheet.createRow(1).createCell(1);
			cell1.setCellValue("Hello there");
			
			
			FileOutputStream fos = new FileOutputStream(new File("c:/output/XlsxSheet7.xlsx"));
			wb.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Crreated xls file");
	}
}
