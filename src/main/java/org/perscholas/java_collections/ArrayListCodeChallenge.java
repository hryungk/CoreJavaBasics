package org.perscholas.java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
 * Given two sorted lists:
 * 3, 4, 6, 7, 9, 12, 15, 17, 23
 * 3, 5, 7, 9, 10, 13, 15, 18, 23
 * Create an ArrayList<Integer> that contains only the values present in both
 * of these lists.
 * Constraint: DO NOT use any nested loops.
 */
public class ArrayListCodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = Arrays.asList(3, 4, 6, 7, 9, 12, 15, 17, 23);
		List<Integer> list2 = Arrays.asList(3, 5, 7, 9, 10, 13, 15, 18, 23);
		List<Integer> commonList = new ArrayList<>();
		
//		// Nested loop
//		for (Integer i : list1) {
//			if (list2.contains(i))
//				commonList.add(i);
//		}
		
//		// Using Dual indices
//		int i1 = 0;
//		int i2 = 0;
//		while (i1 < list1.size() && i2 < list2.size()) {
//			Integer int1 = list1.get(i1);
//			Integer int2 = list2.get(i2);
//			if (int1 == int2) {
//				commonList.add(int1);
//				i1++;
//				i2++;
//			} else if (int1 < int2){
//				i1++;
//			} else
//				i2++;
//		}
		
		for (Integer i : list1) {
			if (Collections.binarySearch(list2, i) >= 0)
				commonList.add(i);
		}
		
		
		System.out.println(commonList);
	}

}
