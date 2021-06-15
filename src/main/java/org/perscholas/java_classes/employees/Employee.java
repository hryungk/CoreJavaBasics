package org.perscholas.java_classes.employees;

public class Employee {

	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee (long Id, String Name, String address, long phone) {
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.printf("$%.2f%n",salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10.0 / 100.0 * basicSalary;
		
		System.out.printf("$%.2f%n", transportAllowance);
	}
	
}
