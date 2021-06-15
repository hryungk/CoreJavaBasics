package org.perscholas.java_math_character_string;

import java.util.Scanner;

public class ComputingAnglesOfATriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x- and y-coordinates of the three corner points in a triangle:");
		System.out.print("\tx-coordinate of the first corner point in a triangle (x1): ");
		double x1 = scan.nextDouble();
		System.out.print("\ty-coordinate of the first corner point in a triangle (y1): ");
		double y1 = scan.nextDouble();
		System.out.print("\tx-coordinate of the second corner point in a triangle (x2): ");
		double x2 = scan.nextDouble();
		System.out.print("\ty-coordinate of the second corner point in a triangle (y2): ");
		double y2 = scan.nextDouble();
		System.out.print("\tx-coordinate of the third corner point in a triangle (x3): ");
		double x3 = scan.nextDouble();
		System.out.print("\ty-coordinate of the third corner point in a triangle (y3): ");
		double y3 = scan.nextDouble();
		scan.close();
		
		double a = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
		double b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
		double c = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
		
		double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
		
		char deg = '\u00B0';
		System.out.println("A = " + Math.round(Math.toDegrees(A)) + deg);
		System.out.println("B = " + Math.round(Math.toDegrees(B)) + deg);
		System.out.println("C = " + Math.round(Math.toDegrees(C)) + deg);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
