package org.perscholas.java_IO_Advanced;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Navigate to your Desktop and create a folder, name it: PlayGround. Using
 * Java, inside PlayGround create the following folder/file structure
 * 
 * @author HRK
 *
 */
public class FilesPlayGround2 {

	public static void main(String[] args) throws IOException {

		File park = null;
		File newFile = null;
		File playGround = new File("/Users/HRK/Documents/PlayGround");
		playGround.mkdir();

		String[] parks = { "ParkOne", "ParkTwo", "ParkThree" };
		String[][] fileNames = { { "Emma", "Olivia" }, { "Aiden", "Ava", "Logan", "Mia" }, { "Ethan", "Liam" } };
		Map<String, List<File>> files = new HashMap<>();
		
		for (int i = 0; i < parks.length; i++) {
			park = new File(playGround.getAbsolutePath() + "/" + parks[i]);
			park.mkdir();
			for (int j = 0; j < fileNames[i].length; j++) {
				newFile = new File(park.getAbsolutePath() + "/" + fileNames[i][j] + ".txt");
				newFile.createNewFile();
				files.putIfAbsent(parks[i], new ArrayList<File>());
				files.get(parks[i]).add(newFile);				
			}
		}

		/**
		 * Modified the structure inside the PlayGround to move all files to ParkOne
		 */
		File file = null;
		for (int i = 1; i < parks.length; i++) {
			for (int j = 0; j < fileNames[i].length; j++) {
				file = files.get(parks[i]).get(j);
				Files.move(Paths.get(file.getPath()),
						Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + file.getName()),
						StandardCopyOption.REPLACE_EXISTING);
		
			}
		}
	}

}
