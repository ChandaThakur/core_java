package day5.ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt {
	
	public static void main(String[] args) {
		ArrayList<Integer> myNum =new ArrayList<Integer>();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Length of List:");
		 
		 int n = sc.nextInt();
		 
		 System.out.println("Enter the list element:");
		 
		for(int i=0;i<n;i++) {
			 int x = sc.nextInt();
			myNum.add(x);
		}
		
		System.out.println(myNum);
	}

}
