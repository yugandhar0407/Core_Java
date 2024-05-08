package fileCreation;

import java.io.File;
import java.io.IOException;

public class MainFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Yugandhar.txt");

		file.createNewFile();

		System.out.println("Yugandhar File was Created");

		System.out.println("************************");

		File file1 = new File("Dharani.txt");

		file1.createNewFile();

		System.out.println("Dharani File was created");

		System.out.println("************************");

		File file2 = new File("RamaLakshmi.txt");

		file2.createNewFile();

		System.out.println("RamaLakshmi File was Created");

		System.out.println("************************");

		File file3 = new File("Govindu.txt");

		file3.createNewFile();

		System.out.println("Govindu File was Created");
		

	}

}
