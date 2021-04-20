package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readthedata {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File file = new File("E:\\Excelfile\\Excel3.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		/*
		 * XSSFWorkbook workbook = WorkbookFactory.create(fi); Sheet sheet0 =
		 * workbook.getSheet("Names");
		 */
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet0 = workbook.getSheet("Names");
		
		int rows = sheet0.getLastRowNum();
		int cols = sheet0.getRow(0).getLastCellNum();
		
		//////////////// Iterator  ////////////////////////
		
	 Iterator iterate = sheet0.iterator();
	 
	 while(iterate.hasNext()) {
		 
		 XSSFRow row = (XSSFRow) iterate.next();
		 
		  Iterator cellIterate = row.cellIterator();
		  
		  while(cellIterate.hasNext()) {
			  
			  XSSFCell cell = (XSSFCell) cellIterate.next();
			  
			  switch(cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank cell "+ "\t");
				}
			  
			  System.out.print(" | ");  
		  }
		  
		  System.out.println();
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//call the sheet
		Sheet sheet0 = workbook.getSheet("Names");
		
		
		for(Row row: sheet0) {
			
			for(Cell cell : row) {
				
				switch(cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank cell "+ "\t");
				}
				
				System.out.print(" | ");
			}
			
			//System.out.println();
			
		}
		*/
		
		
		
		
		/*
		 * Sheet sheet0 = workbook.getSheetAt(1);
		 * 
		 * //call the row Row row = sheet0.getRow(0);
		 * 
		 * //Row row = sheet0. Cell cell = row.getCell(0);
		 * 
		 * System.out.println(cell);
		 */
		
		
		
		
	}

}
