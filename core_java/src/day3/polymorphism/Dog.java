package day3.polymorphism;

public class Dog extends Animal {
	/* this is method overriding as the animalSound method is already in Animal Class
	 *  which is parent of dog class but it it overriding with another method of same name 
	 *  if we hide this method or comment this then method of parent class will be used here
	*/
	
	public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }

}
