package org.perscholas.com.perscholas.cafe;

public class Coffee extends Product {

	private boolean milk;
	private boolean sugar;
	
	public Coffee () {
		super();
		milk = false;
		sugar = false;
	}
	
	public Coffee (String name, double price, String descr, boolean milk, boolean sugar) {
		super(name, price, descr);
		this.milk = milk;
		this.sugar = sugar;
	}
	
	@Override
	public double calculateProductSubtotal() {
		return getPrice() * getQuantity();
	}

	@Override
	public void addOptions() {
		System.out.print("Would you like milk with the coffee? (y/n): ");
		milk = yesOrNo();
		System.out.print("Would you like sugar with the coffee? (y/n): ");
		sugar = yesOrNo();
	}

	@Override
	public String printOptions() {
		String optionStr = "Milk: ";
		if (milk)
			optionStr += "Yes";
		else
			optionStr += "No";
		optionStr += "\tSugar: ";
		if (sugar)
			optionStr += "Yes";
		else
			optionStr += "No";
		return optionStr;
	}


	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

}
