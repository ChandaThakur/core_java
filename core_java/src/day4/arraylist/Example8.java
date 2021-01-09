package day4.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> salList=new ArrayList<Integer>();
		
		salList.add(25000);
		salList.add(26000);
		salList.add(27000);
		salList.add(28000);
		
		System.out.println("unsorted list\n");
		for(int x: salList) {
			System.out.println(x);
		}
		
		System.out.println("sorted list \n");
		Collections.sort(salList);
		
		for(int x: salList) {
			System.out.println(x);
		}
		
		System.out.println(" reverse sorted list \n");
		Collections.sort(salList, Collections.reverseOrder());
		for(int x: salList) {
			System.out.println(x);
		}
	}

}
