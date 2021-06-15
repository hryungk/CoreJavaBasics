package org.perscholas.java_basics;

public class JavaOperatorsAndNumbers {

	public static void main(String[] args) {
		/*
		 * Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 
		 * 1 
		 * 8 
		 * 33 
		 * 78 
		 * 787 
		 * 33987
		 */
		System.out.println("Problem 1");
		System.out.println("1 = 1_(2)" + " Answer: " + Integer.toBinaryString(1));
		System.out.println("8 = 1000_(2)" + " Answer: " + Integer.toBinaryString(8));
		System.out.println("33 = 100001_(2)" + " Answer: " + Integer.toBinaryString(33));
		System.out.println("78 = 1001110_(2)" + " Answer: " + Integer.toBinaryString(78));
		System.out.println("33987 = 1000010011000011_(2)" + " Answer: " + Integer.toBinaryString(33987));
		System.out.println();

		/*
		 * Convert the following binary numbers to decimal notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 
		 * 0010 
		 * 1001 
		 * 0011 0100	 
		 * 0111 0010 
		 * 0010 0001 1111 
		 * 0010 1100 0110 0111
		 */
		System.out.println("Problem 2");
		System.out.println("0010_(2) = 2" + " Answer: " + Integer.parseUnsignedInt("0010", 2));
		System.out.println("1001_(2) = 9" + " Answer: " + Integer.parseUnsignedInt("1001", 2));
		System.out.println("0011 0100_(2) = 52" + " Answer: " + Integer.parseUnsignedInt("00110100", 2));
		System.out.println("0111 0010_(2) = 114" + " Answer: " + Integer.parseUnsignedInt("01110010", 2));
		System.out.println("0010 0001 1111_(2) = 543" + " Answer: " + Integer.parseUnsignedInt("001000011111", 2));
		System.out.println("0010 1100 0110 0111_(2) = 11367" + " Answer: " + Integer.parseUnsignedInt("0010110001100111", 2));		
		System.out.println();
		
		/*
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation. Do the preceding exercise with the
		 * following values:
		 * 
		 * 9 
		 * 17 
		 * 88
		 * 
		 */
		System.out.println("Problem 3");
		int x = 2;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x <<= 1; // predicted decimal value: 4, binary string: 100
		System.out.println("After x<<=1: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 9;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x <<= 1; // predicted decimal value: 18, binary string: 10010
		System.out.println("After x<<=1: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 17;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x <<= 1; // predicted decimal value: 34, binary string: 100010
		System.out.println("After x<<=1: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 88;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x <<= 1; // predicted decimal value: 176, binary string: 10110000
		System.out.println("After x<<=1: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		System.out.println();
		
		/*
		 * Write a program that declares a variable x and assigns 150 to it and prints
		 * out the binary string version of the number. Now use the right shift operator
		 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
		 * what you anticipate the decimal and binary values to be. Now print the value
		 * of x and the binary string. Do the preceding exercise with the following
		 * values:
		 * 
		 * 225 
		 * 1555 
		 * 32456
		 */
		System.out.println("Problem 4");
		x = 150;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x >>= 2; // predicted decimal value: 37, binary string: 100101
		System.out.println("After >>=2: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 225;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x >>= 2; // predicted decimal value: 56, binary string: 111000
		System.out.println("After >>=2: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 1555;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x >>= 2; // predicted decimal value: 388, binary string: 110000100
		System.out.println("After >>=2: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x = 32456;
		System.out.println("x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		x >>= 2; // predicted decimal value: 8114, binary string: 1111110110010
		System.out.println("After >>=2: x_(10) = " + x + ", x_(2) = " + Integer.toBinaryString(x));
		System.out.println();

		/*
		 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
		 * 17 to y. Write a comment that indicates what you predict will be the result
		 * of the bitwise & operation on x and y. Now use the bitwise & operator to
		 * derive the decimal and binary values and assign the result to z. Now, with
		 * the preceding values, use the bitwise | operator to calculate the “or” value
		 * between x and y. As before, write a comment that indicates what you predict
		 * the values to be before printing them out.
		 */
		System.out.println("Problem 5");
		x = 7;
		int y = 17, z;
		z = x & y; // 111 & 10001 = 1 (2) = 1 (10)
		System.out.println(x + " & " + y + " = " + z + "(10), " + Integer.toBinaryString(z) + "(2)");
		z = x | y; // 111 | 10001 = 10111 (2) = 23 (10)
		System.out.println(x + " | " + y + " = " + z + "(10), " + Integer.toBinaryString(z) + "(2)");
		System.out.println();
		
		/*
		 * Write a program that declares an integer variable, assigns a number, and uses
		 * a postfix increment operator to increase the value. Print the value before
		 * and after the increment operator.
		 */
		System.out.println("Problem 6");
		int num = 30;
		System.out.println("number = " + num + ", postfix increment: " + num++);		
		System.out.println();
		
		/*
		 * Write a program that demonstrates at least 3 ways to increment a variable by
		 * 1 and does this multiple times. Assign a value to an integer variable, print
		 * it, increment by 1, print it again, increment by 1, and then print again.
		 */
		System.out.println("Problem 7");
		System.out.println("number = " + num + ", num++ = " + num++ + ", num++ = " + num++);
		System.out.println("number = " + num + ", ++num = " + ++num + ", ++num = " + ++num);
		System.out.print("number = " + num);
		num += 1;
		System.out.print(", num += 1: " + num);
		num += 1;
		System.out.println(", num += 1: " + num);		
		System.out.println();
		
		/*
		 * Write a program that declares 2 integer variables, x, and y, and then assigns
		 * 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		 * added to y and print the result. Notice the value of the sum (should be 14).
		 * Now change the increment operator to postfix (x++) and re-run the program.
		 * Notice what the value of sum is. The first configuration incremented x and
		 * then calculated the sum while the second configuration calculated the sum and
		 * then incremented x.
		 */
		System.out.println("Problem 8");
		x = 5;
		y = 8;
		int sum = ++x + y;
		System.out.println("++x + y = " + sum);
		x = 5;
		sum = x++ + y;
		System.out.println("x++ + y = " + sum);
		System.out.println();
	}

}
