package org.perscholas.com.perscholas.cafe;

import java.util.Scanner;

public abstract class Product {

	private String name;
	private double price;
	private String description;
	private int quantity;
	
	public Product () {
		
	}

	public Product (String name, double price, String descr) {
		this.name = name;
		this.price = price;
		this.description = descr;
	}
	
	/* Calculates the product subtotal for the order. */
//	public double calculateProductTotal() {
//		return price * quantity;
//	}
	public abstract double calculateProductSubtotal();
	
	public abstract void addOptions();
	
	public abstract String printOptions();
	
	@Override
	public String toString() {
		return String.format("Item: %s\tDescription: %s\tQuantity: %d\tSubtotal: $%.2f", name, description, quantity, calculateProductSubtotal());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	protected boolean yesOrNo() {
		Scanner scan = new Scanner(System.in);
		boolean chosen = false;
		boolean option = false;
		while (!chosen) {
			String choice = scan.next();
			if (choice.equalsIgnoreCase("y")) {
				option = true;
				chosen = true;
			} else if (choice.equalsIgnoreCase("n")) {
				chosen = true;
			} else {
				System.out.print("\tPlease type in \"y\" for yes and \"n\" for no: ");
			}
		}
//		scan.close();
		return option;
	}
}
