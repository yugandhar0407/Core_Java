package directoriesInJava;

import java.io.File;
import java.io.IOException;

public class DirectoriesJava {

	public static void main(String[] args) throws IOException {


		File directory = new File ("Yugandhar\\Files\\Details");
		
		directory.mkdirs();
		
		System.out.println("Directories Created");
		
		System.out.println("**********************");
		
		File file = new File ("Yugandhar\\Files\\Details\\Personal.txt");
		
		file.createNewFile();
		
		System.out.println("File Created");
		

	}

}
