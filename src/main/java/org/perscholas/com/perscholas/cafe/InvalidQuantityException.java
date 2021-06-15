package org.perscholas.com.perscholas.cafe;

public class InvalidQuantityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidQuantityException (int quantity) {
		this("Invalid number " + quantity + ": Enter a number above 0.");
	}
	public InvalidQuantityException (String message) {
		super(message);
	}
	
}
