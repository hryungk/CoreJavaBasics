package org.perscholas.java_IO_Basic;

import java.io.File;
import java.io.IOException;

/**
 * If your application needs to create temporary files for some application logic or
 *  unit testing, then you would like to make sure that these temporary files are 
 *  deleted when they are not needed.
 *
 */
public class DeleteFileOnExit {

	public static void main(String[] args) {
		String location = "src/main/java/org/perscholas/java_IO_Basic/myTempFile";
		File temp;
		try {
			temp = File.createTempFile(location, ".txt");
			System.out.println("Temp file created: " + temp.getAbsolutePath());
			
			// temp.delete(); // for deleting immediately
			
			temp.deleteOnExit(); // Delete on runtime exit
			
			System.out.println("Temp file exists: " + temp.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
