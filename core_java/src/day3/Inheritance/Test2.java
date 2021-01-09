package day3.Inheritance;

public class Test2 {
	
	public static void main(String[] args) {
		// object of subclass can be stored in a refrance of a Superclass but reverse is not possible
		Vehicle obj = new Car();
		
		obj.start();
		
		obj.stop();
		
	}

}
