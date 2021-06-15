package org.perscholas.java_conditionals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		scan.close();
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println("The year you entered is" + (result ? "" : " not") + " a leap year.");

	}

}
