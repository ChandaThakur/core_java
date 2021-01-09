package day8.jdbc;

import java.sql.*;

// insert query with Statement
public class Example3 {
	
	public static void main(String[] args) {
		Connection con =getMySqlDbConnection();
		String sql="insert into log_in values('frontdesk','0123')";
		try {
			Statement st=con.createStatement();
			int result=st.executeUpdate(sql);
			// executeUpdate() method can be used for insert/update/delete queries and its return type is int
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
