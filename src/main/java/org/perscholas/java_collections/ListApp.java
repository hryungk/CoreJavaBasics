package org.perscholas.java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = new ArrayList<>();		
//		List<String> list = new ArrayList<>(Arrays.asList("red", "green", "blue"));
		
		
		String[] strArr = {"red", "blue", "green"};
		List<String> list = new ArrayList<>(Arrays.asList(strArr));
		list.add("red");
		list.add("green");
		System.out.println(list);
		

		// If you know the size in advance, use the constructor that sets the capacity
		List<Integer> iList = new ArrayList<>(100);
		for (int i = 0; i < 100; i++) iList.add(i);
		System.out.println(iList.size());
		System.out.println(iList.indexOf(50));
		System.out.println(iList.contains(80));
		System.out.println(iList.contains(128));
		boolean success = iList.remove((Integer)80);
		System.out.println(success);
		success = iList.remove((Integer)120);
		System.out.println(success);
		Integer removed = iList.remove(80);
		System.out.println(removed);
		
		iList.add(80);
		iList.add(81);
		
		int sum = 0;
		for (Integer i : iList) sum += i; // Uses Iterable
		System.out.println(sum); // 4950
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < iList.size(); i++) {
			if (max < iList.get(i))
				max = iList.get(i);
		}
		System.out.println(max);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(1, "banana");
		System.out.println(map);
		
	}

}
