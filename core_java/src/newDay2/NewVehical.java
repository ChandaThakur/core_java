package newDay2;

public class NewVehical implements Vehical,Transportation {

	@Override
	public void car() {
		System.out.println("this is car method");
		
	}

	@Override
	public void bike() {
		System.out.println("this is overried method");
		Transportation.super.bike();
	}
	
	public void bike1() {
		Vehical.super.bike();
	}

}
