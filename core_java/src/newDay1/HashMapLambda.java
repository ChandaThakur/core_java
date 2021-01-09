package newDay1;

import java.util.*;

public class HashMapLambda {
	
	public static void main(String[] args) {
		
		Map<String,Integer> price=new HashMap<>();
		price.put("pen",10);
		price.put("pencil",5);
		price.put("scale",5);
		
		price.forEach((k,v)->System.out.println(k+" price is " +v));
	}

}
