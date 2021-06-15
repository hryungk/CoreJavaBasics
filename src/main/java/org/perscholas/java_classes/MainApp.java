package org.perscholas.java_classes;

public class MainApp {

	public static void main(String[] args) {

		Rectangle bigRect = new Rectangle(500, 250);
		Rectangle defaultRect = new Rectangle();
		System.out.format("Width: %.2f Height: %.2f%n", defaultRect.getWidth(), defaultRect.getHeight());
		System.out.format("Width: %.2f Height: %.2f%n", bigRect.getWidth(), bigRect.getHeight());
		
		Square square = new Square();
		System.out.format("Width: %.2f Height: %.2f%n", square.getWidth(), square.getHeight());
		
		square.setWidth(300.0);
		System.out.format("Width: %.2f Height: %.2f%n", square.getWidth(), square.getHeight());
		
		// Polymorphism
		Rectangle rect = new Square(250.0);
		rect.setWidth(350.0);
		System.out.format("Width: %.2f Height: %.2f%n", rect.getWidth(), rect.getHeight());
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(50.0);
		shapes[1] = new Rectangle(200, 90);
		shapes[2] = new Square(25);
		
		for (Shape s : shapes)
			s.draw();
	}

}
