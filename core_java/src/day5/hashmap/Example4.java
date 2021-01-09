package day5.hashmap;

import java.util.*;

//displaying ley and value both
public class Example4 {
	
	public static void main(String[] args) {

		HashMap<Integer,String> mapOfCities	= new HashMap<Integer,String>();
		mapOfCities.put(1, "Pune");
		mapOfCities.put(2, "Mumbai");
		mapOfCities.put(3, "Nashik");
		mapOfCities.put(4, "Nagpur");
		
		System.out.println(mapOfCities);
		
		Set<Integer> y = mapOfCities.keySet();
		Iterator<Integer> iter = y.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
	}
	

}
