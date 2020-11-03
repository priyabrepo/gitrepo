package com.mvnrepo.poiExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MvnCreateXLs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		XSSFWorkbook wb =null;
		try {
			wb =new XSSFWorkbook();
			// show file is corrupted while opening the generated file because there is no sheets inside.
			FileOutputStream fos = new FileOutputStream(new File("c:/output/Xceldemo.xlsx"));
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
