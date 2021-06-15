package org.perscholas.java_basics;

public class JavaVariables {

	public static void main(String[] args) {
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */
		System.out.println("Problem 1");
		int int1, int2;
		int1 = 10;
		int2 = 33;
		int sum1 = int1 + int2;
		System.out.println(sum1);
		System.out.println();
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */
		System.out.println("Problem 2");
		double d1, d2;
		d1 = 2.38;
		d2 = 893.398;
		double sum2 = d1 + d2;
		System.out.println(sum2);
		System.out.println();

		/*
		 * Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be?
		 */
		System.out.println("Problem 3");
		int int3;
		double d3;
		int3 = 482;
		d3 = 28.721;
		double sum3 = int3 + d3;
		System.out.println(sum3);
		System.out.println();
		
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? What corrections are needed?
		 */
		System.out.println("Problem 4");
		int int4, int5;
		int4 = 281;
		int5 = 67;
		double div1 = int4 / int5;
		System.out.println(div1);
		double int4_double = (double) int4;
		double div2 = int4_double / int5;
		System.out.println(div2);
		System.out.println();
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and divides the larger by the smaller. Assign the result to a variable. Print
		 * out the result. Now, cast the result to an integer. Print out the result
		 * again.
		 */
		System.out.println("Problem 5");
		double d4, d5;
		d4 = 28.82;
		d5 = 184.11;
		double div3 = d5 / d4;
		System.out.println(div3);
		System.out.println((int) div3);
		System.out.println();
		
		/*
		 * Write a program that declares 2 integer variables, x, and y, and assign 5 to
		 * x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
		 * cast y to a double and assign y/x to q. Print q again.
		 */
		System.out.println("Problem 6");
		int x, y;
		x = 5;
		y = 6;
		double q = y / x;
		System.out.println(q);
		q = (double) y / x;
		System.out.println(q);
		System.out.println();

		/*
		 * Write a program that declares a named constant and uses it in a calculation.
		 * Print the result.
		 */
		System.out.println("Problem 7");
		final double G = 9.8;
		int mass = 60;
		double force = mass * G;
		System.out.println("Gravitational force to " + mass + " kg: " + force +" N");
		System.out.println();

		/*
		 * Write a program where you create 3 variables that represent products at a
		 * cafe. The products could be beverages like coffee, cappuccino, espresso,
		 * green tea, etc. Assign prices to each product. Create 2 more variables called
		 * subtotal and totalSale and complete an “order” for 3 items of the first
		 * product, 4 items of the second product, and 2 items of the third product. Add
		 * them all together to calculate the subtotal. Create a constant called
		 * SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
		 * Be sure to format the results to 2 decimal places.
		 */
		System.out.println("Problem 8");
		double p1 = 4.99, p2 = 9.99, p3 = 6.95;
//		double p1 = 10, p2 = 10, p3 = 10;
		double subtotal, totalSale;
		subtotal = 3 * p1 + 4 * p2 + 2 * p3;
		final double SALES_TAX = 0.1;
		totalSale = subtotal * (1 + SALES_TAX);
		System.out.println("Total sale: " + String.format("$%.2f", totalSale));

	}

}
