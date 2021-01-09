package newDay2;

import java.util.ArrayList;

import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> emp = new ArrayList<String>();
        emp.add("Ashok");
        emp.add("zeenat");
        emp.add("payal");
        emp.add("barkha");
        System.out.println("---------EMP Details-------------");
        emp.forEach(e->System.out.println(e));
		Collections.sort(emp);
		System.out.println(emp);
		Collections.reverse(emp);
		System.out.println(emp);
	}

}
