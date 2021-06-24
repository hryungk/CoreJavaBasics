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
public class ScannerEx2 {
	public static void main (String[] args) throws IOException {
		Scanner s = null;
		String location = "src/main/java/org/perscholas/java_IO_Basic/";
		File readin = new File(location + "sample2.txt");
		FileReader inputStream = null;		
		BufferedReader bufferStream = null;		
		Double sum = 0D;
		
		try {
			inputStream = new FileReader(readin);			
			bufferStream = new BufferedReader(inputStream);
			s = new Scanner(bufferStream);
			
			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					sum += s.nextDouble();
				} else {
					System.out.println(s.next());
				}
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
		System.out.println("Total Sum is " + sum);
		
		/* try-with-resources (more up-to-date method) */
		sum = 0D;
		try  (FileReader inputStream2 = new FileReader(readin);
				BufferedReader bufferStream2 = new BufferedReader(inputStream2);
				Scanner s2 = new Scanner(bufferStream2);)
		{
			while (s2.hasNext()) {
				if (s2.hasNextDouble()) {
					sum += s2.nextDouble();
				} else {
					System.out.println(s2.next());
				}
			}
		}
		
	}

}
