package day6Sat.defaultMethod;

public interface vehicle {
	
		default void print() {
			System.out.println("I am a vehicle!");
		}
		//static helper method
		static void blowHorn() {
		      System.out.println("Blowing horn!!!");
		   }

}
