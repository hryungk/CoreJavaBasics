package org.perscholas.java_functionalInterface;

import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {
		/*
		 * Returns a boolean
		 * 
		 * Predicate interface definition:
		 * public interface Predicate<T> {
		 *     boolean test(T t);
		 * }
		 */
		Predicate<String> moreThanFiveChars = s -> s.length() > 5;
		System.out.println(moreThanFiveChars.test("abcde"));
		System.out.println(moreThanFiveChars.test("abcdef"));
	}

}
