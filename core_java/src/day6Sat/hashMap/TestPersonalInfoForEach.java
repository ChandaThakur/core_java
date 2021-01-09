package day6Sat.hashMap;

import java.util.HashMap;
import java.util.Set;

public class TestPersonalInfoForEach {
	
	public static void main(String[] args) {
		PersonalInfoBean p1 =new PersonalInfoBean("abc", "single");
		PersonalInfoBean p2 =new PersonalInfoBean("xyz", "married");
		PersonalInfoBean p3 =new PersonalInfoBean("jkl", "single");
		
		HashMap<Integer,PersonalInfoBean> info= new HashMap<Integer,PersonalInfoBean>();
		
		info.put(1, p1);
		info.put(2, p2);
		info.put(3, p2);
		
		Set<Integer> keysSet =info.keySet();
		
		for(Integer x:keysSet) {
			
			System.out.println(x +" "+info.get(x));
			
		}
	}

}
