package org.perscholas.java_generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Number> {

	List<T> values;
	public Box() {
		values = new ArrayList<T>();
	}
	
	public void add(T value) {
		values.add(value);
	}
	
	public List<T> get() {
		return values;
	}
	
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.add(12);
		intBox.add(24);
		intBox.add(42);
		intBox.add(45);
		System.out.println(intBox.get());
		
		// This will cause error
//		Box<String> strBox = new Box<>();
//		strBox.add("apple");
//		strBox.add("banana");
//		strBox.add("cherry");
//		System.out.println(strBox.get());
		
		Box<Double> dblBox = new Box<>();
		dblBox.add(1.2);
		dblBox.add(2.4);
		dblBox.add(4.2);
		dblBox.add(4.5);
		System.out.println(dblBox.get());
	}
}
