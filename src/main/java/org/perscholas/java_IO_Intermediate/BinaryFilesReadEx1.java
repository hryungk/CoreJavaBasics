package org.perscholas.java_IO_Intermediate;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * If you want to read a binary file, or a text file, or a text file containing
 * special characters, you need to use FileInputStream instead of FileReader.
 * Instead of wrapping FileInputStream in a buffer, FileInputStream defines a
 * method called read() that lets you fill a buffer with data, automatically
 * reading just enough bytes to fill the buffer (or less if there aren't that
 * many bytes left to read).
 *
 */
public class BinaryFilesReadEx1 {

	public static void main(String[] args) {
		// The name of the file to open
		String location = "src/main/java/org/perscholas/java_IO_Intermediate/";
		String fileName = "sample2.txt";
		try (FileInputStream inputStream = new FileInputStream(location + fileName);) {
			// Use this array for reading the data
			byte[] buffer = new byte[30];
			/*
			 * The read() method fills the buffer with data and returns the number of bytes
			 * read which may be less than the buffer size, but never more.
			 */
			int total = 0;
			int nRead = 0;
			while ((nRead = inputStream.read(buffer)) != -1) {
				// This statement converts the buffer to a string for displaying the results
				String display = new String(buffer);
				System.out.println(display);
				System.out.println("nRead: " + nRead);
				total += nRead;
			}
			System.out.println("Total: " + total);
		} catch (IOException ex) {
			System.out.println("Error reading file \"" + fileName + "\"");
		}

	}

}