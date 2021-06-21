package org.perscholas.java_lambdaExpressions;

public class MyCalc<T> {
	
	private Calculator<Integer> sum = (num1, num2, operator) -> num1 + num2;
	private Calculator<Integer> subtract = (num1, num2, operator) -> num1 - num2;
	private Calculator<Float> multiply = (num1, num2, operator) -> num1 * num2;
	private Calculator<Float> divide = (num1, num2, operator) -> num1 / num2;
	
	public Calculator<Integer> getSum() {
		return sum;
	}
	public Calculator<Integer> getSubtract() {
		return subtract;
	}
	public Calculator<Float> getMultiply() {
		return multiply;
	}
	public Calculator<Float> getDivide() {
		return divide;
	}		
}
