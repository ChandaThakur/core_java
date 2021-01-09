package day7.practice;

public class tryCatchEx {
	
	public static void main(String[] args) {
		int x =10;
		double div;
		try {
			div=x/0;
			System.out.println("Divison:"+div);
		}catch(Exception e) {
			System.out.println("Exception Occured " +e);
		}
	}

}
