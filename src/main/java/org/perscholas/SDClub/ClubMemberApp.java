package org.perscholas.SDClub;

import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {

		SoftwareDeveloperClub sdc = new SoftwareDeveloperClub();
//		System.out.println(sdc);
		
		String[] menuArray = {"Display Members", "Remove a Member", "Add a Member", "Quit"};
		String menu = menu(menuArray);
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println(menu);
			choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println(sdc);
				break;
			case 2:
				System.out.println("Choose a number from the list to delete: ");
				System.out.println(sdc.getList());
				sdc.removeMember(input.nextInt());
//				System.out.print("Enter the name, city, state, and favorite language of the member to delete: ");
//				sdc.removeMember(new ClubMember(input.next(),input.next(),input.next(),input.next()));
				break;
				
			case 3:
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("City: ");
				String city = input.next();
				System.out.print("State: ");
				String state = input.next();
				System.out.print("Favoriate Language: ");
				String favLang = input.next();
				sdc.addMember(new ClubMember(name,city,state,favLang));
				System.out.println();
//				System.out.print("Enter the name, city, state, and favorite language of the member to add: ");
//				sdc.addMember(new ClubMember(input.next(),input.next(),input.next(),input.next()));
				break;
			case 4:
				System.out.println("You've quit the program. Thanks for using the app!");
				break;
			default:
				System.out.println("Invalid number. Please enter a number between 1 and " + menuArray.length);
			}
		} while (choice != menuArray.length);
		input.close();
	}

	private static String menu(String[] menuArray) {
		
		String showMenu = "Select from the following menu:\n";
		for (int i = 0; i < menuArray.length; i++) {
			showMenu += String.format("%d: %s%n", i+1, menuArray[i]);
		}
		return showMenu;
	}
}
