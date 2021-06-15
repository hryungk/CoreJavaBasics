package org.perscholas.java_map;

import java.util.LinkedHashMap;
import java.util.Map;

/** 
 * 
 * @author Charlie de la Rosa
 *
 * References:
 * https://www.baeldung.com/java-linked-hashmap
 * https://www.geeksforgeeks.org/linkedhashmap-class-java-examples/
 */

public class LinkedHashMapApp {
	// Insertion order will always be maintained

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(8, "eight");
		linkedHashMap.put(5, "five");
		System.out.println(linkedHashMap);
	}
}