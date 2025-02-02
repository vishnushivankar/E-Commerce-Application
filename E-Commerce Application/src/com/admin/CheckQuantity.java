package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckQuantity {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	
	public static void getQuantity() throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Product ID to View the Quantity  ");
	int productid=scanner.nextInt();
		
		
		Class.forName(Driver_Name);
		
				Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
				PreparedStatement ps=con.prepareStatement("SELECT quantity FROM products WHERE productid = ?");
			ps.setInt(1, productid);
				ResultSet rs=ps.executeQuery();
				 if (rs.next()) { 
			int Quantity=rs.getInt("quantity");
			System.out.println("Quantity is = "+Quantity);
				 }else {
					 System.out.println("Product not found");
				 }
				con.close();
				ps.close();
				rs.close();
			}
	}
	

