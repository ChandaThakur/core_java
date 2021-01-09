package newDay1;
import java.util.*;

public class ObjectToignorecase {
	public static void main(String[] args) {
		
	
	/*String[] arr= {"one","two", "three","nine"};
	Arrays.sort(arr::);*/
		
		List<String> l= new ArrayList<String>();
		l.add("abc");
		l.add("asd");
		l.add("zxc");
		
		Collections.sort(l,String::compareToIgnoreCase);
		l.forEach(System.out::println);
	}
}
