package day1.strings;

public class mycode {
	
	public static void main(String[] args) {
		String str= "Original Sting";
		String str1="Another String";
		int a= 123;
		int b=456;
		char c='c';
		long l=12345;
		double d=23435.67;
		System.out.println("String Concatenation"+str +" " +str1 +" " +a +" " +b +" "  +c +" " +l +" " +d);
		System.out.println("integer concatenation "+a+b);
		System.out.println("integer addtion " +(a+b));
		
		short s = 65;
        char cc1 = (char) s;
        System.out.println(s+"  "+cc1);

        char c1 = '1';
        int i = (int) c1;
        System.out.println(c1+"  "+i); // here we get the ascii value of '1'
        System.out.println(Character.getNumericValue(c1)); // to get the exact numeric value of char

        // this for narrowing casting
        float num = 2.88f;
        int myint = (int) num;
        System.out.println(num+" "+ myint);

        double value = 22.2;
        int y = (int) value;
        char c2 = (char) y;
        System.out.println(value+"  "+c2);
        System.out.println(c2);

        short s2 = 224;
        byte  b1 = (byte) s2;
        System.out.println(s2+"  "+b1);
	}

}
