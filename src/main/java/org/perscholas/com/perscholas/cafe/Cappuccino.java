package org.perscholas.com.perscholas.cafe;

public class Cappuccino extends Product {

	private boolean peppermint;
	private boolean whippedCream;
	
	public Cappuccino () {
		super();
		peppermint = false;
		whippedCream = false;
	}
	
	public Cappuccino (String name, double price, String descr, boolean extraShot, boolean macchiato) {
		super(name, price, descr);
		this.peppermint = extraShot;
		this.whippedCream = macchiato;
	}
	
	@Override
	public double calculateProductSubtotal() {
		double subtotal = getPrice() * getQuantity(); 
		if (peppermint)
			subtotal += 2 * getQuantity();
		if (whippedCream)
			subtotal += 1 * getQuantity();
		return subtotal;
	}

	@Override
	public void addOptions() {
		System.out.print("Would you like to add peppermint to the coffee? (y/n): ");
		peppermint = yesOrNo();
		System.out.print("Would you like to add whipped cream to the coffee? (y/n): ");
		whippedCream = yesOrNo();
	}

	@Override
	public String printOptions() {
		String optionStr = "Peppermint: ";
		if (peppermint)
			optionStr += "Yes (Add $2)";
		else
			optionStr += "No";
		optionStr += "\tWhipped Cream: ";
		if (whippedCream)
			optionStr += "Yes (Add $1)";
		else
			optionStr += "No";
		return optionStr;
	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
}
