package day5.setExamples;

import java.util.*;

public class Example4 {
	
	public static void main(String[] args) {
		Set<String> countries =new HashSet<String>();
		
		countries.add("India");
		countries.add("nepal");
		countries.add("China");
		countries.add("Bhutan");
		
		Iterator<String> iter =countries.iterator();
		
		while (iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
			}
		
	}

}
