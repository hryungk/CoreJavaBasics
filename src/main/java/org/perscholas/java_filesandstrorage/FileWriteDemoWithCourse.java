package org.perscholas.java_filesandstrorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemoWithCourse {

	public static void main(String[] args) {

		String location = "src/main/java/org/perscholas/java_filesandstrorage/courses.csv";
//		File file = new File(location);
//		FileWriter writer;
		try (FileWriter writer = new FileWriter(new File(location), true)){
//			writer = new FileWriter(file, true);
			writer.write("\n");
			writer.write("CIS335, Advanced Object-Oriented Programming, Bairon Vasquez\n");
//			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileWriter writer = new FileWriter(new File(location), true)){
//			writer = new FileWriter(file, true);
			Course c = new Course("CIS335", "Advanced OOP", "Bairon V.");
			writer.write(String.format("%s, %s, %s%n",c.getCode(), c.getName(), c.getInstructor()));
//			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
