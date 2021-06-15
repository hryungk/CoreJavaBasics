package org.perscholas.java_math_character_string;
/** Class exercises on 6/2/2021 */
public class MathclassFeatures {

	public static void main(String[] args) {
		System.out.println("pi = " + Math.PI);
		System.out.println("e = " + Math.E);
		System.out.println("abs(-5.0) = " + Math.abs(-5.0));
		System.out.println("sqrt(25) = " + Math.sqrt(25));
		
		double x = 5.678;
		System.out.println("x = " + x);
		System.out.println("floor(x) = " + Math.floor(x));
		System.out.println("ceil(x) = " + Math.ceil(x));		
		System.out.println("round(x) = " + Math.round(x));
		
		System.out.println("max(3.0, 6.0) = " + Math.max(3.0, 6.0));
		
		System.out.println("random = " + Math.random());
		System.out.println((int) (Math.random()*10)); // Returns a random int between 0 and 9
		System.out.println(50 + (int) (Math.random()*50)); // Returns a random int between 50 and 99

	}

}
