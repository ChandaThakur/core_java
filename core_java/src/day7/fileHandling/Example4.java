package day7.fileHandling;

import java.io.File;

// demo for deleting file
public class Example4 {
	
	public static void main(String[] args) {
		File file = new File("courses.txt");
		boolean fileExists=file.exists();
		
		if(fileExists ) {
			System.out.println("File Exists");
		
			System.out.println("Going to delete this File");
			boolean deletionSuccesful= file.delete();
			if(deletionSuccesful) {
				System.out.println("File Deleted");
			}else {
				System.out.println("File  Exist");
			}
		}
		else {
			System.out.println("File dose no  Exist");
		}
	}

}
