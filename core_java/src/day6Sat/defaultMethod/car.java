package day6Sat.defaultMethod;

public class car implements vehicle, fourWheeler{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		fourWheeler.super.print();
	}
	
	blowHorn();
	
	
	/*public void print() {
	      System.out.println("I am a four wheeler car vehicle!");
	   }*/

}
