package testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelsheet {

	public static void main(String[] args) throws IOException {
		
		//create the workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create sheet
		XSSFSheet sheet = workbook.createSheet("Data");
		
		//create row
		/*
		 * Row row = sheet.createRow(10);
		 * 
		 * //create cols Cell cellA = row.createCell(13, 1); Cell cellB =
		 * row.createCell(1, 1);
		 * 
		 * cellA.setCellValue(false); cellB.setCellValue(true);
		 */
		
		for(int row = 0; row < 10; row++) {
			
			Row rows =   sheet.createRow(row);
			
			for(int cols = 0; cols < 10; cols++) {
				
				Cell cell = rows.createCell(row);
				
				
				
				}
			}
		
		
		File file = new File("E:\\Excelfile\\Excel3.xlsx");
		FileOutputStream fo = new FileOutputStream(file);
		
		workbook.write(fo);
		
		fo.close();
		
		System.out.println("file is created !!!!");
		
	}

}
