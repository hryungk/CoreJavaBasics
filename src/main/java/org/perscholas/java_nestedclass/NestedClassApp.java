package org.perscholas.java_nestedclass;

public class NestedClassApp {

	public static void main(String[] args) {
		Example.NestedExample.hello();
		
		Example ex = new Example();
		Example.InnerExample innerEx = ex.new InnerExample();
		innerEx.hello();

	}

}
