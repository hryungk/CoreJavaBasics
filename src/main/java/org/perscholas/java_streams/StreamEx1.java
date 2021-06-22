package org.perscholas.java_streams;

import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		Stream.of("a1", "a2","a3")
		.findFirst()
		.ifPresent(System.out::println);
				
	}
}
