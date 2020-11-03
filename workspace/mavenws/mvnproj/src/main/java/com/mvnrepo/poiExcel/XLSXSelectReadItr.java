package com.mvnrepo.poiExcel;

import java.io.FileInputStream;
import java.util.Iterator;

import javax.swing.JFileChooser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLSXSelectReadItr {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		JFileChooser filechooser = new JFileChooser();
		int selected = filechooser.showOpenDialog(null);
		
		if(selected == JFileChooser.APPROVE_OPTION) {
			try {
				Workbook wb = new XSSFWorkbook(new FileInputStream(filechooser.getSelectedFile()));
				Sheet sheet =  wb.getSheetAt(0);
				
			//	for(Iterator<Row> rowItr = sheet.rowIterator(); rowItr.hasNext();)
					//or
					for(Row row :sheet)//comment this and uncomment above and below line. works the same
				{
					//Row row = rowItr.next();  
					for (Iterator<Cell> cellItr = row.cellIterator();cellItr.hasNext();) {
						Cell cell = cellItr.next();
						cell.setCellType(CellType.STRING);
						System.out.print(cell.getStringCellValue().toString()+" \t");
					}
					System.out.println();
				}
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
