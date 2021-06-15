package org.perscholas.java_classes.employees;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.print("Manager's salary: ");
		manager.calculateSalary();
		System.out.print("Manager's travel allowance: ");
		manager.calculateTransportAllowance();
		
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.print("Trainee's salary: ");
		trainee.calculateSalary();
		System.out.print("Trainee's travel allowance: ");
		trainee.calculateTransportAllowance();

	}

}
