package day8.jdbc.practice;

import java.sql.*;

import utility.DBUtil;

public class Ecample1 {
	
	public static void main(String[] args) {
		Connection con= DBUtil.getMySqlDbConnection();
		String sql="select * from student";
		
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
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
