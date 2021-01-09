package day4.abstraction;

public class TestAnimal {
	
	public static void main(String[] args) {
		//Animal animal =new Animal();
		
		Animal animal=new Pig();
		
		animal.animalSound(); // abstract method
		animal.sleep(); // non abstract method
	}

}
