package org.perscholas.java_classes.employees;

public class Trainee extends Employee {

	public Trainee(long Id, String Name, String address, long phone) {
		super(Id, Name, address, phone);
	}
	
	public Trainee(long Id, String Name, String address, long phone, long salary) {
		this(Id, Name, address, phone);
		basicSalary = salary;
	}

}
