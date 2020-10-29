package com.mvnrepo.mvnproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.math3.util.IterationEvent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxReadCell {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		File file = new File("c:/output/XlsxSheet7.xlsx");
		
		
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			Iterator<Row> itrRow = sheet.iterator();
			while(itrRow.hasNext())
			{
				Row row = itrRow.next();
				Iterator<Cell> itrCell = row.cellIterator();
				
				while(itrCell.hasNext())
				{
					Cell cell = itrCell.next();
					System.out.println(cell.toString());
				}
			}
			
			// or if the cell value is known,
			XSSFCell cellVal = wb.getSheetAt(0).getRow(0).getCell(CellReference.convertColStringToIndex("B"));
			System.out.println("Reading individual cell: "+cellVal.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
