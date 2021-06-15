package org.perscholas.java_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws CustomException {

		String location = "example.txt";
		try {
			readFile(location);
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
			throw new CustomException("File " + location + " was not found.");
		} catch (IOException e) {
			System.out.println("Error: Something happend while reading the file!");
		} finally {
			System.out.println("All done. I hoep that worked!");
		}

		
	}
	
	public static void readFile(String location) throws IOException  {
//		File file = new File(location);
//		FileReader r = new FileReader(file);
//		System.out.println("ReadFile method ran successfully.");
//		r.close();
		
		// try-with-resources doesn't require close() method.
		try (FileReader r = new FileReader(new File(location))) {
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		} finally {
			System.out.println("All done. I hoep that worked!");
		}
	}

}
