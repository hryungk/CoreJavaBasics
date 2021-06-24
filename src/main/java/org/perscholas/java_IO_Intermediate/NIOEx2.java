package org.perscholas.java_IO_Intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOEx2 {

	public static void main(String[] args) throws IOException {
		String location = "src/main/java/org/perscholas/java_IO_Intermediate/";
		String fileName = "sample.txt";
		Path file = Paths.get(location + fileName);
		try (InputStream inputStream = Files.newInputStream(file);
				BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));)			
		{
			System.out.println("Reading the first line of " + fileName + " file: " + bufferReader.readLine());
		
		} catch (IOException e) {
			
		}
		
	}	

}
