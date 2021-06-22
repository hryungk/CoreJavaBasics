package org.perscholas.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * IntStreams can replace the regular for loop
 * ➢ Use IntStream.range() to create a stream
 * ➢ Call the lambda forEach method
 */
public class Calculator {
	public static Object CalcExpression(String ex) {
		List<String> expression = Arrays.asList(ex.split(""));
		
		IntStream.range(0, expression.size()).forEach(s ->  {
//			System.out.println(s); // Prints numbers
			System.out.println(expression.get(s)); // Prints each letter
		});
//		IntStream.range(0, expression.size()).forEach(System.out::println); // prints numbers
		return null;
	}
	
	public static void main(String[] args) {
		CalcExpression("Monday");
	}
}
