package org.perscholas.com.perscholas.cafe;

public class InvalidMenuException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMenuException (int menuSize) {
		this("Invalid number: Enter a number between " + 1 + " and " + (menuSize + 1) + ".");
	}
	public InvalidMenuException (String message) {
		super(message);
	}
	
}
