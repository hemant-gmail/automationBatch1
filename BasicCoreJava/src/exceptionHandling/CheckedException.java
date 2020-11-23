package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;

public class CheckedException {
	//Exception: It can be handle (Arithmatic, FileNotFoundException etc..)
	//Error: it can't be handle (Stackoverflow,OutOfMemory, Assert etc..)	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Hemant");
		//1. Interrupted Exception
		Thread.sleep(5000);
		System.out.println("Fulmali");
		
		//2. File Not Found Exception
		FileInputStream file = new FileInputStream("");
		//file.available();		
		
		Properties p = new Properties();
		//3.IO Exception
		p.load(file);
		
	}

}
