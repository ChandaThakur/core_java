package day4.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {
	
public static void main(String[] args) {
		
		ArrayList<String> cars =new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");

		Iterator<String> iter=cars.iterator(); //here Iterator is a method of ArrayList which we are using to fetch elements of cars
		
		while(iter.hasNext()) {
			String x= iter.next();
			System.out.println(x);
		}
	}

}
