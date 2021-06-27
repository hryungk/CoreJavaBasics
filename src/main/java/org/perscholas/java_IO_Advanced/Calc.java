package org.perscholas.java_IO_Advanced;

import java.util.Arrays;
import java.util.List;

public class Calc {

	private int sum;
	private int num1, num2;
	
	public Calc() {
		sum = 0;
		num1 = num2 = 0;
	}
	
	Calc performSum(List<Integer> list) {
		for (Integer i : list)
			sum += i;
		return this;
	}
	
	void displaySum() {
		System.out.println(sum);
	}
	
	Calc numberToPerformOn(int numA, int numB) {
		num1 = numA;
		num2 = numB;
		return this;
	}
	
	void operator(String op) {
		switch (op) {
		case "+":
			System.out.printf("%d%n", num1 + num2);
			break;
		case "-":
			System.out.printf("%d%n", num1 - num2);
			break;
		case "*":
			System.out.printf("%d%n", num1 * num2);
			break;
		case "/":
			System.out.printf("%.2f%n", (double)num1 / num2);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
	
	public static void main(String[] args) {
		Calc classObj = new Calc();
		List<Integer> num = Arrays.asList(3, 4, 3);
		classObj.performSum(num).displaySum();
		
		classObj.numberToPerformOn(2, 3).operator("+");
		classObj.numberToPerformOn(2, 3).operator("-");
		classObj.numberToPerformOn(2, 3).operator("*");
		classObj.numberToPerformOn(2, 3).operator("/");
		
	}
}
