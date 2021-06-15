package org.perscholas.java_classes;

public class Rectangle  extends Shape{

	private double width, height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// Default constructor
	public Rectangle() {
		this(100, 100);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.format("Drawing a %.2f X %.2f rectangle%n" , width, height);
	}
}
