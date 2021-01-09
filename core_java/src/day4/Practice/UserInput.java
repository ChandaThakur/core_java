package day4.Practice;

import java.util.Scanner;
// code to check a year is leap year or not
public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		int year = sc.nextInt();
		
		if(year%4 ==0) {
			
			if(year%100 ==0)
			{
				System.out.println("Its a Leap year");
			}
			else {
				System.out.println("Not a Leap year!");
			}
		}else {
			System.out.println("not a leap year");
		}
		
	}

}
