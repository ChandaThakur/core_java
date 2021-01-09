package day7.fileHandling;

import java.io.File;

public class Example1 {
	
	public static void main(String[] args) {
		try {
			//File file = new File("courses.txt"); //in this we create file without specifing path
			
			File file = new File("D:\\Temp\\coursee.txt");
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("file created"+ " "+file.getName());
			}else {
				System.out.println("File already exists");
			}
		}catch (Exception e) {
			System.out.println("Exception Occured:" +e);
		}
	}

}
