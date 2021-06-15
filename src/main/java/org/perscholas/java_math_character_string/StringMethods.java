package org.perscholas.java_math_character_string;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println("Formatting numbers");
		double x = Math.sqrt(10);
		String prettyOutput = String.format("%.2f", x);
		System.out.println(prettyOutput);
		System.out.println(String.format("%.4f %d", Math.PI, 2));		
		
		System.out.println("\ntrim method");
		String message = "    Hello Java Developers!    ";
		System.out.println(message.trim());
		
		System.out.println("\nconcat method");
		String first = "Hello";
		String second = " World!";
		System.out.println(first.concat(second));
		System.out.println(first + second);
		
		System.out.println("\nReading string from console");
		Scanner input = new Scanner(System.in); System.out.print("Enter three words separated by spaces: "); 
//		String s1 = input.next();
//		String s2 = input.next();
//		String s3 = input.next();
//		System.out.println("s1 is " + s1);
//		System.out.println("s2 is " + s2);
//		System.out.println("s3 is " + s3);
		input.close();
		
		System.out.println("\nCompare strings");
		String s1 = "first string";
		String s2 = "first string";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		String s3 = new String("first string");
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		s1 = "apple";
		s2 = "Banana";
		System.out.println(s1.compareTo(s2));
		s3 = "Apple";
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.startsWith("app"));
		System.out.println(s1.startsWith("App"));
		System.out.println(s1.endsWith("ple"));
		
		System.out.println("\nSubstrings");
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,4));
		
				
	}

}