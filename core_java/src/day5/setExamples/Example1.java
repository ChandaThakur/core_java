package day5.setExamples;

import java.util.*;

// set of numbers
public class Example1 {
	
	public static void main(String[] args) {
		Set<Integer> setOfIds=new HashSet<Integer>();
		
		setOfIds.add(93036);
		setOfIds.add(93037);
		setOfIds.add(93038);
		setOfIds.add(93039);
		
		//System.out.println(setOfIds);
		
		for(int x:setOfIds) {
			System.out.println(x);
		}
		
	}

}
