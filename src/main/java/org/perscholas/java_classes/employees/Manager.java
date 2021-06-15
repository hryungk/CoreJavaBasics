package org.perscholas.java_classes.employees;

public class Manager extends Employee {

	public Manager(long Id, String Name, String address, long phone) {
		super(Id, Name, address, phone);
	}
	
	public Manager(long Id, String Name, String address, long phone, long salary) {
		this(Id, Name, address, phone);
		basicSalary = salary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = 15.0 / 100.0 * basicSalary;
		System.out.printf("$%.2f%n", transportAllowance);
	}
}
