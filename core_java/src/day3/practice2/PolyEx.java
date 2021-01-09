package day3.practice2;

public class PolyEx {
	
	public void add() {
		int x=10;
		int y=5;
		//protected int sum = x+y;
		System.out.println("Sum:" +(x+y));
	}
	
	protected void sub() {
		int x=10;
		int y=5;
		System.out.println("Diffrance:" +(x-y));
	}
	
	private void mul() {
		int x=10;
		int y=5;
		System.out.println("multiple:" +(x*y));
	}

}
