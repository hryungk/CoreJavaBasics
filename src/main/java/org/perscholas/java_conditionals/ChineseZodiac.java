package org.perscholas.java_conditionals;

import java.util.Scanner;
/** Write a program that prompts the user to enter a year and displays teh animal for teh year. */
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		scan.close();
		
		String zodiac;
		switch (year % 12) {
		case 0:
			zodiac = "monkey";
			break;
		case 1:
			zodiac = "rooster";
			break;
		case 2:
			zodiac = "dog";
			break;
		case 3:
			zodiac = "pig";
			break;
		case 4:
			zodiac = "rat";
			break;
		case 5:
			zodiac = "ox";
			break;
		case 6:
			zodiac = "tiger";
			break;
		case 7:
			zodiac = "rabbit";
			break;
		case 8:
			zodiac = "dragon";
			break;
		case 9:
			zodiac = "snake";
			break;
		case 10:
			zodiac = "horse";
			break;
		case 11:
			zodiac = "sheep";
		default:
			zodiac = "Something's wrong with your input.";
			break;
		}
		System.out.println("Chinese zodiac of the year " + year + ": " + zodiac);
	}

}
