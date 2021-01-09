package newDay2;
@FunctionalInterface
public interface Vehical {
	
	public void car();
	
	default void bike() {
		System.out.println("this is bike method");
	}
	
	default int count(int a, int b) {
		return a+b;
	}

}
