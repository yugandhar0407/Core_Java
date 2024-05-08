package directoryInJava;

import java.io.File;

public class DirectoryJava {

	public static void main(String[] args) {
		File directory = new File("Family");
		
		directory.mkdir();
		
		System.out.println("Directory Created");

	}

}
