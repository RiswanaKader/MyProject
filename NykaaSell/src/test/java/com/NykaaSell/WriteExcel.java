package com.NykaaSell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\NykaaSell\\Excel\\sr.xlsx");
		FileInputStream file=new FileInputStream(f);
		
	    Workbook w = new XSSFWorkbook(file);
	    Sheet cs = w.createSheet("Sports");
	    Row r = cs.createRow(0);
	    Cell c = r.createCell(0);
	    c.setCellValue("Student");
	    
	    Sheet cs1 = w.getSheet("Sports");
	    Row r1 = cs1.getRow(0);
	    Cell c1 = r1.createCell(1);
	    c1.setCellValue("Games");
	    
	    w.getSheet("Sports").createRow(1).createCell(0).setCellValue("Fayaz");
	    w.getSheet("Sports").getRow(1).createCell(1).setCellValue("Netball");
	    w.getSheet("Sports").createRow(2).createCell(0).setCellValue("Farvesh");
	    w.getSheet("Sports").getRow(2).createCell(1).setCellValue("Hockey");
	    FileOutputStream os=new FileOutputStream(f);
	    w.write(os);
	    w.close();
	    
	    
	}
}
