package org.perscholas.java_IO_Basic;

import java.io.File;

/**
 * Write a Java program to get specific files by extensions from a specified folder.
 *
 */
public class LisfOfFileWithSpecificExtension {

	public static void main(String[] args) {
		String location = "/Users/HRK/showtime";
		File file = new File(location);
		String[] fileList = file.list();
		for (String f : fileList) {
			if (f.toLowerCase().endsWith(".txt"))
				System.out.println(f);
		}
		
	}

}
