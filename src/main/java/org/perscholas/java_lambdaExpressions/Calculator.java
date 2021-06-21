package org.perscholas.java_lambdaExpressions;

@FunctionalInterface
public interface Calculator<T> {
	public T compute(T num1, T num2, String operator);
}
