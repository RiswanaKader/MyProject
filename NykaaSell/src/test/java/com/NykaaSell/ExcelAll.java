package com.NykaaSell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAll {
	
	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\NykaaSell\\Excel\\sr.xlsx");
		FileInputStream file=new FileInputStream(f);
		
	    Workbook w = new XSSFWorkbook(file);
		Sheet s =w.getSheet("Details");
		
		int ph = s.getPhysicalNumberOfRows();
		for(int i=0;i<ph;i++)
		{
			Row r = s.getRow(i);
			int cell = r.getPhysicalNumberOfCells();
			for(int j=0;j<cell;j++)
			{
				Cell c = r.getCell(j);
				CellType type = c.getCellType();
				if(type.equals(CellType.STRING))
				{
					String val = c.getStringCellValue();
					System.out.println(val);
				}
				else if(type.equals(CellType.NUMERIC)) {
					double num = c.getNumericCellValue();
					int data=(int) num;
				
				System.out.println(data);
				w.close();
			}
			}
		}
		
	}

}
