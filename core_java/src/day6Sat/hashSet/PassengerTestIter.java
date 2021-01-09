package day6Sat.hashSet;

import java.util.*;

public class PassengerTestIter {
	
	public static void main(String[] args) {
		
		PassengerBean p1 = new PassengerBean("chanda",10);
		PassengerBean p2 = new PassengerBean("chanda",20);
		PassengerBean p3 = new PassengerBean("chanda",30);
		PassengerBean p4 = new PassengerBean("chanda",40);
		
		Set<PassengerBean> passenger =new HashSet<PassengerBean>();
		
		passenger.add(p1);
		passenger.add(p2);
		passenger.add(p3);
		passenger.add(p4);
		
		Iterator<PassengerBean> iter =passenger.iterator();
		
		while(iter.hasNext()) {
			PassengerBean x=iter.next();
			System.out.println(x);
		}
		
	}
	
	
	

}
