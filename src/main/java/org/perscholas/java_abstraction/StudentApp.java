package org.perscholas.java_abstraction;

public class StudentApp {

	public static void main(String[] args) {
		StudentI student = new Student();
		student.setName("Mike");
		student.introduceSelf();

	}

}
