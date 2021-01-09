package day3.ClassAttributes;

import day3.Beans.*;

public class TestStudents2 {
	
	public static void main(String[] args) {
		
		Student student1=new Student(1,"chanda","BE");
		
		Student student2=new Student(2,"roshni","BE");
		
		Student student3=new Student(3,"hari","BE");
		
		Student student4=new Student(4,"gayatri","BE");
		
		Student[] arrayOfStudents= {student1,student2,student3,student4};
		
		TestStudents2 testStudent2=new TestStudents2();
		testStudent2.displayAllStudents(arrayOfStudents);
		
	}

	public void displayAllStudents(Student[] arrayOfStudents) {
		
		for(Student x:arrayOfStudents) {
			System.out.println(x);
		}
		
	}
}
