package org.perscholas.com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

private List<Product> cart;
	
	public ShoppingCart() {
		cart = new ArrayList<Product>();
	}
	
	public void add(Product p) {
		cart.add(p);
	}
	
	public List<Product> getCart(){
		return cart;
	}
	
	@Override
	public String toString() {
		String result = "";
		for (Product p : cart) {
			result += String.format("Item:\t%-12s\tPrice: $%.2f\tQuantity: %d\tSubtotal: $%.2f%n", p.getName(), p.getPrice(), p.getQuantity(), p.calculateProductSubtotal());
			result += String.format("\t%s%n", p.printOptions());
		}
		return result;
	}
}
