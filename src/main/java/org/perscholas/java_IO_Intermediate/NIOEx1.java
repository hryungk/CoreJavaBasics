package org.perscholas.java_IO_Intermediate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NIOEx1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String location = "src/main/java/org/perscholas/java_IO_Intermediate/";	
		try (FileInputStream input = new FileInputStream(location + "sample.txt");
				ReadableByteChannel source = input.getChannel();
				FileOutputStream output = new FileOutputStream(location + "sampleToNIOEx1.txt");
				WritableByteChannel destination = output.getChannel();)
		{
			copyData(source, destination);		
		} catch (IOException e) {
			
		}
		
	}
	
	private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
		while (src.read(buffer) != -1) {
			buffer.flip(); // The buffer is used to be drained
			// Make sure that buffer was fully drained
			while (buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear();
			// Now the buffer is empty; ready for the filling
		}
	}

}
