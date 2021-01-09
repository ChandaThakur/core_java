package day5.hashmap;

import java.util.HashMap;

public class Example3 {
	
	public static void main(String[] args) {
		
		HashMap<Double,String> numAndName= new HashMap<Double,String>();
		numAndName.put(98989898d, "chanda");
		numAndName.put(9088d, "roshni");
		numAndName.put(947789d, "gayatri");
		
		System.out.println(numAndName);
	}

}
