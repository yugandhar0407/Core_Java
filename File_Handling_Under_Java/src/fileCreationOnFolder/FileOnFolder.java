package fileCreationOnFolder;

import java.io.File;
import java.io.IOException;

public class FileOnFolder {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("src\\Inida.txt");
		
		file.createNewFile();
		
		System.out.println("File was created on folder");
		
		

	}

}
