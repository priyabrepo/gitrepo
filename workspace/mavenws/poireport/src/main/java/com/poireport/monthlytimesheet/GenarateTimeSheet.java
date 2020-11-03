package com.poireport.monthlytimesheet;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

public class GenarateTimeSheet {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		int lastdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] holidays = { "15-Jan-20	Makar Sankranti", "16-Jan-20	Kanuma", "21-Feb-20	Maha Shivaratri",
				"25-Mar-20	Ugadi", "02-Apr-20	Ram Navami", "01-May-20	May Day", "25-May-20	Ramzan",
				"02-Oct-20	Gandhi Jayanti", "26-Oct-20	Vijaya Dashami", "24-Nov-20	Vijaya Dashami",
				"25-Dec-20	Christmas" };
		String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String thismonth = monthName[cal.get(Calendar.MONTH)];
		int thisYear = cal.get(Calendar.YEAR);

		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet(thismonth + " , " + thisYear);
		sheet.protectSheet("password");

		sheet.setColumnWidth(0, 7000);
		sheet.setColumnWidth(1, 14000);
		sheet.setColumnWidth(2, 10000);
		sheet.setColumnWidth(4, 3000);
		sheet.setColumnWidth(5, 5000);
		sheet.setColumnWidth(6, 5000);

		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 2));
		Cell cell = sheet.createRow(0).createCell(0);
		cell.getRow().setHeight((short) 500);

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
		font.setFontHeight((short) 300);
		font.setFontName("arial");
		cs.setFont(font);
		cell.setCellStyle(cs);
		cell.setCellValue("NICHEBIT");

		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(0);
		CellStyle cs1 = wb.createCellStyle();
		cs1.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
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

		Cell cell4 = row1.createCell(4);
		CellStyle cs4 = wb.createCellStyle();
		cs4.setAlignment(HorizontalAlignment.CENTER);
		cs4.setVerticalAlignment(VerticalAlignment.CENTER);
		cell4.setCellStyle(cs4);
		cell4.setCellValue("Color Code:");

		Cell cell5 = row1.createCell(5);
		CellStyle cs5 = wb.createCellStyle();
		cs5.setLocked(false);
		cs5.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cs5.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs5.setBorderBottom(BorderStyle.THICK);
		cs5.setBorderTop(BorderStyle.THICK);
		cs5.setBorderLeft(BorderStyle.THICK);
		cs5.setBorderRight(BorderStyle.THICK);
		cs5.setAlignment(HorizontalAlignment.CENTER);
		cs5.setVerticalAlignment(VerticalAlignment.CENTER);
		cell5.setCellStyle(cs5);
		cell5.setCellValue("Holiday/Weekend");

		Cell cell6 = row1.createCell(6);
		CellStyle cs6 = wb.createCellStyle();
		cs6.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		cs6.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs6.setBorderBottom(BorderStyle.THICK);
		cs6.setBorderTop(BorderStyle.THICK);
		cs6.setBorderLeft(BorderStyle.THICK);
		cs6.setBorderRight(BorderStyle.THICK);
		cs6.setAlignment(HorizontalAlignment.CENTER);
		cs6.setVerticalAlignment(VerticalAlignment.CENTER);
		cell6.setCellStyle(cs6);
		cell6.setCellValue("Personal Leave");

		CellStyle cs3 = wb.createCellStyle();
		cs3.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		cs3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs3.setBorderBottom(BorderStyle.THICK);
		cs3.setBorderTop(BorderStyle.THICK);
		cs3.setBorderLeft(BorderStyle.THICK);
		cs3.setBorderRight(BorderStyle.THICK);
		cs3.setAlignment(HorizontalAlignment.CENTER);
		cs3.setVerticalAlignment(VerticalAlignment.CENTER);

		for (int r = 2; r < lastdate + 2; r++) {
			Row rowloop = sheet.createRow(r);
			boolean isHoliday = false;
			String zero = "";
			if (r < 11) {
				zero = "0";
			}
			for (int h = 0; h < holidays.length; h++) {
				String date1 = zero + (r - 1) + "-" + thismonth.substring(0, 3) + "-"
						+ String.valueOf(thisYear).substring(0, 2);
				String hmatch = (String) holidays[h].toString().subSequence(0, 9);

				if (date1.equals(hmatch)) {
					isHoliday = true;
				}
			}
			for (int c = 0; c < 3; c++) {
				Calendar myCalendar = new GregorianCalendar(thisYear, cal.get(Calendar.MONTH), r - 1);
				int dayOfWeek = myCalendar.get(Calendar.DAY_OF_WEEK);

				if (c == 0) {
					Cell cellllop = rowloop.createCell(c);
					cellllop.setCellStyle(cs3);

					cellllop.setCellValue(zero + (r - 1) + "-" + thismonth.substring(0, 3) + "-"
							+ String.valueOf(thisYear).substring(0, 2) + " : " + dayName[dayOfWeek - 1]);
				} else if (c == 1 && (dayOfWeek == 1 || dayOfWeek == 7 || isHoliday == true)) {
					Cell cellllop = rowloop.createCell(c);
					cellllop.setCellStyle(cs5);
					if (isHoliday)
						cellllop.setCellValue("Holiday");
					else
						cellllop.setCellValue("Weekend");
				} else {
					Cell cellllop = rowloop.createCell(c);
					cellllop.setCellStyle(cs2);
				}
			}

		}

		try {
			FileOutputStream fos = new FileOutputStream(
					new File("c:/output/Timesheet_" + thismonth + "," + thisYear + ".xls"));

			wb.write(fos);
			System.out.println("file created");
			fos.close();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
