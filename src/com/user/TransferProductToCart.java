package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TransferProductToCart {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	
	public static void addToCart() throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Product ID to Add to cart ");
		int productId = scanner.nextInt();	
		System.out.println("Select qauntity to add");
		int qantitytoadd=scanner.nextInt();
		
		Class.forName(Driver_Name);
				Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
			//	PreparedStatement ps=con.prepareStatement("INSERT INTO cart (productid, productname, description, quantity,price)\r\n" + 
			//			"SELECT productid, productname, description, quantity,price \r\n" + 
			////			"FROM products\r\n" + 
				//		"WHERE productid = ?");
				PreparedStatement ps=con.prepareStatement("INSERT INTO cart (productid, productname, description, quantity, price) "
						+ "SELECT productid, productname, description, ?, price FROM products WHERE productid = ?");
				ps.setInt(1, qantitytoadd);
				ps.setInt(2, productId);
	
				ps.executeUpdate();
				
				System.out.println("Product added Successfully");
				con.close();
			}
	
	
		
}

  

