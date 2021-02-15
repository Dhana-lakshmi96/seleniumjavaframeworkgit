package com.selenium.test;

public class ExcelUtils_mainMethod {

	public static void main(String[] args) {
		
		 String projectpath=System.getProperty("user.dir");
		 ExcelUtils excel=new ExcelUtils(projectpath+"/excel/data.xlsx", "userdata");
		 excel.getRowCount();
		 excel.getCell_Stringdata();
		 

	}

}
