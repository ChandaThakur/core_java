package day6Sat.arrayList;

import java.util.ArrayList;

public class AirportTestForEach {
	
	public static void main(String[] args) {
		AirportBean  a = new AirportBean(101, "Hande","11:20");
		AirportBean a1 = new AirportBean(123, "Drek","11:30");
		AirportBean a2 = new AirportBean(103, "Rega","10:20");
		
		ArrayList<AirportBean> out = new ArrayList<>();
		out.add(a);
		out.add(a1);
		out.add(a2);
		
		for(AirportBean x: out) {
			System.out.println(x);
		}
	}

}
