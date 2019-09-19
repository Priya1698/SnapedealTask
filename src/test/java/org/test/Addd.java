package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Addd {
	public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven1st\\TestData\\Student Details.xlsx");
	FileInputStream stream= new FileInputStream(f);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Pragathi");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String st = c.getStringCellValue();
	if(st.equals("hiiiiiiii")) {
		c.setCellValue("byeeee");
	}
	
	FileOutputStream op=new FileOutputStream(f);
	w.write(op);
	
	}
	
	
	
	
	


	}


