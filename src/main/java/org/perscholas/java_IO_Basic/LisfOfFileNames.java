package org.perscholas.java_IO_Basic;

import java.io.File;

/**
 * Write a Java program to get a list of all file/directory names inside the Documents folder.
 *
 */
public class LisfOfFileNames {

	public static void main(String[] args) {
		String location = "/Users/HRK/showtime";
		File file = new File(location);
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
		}
		
	}

}
