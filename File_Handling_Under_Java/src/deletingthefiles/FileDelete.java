package deletingthefiles;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		

		File file = new File("Dharani.txt");
		file.delete();
		
		System.out.println("File Deleted");
	}

}
