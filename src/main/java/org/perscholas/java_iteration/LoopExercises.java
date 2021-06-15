package org.perscholas.java_iteration;

import java.util.Scanner;

public class LoopExercises {

	public static void main(String[] args) {

//		sentinalValue();
//		testAddition();
		repeatAddition();
//		guessTheNumber();
//		advancedMathTool();

//		printMultiplicationTable();
//		greatestCommonDivisor();
//		predictFutureTuition();
//		primeNumbers();
	}

	/**
	 * Write a program that reads and calculates the sum of an unspecified number of
	 * integers. The inptu 0 signifies the end of the input.
	 */
	public static void sentinalValue() {

		Scanner s = new Scanner(System.in);
		int entry = -1;
		int sum = 0;

		while (entry != 0) {
			System.out.print("Please enter an integer (Enter 0 to quit): ");
			entry = s.nextInt();
			if (entry == 0)
				continue;

			sum += entry;
			System.out.println("sum of integers you've entered: " + sum);
		}
		s.close();
		System.out.println("You have quit the game. Thanks for playing!");
	}

	/**
	 * Write a one-off program that exercises a user's addition skills: Generate a
	 * random integer in the range 1 - 100. Generate a second random number in the
	 * same range. Output the two value sand ask the user to enter the sum, like
	 * this: What is 53 + 22? Inform the user whether the sum they entered was
	 * correct or not.
	 * 
	 * Test your program by entering first a correct answer, then an incorrect
	 * answer.
	 * 
	 * Now use a while loop to rewrite the program to allow the user to repeat the
	 * exercise until they respond by entering a non-number.
	 */
	public static void testAddition() {

		int r1 = (int) (Math.random() * 100) + 1;
		int r2 = (int) (Math.random() * 100) + 1;
		System.out.print("What is " + r1 + " + " + r2 + "?: ");
		Scanner scan = new Scanner(System.in);
//		int entry = scan.nextInt();
		String input = scan.next();
		int entry = Integer.parseInt(input);
		scan.close();
		System.out.println("Your answer " + entry + " is " + (entry == r1 + r2 ? "" : "not ") + "correct.");
	}

	public static void repeatAddition() {

		int r1, r2, entry;
		String input = "";
		Scanner scan = new Scanner(System.in);

		while (!input.equals("q")) {
			r1 = (int) (Math.random() * 100) + 1;
			r2 = (int) (Math.random() * 100) + 1;
			System.out.print("What is " + r1 + " + " + r2 + "? (Enter q to quit): ");
			input = scan.next();
			if (input.equals("q"))
				continue;
			entry = Integer.parseInt(input);
			System.out.println("Your answer is " + (entry == r1 + r2 ? "" : "not ") + "correct.");
		}
		scan.close();
		System.out.println("You have quit the game. Thanks for playing!");
	}

	/**
	 * Write a program that randomly generates an integer between 0 and 100,
	 * inclusive. The program should prompt the user to enter a number repeatedly
	 * until the number matches the randomly generated number. For each user input,
	 * the program tells the user whether the input is too low or too high. When the
	 * user discovers the correct answer, output a congratulatory message. Then,
	 * provide the user with the opportunity to play again.
	 */
	public static void guessTheNumber() {

		int MAX = 10;
		int r1 = (int) (Math.random() * (MAX + 1));
		int entry = -1;
		String input = "";
		String playAgain = "n";
		Scanner scan = new Scanner(System.in);

		while (r1 != entry || playAgain.equals("y")) {
			System.out.print("Guess the number (0 - " + MAX + "): ");
			input = scan.next();
			entry = Integer.parseInt(input);
			if (r1 == entry) {
				System.out.println(
						"Congratulations! You have guessed right!\nDo you want to play again? (Enter y for yes) ");
				playAgain = scan.next();
				if (playAgain.equals("y"))
					r1 = (int) (Math.random() * (MAX + 1));
			} else if (r1 > entry)
				System.out.println("Your guess is too low");
			else
				System.out.println("Your guess is too high");
		}
		scan.close();
		System.out.println("You have quit the game. Thanks for playing!");
	}

	/**
	 * Write a program that generates five single digit integer subtraction
	 * problems. Using a while loop, prompt the user to answer all five problems.
	 * After all answers are entered, report the number of the correct answers.
	 * Offer the user the opportunity to play the game again.
	 */
	public static void advancedMathTool() {

		String playAgain = "y";
		int numP = 5;
		int count;
		int[] r1, r2, entry;
		while (playAgain.equals("y")) {
			// Create 5 pairs of single-digit integers
			r1 = new int[numP];
			r2 = new int[r1.length];
			for (int i = 0; i < numP; i++) {
				r1[i] = (int) (Math.random() * 9) + 1;
				r2[i] = (int) (Math.random() * 9) + 1;
			}

			Scanner scan = new Scanner(System.in);
			entry = new int[r1.length];
			count = 0;
			for (int i = 0; i < r1.length; i++) {
				System.out.print("Problem " + (i + 1) + ": " + r1[i] + " - " + r2[i] + " = ");
				entry[i] = scan.nextInt();
				if (entry[i] == (r1[i] - r2[i]))
					count++;
			}

			System.out.println("Number of the correct answers: " + count);
			System.out.println("Would you like to play again? (Enter y for yes)");
			playAgain = scan.next();
			if (!playAgain.equals("y"))
				scan.close();
		}
		System.out.println("You have quit the game. Thanks for playing!");
	}

	/**
	 * Write a program that uses nested for loops to print a multiplication table.
	 */
	public static void printMultiplicationTable() {

		int MAX = 12;
		for (int i = 1; i <= MAX; i++) {
			if (i == 1) { // Table head
				System.out.print("\t");
				for (int j = 1; j <= MAX; j++) {
					System.out.print(i * j + "\t");
				}
				System.out.println();
			}
			for (int j = 1; j <= MAX; j++) {
				if (j == 1)
					System.out.print(i + "\t");
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * Write a program that prompts the user to enter two positive integers and
	 * finds their greatest common divisor (gcd).
	 */
	public static void greatestCommonDivisor() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("You entered: " + n1 + " and " + n2);
		int k = 1;
		int gcd = k;
		while (k <= Math.min(n1, n2)) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		scan.close();
		System.out.println("Greatest Common Divisor: " + gcd);
	}

	/**
	 * Suppose that the tuition for a university is $10,000 this year and tuition
	 * increases 7% every year. In how many years will the tuition be doubled?
	 */
	public static void predictFutureTuition() {
		int count = 0;
		double init = 10000;
		double tuition = init;
		int rate = 7;
		while (tuition < init * 2) {
			tuition *= (1 + rate / 100.0);
			count++;
//			System.out.println("After " + count + " years, tuition is " + String.format("$%.2f", tuition));
		}
		System.out.println("The tuition will be doubled after " + count + " years.");
	}

	/**
	 * Write a program that displays the first 20 prime numbers. An integer greater
	 * than 1 is prime if its only positive divisor is 1 or itself. For example, 2,
	 * 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
	 */
	public static void primeNumbers() {

		int count = 0;
		int num = 1;
		String primeNumbers = "";
		while (count < 20) {
			if (num > 1) {
				int k = 2;
				boolean notDivisor = true;
				while (k < num && notDivisor) {
					notDivisor = num % k != 0;
					k++;
				}
				if (num == k) {
					primeNumbers = primeNumbers + num + " ";
					count++;
				}
			}
			num++;
		}
		System.out.println("First 20 prime numbers:\n" + primeNumbers);
	}
}
