package day7.practice.fileHandlings;
import java.io.FileNotFoundException;
// write and read the file
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ExampleToWrite {
	
	public static void main(String[] args) {
		try {
			File read=new File("FileName.txt");
			// to write
			 FileWriter myObj = new FileWriter("FileName.txt");
		      myObj.write("Files in Java might be tricky, but it is fun enough!");
		      myObj.close();
		      System.out.println("Successfully wrote to the file.");
		      
		      // to read
		     
		      Scanner sc=new Scanner(read);
		      while(sc.hasNext()) {
		    	  System.out.println(sc.nextLine());
		    	  
		    	  // to delete file
		    	  // using read we can not delete becoz read object is to read only
		    	if( read.delete()) {
		    		System.out.println("Deleted");
		    	}else {
		    		System.out.println("not Deleted");
		    	}
		      }
			
		}catch(IOException e){
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		 
	}

}
