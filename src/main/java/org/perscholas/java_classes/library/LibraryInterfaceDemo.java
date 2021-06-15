package org.perscholas.java_classes.library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser kid1 = new KidUser(10, "Kids");
		LibraryUser kid2 = new KidUser(18, "Fiction");
		
		kid1.registerAcount();
		kid1.requestBook();
		
		kid2.registerAcount();
		kid2.requestBook();
		
		LibraryUser adult1 = new AdultUser(5, "Kids");
		LibraryUser adult2 = new AdultUser(23, "Fiction");
		
		adult1.registerAcount();
		adult1.requestBook();
		
		adult2.registerAcount();
		adult2.requestBook();

	}

}
