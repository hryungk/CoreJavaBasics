package org.perscholas.java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaConsumer {
	
	public static void print2(String str, int num) {
		System.out.println(str + "\t" + num);
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Larry", "Steve", "James", "Conan", "Ellen"));
		names.forEach(name -> System.out.println(name));
		
		// Using method reference, the same result will be displayed
		/* You use lambda expressions to create anonymous methods. 
		 * Sometimes, however, a lambda expression does nothing but 
		 * call an existing method. In those cases, it's often clearer 
		 * to refer to the existing method by name. Method references 
		 * enable you to do this; they are compact, easy-to-read lambda 
		 * expressions for methods that already have a name.
		 * */
		names.forEach(System.out::println);
		
		// stream() will usually yield the same result.
		names.stream().forEach(System.out::println);

		// Using enhanced for-loop; also yields the same result
		for (String name : names) {
			System.out.println(name);
		}
		
		// Example of using method reference for methods with multiple parameters 
		Map<String, Integer> map = new HashMap<>();
		map.put("Larry", 4);
		map.put("Steve", 34);
		map.put("James", 3);
		map.put("Conan", 9);
		map.put("Ellen", 78);
				
		map.forEach((str, num) -> LambdaConsumer.print2(str, num));
		map.forEach(LambdaConsumer::print2); 
	}

}
