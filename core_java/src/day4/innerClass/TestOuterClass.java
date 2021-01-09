package day4.innerClass;

import day4.innerClass.Outerclass.InnerClass;;

public class TestOuterClass {
	
	public static void main(String[] args) {
		
		Outerclass out=new Outerclass();
		System.out.println(out.x);
		
		InnerClass in = out.new InnerClass();
		System.out.println(in.y);
		//System.out.println(out.y);
		
	}

}
