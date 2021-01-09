package day7.treads;

public class TestExample2 {
	
	public static void main(String[] args) {
		
		Example2 ex2= new Example2();
		Thread thread1=new Thread(ex2);
		thread1.start();
	}

}
