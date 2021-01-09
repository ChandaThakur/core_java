package newDay2;

 interface interval1{
	void m1(String s1);
	default void first(String s2) {
		System.out.println("in interval1");
	}
}
 
 interface interval2{
	 default void first(String s3) {
			System.out.println("in interval2");
		}
 }

public class DefaultInterface implements interval1,interval2{

	@Override
	public void m1(String s1) {
		
		System.out.println(s1);
	}

	@Override
	public void first(String s2) {
		interval1.super.first(s2);
		
	}

	public void first1(String s3) {
		interval2.super.first(s3);
		
	}
	
	public static void main(String[] args) {
		DefaultInterface a= new DefaultInterface();
		a.m1("hi");
		a.first("hello");
		a.first1("bye");
	}
	

}
