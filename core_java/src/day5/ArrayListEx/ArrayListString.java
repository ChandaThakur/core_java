package day5.ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
	
	public static void main(String[] args) {
		
		ArrayList<String> myNum =new ArrayList<String>();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Length of List:");
		 
		 int n = sc.nextInt();
		 
		 System.out.println("Enter the Students Name:");
		 Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			 String x = sc1.nextLine();
			myNum.add(x);
		}
		
		System.out.print(myNum);
	}

}
