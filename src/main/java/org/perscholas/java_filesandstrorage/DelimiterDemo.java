package org.perscholas.java_filesandstrorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DelimiterDemo {

	public static void main(String[] args) {
		
		try {
			String location = "src/main/java/org/perscholas/java_filesandstrorage/courses.csv";
			File file = new File(location);
			Scanner input = new Scanner(file);
			ArrayList<String[]> dataArrayList = new ArrayList<>();
			while (input.hasNextLine()) {
				String curLine = input.nextLine();
				dataArrayList.add(curLine.split(","));
			}
			input.close();
			for (String[] s : dataArrayList) {
				String reg = "";
				for (int i = 0; i < s.length; i++) 
					reg += "%s | ";
				reg = reg.substring(0,reg.length()-3) + "%n";
				System.out.printf(reg, s);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}

}
