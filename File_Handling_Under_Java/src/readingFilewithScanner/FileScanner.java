package readingFilewithScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("Inida\\team.txt"));

			String line;
			while (sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error while reading the file");
		}

	}

}
