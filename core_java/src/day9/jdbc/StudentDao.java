package day9.jdbc;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class StudentDao {
	
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
	
	public void getStudent(String name) {
		Connection con= DBUtil.getMySqlDbConnection();
				
		String sql1= "select * from student where student_name=?";
		try {
			PreparedStatement pst= con.prepareStatement(sql1);
			//pst.setString(1, name);
			pst.setString(1, "%" + name + "%");
			ResultSet rs = pst.executeQuery();
			//int numFromDB = rs.getInt("roll_num");
			while(rs.next()) {
				String nameFromDb = rs.getString("student_name");
				if(name.equals(nameFromDb)) {
					
					System.out.println("Roll NO. Found");
					int rollno=rs.getInt("roll_number");
					//String name1=rs.getString("student_name");
					String courses=rs.getString("course");
					int duration=rs.getInt("duration");
					int ages=rs.getInt("age");
					System.out.println("Roll Number:" +rollno);
					System.out.println("Student Name:" +nameFromDb);
					System.out.println("Course:" +courses);
					System.out.println("Duratoin:" +duration);
					System.out.println("Age:" +ages);
					
					System.out.println("***********************");
					
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
				System.out.println("Roll Number:" +rollno);
				System.out.println("Student Name:" +name);
				System.out.println("Course:" +courses);
				System.out.println("Duratoin:" +duration);
				System.out.println("Age:" +ages);
				System.out.println("_____________________");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int rollNo) {
		
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="delete from student where roll_number=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollNo);
			int result=pst.executeUpdate();
			if(result==0) {
				System.out.println("Student with this Roll Number does not exist");
			}
			else {
				System.out.println("Succesfully Deleted");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void updateStudent(Student student) {
		
		Connection con=DBUtil.getMySqlDbConnection();
		String sql="update student set student_name=?,course=? where roll_number=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, "Tina");
			pst.setString(2, "MBA");
			pst.setInt(3, student.getRollNumber());
			int result=pst.executeUpdate();
			
			if(result ==0) {
				System.out.println("Student with this ID does not exist");
			}
			else {
				System.out.println("Succesfully Updated");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}


}
