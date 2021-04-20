package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingthedata {

	public static void main(String[] args) throws IOException, InvalidFormatException {
			
		File file = new File("E:\\Excelfile\\Excel3.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		Workbook workbok   = WorkbookFactory.create(fi);
		
		Sheet sheet  = workbok.getSheet("Total");
		
		
		Row rows = sheet.getRow(4);
		Cell cell = rows.getCell(1);
		
		System.out.println(cell);
		
		/*
		for(Row row : sheet) {
			
			for(Cell cell: row) {
				
				switch(cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_FORMULA:
					System.out.println(cell.getNumericCellValue()+"\t");
				}
				
				System.out.print(" | ");
				
			}
			
			System.out.println();
		}
		
		*/
		
	}

}
