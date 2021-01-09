package day4.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// continue untill user stops
public class Example7 {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<String>();
		int flag=1;
		while( flag==1) {
			System.out.println("If want to enter the city name then enter 1 else enter 0:");
			int n=sc1.nextInt();
			if (n==1) {
				for(int i=0;i<1;i++)
				{
					System.out.println("Enter city name:");
					String city=sc.nextLine();
					cities.add(city);
					
				}
				System.out.println(cities);
			}
			else {
				System.out.println("Okay..!");
				flag=0;
			}
		}
	}
		
		

}
