package testCases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeAndReadingNotePad {

	public static void main(String[] args) throws IOException {

		
		//Write  the notepad code
		File fis = new File("E:\\Excelfile\\text.txt");
		try {
			fis.createNewFile();

		} catch (IOException e) {

			e.printStackTrace();
		}

	
		
		  FileWriter fw = new FileWriter(fis);
		  BufferedWriter filewriter = new BufferedWriter(fw);
		 
		 filewriter.write("The print the first statement"); 
		 filewriter.newLine();
		 filewriter.write("The print the second statement"); 
		 filewriter.newLine();
		 filewriter.write("The print the third statement"); 
		 filewriter.flush();
		 
		
		
		//Reader code for notepad
		
		FileReader fr = new FileReader("E:\\Excelfile\\text.txt");
		BufferedReader fileReader = new BufferedReader(fr);
		
		/*
		 * System.out.println(fileReader.readLine());
		 * System.out.println(fileReader.readLine());
		 * System.out.println(fileReader.readLine());
		 */
		
		String i = "";
		
		while((i = fileReader.readLine())!=null) {
			
			System.out.println(i);
		}
		
	}

}
