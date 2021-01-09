package day7.fileHandling;

import java.io.*;
// witing into the file
public class Example2 {
	
	public static void main(String[] args) {
		try{
			FileWriter filewriter =new FileWriter("courses.txt");
			// each time we run the pevious text will we replaced
			filewriter.write("hello world \n");
			filewriter.write("core java \n");
			filewriter.write("hello world");
			filewriter.close();
			System.out.println("wroted");
		}catch(Exception e){
			System.out.println("Exception Occured"+e);
		}
		
		
	}

}
