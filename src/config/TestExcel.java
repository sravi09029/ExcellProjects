package config;

import org.apache.log4j.Logger;

public class TestExcel {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("devpinoyLogger");

		ExcelReader excel = new ExcelReader("E:\\Excelfile\\MyExcel3.xlsx");

		String sheetName = "Credentials";

		log.debug("Getting the Row count");
		System.out.println("Row count is: " + excel.getRowCount(sheetName));
		log.debug("Getting the column count");
		System.out.println("Columns count  is: " + excel.getColumnCount(sheetName));
		log.debug("Getting the data ");
		// print the data
		System.out.println(excel.getCellData(sheetName, "Username", 2));

		log.debug("set the data");
		// write the data
		excel.setCellData(sheetName, "Username", 5, "Trilokya");
		
		
	}

}
