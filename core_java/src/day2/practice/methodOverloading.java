package day2.practice;

public class methodOverloading {
	
	public int area(int s)
	{
		int sqArea = s*s;
		return sqArea;
	}
	
	public double area(int b, int h)
	{
		double triArea = 0.5*b*h;
		return triArea;
	}
	
	public static void main(String[] args) {
		methodOverloading x = new methodOverloading();
		System.out.println("Area of Square :" +x.area(10));
		
		System.out.println("Area of Square :" +x.area(10,2));
	}

}
