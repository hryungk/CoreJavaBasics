package org.perscholas.java_arrays;

import java.util.Arrays;

public class CoreJavaExercises_Arrays {

	public static void main(String[] args) {

		assignArray();
		System.out.println();
		arrayMiddle();
		System.out.println();
		stringArray();
		System.out.println();
		arrayBoundary();
		System.out.println();
		initializeArray();
		System.out.println();
		initializeArray2();
		System.out.println();
		printExceptMiddle();
		System.out.println();
		swapFirstMiddle();
		System.out.println();
		sortArray();
		System.out.println();
		mixedArray();
		System.out.println();
		
	}
	

	/**
	 * Write a program that creates an array of integers with a length of 3. Assign
	 * the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	private static void assignArray() {
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.println("Element " + i + ": " + array[i]);
		}
	}
	
	/** 
	 * Write a program that returns the middle element in an array. Give the
	 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
	 * following output: 7
	 */
	private static void arrayMiddle() {
		int[] array = {13, 5, 7, 68, 2};
		System.out.println("Middle element in " + Arrays.toString(array) +": "+ array[array.length/2]);
	}

	/** 
	 * Write a program that creates an array of String type and initializes it with
	 * the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
	 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
	 * the new array to verify that the original array was copied.
	 */
	private static void stringArray() {
		String[] array = {"red", "green", "blue", "yellow"};
		System.out.println("Array length: " + array.length);
		String[] copy = array.clone();
		System.out.println("Original array: " + Arrays.toString(array));
		System.out.println("Copy array: " + Arrays.toString(copy));
	}
	

	
	/**
	 * Write a program that creates an integer array with 5 elements (i.e.,
	 * numbers). The numbers can be any integers. Print out the value at the first
	 * index and the last index using length - 1 as the index. Now try printing the
	 * value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
	 * of exception which is produced. Now try to assign a value to the array index
	 * 5. You should get the same type of exception.
	 */
	private static void arrayBoundary() {
		int[] array = {31, 63, 29, 18, 47};
		System.out.println("First value: " + array[0]);
		System.out.println("First value: " + array[array.length-1]);
//		System.out.println("First value: " + array[array.length]); // Creates ArrayIndexOutOfBoundsException
//		System.out.println("First value: " + array[5]); // Creates ArrayIndexOutOfBoundsException
	}
	

	/**
	 * Write a program where you create an integer array with a length of 5. Loop
	 * through the array and assign the value of the loop control variable (e.g., i)
	 * to the corresponding index in the array.
	 */
	private static void initializeArray() {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++)
			array[i] = i;
		System.out.println(Arrays.toString(array));
	}

	/**
	 * Write a program where you create an integer array of 5 numbers. Loop through
	 * the array and assign the value of the loop control variable multiplied by 2
	 * to the corresponding index in the array.
	 */
	private static void initializeArray2() {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++)
			array[i] = 2*i;
		System.out.println(Arrays.toString(array));
	}

	/**
	 * Write a program where you create an array of 5 elements. Loop through the
	 * array and print the value of each element, except for the middle (index 2)
	 * element.
	 */
	private static void printExceptMiddle() {
		int[] array = {31, 63, 29, 18, 47};
		for (int i = 0; i < array.length; i++) {
			if (i != array.length/2)
				System.out.println("Element " + i + ": " + array[i]);
		}
	}
	
	/**
	 * Write a program that creates a String array of 5 elements and swaps the first
	 * element with the middle element without creating a new array.
	 */
	private static void swapFirstMiddle() {
	
		String[] array = {"first", "second", "third", "fourth", "fifth"};
		String temp = array[0];
		array[0] = array[array.length/2];
		array[array.length/2] = temp;
		System.out.println(Arrays.toString(array));
	}
	
	/** 
	 * Write a program to sort the following int array in ascending order: {4, 2, 9,
	 * 13, 1, 0}. Print the array in ascending order, print the smallest and the
	 * largest element of the array. The output will look like the following:
	 *  
	 * Array in ascending order: 0, 1, 2, 4, 9, 13
	 * The smallest number is 0
	 * The biggest number is 13
	 */
	private static void sortArray() {
		int[] array = {4, 2, 9, 13, 1, 0};
		Arrays.sort(array);
		System.out.println("Array in ascending order: " + Arrays.toString(array));
		System.out.println("The smallest number is " + array[0]);
		System.out.println("The largest number is " + array[array.length-1]);
	}

	/**
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the
	 * array.
	 */
	private static void mixedArray() {
		Object[] array = {31, "String 1", "String 2", "String 3", 1.538};
		System.out.println(Arrays.toString(array));
	}
}
