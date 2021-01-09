package day2.Methods;

public class TestEx5 {
	
	public static void main(String[] args) {
		// Example5 is class name and not object of class Example5
		// since these methods are static it is possible
		
		System.out.println( Example5.add(10,3));
		
		int result=Example5.sub(10,6);
		System.out.println(result);
		
		int result1=Example5.mul(10,6);
		System.out.println(result1);
		
		int result2=Example5.div(10,6);
		System.out.println(result2);
		
		int result3=Example5.reminder(10,6);
		System.out.println(result3);
	}

}
