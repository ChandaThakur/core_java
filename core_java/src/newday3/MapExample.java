package newday3;

import java.util.Optional;

public class MapExample {
	
	public static void main(String[] args) {
		
		Optional<String> opt=Optional.of("HEYY");
		Optional<String> opt1=Optional.of("hello");
		System.out.println(opt.map(String::toLowerCase));
	}

}
