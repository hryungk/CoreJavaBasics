package org.perscholas.java_lambdaExpressions;

public class FuncExample {

	public static void main(String[] args) {
//		MyFunctionalInterface msg = () -> "Hello";
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};		
		System.out.println(msg.sayHello());
		System.out.println();
		
		MyFunctionalInterface2 f = (num) -> num + 5;		
		System.out.println(f.incrementByFive(22));
		System.out.println();
		
		StringConcat s = (str1, str2) -> str1 + str2;
		System.out.println("Result: " + s.sconcat("Hello" , "World"));
		System.out.println();

		/*
		 * Write a method that generates a Comparator(String) that can be normal and no-space 
		 * or reversed and with-space. Your method should return a lambda expression.
		 */
		ComparatorInterface normal_nospace = str -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				String curLetter = str.substring(i, i+1);
				if (curLetter.equals(" "))
					continue;
				result += curLetter;
			}
			return result;
		};
		System.out.println(normal_nospace.comparator("Hello class of JD"));
		System.out.println();
		
		ComparatorInterface reverse_space = str -> {
			String result = "";
			for (int i = str.length()-1; i >= 0; i--) {
				result += str.substring(i, i+1);				
			}
			return result;
		};
		System.out.println(reverse_space.comparator("Hello class of JD"));
		System.out.println();
	}

}
