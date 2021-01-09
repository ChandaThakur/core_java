package day1.if_else;

public class ex4 {
	public static void main(String[] args) {
		// ternary operator
		int x= 10;
		String result = (x < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		String str1 = new String("okay");
        String str2 = new String(str1);
        System.out.println(str1.equals(str2));
        
        String str3 = new String("okay");
        String str4 = new String(str3);
        System.out.println(str3.equals(str4));
	}

}
