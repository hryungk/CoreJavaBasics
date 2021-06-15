package org.perscholas.java_math_character_string;

public class GreekLetters {

	public static void main(String[] args) {
		char letter = 'A'; // ASCII
		char num_char = '4'; // ASCII
		letter = '\u0041'; // Unicode
		num_char = '\u0034'; // Unicode
		
		System.out.println("letter = " + letter);
		System.out.println("num_char = " + num_char);
		
		char alpha = '\u03b1';
		char beta = '\u03b2';
		char gamma = '\u03b3';
		System.out.println("alpha = " + alpha +" beta = " +  beta + " gamma = " +  gamma);		
	}

}
