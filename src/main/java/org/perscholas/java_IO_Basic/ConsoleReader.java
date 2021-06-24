package org.perscholas.java_IO_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write Java program to read input from Java console.
 *
 */
public class ConsoleReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input your name: ");
		String name = reader.readLine();
		System.out.println("Your name is: " + name);

	}

}
