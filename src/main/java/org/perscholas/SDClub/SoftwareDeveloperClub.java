package org.perscholas.SDClub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {

	ArrayList<ClubMember> list;
	
	/** Reads the text file and creates an ArrayList of ClubMember. */
	public SoftwareDeveloperClub() {
		list = new ArrayList<>(); // Instantiate the list.
		
		String location = "src/main/java/org/perscholas/SDClub/members.txt";
		File file = new File(location);
		try {
			Scanner scan = new Scanner(file);
			scan.nextLine(); // Skipping the table head row.
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] a = line.split("\\*\\*");
				list.add(new ClubMember(a[0], a[1], a[2], a[3]));
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeMember(ClubMember cm) {
		list.remove(cm);
	}
	public void removeMember(int i) {
		list.remove(i-1);
	}
	
	public void addMember(ClubMember cm) {
		list.add(cm);
	}
	
	public String getList() {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			ClubMember c = list.get(i);
			result += String.format("[%d] %s %s, %s%n", i+1, c.getName(), c.getCity(), c.getState());
		}
		return result;
	}
	public String toString() {
		String result = "";
		
		for (ClubMember c : list) {
			result += c.toString() + "\n\n";
		}
		return result;
	}
}
