package org.perscholas.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>(Arrays.asList("ONE", "TWO", "THREE"));
		
		Stream<String> stream = stringList.stream();

//		long count = stream
//				.map((value) -> {return value.toLowerCase();})
//				.count();
//		long count = stream.map(value -> value.toLowerCase()).count(); // The same result as above with this line		
//		long count = stringList.stream().map(value -> value.toLowerCase()).count(); // No need to create a stream object
//		long count =  stream.map(String::toLowerCase).count(); // Using method reference
		
//		System.out.println("count  = " + count);
		
		
		Stream<String> longStringStream = stream.filter(value -> value.length() >= 3);
		
		longStringStream.forEach(System.out::println);

		List<String> names = new ArrayList<>(Arrays.asList("Larry", "Steve", "James", "Conan", "Ellen"));
		names.stream()
		.filter(s -> s.startsWith("C") || s.startsWith("S"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
	}

}
