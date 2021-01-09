package day4.arraylist;

import java.util.ArrayList;

public class Example5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> salList=new ArrayList<Integer>();
		
		salList.add(25000);
		salList.add(26000);
		salList.add(27000);
		salList.add(28000);
		
		for(int x: salList) {
			System.out.println(x);
		}
		
		/*for(int i = 0; i<salList.size();i++) {
			int x=salList.get(i);
			System.out.println(x);
		}*/
		
	}

}
