package day5.ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class BookTest {
	
	public static void main(String[] args) {
		
		BookInfo book1 = new BookInfo("abc",300,105);
		BookInfo book2 = new BookInfo("xyz",450,700);
		BookInfo book3 = new BookInfo("asd",100,50);
		
		ArrayList<BookInfo> bookList =new ArrayList<BookInfo>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		Iterator<BookInfo> iter= bookList.iterator();

		
		while(iter.hasNext()) {
			BookInfo x= iter.next();
			System.out.println(x);
		}
	}

}
