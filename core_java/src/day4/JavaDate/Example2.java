package day4.JavaDate;

// we can use only one lib java.time.*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {
	
	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    System.out.println("After formatting: " + myFormatObj);
	}

}
