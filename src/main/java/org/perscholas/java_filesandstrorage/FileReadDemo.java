package org.perscholas.java_filesandstrorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try {
			String location = "src/main/java/org/perscholas/java_filesandstrorage/file.txt";
			File file = new File(location);
			Scanner input = new Scanner(file);
//			String data = "";
			ArrayList<String> dataArrayList = new ArrayList<>();
			while (input.hasNextLine()) {
				String curLine = input.nextLine();
//				data += curLine + "\t";
				dataArrayList.add(curLine);
				System.out.println(curLine);
			}
			input.close();
//			System.out.println("Data in " + location + ": " + data);
			for (String s : dataArrayList) 
				System.out.println(s);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}

}
