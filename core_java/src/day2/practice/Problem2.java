package day2.practice;

/**
*
* Write a Java program to find sum of values of a given array.
int[] marks = {69, 85, 66, 80, 81 };
*
*/ 
public class Problem2 {
	
	public static void main(String[] args) {
		int[] marks= {69, 85, 66, 80,81};
		int sum=0;
		for(int i:marks) {
			sum= sum+i;
		}
		
		int avg = sum/marks.length;
		System.out.println("Sum:" +sum);
		System.out.println("Avg:" +avg);
	}

}
