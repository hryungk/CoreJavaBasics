package org.perscholas.java_arrays;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] array = {3, 9, 1, 6, 4};
		System.out.println("Bubble sort of " + Arrays.toString(array));
		bubbleSort(array);
		System.out.println("Descending Bubble sort of " + Arrays.toString(array));
		bubbleSortDesc(array);

		double[] arrayFractional = {3.2, 9.68, 1.16, 6.54, 0.4};
		System.out.println("Bubble sort of " + Arrays.toString(arrayFractional));
		bubbleSort(arrayFractional);
		System.out.println("Descending Bubble sort of " + Arrays.toString(arrayFractional));
		bubbleSortDesc(arrayFractional);
		
		
		int[] array2 = {2, 9, 5, 4, 8, 1, 6};
		System.out.println("Selection sort of " + Arrays.toString(array2));
		selectionSort(array2);
		

	}
	
	private static void bubbleSort(int[] a) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < a.length; ++i) {
				if (a[i-1] > a[i]) {
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					swapped = true;
				}	
			}
			System.out.println(Arrays.toString(a));
		}
	}
	
	private static void bubbleSort(double[] a) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < a.length; ++i) {
				if (a[i-1] > a[i]) {
					double temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					swapped = true;
				}	
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void bubbleSortDesc(int[] a) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < a.length; ++i) {
				if (a[i-1] < a[i]) {
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					swapped = true;
				}	
			}
			System.out.println(Arrays.toString(a));
		}
	}
	
	private static void bubbleSortDesc(double[] a) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < a.length; ++i) {
				if (a[i-1] < a[i]) {
					double temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					swapped = true;
				}	
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIdx])
					minIdx = j;
			}
			int temp = a[i];
			a[i] = a[minIdx];
			a[minIdx] = temp;
			System.out.println(Arrays.toString(a));
		}
	}
}
