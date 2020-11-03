package com.mvnrepo.poiExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet; //import org.apache.poi.sl.usermodel.Sheet; - is wrong
import org.apache.poi.ss.util.WorkbookUtil;  //to have ? or [] in name
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxSheet {


	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		XSSFWorkbook wb =null;
		
		try {
			wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet();//creates "Sheet0" by default.
			Sheet sheet1 = wb.createSheet("sheet1");// cant have ? or [] in name by default
			Sheet sheet2 = wb.createSheet(WorkbookUtil.createSafeSheetName("with??and[].xslx"));
			
			FileOutputStream fos = new FileOutputStream(new File("c:/output/XlsxSheet2.xlsx"));
			wb.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Created xls file");
	}


}
