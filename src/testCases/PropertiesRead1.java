package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead1 {

	public static void main(String[] args) throws IOException {
			
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\config\\objects.properties");
		prop.load(file);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("salary"));
		System.out.println(prop.get("age"));
		System.out.println(System.getProperty("user.dir"));
	}

}
