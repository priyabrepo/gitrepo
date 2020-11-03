package com.mvnrepo.poiExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxCellFormula {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		HSSFWorkbook wb =null;
		
		try {
			wb = new HSSFWorkbook();
			Sheet sheet = wb.createSheet();//creates "Sheet0" by default.
		
			
			Cell cell1 = sheet.createRow(0).createCell(0);
			Cell cell2 = sheet.createRow(0).createCell(1);
			Cell cell3 = sheet.createRow(0).createCell(2);
			Cell cell4 = sheet.createRow(0).createCell(3);
			Cell cell5 = sheet.createRow(0).createCell(4);
			
			cell1.setCellValue(50);
			cell2.setCellValue("+");
			cell3.setCellValue(20);
			cell4.setCellValue("=");
			cell5.setCellFormula("A1+C1");
			
			//first create all the cells then assign value to them.
			
			
			/*
			 * 
			 * Cell cell3 = sheet.createRow(0).createCell(2); 
			 * cell3.setCellValue(30); Cell
			 * cell4 = sheet.createRow(0).createCell(3);
			 *  cell4.setCellValue("=");
			 *   Cell cell5= sheet.createRow(0).createCell(4);
			 * cell5.setCellFormula("A1+C1");
			*/
			
			
			
			FileOutputStream fos = new FileOutputStream(new File("c:/output/XlsxSheet22.xls"));
			
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
