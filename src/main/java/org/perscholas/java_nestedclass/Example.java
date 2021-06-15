package org.perscholas.java_nestedclass;

public class Example {

	public static class NestedExample {
		public static void hello() {
			System.out.println("Hello from Nested Class!");
		}
	}
	
	public class InnerExample {
		public void hello() {
			System.out.println("Hello from Inner Class!");
		}
	}
}
