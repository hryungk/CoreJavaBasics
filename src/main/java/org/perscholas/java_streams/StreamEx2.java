package org.perscholas.java_streams;

import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {

		/*
		 * The following code snippet returns nothing to the console ➢ It isn’t even
		 * executed Intermediate ops only executed when terminal op is present	
		 */
		Stream.of("d1", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return true;
		});
		System.out.println();
		
		/*
		 * The following code will execute both filter and forEach's println method
		 */
		Stream.of("d1", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return true;
		})
		.forEach(s -> System.out.println("forEach: " + s));
		System.out.println();		
		
		/*
		 * Example below contains two intermediate ops and one terminal op 
		 * Both map & filter are called once for each string
		 * forEach is only called once
		 */		
		Stream.of("d2", "a2", "b1", "b3", "c")
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		})
		.forEach(s -> System.out.println("forEach: " + s));
		System.out.println();
		
		/*
		 * Moving filter to the start of the chain
		 * ➢ Reduces number of executions
		 * ➢ Map is only called once now
		 */
		Stream.of("d2", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		})
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})		
		.forEach(s -> System.out.println("forEach: " + s));
	}

}
