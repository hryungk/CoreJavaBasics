package org.perscholas.java_IO_Intermediate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryFilesWriteEx2 {

	public static void main(String[] args)  {
		// The name of the file to open
		String location = "src/main/java/org/perscholas/java_IO_Intermediate/";
		String fileName = "sample_BinaryFilesWriteEx.txt"; 
		try (FileWriter fileWriter = new FileWriter(location + fileName);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);)
		{
			bufferedWriter.write("Hello there, ");
			bufferedWriter.write("here is some text.");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing");
			bufferedWriter.write(" the text to the file.");
		} catch (IOException e) {
			System.out.println("Error writing to file '" + fileName + "'");
		}

	}

}
