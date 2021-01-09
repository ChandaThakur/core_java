package day5.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
	
	public static void main(String[] args) {
		//map is the interface implemented by hashmap so we can store hashmap value as refrence in interface map
		Map<String,String> mapOfCities = new HashMap<String,String>();
		
		mapOfCities.put("pune", "Maharashtra");
		mapOfCities.put("gandhinagar", "Gujarat");
		mapOfCities.put("nagpur", "maharashtra");
		mapOfCities.put("hyderabad", "telangana");
		
		Set<String> keysSet =mapOfCities.keySet();
		
		for(String x: keysSet) {
			String city =mapOfCities.get(x);
			System.out.println(x +" " +city);
		}
	}

}
