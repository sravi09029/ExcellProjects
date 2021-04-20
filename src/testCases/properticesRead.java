package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properticesRead {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("E:\\Projects\\ExcellProjects\\src\\config\\objects.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\config\\objects.properties");
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("salary"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("job"));
		System.out.println(System.getProperty("user.dir"));
	
	}

}
