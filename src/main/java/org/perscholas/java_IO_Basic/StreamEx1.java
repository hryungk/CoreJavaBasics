package org.perscholas.java_IO_Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Iterate through all the lines in the file - allowing for processing of each line 
 * - without keeping references to them - and in conclusion, without keeping them in memory
 * 
 */
public class StreamEx1 {
	public static void main (String[] args) throws IOException {
		
		/* try-with-resources (more up-to-date method) */
		String location = "src/main/java/org/perscholas/java_IO_Basic/sample.txt";
		try (FileInputStream inputStream = new FileInputStream(location);
				Scanner sc = new Scanner(inputStream, "UTF-8");) 
		{
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			if (sc.ioException() != null)
				throw sc.ioException();
		}
		
	}

}
