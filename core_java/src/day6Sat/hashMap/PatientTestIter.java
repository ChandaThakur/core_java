package day6Sat.hashMap;

import java.util.*;

public class PatientTestIter {
	
	public static void main(String[] args) {
		
		Patient p1=new Patient(1,"abc","a");
		Patient p2=new Patient(2,"asd","x");
		Patient p3=new Patient(3,"qwe","w");
		Patient p4=new Patient(4,"zxc","z");
		
		HashMap<Integer,Patient> p= new HashMap<Integer,Patient>();
		
		p.put(10, p1);
		p.put(20, p2);
		p.put(30, p3);
		p.put(40, p4);
		
		Set<Integer> keysSet = p.keySet();
		
		Iterator<Integer> iter = keysSet.iterator();
		
		while(iter.hasNext()) {
			Integer x= iter.next();
			Patient y= p.get(x);
			System.out.println(x+" " +y);
		}
 	}

}
