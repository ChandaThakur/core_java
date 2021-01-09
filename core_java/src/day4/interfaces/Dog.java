package day4.interfaces;

public class Dog  implements Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
		System.out.println("this is animal sound method");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("this is sleep method");
	}

}
