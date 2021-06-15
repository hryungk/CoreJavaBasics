package org.perscholas.java_arrays;

public class CalculateAverage {

	public static void main(String[] args) {
		
		int n = 100;
		int[] numbers = new int[n];
		int result = 0;
		int countAboveAvg = 0;
		for (int i = 0; i < n; i++) {
//			numbers[i] = (int) (Math.random()*100000);
			numbers[i] = i+1;
			result += numbers[i];
		}
		double avg = result / n;
		for (int i = 0; i < n; i++) {
			if (numbers[i] > avg) 
				countAboveAvg++;
		}
		System.out.println(countAboveAvg + " numbers are above the average ("+avg+")");

	}

}
