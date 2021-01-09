package day7.exceptions;

public class ThrowEx2 {
	
	public static void checkAge( int age) {
		if(age<18) {
			throw new ArithmeticException("access denied: you must be at least 18 years old");
		}else {
			System.out.println("access granted");
		}
	}
	
	public static void main(String[] args) {
		checkAge(17);
	}

}
