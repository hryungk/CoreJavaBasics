package org.perscholas.com.perscholas.cafe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeApp {
	
	private static final double SALES_TAX = 0.0625;

	public static void main(String[] args) {
		
		Store menu = new Store();
		int menuSize = menu.getMenuSize();
		ShoppingCart cart = new ShoppingCart();
		
		Scanner scan = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("Please select from the following menu:");
			System.out.println(menu);
			
			boolean valid = false;
			while (!valid ) {
				try {
					menuNum = scan.nextInt();
					if (menuNum < 1 || menuSize+1 < menuNum) { // out of menu number
						throw new InvalidMenuException(menuSize);
					} else {
						valid = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input type: Enter a NUMBER between " + 1 + " and " + (menuSize + 1) + ".");
					scan.next(); // flush the scanner
					System.out.println("Please select from the following menu:");
					System.out.println(menu);
				} catch (InvalidMenuException e) {
					System.out.println(e.getMessage());
					System.out.println("Please select from the following menu:");
					System.out.println(menu);
				}
			}
			
			System.out.println();
			if (menuNum == menuSize+1) { // check out selected; skip to the bottom
				continue;
			} 
			Product p = menu.getProduct(menuNum);
			System.out.printf("Enter the quantity of %s: ", p.getName());
			int quantity = 0;
			
			valid = false;
			while (!valid) {
				try {
					quantity = scan.nextInt();
					if (quantity < 1) { // out of possible quantity
						throw new InvalidQuantityException(quantity);
					} else {
						valid = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input type: Enter a NUMBER above 0");
					scan.next(); // flush the scanner
					System.out.printf("Enter the quantity of %s: ", p.getName());
				} catch (InvalidQuantityException e) {
					System.out.println(e.getMessage());
					System.out.printf("Enter the quantity of %s: ", p.getName());
				}
			}
			
			p.setQuantity(quantity);
			p.addOptions();
			cart.add(p);
			System.out.println(p);
			System.out.println();
		} while (menuNum != menuSize+1);
		scan.close();
		System.out.println("Proceed to checkout.\n");
		System.out.println(cart);
		
//		Product p1 = new Product("Coffee", 2.75, "12oz espresso with hot water");
//		Product p2 = new Product("Espresso", 1.50, "1oz cup of espresso");
//		Product p3 = new Product("Cappuccino", 3.25, "12oz espresso with milk foam");		
		
//		Product p1 = new Coffee("Coffee", 3.49, "12oz espresso with hot water", false, false);
//		Product p2 = new Espresso("Espresso", 3.99, "1oz cup of espresso", false, false);
//		Product p3 = new Cappuccino("Cappuccino", 4.99, "12oz espresso with milk foam", false, false);
		
//		cart.add(p1);
//		cart.add(p2);
//		cart.add(p3);
		
		
//		System.out.printf("Enter the quantity of %s: ", p1.getName());
//		p1.setQuantity(scan.nextInt());
//		p1.addOptions();
//		System.out.println(p1);
//		
//		System.out.printf("Enter the quantity of %s: ", p2.getName());
//		p2.setQuantity(scan.nextInt());
//		p2.addOptions();
//		System.out.println(p2);
//		
//		System.out.printf("Enter the quantity of %s: ", p3.getName());
//		p3.setQuantity(scan.nextInt());
//		p3.addOptions();
//		System.out.println(p3);
//		scan.close();
		
		double subtotal = 0;
		for (Product p : cart.getCart()) {
			subtotal += p.calculateProductSubtotal();
		}
//		double subtotal = p1.calculateProductSubtotal() + p2.calculateProductSubtotal() + p3.calculateProductSubtotal();
		System.out.printf("Sales Subtotal: $%.2f%n", subtotal);
		double tax = subtotal * SALES_TAX;
		System.out.printf("Sales Tax: $%.2f%n", tax);
		System.out.printf("Sales Total: $%.2f%n", subtotal + tax);
		
	}

}
