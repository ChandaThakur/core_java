package day2.Methods;

public class Example3 {
	
	public static int add(int x,int y) {
		int z=x+y;
		
		return z;
	}
	
	public static int sub(int x, int y) {
		
		int z=x-y;
		
		return z;
		
	}
	public static void main(String[] args) {
		System.out.println( add(10,3));
		
		int result=sub(10,6);
		
		System.out.println(result);
	}


}
