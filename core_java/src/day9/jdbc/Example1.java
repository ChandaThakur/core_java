package day9.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;
// see bean class of product
public class Example1 {
	
	public static void main(String[] args) {
		Product product1= new Product(1,"laptop",5200);
		ProductDao example1= new ProductDao();
		//example1.addProduct(product1);
		//example1.getProduct(3);
		
		//example1.deleteProduct(1);
		
		example1.updateProduct(product1);
	}
	
	
}
