package org.perscholas.java_arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		// Using a loop
		int[] sourceArray = {1, 2, 3, 4, 5};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++)
			targetArray[i] = sourceArray[i];
		
		// Using array's clone
		int[] values = {1, 2, 3};
		int[] copy = values.clone();
		copy = new int[values.length];
		
		// Using System.arraycopy
		System.arraycopy(sourceArray, 0, copy, 0, copy.length);
		
		// Using Arrays.CopyOf
		int[] expandedValues = Arrays.copyOf(values, 6); // {1, 2, 3, 0, 0, 0}
		System.out.println(Arrays.toString(expandedValues));
	}
}
