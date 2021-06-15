package org.perscholas.java_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		Map<Integer, String> numMap = new HashMap<>();
		numMap.put(1, "one");
		numMap.put(2, "two");
		numMap.put(3, "three");
		System.out.println(numMap.get(2));
		numMap.put(null, "nothing");
		System.out.println(numMap.get(null));
		numMap.put(3, "four");
		numMap.replace(4, "four");
		System.out.println(numMap);
		
		numMap.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}