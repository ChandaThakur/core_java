package day4.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Example9 {
	
public static void main(String[] args) {
	
	ArrayList<String> cars =new ArrayList<String>();
	
	cars.add("Volvo");
	cars.add("Ford");
	cars.add("Honda");
	cars.add("Hyundai");

	System.out.println(cars);
	Collections.sort(cars);
	
	for(String x: cars)
	{
		
		System.out.println(x);
	}
	
	Collections.sort(cars, Collections.reverseOrder());
	
	for(String y: cars)
	{
		
		System.out.println("\n" +y);
	}
		
 }

}