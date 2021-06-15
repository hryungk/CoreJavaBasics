package org.perscholas.java_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeckOfCards {

	/** Write a program that picks four cards randomly from a deck of 52 cards.
	 * All the cards can be represented using an array named deck, filled with
	 * initial values 0 to 51. */
	public static void main(String[] args) {
		
		int[] deck = new int[52];
		
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		/* Shuffle the deck (Fisher-Yates Shuffle algorithm)*/
		for (int i = deck.length-1; i > 0; i--) {
			int destIdx = (int) (Math.random() * (i+1));
			if (destIdx != i) { // swap
				int temp = deck[i];
				deck[i] = deck[destIdx];
				deck[destIdx] = temp;
			}
		}
		
		// Identify card shape and number of the shuffled deck.
		String[] deckList = new String[52];
		for (int i = 0; i < deck.length; i++) 
			deckList[i] = identifyCard(deck[i]);
		
//		Arrays.sort(deck);
//		System.out.println(Arrays.toString(deck));
//		System.out.println(Arrays.toString(deckList));
		
		// Print out 4 randomly selected cards.
		for (int i = 0; i < 4; i++)
			System.out.println(deckList[i]);
	}
	
	private static String identifyCard(int i) {
		
		String result = "";
		switch (i / 13) {
		case 0:
			result = "Spade";
			break;
		case 1:
			result = "Heart";
			break;
		case 2:
			result = "Diamond";
			break;
		case 3:
			result = "Club";
			break;
		}
		
		switch (i % 13) {
		case 0:
			result += " A";
			break;
		case 1:
			result += " 2";
			break;
		case 2:
			result += " 3";
			break;
		case 3:
			result += " 4";
			break;
		case 4:
			result += " 5";
			break;
		case 5:
			result += " 6";
			break;
		case 6:
			result += " 7";
			break;
		case 7:
			result += " 8";
			break;
		case 8:
			result += " 9";
			break;
		case 9:
			result += " 10";
			break;
		case 10:
			result += " J";
			break;
		case 11:
			result += " Q";
			break;
		case 12:
			result += " K";
			break;
		}
		return result;
	}

}
