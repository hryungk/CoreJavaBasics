package org.perscholas.java_filesandstrorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {

		String location = "src/main/java/org/perscholas/java_filesandstrorage/hello.txt";
		File file = new File(location);
		FileWriter writer = new FileWriter(file, true);
		writer.write("Hello\n");
		writer.write("World\n");
		writer.close();

	}

}
