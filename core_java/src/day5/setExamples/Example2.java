package day5.setExamples;

import java.util.*;

// set of numbers using itrator
public class Example2 {
	
	public static void main(String[] args) {
		Set<Integer> setOfIds=new HashSet<Integer>();
		
		setOfIds.add(93036);
		setOfIds.add(93037);
		setOfIds.add(93038);
		setOfIds.add(93039);
		
		//System.out.println(setOfIds);
		Iterator<Integer> iter = setOfIds.iterator();
		
		while(iter.hasNext()) {
			int x=iter.next();
			System.out.println(x);
		}
		
	}

}
