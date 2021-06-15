package org.perscholas.java_abstraction;

public class Student implements StudentI {

	String name;
	
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void introduceSelf() {
		System.out.println("Hi, I'm " + name);
		System.out.println("i'm attending "+ school);

	}

}
