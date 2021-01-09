package day4.JavaDate;

import java.time.*;
import java.time.LocalTime;

public class Eample {

	public static void main(String[] args) {
		
		LocalDate dates = LocalDate.now();
		System.out.println(dates);
		
		LocalTime times = LocalTime.now();
		System.out.println(times);
		
		LocalDateTime dateTime = LocalDateTime.now();
	    System.out.println(dateTime);
	    
	    
	}
}
