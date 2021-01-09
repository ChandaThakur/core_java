package newDay1;
import java.util.function.*;


public class RefToConstructor {
	static void usemethod(String s) {
		System.out.println("String" +s);
	}
	
	static void PrintNum(int x) {
		System.out.println("int" +x);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> con1=RefToConstructor::usemethod;
		con1.accept("hello");
		
		Consumer<Integer> con2=RefToConstructor::PrintNum;
		con2.accept(25);
		
	}

}
