package org.perscholas.java_arrays;

import java.util.Arrays;

public class MultiDimensionalArrayExercise {

	public static void main(String[] args) {

		/*
		 * Initialize a Initialize a two-dimensional array with integers sequentially
		 * incremented by 10. Print all the elements afterwards.
		 */
		// Declare a 2D matrix
		int row = 5;
		int col = 7;
		int[][] matrix1 = new int[row][col];

		// Initialize the matrix
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrix1[i][j] = 10 * col * i + 10 * j;

		// Print the matrix
		for (int i = 0; i < row; i++)
			System.out.println(Arrays.toString(matrix1[i]));

		System.out.println();

		
		/*
		 * Initialize a two-dimensional array with random numbers. Print all the
		 * elements afterwards.
		 */
		// Declare a 2D matrix
		int[][] matrix2 = new int[row][col];

		// Initialize the matrix with random numbers
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrix2[i][j] = (int) (Math.random() * 100);

		// Print the matrix
		for (int i = 0; i < row; i++)
			System.out.println(Arrays.toString(matrix2[i]));

		System.out.println();
		

		/*
		 * Write code to work with 3-dimensional arrays, emphasizing:
		 * 
		 * Array declaration 
		 * Array initialization 
		 * Array access
		 */
		// Declare a 3D matrix.
		int z = 3;
		int[][][] matrix3 = new int[z][row][col];
		
		// Initialize the matrix.
		for (int i = 0; i < z; i++)
			for (int j = 0; j < row; j++)
				for (int k = 0; k < col; k++)
					matrix3[i][j][k] = i*(col*row) + col*j + k;
		
		// Print the matrix
		for (int i = 0; i < z; i++) {
			System.out.println("Matrix " + (i+1));
			for (int j = 0; j < row; j++) {
				System.out.println(Arrays.toString(matrix3[i][j]));
			}
			System.out.println();
		}

	}
}
