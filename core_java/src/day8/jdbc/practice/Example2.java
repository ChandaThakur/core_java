package day8.jdbc.practice;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Example2 {
	
	public static void main(String[] args) {
		;
		
		Student student1=new Student(3,"nimo","B.E",4,22);
		Student student2=new Student(4,"nimo","B.E",4,22);
		Example2 ex1=new Example2();
		//ex1.addStudent(student1);
		//ex1.addStudent(student2);
		ex1.checkStudent(2);
		ex1.getAllData();
		
	}
	
	public void addStudent(Student student) {
		
		Connection con= DBUtil.getMySqlDbConnection();
				
		String sql="insert into student values (?,?,?,?,?)";
		
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourse());
			pst.setInt(4, student.getDuration());
			pst.setInt(5, student.getAge());
			
			int result =pst.executeUpdate();
			
			if(result!=0) {
				System.out.println("Successfully Inserted");
			}else {
				System.out.println("Insertion Failed");
			}
		}catch (Exception e) {
			System.out.println("Exception Occured" +e);
		}
	}
	
	public void checkStudent(int num) {
		Connection con= DBUtil.getMySqlDbConnection();
				
		String sql1= "select * from student where roll_number=?";
		try {
			PreparedStatement pst= con.prepareStatement(sql1);
			pst.setInt(1, num);
			ResultSet rs = pst.executeQuery();
			//int numFromDB = rs.getInt("roll_num");
			while(rs.next()) {
				int numFromDb = rs.getInt("roll_number");
				if(num == numFromDb) {
				System.out.println("Roll NO. Found");
				}else {
				System.out.println("Roll NO. does not exist");
				}
				}
		} catch (Exception e) {
			
			System.out.println("Exception Occured" +e);
			
		}
		
	}
	
	public void getAllData() {
		Connection con= DBUtil.getMySqlDbConnection();
		String sql2 ="select * from student ";
		try {
			PreparedStatement pst=con.prepareStatement(sql2);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int rollno=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String courses=rs.getString("course");
				int duration=rs.getInt("duration");
				int ages=rs.getInt("age");
				System.out.println(rollno);
				System.out.println(name);
				System.out.println(courses);
				System.out.println(duration);
				System.out.println(ages);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
