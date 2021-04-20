package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormalData {

	public static void main(String[] args) throws IOException, InvalidFormatException{

		File file = new File("E:\\Excelfile\\Excel3.xlsx");
		FileInputStream fi = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fi);

		XSSFSheet sheet = workbook.getSheet("Total");

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		for (int r = 0; r <= rows; r++) {

			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {

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
			System.out.println("This is changed code");
			
		}

	}

}
