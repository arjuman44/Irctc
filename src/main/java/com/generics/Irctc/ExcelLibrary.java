package com.generics.Irctc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstants {
	
	public static String getcellValue(String path, String Sheet,int row, int cell) throws IOException
	{
		
		FileInputStream fis = new FileInputStream(excel_path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	 String cellValue = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}

}
