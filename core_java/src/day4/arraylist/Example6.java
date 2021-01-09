package day4.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<String>();
		
		System.out.println("Please enter no. of cities you want to add");
		int n=sc1.nextInt();
		
		System.out.println("Enter city Names");
	
		for(int i=0;i<n;i++)
		{
			String city=sc.nextLine();
			cities.add(city);
			
		}
		System.out.println(cities);
	}
		
		

}
