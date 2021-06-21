package org.perscholas.java_functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
/**
 * References:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html
 * http://tutorials.jenkov.com/java-functional-programming/functional-interfaces.html
 * https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
 * 
 */
public class FunctionApp {

	public static void main(String[] args) {
		/* 
		 * Function interface definition:
		 * public interface Function<T,R> {
		 * 	   public <R> apply(T parameter);
		 * }
		 */
		// First, assign a lambda function to an instance of Function
		Function<String, String> greet = s -> s + " World!";
		// Print out the result
		System.out.println(greet.apply("Hello"));
		System.out.println();
		
		// Shuffle a string
		Function <String, String> shuffleString = s -> {
			String[] strArr = s.split("");
			List<String> strList = Arrays.asList(strArr);
			Collections.shuffle(strList);
			return String.join("", strList);
		};
		
		// apply()
		String str = shuffleString.apply("Hello World!");
		System.out.println(str);
		System.out.println();
		
		// andThen()
		shuffleString = shuffleString.andThen(s -> s + " - Hello World!");
		System.out.println(shuffleString.apply("Hello World!"));
		System.out.println();
				
		// compose()str.length()
		/*
		 * Parameterized function will run first followed by the original function
		 */
		shuffleString = shuffleString.compose(String::toUpperCase);
		System.out.println(shuffleString.apply("Hello World"));
		System.out.println();

	}

}