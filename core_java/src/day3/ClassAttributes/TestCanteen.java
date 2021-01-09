package day3.ClassAttributes;

import day3.Beans.*; // we are importing complete package

import day3.Beans.Student;

public class TestCanteen {
	
public static void main(String[] args) {
		
		Canteen food1=new Canteen("Vada Pav",12);
		
		Canteen food2=new Canteen("Pav Bhaji",110);
		
		Canteen food3=new Canteen("Dosa",50);
		
		Canteen[] arrayOfFoods= {food1,food2,food3};
		
		TestCanteen canteen1=new TestCanteen();
		canteen1.display(arrayOfFoods);
		
	}

	public void display(Canteen[] arrayOfFoods) {
		
		for(Canteen x:arrayOfFoods) {
			System.out.println(x);
		}
		
	}

}
