package com.selenium.test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String projectpath=System.getProperty("user.dir");

	/*
	 * public static void main(String[] args) {
	 * 
	 * //getRowCount(); //getCell_Stringdata(); //getCell_Numaricdata();
	 * getCell_Numaric(2, 1); }
	 */

	public ExcelUtils(String excelpath, String sheetname) {
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet("sheetname");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

public static void getRowCount() {

	try {
		workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("userdata");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:"+rowcount);

	} catch (IOException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
}


public static void getCell_Stringdata() {

	try {
		workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("userdata");
		String s1=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(s1);

	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void getCell_Numaricdata() {

	try {
		workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("userdata");
		Double s2=sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(s2);

	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void getCell_Numaric(int rowNum, int colNum) {

	try {
		workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("userdata");
		String s3=sheet.getRow(2).getCell(0).getStringCellValue();
		Double s4=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(s3 + " | " + s4 + " | ");


	} catch (IOException e) {
		e.printStackTrace();
	}
}

}
