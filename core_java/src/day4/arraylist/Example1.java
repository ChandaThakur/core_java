package day4.arraylist;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		// create object for arrayList
		ArrayList<String> cars= new ArrayList<String>();
		
		// from above we can remove <String> still the code will run 
		
		//add elements to the array
		cars.add("Volvo");
		cars.add("ford");
		cars.add("oudi");
		cars.add("honda");
		
		System.out.println(cars);
		
		//to print the elements if youu no the index
		
		System.out.println(cars.get(2));
		
		// to update a method in ArrayList
		
		cars.set(0, "Opel");
		System.out.println(cars);
		
		// to find the size of array
		
		System.out.println(cars.size());
		
		
		// to remove a item from list
		
		cars.remove(0);
		System.out.println("after deleting one item");
		System.out.println(cars);
		
		// to remove all elements
		
		cars.clear();
		System.out.println("after deleting all item");
		System.out.println(cars);
				
	}

}
