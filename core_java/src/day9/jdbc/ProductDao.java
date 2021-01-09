package day9.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;

public class ProductDao {
	
	public void addProduct(Product product) {
		System.out.println("Now going to insert the product into db:" +product);
	
		Connection con=DBUtil.getMySqlDbConnection();
		
		String sql= "insert into product values (?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql); 
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getPrice());
			
			int result=pst.executeUpdate();
			
			if(result==0) {
				System.out.println("Query Failed");
			}else {
				System.out.println("Success");
			}
		}catch(Exception e) {
			System.out.println("Exception" +e);
		}
			
	}

	public void getProduct(int productId) {
		Connection con=DBUtil.getMySqlDbConnection();
		
		String sql = "select * from product where product_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				String productName=rs.getString("product_name");
				int price= rs.getInt("price");
				System.out.println("productId:"+productId);
				System.out.println("productName:"+productName);
				System.out.println("price:"+price);
			}else {
				System.out.println("Product ID does not exist");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	public void deleteProduct(int productId) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql3="delete from product where product_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql3);
			pst.setInt(1, productId);
			int result=pst.executeUpdate();
			
			if(result ==0) {
				System.out.println("The product with this ID does not exost");
			}
			else {
				System.out.println("Succesfully Deleted");
			}
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void updateProduct(Product product) {
		Connection con=DBUtil.getMySqlDbConnection();
		String sql4="update product set product_name=?,price=? where product_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(sql4);
			pst.setString(1, "PC");
			pst.setInt(2, 40000);
			pst.setInt(3, product.getProductId());
			int result=pst.executeUpdate();
			
			if(result ==0) {
				System.out.println("The product with this ID does not exist");
			}
			else {
				System.out.println("Succesfully Updated");
			}
	}catch(Exception e) {
		System.out.println(e);
	}

}

}
