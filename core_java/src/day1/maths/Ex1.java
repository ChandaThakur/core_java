package maths;

public class Ex1 {
	
	public static void main(String[] args) {
		int result1 = Math.max(51, 29);
		System.out.println(result1);
		 int x = Math.min(51, 22);
		 System.out.println(x);
		 System.out.println(Math.sqrt(64));
		 System.out.println(Math.abs(-4.7)); 
		 // in this outpot is double but it is calso used for int short n float
		 System.out.println(Math.random()); 
		 // defoult random function will give value between 0 to 1
		 int randomNum = (int)(Math.random() * 101);  // 0 to 100
		 System.out.println(randomNum);
	}

}
