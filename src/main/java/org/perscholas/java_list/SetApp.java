package org.perscholas.java_list;

import java.util.*;
import java.util.function.Consumer;

public class SetApp {
	
	private static Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
	
	public static void main(String[] args) {
		// Create a list with duplicates and print it.
		List<String> colorList = Arrays.asList("red","red","green","green","blue");
		colorList.forEach(System.out::println);
		
		System.out.println();
		
		// Convert the list to a set and print to upper case
		Set<String> colorSet = new HashSet<>(colorList);
		colorSet.forEach(printUpperCase);
		System.out.println();
		
		Set<String> treeColors = new TreeSet<>(colorList);
		treeColors.forEach(printUpperCase);
		System.out.println();
		
		uniqueValuesExample();	
		
	}
	
	private static void uniqueValuesExample() {
		ArrayList<Integer> values = new ArrayList<>(100);
		for (int i = 0; i < 100; i++) {
			int v = 1 + (int) (Math.random() * 50);
			values.add(v); // autobox
		}
		TreeSet<Integer> set = new TreeSet<>(values);
		set.addAll(values); // This will have no effect!
		System.out.format("Of %d values, %d are unique.%n", values.size(), set.size());
	}
	
}