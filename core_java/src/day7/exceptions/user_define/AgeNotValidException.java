package day7.exceptions.user_define;

public class AgeNotValidException extends Exception{
	
	public AgeNotValidException() {
		System.out.println("Age should be above 18");
	}
	
	public AgeNotValidException(String msg) {
		System.out.println(msg);
	}

}
