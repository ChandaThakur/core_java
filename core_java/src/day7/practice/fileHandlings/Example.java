package day7.practice.fileHandlings;

import java.io.File;

public class Example {
	
	public static void main(String[] args) {
		try {
			File obj =new File("FileName.txt");
			if(obj.createNewFile()) {
				System.out.println("File is created as neme:" +obj.getName());
			}else {
				System.out.println("File already Exixts");
			}
			// obj is in the scope of try only so we have to delete from here only
			System.out.println(obj.delete());
			
		} catch(Exception e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		
	}

}
