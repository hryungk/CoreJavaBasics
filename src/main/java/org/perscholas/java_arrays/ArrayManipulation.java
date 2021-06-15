package org.perscholas.java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(deleteFromArray(array, 3)));
		System.out.println(Arrays.toString(insertIntoArray(array, 7, 3)));

	}

	public static int[] deleteFromArray(int[] values, int indexToDelete) {
		int[] result = new int[values.length-1];
		for (int i = 0; i < values.length-1; i++) {
			if (i < indexToDelete)
				result[i] = values[i];
			else
				result[i] = values[i + 1];
		}
		return result;
	}
	
	public static int[] insertIntoArray(int[] values, int newValue, int newValueIndex) {
		int[] result = new int[values.length+1];
		for (int i = 0; i < values.length+1; i++) {
			if (i < newValueIndex)
				result[i] = values[i];
			else
				result[i] = values[i - 1];
		}
		result[newValueIndex] = newValue;
		return result;
	}
}
