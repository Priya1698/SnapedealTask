package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;

public class ExcelForloop {
	public static void main(String[] args) throws Throwable  {
		File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven1st\\TestData\\Student Details.xlsx");
		
		FileInputStream stream= new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			int c = cell.getCellType();
			if (c==1) {
				String sv = cell.getStringCellValue();
				System.out.println(sv);
			}
			else if (c==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dv = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
					String format = sim.format(dv);
					System.out.println(format);
				}
				else {
					double ncv = cell.getNumericCellValue();
					long l = (long) ncv;
					
					String v = String.valueOf(l);
					System.out.println(v);
					}}}}}}
