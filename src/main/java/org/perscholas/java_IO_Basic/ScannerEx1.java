package org.perscholas.java_IO_Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Read and Write Example - Read one line at a time
 * 
 */
public class ScannerEx1 {
	public static void main (String[] args) throws IOException {
		Scanner s = null;
		String location = "src/main/java/org/perscholas/java_IO_Basic/";
		File readin = new File(location + "sample.txt");
		FileReader inputStream = null;		
		BufferedReader bufferStream = null;		
		
		try {
			inputStream = new FileReader(readin);			
			bufferStream = new BufferedReader(inputStream);
			s = new Scanner(bufferStream);
			
			while (s.hasNext()) {
				System.out.println(s.next());				
			}
		} finally {			
			if (inputStream != null) {
				inputStream.close();
			}
			if (bufferStream != null) {
				inputStream.close();
			}
			if (s != null) {
				s.close();
			}
		}		
		
		/* try-with-resources (more up-to-date method) */
		try (FileReader inputStream2 = new FileReader(readin);
				BufferedReader bufferStream2 = new BufferedReader(inputStream2);
				Scanner s2 = new Scanner(bufferStream2);)
		{
			while (s2.hasNext()) {
				System.out.println(s2.next());
			}
		}
		
	}

}
