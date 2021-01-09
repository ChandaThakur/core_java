package day8.jdbc;
import utility.DBUtil;
import java.sql.*;
// check weather user is their in table or not
public class Example6 {
	// we will give a message that "User Id not present in db" in case user_name not found in db
	public static void main(String[] args) {
		
		
		
		
		
		// complete this code
		String userName= "chanda";
		String password ="93036";
		Connection con= DBUtil.getMySqlDbConnection();
		
		String sql= "select * from log_in where username='?'";
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
