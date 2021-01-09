package day7.exceptions.user_define;

public class ThrowEx2 {
	
	public static void checkAge( int age) throws AgeNotValidException {
		if(age<18) {
			throw new AgeNotValidException("access denied: you must be at least 18 years old");
		}else {
			System.out.println("access granted");
		}
	}
	
	public static void main(String[] args) {
		try{
			checkAge(17);
			}
		catch(AgeNotValidException e) {
			e.printStackTrace();
		}
		
	}

}
