package testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingExcel1 {

	public static void main(String[] args) throws IOException {
		
		//create the workbook
		XSSFWorkbook workbook  = new XSSFWorkbook();
		
		//create the ssheet
		XSSFSheet  sheet = workbook.createSheet("Data");
		
		//create row
		Row rows  = sheet.createRow(0);
		
		//create cols
		Cell cellA = rows.createCell(0);
		Cell cellB= rows.createCell(1);
		
		cellA.setCellValue("Kumar");
		cellB.setCellValue("Ravikumar");
		
		File file = new File("E:\\Excelfile\\MyExcel1.xlsx");
		FileOutputStream fo = new FileOutputStream(file);
		
		workbook.write(fo);
		
		System.out.println("File is created !!!");
	}

}
