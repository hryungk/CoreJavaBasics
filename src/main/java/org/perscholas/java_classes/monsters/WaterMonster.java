package org.perscholas.java_classes.monsters;

public class WaterMonster extends Monster {

	public WaterMonster(String name) {
	
		super(name);
	}
	
	@Override
	public String attack() {
		return "Attack with water!";
	}

}
