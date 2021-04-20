package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingExcel {

	public static void main(String[] args) throws IOException {

		// create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// create sheet
		XSSFSheet sheet0 = workbook.createSheet("First cell");
		XSSFSheet sheet1 = workbook.createSheet("Second Cell");

		// create rwo
		/*
		 * Row rows = sheet1.createRow(0);
		 * 
		 * //ceate cols Cell cellA = rows.createCell(0); Cell cellB =
		 * rows.createCell(1);
		 * 
		 * cellA.setCellValue("First Data"); cellB.setCellValue("Second Data");
		 */

		for (int rows = 0; rows < 10; rows++) {

			Row row = sheet0.createRow(rows);

			for (int cols = 0; cols < 10; cols++) {

				Cell cell = row.createCell(rows);
				cell.setCellValue((int) (Math.random() * 100));

			}
		}

		// connecting streams
		File file = new File("E:\\Excelfile\\MyExcel.xlsx");
		FileOutputStream fo = new FileOutputStream(file);

		workbook.write(fo);

		fo.close();

		System.out.println("file is created !!!");

	}

}
