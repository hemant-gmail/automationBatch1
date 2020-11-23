package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
		String filepath;
		
		filepath = System.getProperty("user.dir") + "\\src\\fileHandler\\TestData.properties";
		
		System.out.println(filepath);
		//D:\AutomationBatch1\automationBatch1\BasicCoreJava\src\fileHandler\TestData.properties
		
		FileInputStream file = new FileInputStream(filepath);
		
		Properties p = new Properties();
		p.load(file);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("surname"));
		System.out.println(p.getProperty("age"));
		
		Set<Object> obj = p.keySet();
		for (Object obj1 : obj) {
			System.out.println(p.getProperty( (String)obj1));
		}
		
		
	}

}
