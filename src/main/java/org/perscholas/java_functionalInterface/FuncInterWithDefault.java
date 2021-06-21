package org.perscholas.java_functionalInterface;

@FunctionalInterface
public interface FuncInterWithDefault {

	public void square(int a);
	
	default void show() {
		System.out.println("Default method executed.");
	}
	
	static void staticMethod() {
		System.out.println("Static method executed.");
	}
	
}
