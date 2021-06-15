package org.perscholas.com.perscholas.cafe;

public class Store {

	private Menus[] menu;
	
	public Store() {
		menu = Menus.values();
	}
	
	public Product getProduct(int i) {
		Product p = null;
		switch (i) {
		case 1:
			p = new Coffee("Coffee", 3.49, "12oz espresso with hot water", false, false);
			break;
		case 2:
			p = new Espresso("Espresso", 3.99, "1oz cup of espresso", false, false);
			break;
		case 3:
			p = new Cappuccino("Cappuccino", 4.99, "12oz espresso with milk foam", false, false);
			break;
		case 4: 
			break;
		default:
			System.out.println("Something is very wrong. This statement shouldn't be reached.");
			break;
		}
		return p;
	}
	
	public int getMenuSize() {
		return menu.length;
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < menu.length; i++) {
			result += String.format("%d: %s%n", i+1, menu[i]);
		}
		result += String.format("%d: %s", menu.length+1, "Check Out");
		return result;
	}
	
	public enum Menus {

		Coffee(0), Cappuccino(1), Espresso(1);
		
		private final int menuNum;
		
		private Menus (int i) {
			menuNum = i;
		}
		
		public int getMenuNum() {
			return menuNum;
		}
	}
}
