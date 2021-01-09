package day6Sat.hashSet;

import java.util.*;

public class CricketerTestForEach {
	
	public static void main(String[] args) {
		
		CricketerBean c1 = new CricketerBean(7,"Dhoni");
		CricketerBean c2 = new CricketerBean(10,"sachin");
		
		Set<CricketerBean> player = new HashSet<CricketerBean>();
		
		player.add(c1);
		player.add(c2);
		player.add(c1);
		
		for(CricketerBean x:player) {
			System.out.println(x);
		}
	}

}
