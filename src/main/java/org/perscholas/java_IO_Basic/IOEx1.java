package org.perscholas.java_IO_Basic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Read and Write Example - Read one character at a time
 * 
 */
public class IOEx1 {
	public static void main (String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		String location = "src/main/java/org/perscholas/java_IO_Basic/";
		File readin = new File(location + "sample.txt");
		File writeTo = new File(location + "sampleTo.txt");
		
		try {
			inputStream = new FileReader(readin);
			outputStream = new FileWriter(writeTo);
			
			/* It uses an int variable "c" to read from and write to a file.
			 * The int variable holds a character value.
			 * Using an int as the return type allows read() to use -1 to indicate that 
			 * it has reached the end of the stream. 
			 */
			int c;
			while ((c = inputStream.read()) != -1) {
				System.out.println(c);
				outputStream.write(c);
			}
		} finally {
			/* Closing a stream when int's no longer needed is very important.
			 * That's why we use a finally block to guarantee that both streams will be closed
			 * even if an error occurs. 
			 */
			/* One possible error is that the program was unable to open one or both files.
			 * When that happens, the stream variable corresponding to the file never changes
			 * from its initial null value. That's why we make sure that each stream variable 
			 * contains an object reference before invoking close.
			 */
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}		
		
		/* try-with-resources method (more up-to-date method) */
		try (FileWriter outputStream2 = new FileWriter(writeTo);
			FileReader inputStream2 = new FileReader(readin);) {			 
			int c;
			while ((c = inputStream2.read()) != -1) {
				outputStream2.write(c);
			}
		}
		
	}

}
