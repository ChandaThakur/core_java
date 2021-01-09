package day7.fileHandling;

import java.io.*;
import java.util.Scanner;

// reading from file using scanner
public class Example3 {
	
	public static void main(String[] args) {
		
		File file=new File("courses.txt");
		try {
			Scanner sc= new Scanner(file);
			//perviously we used system .in becose it was reading from console but now it is reading from file
			while(sc.hasNextLine()) {
				String x= sc.nextLine();
				System.out.println(x);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception Ocured" +e);
		}
		
		
	}

}
