package org.perscholas.java_collections;

import java.util.Stack;

/**
 * 
 * @author Charlie de la Rosa
 * 
 * References:
 * http://tutorials.jenkov.com/java-collections/stack.html
 * https://www.geeksforgeeks.org/stack-class-in-java/
 */

public class StackApp {

	public static void main(String[] args) {
		Stack<String> colors = new Stack<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		String poppedColor = colors.pop();
		System.out.println(poppedColor);
		System.out.println(colors);
		colors.push("blue");
		System.out.println(colors);
	}

}