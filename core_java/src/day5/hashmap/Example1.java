package day5.hashmap;

import java.util.HashMap;

public class Example1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> mapOfCities	= new HashMap<Integer,String>();
		mapOfCities.put(1, "Pune");
		mapOfCities.put(2, "Mumbai");
		mapOfCities.put(3, "Nashik");
		mapOfCities.put(4, "Nagpur");
		
		System.out.println(mapOfCities);
		
		
	}

}
