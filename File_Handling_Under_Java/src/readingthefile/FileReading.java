package readingthefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {

		File directory = new File("Inida");

		directory.mkdir();

		System.out.println("Directory Created");

		File file = new File("Inida\\team.txt");

		try {
			file.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println("Error occured while creating the file");
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("Rohit");
			bw.newLine();
			bw.write("Gill");
			bw.newLine();
			bw.write("Kohli");
			bw.newLine();
			bw.write("Iyer");
			bw.newLine();
			bw.write("Rahul");
			bw.newLine();
			bw.write("Hardik");
			bw.newLine();
			bw.write("Jedaja");
			bw.newLine();
			bw.write("Kuldeep");
			bw.newLine();
			bw.write("Bhrumah");
			bw.newLine();
			bw.write("Shami");
			bw.newLine();
			bw.write("Siraj");
			bw.newLine();

			System.out.println("Writing into the file completed");

			bw.close();
		} catch (Exception e) {
			System.out.println("Error occured while writing into the file");
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("Inida\\team.txt"));

			String line;

			System.out.println("************");

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("FileNotFoundException");
		}

	}

}
