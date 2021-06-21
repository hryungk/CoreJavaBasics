package org.perscholas.java_functionalInterface;

import java.util.Calendar;
import java.util.function.UnaryOperator;
/*
 * * This interface takes a single parameter and returns a parameter of the same type
*/
public class UnaryOperatorApp {
	
	public static void main(String[] args) {		
		// This method accepts a StringBuilder object and appends it with the current date and time
		UnaryOperator<StringBuilder> appendSB = sb -> {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(System.currentTimeMillis());
			sb.append(calendar.getTime());
			return sb;
		};
		System.out.println(appendSB.apply(new StringBuilder("Created At: ")));
	}
}
