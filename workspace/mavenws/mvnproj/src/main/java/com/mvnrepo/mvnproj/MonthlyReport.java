package com.mvnrepo.mvnproj;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class MonthlyReport {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int lastdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};

        String thismonth = monthName[cal.get(Calendar.MONTH)];
        int thisYear = cal.get(Calendar.YEAR);
		
		Workbook wb = new HSSFWorkbook();
		Sheet sheet =wb.createSheet(thismonth+" , "+thisYear);
		sheet.protectSheet("password");
		
		sheet.setColumnWidth(0, 7000);
		sheet.setColumnWidth(1, 14000);
		sheet.setColumnWidth(2, 10000);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,2));
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
		cell.setCellStyle(cs);
		cell.setCellValue("NICHEBIT");
		
		
		
		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(0);
		CellStyle cs1 = wb.createCellStyle();
		cs1.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		cs1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs1.setBorderBottom(BorderStyle.THICK);
		cs1.setBorderTop(BorderStyle.THICK);
		cs1.setBorderLeft(BorderStyle.THICK);
		cs1.setBorderRight(BorderStyle.THICK);
		cs1.setAlignment(HorizontalAlignment.CENTER);
		cs1.setVerticalAlignment(VerticalAlignment.CENTER);
		cell1.setCellStyle(cs1);
		cell1.setCellValue("Date");
		
		
		Cell cell2 = row1.createCell(1);
		cell2.setCellStyle(cs1);
		cell2.setCellValue("Task");
		
		
		Cell cell3 = row1.createCell(2);
		cell3.setCellStyle(cs1);
		cell3.setCellValue("Remark");
		
		CellStyle cs2 = wb.createCellStyle();
		cs2.setLocked(false);
		cs2.setBorderBottom(BorderStyle.THICK);
		cs2.setBorderTop(BorderStyle.THICK);
		cs2.setBorderLeft(BorderStyle.THICK);
		cs2.setBorderRight(BorderStyle.THICK);
		cs2.setAlignment(HorizontalAlignment.CENTER);
		cs2.setVerticalAlignment(VerticalAlignment.CENTER);
		
		CellStyle cs3 = wb.createCellStyle();
		cs3.setBorderBottom(BorderStyle.THICK);
		cs3.setBorderTop(BorderStyle.THICK);
		cs3.setBorderLeft(BorderStyle.THICK);
		cs3.setBorderRight(BorderStyle.THICK);
		cs3.setAlignment(HorizontalAlignment.CENTER);
		cs3.setVerticalAlignment(VerticalAlignment.CENTER);
		
		
		for (int r=2;r<lastdate+2;r++)
		{
			Row rowloop = sheet.createRow(r);
			for (int c=0;c<3;c++)
			{
				if(c== 0)
				{
					Cell cellllop = rowloop.createCell(c);
					cellllop.setCellStyle(cs3);
					
					String zero="";
					if(r<11) {
						zero="0";
					}
					cellllop.setCellValue(zero+(r-1) +"-"+thismonth.substring(0, 3)+"-"+String.valueOf(thisYear).substring(0, 2));
				}else {
				Cell cellllop = rowloop.createCell(c);
				cellllop.setCellStyle(cs2);
				}
			}
			 
		}
		 
		 

		try {
			FileOutputStream fos = new FileOutputStream(new File("c:/output/XlsxSheet32.xls"));

			wb.write(fos);
			System.out.println("file created");
			fos.close();
			
		} catch (Exception e) {
           e.printStackTrace();
		}
		
		
		
		
	}

}
