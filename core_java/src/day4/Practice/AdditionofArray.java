package day4.Practice;

import java.util.Scanner;

public class AdditionofArray {
	public static void main(String[] args) {
		
		
		int[] array1=new int[5];
		int[] array2=new int[5];
		int[] sum=new int[5];
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the elements of 1st array:");
		while(i<5) {
			array1[i]=sc.nextInt();
			i++;
		}
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the elements of 2st array:");
		while(i<5) {
			array2[i]=sc.nextInt();
			i++;
		}
		
		while(i<5) {
			sum[i]=array1[i]+array2[i];
			i++;
		}
		
		System.out.println("Elements of 1st array:");
		while(i<5) {
			System.out.println(array1[i]);
			i++;
		}
		System.out.println("Elements of 2nd array:");
		while(i<5) {
			System.out.println(array2[i]);
			i++;
		}
		System.out.println("Sun of array elements:");
		while(i<5) {
			System.out.println(array1[i]);
			i++;
		}

	}
}
