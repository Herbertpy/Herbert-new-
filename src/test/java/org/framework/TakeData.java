package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TakeData {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Herbert\\Desktop\\HerbertSamson\\MavenOne\\Output\\New.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("Herbert");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}

}
