package day8.jdbc;
import utility.DBUtil;
import java.sql.*;
// check weather user is their in table or not
public class Example5 {
	
	public static void main(String[] args) {
		String userName= "chanda";
		String password ="93036";
		Connection con= DBUtil.getMySqlDbConnection();
		
		String sql= "select * from log_in where username='chanda'";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				String passFromDB=rs.getString("password");
				//System.out.println(passFromDB);
				if(password.equals(passFromDB) ) {
					System.out.println("Match Found");
				}else {
					System.out.println("no match");
				}
			}
			
		}catch(Exception e) {
			System.out.println("Exception Occured" +e);
		}
	}

}
