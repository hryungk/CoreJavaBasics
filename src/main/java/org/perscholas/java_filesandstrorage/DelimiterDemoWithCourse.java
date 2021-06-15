package org.perscholas.java_filesandstrorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DelimiterDemoWithCourse {

	public static void main(String[] args) {
		
		try {
			String location = "src/main/java/org/perscholas/java_filesandstrorage/courses.csv";
			File file = new File(location);
			Scanner input = new Scanner(file);
			ArrayList<Course> dataArrayList = new ArrayList<>();
			while (input.hasNextLine()) {
				String[] courseArray = input.nextLine().split(",");
				dataArrayList.add(new Course(courseArray[0], courseArray[1], courseArray[2]));
			}
			input.close();
			for (Course c : dataArrayList) {
				System.out.printf("%-15s | %-35s | %-25s%n", c.getCode(), c.getName(), c.getInstructor());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}

}
