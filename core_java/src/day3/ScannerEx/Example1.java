package day3.ScannerEx;

import java.util.Scanner; //we are importing paticular class name scanner

public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		
		String userName =sc.nextLine();
		System.out.println("User Name:" +userName);
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter age");
		
		int age=sc1.nextInt();
		System.out.println("Age:" +age);
				}

}
