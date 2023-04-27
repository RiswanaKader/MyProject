package com.NykaaSell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\NykaaSell\\Excel\\sr.xlsx");
		FileInputStream file=new FileInputStream(f);
		
	    Workbook w = new XSSFWorkbook(file);
		Sheet s =w.getSheet("Details");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		System.out.println(c);
	}
}
