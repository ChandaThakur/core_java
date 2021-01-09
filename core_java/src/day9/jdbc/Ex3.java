package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Student;
import utility.DBUtil;

public class Ex3 {
	
	public static void main(String[] args) {
		;
		
		Student student1=new Student(5,"chanda thakur","B.E",4,22);
		Student student2=new Student(4,"nimo","B.E",4,22);
		StudentDao ex1=new StudentDao();
		//ex1.addStudent(student1);
		//ex1.addStudent(student2);
		//ex1.getStudent("thakur");
		//ex1.getAllData();
		
		//ex1.deleteStudent(5);
		ex1.updateStudent(student2);
		
	}
	

}
