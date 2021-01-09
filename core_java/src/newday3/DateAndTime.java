package newday3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println("Current Date:" +date);
		Month m= date.getMonth();
		int m1= date.getMonthValue();
		
		System.out.println(m +" "+m1);
	}

}
