package testCases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeandReadNotepad1 {

	public static void main(String[] args) throws Exception {
		
		//write the coding
		File file = new File("E:\\Excelfile\\text.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter write = new BufferedWriter(fw);
		
		write.write("This is the first line");
		write.newLine();
		write.write("This is second line");
		write.flush();
		
		//read the code
		FileReader file1 = new FileReader("E:\\Excelfile\\text.txt");
		BufferedReader reader = new BufferedReader(file1);
		
		/*
		 * System.out.println(reader.readLine());
		 *  System.out.println(reader.readLine());
		 */
		
		String i = "";
		
		while((i = reader.readLine())!=null) {
			System.out.println(i);
		}
		
		
		
		
	}

}
