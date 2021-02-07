package com.poireport.monthlytimesheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

public class TimeSheet {
	public static String GenerateSummaryofQuotes() throws IOException {
		int colcount = 5;

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Summary of Quotes");
		sheet.setColumnWidth(0, 8000);
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, colcount + 1)); // 4 is n
		HSSFCell cell = sheet.createRow(0).createCell(0);
		cell.getRow().setHeight((short) 500);

		CellStyle cs = wb.createCellStyle();

		// cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs.setBorderBottom(BorderStyle.THICK);
		cs.setBorderTop(BorderStyle.THICK);
		cs.setBorderLeft(BorderStyle.THICK);
		cs.setBorderRight(BorderStyle.THICK);
		cs.setAlignment(HorizontalAlignment.CENTER);
		cs.setVerticalAlignment(VerticalAlignment.CENTER);

		Font font = wb.createFont();

		font.setBold(true);
		font.setFontHeight((short) 300);
		font.setFontName("arial");
		cs.setFont(font);
		cell.setCellStyle(cs);
		cell.setCellValue("Summary of Quotes");

		Row row1 = sheet.createRow(1);
		org.apache.poi.ss.usermodel.Cell cell1 = row1.createCell(0);
		CellStyle cs1 = wb.createCellStyle();
		// cs1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs1.setBorderBottom(BorderStyle.THICK);
		cs1.setBorderTop(BorderStyle.THICK);
		cs1.setBorderLeft(BorderStyle.THICK);
		cs1.setBorderRight(BorderStyle.THICK);
		cs1.setAlignment(HorizontalAlignment.CENTER);
		cs1.setVerticalAlignment(VerticalAlignment.CENTER);

		cs1.setFont(font);
		cell1.setCellStyle(cs1);
		cell1.setCellValue("DETAILS");

		for (int sup = 0; sup <= colcount; sup++) {
			sheet.setColumnWidth(sup + 1, 8000);
			org.apache.poi.ss.usermodel.Cell supcell = row1.createCell(sup + 1);
			supcell.setCellStyle(cs1);
			supcell.setCellValue("Supplier " + (sup + 1));
		}

		CellStyle cs2 = wb.createCellStyle();
		// cs1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cs2.setBorderBottom(BorderStyle.THICK);
		cs2.setBorderTop(BorderStyle.THICK);
		cs2.setBorderLeft(BorderStyle.THICK);
		cs2.setBorderRight(BorderStyle.THICK);
		cs2.setAlignment(HorizontalAlignment.CENTER);
		cs2.setVerticalAlignment(VerticalAlignment.CENTER);

		String supplierheaders[] = { "Manufacturing Supplier", "Manufacturing Location", "Quotation date", "Sector",
				"Annual Volume", "Batch size", "Quotation Currency", "Payment Terms", "Delivery Terms",
				"Raw Material Cost", "Process", "Overheads", "Profit cost", "Rejection cost", "Packaging Cost",
				"Exworks Price", "Logistics Cost (to M&M)", "FOR M&M works", "Taxes & Duties", "Landed cost",
				"Tooling/ Development Cost (Rs. Lacs)", "Year on Year Productivity %" };

			for (int slno = 0; slno < supplierheaders.length; slno++) {
				Row rows = sheet.createRow(slno + 2);
				org.apache.poi.ss.usermodel.Cell cell_names = rows.createCell(0);
				cell_names.getRow().setHeight((short) 300);

				cell_names.setCellStyle(cs2);
				cell_names.setCellValue(supplierheaders[slno]);
			}
		
		String filepath = "d:/SUPPLIER_SUMMARY_QUOTE_TEMPLATE.xls";
		try {
			FileOutputStream fos = new FileOutputStream(new File(filepath));

			wb.write(fos);
			System.out.println("file created");
			fos.close();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return filepath;
	}

	public static void main(String[] args) throws IOException {

		GenerateSummaryofQuotes();

	}
}
