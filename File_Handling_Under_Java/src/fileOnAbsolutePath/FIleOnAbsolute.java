package fileOnAbsolutePath;

import java.io.File;
import java.io.IOException;

public class FIleOnAbsolute {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\Yugandhar\\details.txt");
		
		file.createNewFile();
		
		System.out.println("File was created On Absolute Path");
		

	}

}
