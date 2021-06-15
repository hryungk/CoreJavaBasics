package org.perscholas.java_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyLinkedLIstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<String> myList = new MyLinkedList<>();
		
		myList.add("apple");
		myList.add("banana");
		myList.add("cherry");
		myList.add("Dill");
		
		System.out.println(myList);
		
		String s1 = "apple";
		System.out.println("Contains " + s1 + ": " + myList.contains(s1));
		System.out.println("Remove " + s1 + ": " + myList.remove(s1));
		System.out.println(myList);
		
		myList.add(s1);
		System.out.println("After adding " + s1 + ": " + myList);
		String s2 = "dill";
		System.out.println("Contains " + s2 + ": " + myList.contains(s2));
		String s3 = "cherry";
		System.out.println("Remove " + s3 + ": " + myList.remove(s3));		
		System.out.println(myList);
		
		String s4 = null;
		System.out.println("Contains " + s4 + ": " + myList.contains(s4));
		
		String name = "uncle sam";
		int phone = 99912222;
		Map<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put(name, phone);
		Integer number = phoneBook.get("harry");
		if (number == null)
			System.out.println("Not found");
		
		Set<String> names = new HashSet<>();
		
	}

}
