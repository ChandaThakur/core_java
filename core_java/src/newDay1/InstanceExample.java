package newDay1;
interface MyInterface1{
	void NewMethod();
	public static void add(int a,int b) {
		
		System.out.println("static" +(a+b));
	}
}

public class InstanceExample {
	
	public void MyMethod1() {
		System.out.println("this is instance method ");
	}
	public static void main(String args[]) {
		InstanceExample IE=new InstanceExample();
		//MyInterface1 n= IE::MyMethod1;
		//n.NewMethod();
		IE.MyMethod1();
		MyInterface1.add();
	}

}
