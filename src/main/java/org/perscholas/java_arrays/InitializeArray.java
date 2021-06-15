package org.perscholas.java_arrays;

import java.util.Arrays;

public class InitializeArray {

	public static void main(String[] args) {
		int[] myList = new int[9];
		System.out.println(Arrays.toString(myList));
		System.out.println(myList.length);
		System.out.println(myList[2]);
		myList[0] = 1;
		myList[1] = 2; 
		myList[2] = myList[0] + myList[1];
		System.out.println(myList[2]);

	}

}
