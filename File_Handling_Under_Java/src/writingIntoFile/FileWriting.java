package writingIntoFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {

		File directory = new File("YugandharTeam");
		directory.mkdir();

		System.out.println("Directory Created");

		File file = new File("YugandharTeam\\team.txt");

		try {
			file.createNewFile();
			System.out.println("File was creatred");

		} catch (IOException e) {
			System.out.println("Error while creating into file");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("Yugandhar");
			bw.newLine();
			bw.write("Rakesh");
			bw.newLine();
			bw.write("Pavan");
			bw.newLine();
			bw.write("Jagan");
			bw.newLine();
			bw.write("Suresh");
			bw.newLine();
			bw.write("Sainath");
			bw.newLine();

			System.out.println("Writing into the file completed");

			bw.close();

		} catch (Exception e) {

			System.out.println("Error occured while writing into file");
		}

	}

}
