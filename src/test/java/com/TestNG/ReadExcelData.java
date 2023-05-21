package com.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//create class
//create xl file inside TestData Folder
public class ReadExcelData {
	//check pom.xml for dependency(Apachi POI, POI oom)
	public static void main(String[] args) throws IOException {
		//In order to read the file you need a class from java FileInputStream and create obj fileLocation
		FileInputStream fileLocation=new FileInputStream("./TestData/testData.xlsx");
		//XSSFWorkbook is Apachi POI to take control workBook
		XSSFWorkbook workBook = new XSSFWorkbook(fileLocation);
		// with the help of workBook obj call the getSheet method to take control workSheet
		XSSFSheet sheet= workBook.getSheet("Login1");
		// create Iterator instance to take control all sheet values and
		// ignore the header with the help of Iterator instance
		Iterator <Row> rowIterator = sheet.iterator();
		rowIterator.next();
		// To handle multiple data we have to use ArrayList		
		ArrayList <String>list = new ArrayList<String>();
		//in order to retrieve all data we need to use looping and call values by getCell method.
		while(rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
		}		
		//System.out.println(list);
	}

}
