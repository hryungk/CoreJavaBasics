package org.perscholas.java_enum;

public class EnumApp {

	public static void main(String[] args) {
		getDay(Days.MONDAY);
		
		Days day = Days.MONDAY;
		System.out.println(day + " is day number " + day.getDay());
	}
	
	private static void getDay(Days day) {
		System.out.println("The day is " + day);
	}
	
}
