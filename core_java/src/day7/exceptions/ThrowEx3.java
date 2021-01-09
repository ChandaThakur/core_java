package day7.exceptions;

public class ThrowEx3 {
	
	public static void checkAge( int age) throws Exception {
		if(age<18) {
			throw new Exception("access denied: you must be at least 18 years old");
		}else {
			System.out.println("access granted");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(17);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace(); this is auto msg
			System.out.println("somthing went wrong");
		}
	}

}
