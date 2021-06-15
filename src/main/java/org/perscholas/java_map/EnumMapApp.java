package org.perscholas.java_map;

import java.util.EnumMap;

enum DayOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumMapApp {
	public static void main(String[] args) {
		EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
		
		map.put(DayOfWeek.SUNDAY, 25);
		map.put(DayOfWeek.MONDAY, 30);
		map.put(DayOfWeek.TUESDAY, 35);
		System.out.println(map.get(DayOfWeek.SUNDAY));
	}
}