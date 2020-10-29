package com.mvnrepo.mvnproj;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class xlsxResizeCells {

	public static void main(String[] args) {

		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet();
		sheet.setColumnWidth(0, 7000);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,4));
		Cell cell = sheet.createRow(0).createCell(0);
		cell.getRow().setHeight((short)500);

		CellStyle cs = wb.createCellStyle();
		cs.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs.setBorderBottom(BorderStyle.THICK);
		cs.setBorderTop(BorderStyle.THICK);
		cs.setBorderLeft(BorderStyle.THICK);
		cs.setBorderRight(BorderStyle.THICK);
		cs.setAlignment(HorizontalAlignment.CENTER);
		cs.setVerticalAlignment(VerticalAlignment.CENTER);
		
		
		Font font = wb.createFont();
		font.setColor(IndexedColors.WHITE.index);
		font.setBold(true);
		font.setFontHeight((short)300);
		font.setFontName("arial");
		
	
		cs.setFont(font);
		cs.setLocked(true);
		cell.setCellStyle(cs);
		cell.setCellValue("Name");

		try {
			FileOutputStream fos = new FileOutputStream(new File("c:/output/XlsxSheet30.xls"));

			wb.write(fos);
			System.out.println("file created");
			fos.close();
			
		} catch (Exception e) {
           e.printStackTrace();
		}

	}


}
