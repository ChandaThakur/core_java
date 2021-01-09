package day8.jdbc;

import java.sql.*;

// demo of JDBC connection
public class Example1 {
	
	public static void main(String[] args) {
		String driverClassName ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword ="chanda#25";
		
		try {
			Class.forName(driverClassName);
			Connection con=DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("Connection:"+con);
			
			String sql="select *from log_in";
			// Statement or PreparedStatement
			// First giving demo using Statement
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql); 
			
			
			// for select queries, we use executeQury() method
			
			while(rs.next()) {
				String userName=rs.getString("username");
				String password=rs.getString("password");
				System.out.println("User Name:" +userName);
				System.out.println("Password:" +password);
				System.out.println("********************");
			}
					
		}catch(Exception e) {
			System.out.println("excpetion occured" +e);
		}
	}

}
