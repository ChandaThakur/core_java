package day8.jdbc;

import java.sql.*;

//insert data into login table using PreparedStatement
public class Example4 {
	
	public static void main(String[] args) {
		Connection con =getMySqlDbConnection();
		String sql="insert into log_in values(?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, "basic"); //inserted value with index no. and actual value as string
			pst.setString(2, "2502"); // index start with 1 in sql
			int result=pst.executeUpdate();
			if(result==0) {
				System.out.println("Insertion Failed");
			}else {
				System.out.println("Inserted Successfully");
			}
		}catch(Exception e) {
			System.out.println("Exception Occured" +e);
		}
		
	}
	
	// created this method as static as we dont want to create object
	public static Connection getMySqlDbConnection() {
		
		String driverClassName ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword ="chanda#25";
		Connection con=null;
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("Connection:"+con);
		}catch(Exception e) {
			System.out.println("exception occured while creating connection" +e);
		}
		
		return con;
		
	}

}
