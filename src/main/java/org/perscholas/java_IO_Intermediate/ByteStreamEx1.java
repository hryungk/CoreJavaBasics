package org.perscholas.java_IO_Intermediate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamEx1 {

	public static void main(String[] args) throws IOException {
		String location = "src/main/java/org/perscholas/java_IO_Intermediate/";		
		
		try (FileInputStream fis = new FileInputStream(location + "sample.txt");
				FileOutputStream fos = new FileOutputStream(location + "sampleTo.txt");)
		{
			int temp;
			while ((temp = fis.read()) != -1) { // read byte by byte
				fos.write((byte)temp); // write byte by byte
//				System.out.println(Character.toChars(temp));
				System.out.print(Character.toChars(temp));
			}
		}
		
	}

}
