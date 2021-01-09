package newDay2;

import java.util.function.Function;

public class ClassFuntionInterface {
	
	public static void main(String[] args) {
		Function<Integer,Double> f=a->a/5.7;
		System.out.println(f.apply(20));
		
		Function<String,String>f1=b->"hello";
		System.out.println(f1.apply("hey "));
		try {
		//f1=f1.andThen(b->5+b);
		f1=f1.compose(b->b+"hi");
		System.out.println(f1.apply("bye"));
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
