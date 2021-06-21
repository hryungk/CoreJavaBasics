package org.perscholas.java_lambdaExpressions;

import java.util.Scanner;

/**
 * Write a program that can sum, add, multiply or divide two numbers.
 * This class reads in an expression from the user and using a switch statement,
 * it figures out which implementation of the method compute to call.
 * 
 * @author HRK
 *
 */
public class CalcMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an expression to calculate: ");	
		String input = scan.nextLine();
		scan.close();
		String[] params = input.split(" ");
		int num1 = Integer.parseInt(params[0]);
		int num2 = Integer.parseInt(params[2]);		
		String operator = params[1];
		
		MyCalc<Number> myCalc = new MyCalc<>();		
		String answer = "Your operator is not valid."; // For default case
		switch (operator) {
		case "+":
			answer = Integer.toString(myCalc.getSum().compute(num1, num2, operator));
			break;
		case "-":
			answer = Integer.toString(myCalc.getSubtract().compute(num1, num2, operator));
			break;
		case "*":
			answer = Float.toString(myCalc.getMultiply().compute((float) num1, (float)num2, operator));
			break;
		case "/":
			answer = Float.toString(myCalc.getDivide().compute((float) num1, (float)num2, operator));
			break;
		default:
			break;
		}
		System.out.println(input + " = " + answer);
	}

}
