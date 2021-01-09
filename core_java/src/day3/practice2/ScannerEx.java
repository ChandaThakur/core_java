package day3.practice2;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name ");
		
		String userName =sc.nextLine();
		System.out.println("User Name:" +userName);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter You Roll No.");
		
		int rollNo=sc1.nextInt();
		System.out.println("Roll No.:" +rollNo);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter marks of 5 subject");
		
		double sum =0;
		for(int i=0;i<5;i++) {
			int marks=sc2.nextInt();
			
			sum +=marks;
			
		}
		
		System.out.println("Sum of Marks:" +sum);
		
		double avg = sum/5;
		
		System.out.println("Avg of Marks:" +avg);
		
		
		
	}

}
