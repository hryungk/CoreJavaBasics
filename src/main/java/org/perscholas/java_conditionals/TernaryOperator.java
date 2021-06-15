package org.perscholas.java_conditionals;

public class TernaryOperator {
	
	public static void main (String[] args) {
		int x = 1;
		int y = 0;
		
		if (x > 0)
			y = 1;
		else
			y = -1;
		
		y = (x > 0) ? 1 : -1;
		System.out.println(y);
		
	}

}
