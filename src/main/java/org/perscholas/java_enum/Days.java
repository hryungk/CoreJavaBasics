package org.perscholas.java_enum;

public enum Days {

//	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
	
	private final int day;
	
	private Days (int i) {
		day = i;
	}
	
	public int getDay() {
		return day;
	}
}
