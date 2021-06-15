package org.perscholas.java_classes;

public class Square extends Rectangle {

	public Square() {
		super();
	}
	
	public Square(double widthAndHeight) {
		super(widthAndHeight, widthAndHeight);
	}
	
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
		super.setHeight(newWidth);
	}
	
	public void setHeight(double newHeight) {
		super.setHeight(newHeight);
		super.setWidth(newHeight);
	}
	
	@Override
	public void draw() {
		System.out.format("Drawing a %.2f X %.2f square%n" , getWidth(), getHeight());
	}
}
