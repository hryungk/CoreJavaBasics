package org.perscholas.java_math_character_string;

public class PrintFormat {

	public static void main(String[] args) {
		
		int i = 1024;
		byte b = 127;
		double d = 1.232, tiny = d/1000000.0;
		boolean bool = true;
		System.out.printf("This is an integer: %d and this is byte: %d.\n", i, b);
		System.out.printf("This is double: %.4f and this is entineering: %.4e.\n", d, tiny);
		System.out.printf("This is a string: %s", "This is a string\n");
		System.out.printf("This is a boolean: %b", bool);

	}

}
