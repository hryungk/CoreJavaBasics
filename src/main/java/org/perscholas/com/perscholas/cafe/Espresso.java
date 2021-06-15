package org.perscholas.com.perscholas.cafe;

public class Espresso extends Product {

	private boolean extraShot;
	private boolean macchiato;
	
	public Espresso () {
		super();
		extraShot = false;
		macchiato = false;
	}
	
	public Espresso (String name, double price, String descr, boolean extraShot, boolean macchiato) {
		super(name, price, descr);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	@Override
	public double calculateProductSubtotal() {
		double subtotal = getPrice() * getQuantity(); 
		if (extraShot)
			subtotal += 2 * getQuantity();
		if (macchiato)
			subtotal += 1 * getQuantity();
		return subtotal;
	}

	@Override
	public void addOptions() {
		System.out.print("Would you like to add an extra shot to coffee? (y/n): ");
		extraShot = yesOrNo();
		System.out.print("Would you like to make it macchiato style? (y/n): ");
		macchiato = yesOrNo();
	}

	@Override
	public String printOptions() {
		String optionStr = "Extra Shot: ";
		if (extraShot)
			optionStr += "Yes (Add $2)";
		else
			optionStr += "No";
		optionStr += "\tMacchiato: ";
		if (macchiato)
			optionStr += "Yes (Add $1)";
		else
			optionStr += "No";
		return optionStr;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

}
