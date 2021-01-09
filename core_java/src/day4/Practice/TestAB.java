package day4.Practice;

public class TestAB extends A implements B{
	
	public static void main(String[] args) {
		B a = new TestAB();

		a.myMethod();
	}

}
