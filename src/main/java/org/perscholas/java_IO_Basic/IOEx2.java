package org.perscholas.java_IO_Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Read and Write Example - Read one line at a time
 * 
 */
public class IOEx2 {
	public static void main (String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		BufferedReader bufferStream = null;
		PrintWriter printStream = null;
		String location = "src/main/java/org/perscholas/java_IO_Basic/";
		File readin = new File(location + "sample.txt");
		File writeTo = new File(location + "sampleTo.txt");
		
		try {
			inputStream = new FileReader(readin);
			outputStream = new FileWriter(writeTo);
			bufferStream = new BufferedReader(inputStream);
			printStream = new PrintWriter(outputStream);
			
			String l;
			while ((l = bufferStream.readLine()) != null) {
				System.out.println(l);
				printStream.println(l);
			}
		} finally {			
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			if (bufferStream != null) {
				inputStream.close();
			}
			if (printStream != null) {
				outputStream.close();
			}
		}		
		
		/* try-with-resources (more up-to-date method) */
		try (FileWriter outputStream2 = new FileWriter(writeTo);
				FileReader inputStream2 = new FileReader(readin);
				BufferedReader bufferStream2 = new BufferedReader(inputStream2);
				PrintWriter printStream2 = new PrintWriter(outputStream2);) 
		{			 
			String l;
			while ((l = bufferStream2.readLine()) != null) {
				printStream2.println(l);
			}
		}
		
	}

}
