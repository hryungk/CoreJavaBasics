package org.perscholas.java_map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Charlie de la Rosa
 *
 * References:
 * https://www.baeldung.com/java-treemap
 * https://www.geeksforgeeks.org/treemap-in-java/
 */

public class TreeMapApp {
	
	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(12, "twelve");
		treeMap.put(4, "four");
		treeMap.put(32, "thirty-two");
		treeMap.put(27, "twenty-seven");
		treeMap.put(1, "one");
		System.out.println(treeMap.containsValue("four"));
		System.out.println(treeMap.containsKey(27));
		
		for (Map.Entry<Integer, String> e: treeMap.entrySet()) {
			System.out.printf("%s ", e.getValue());
		}
		
		System.out.println();
		
		TreeMap<Integer, String> reverseTreeMap = new TreeMap<>(Comparator.reverseOrder());
		reverseTreeMap.putAll(treeMap);
		for (Map.Entry<Integer, String> e: reverseTreeMap.entrySet()) {
			System.out.printf("%s ", e.getKey());
		}
		
		reverseTreeMap.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}