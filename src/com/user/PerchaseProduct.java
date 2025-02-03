package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PerchaseProduct {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static void purchase() throws ClassNotFoundException, SQLException {
		Class.forName(Driver_Name);
		Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
		PreparedStatement ps1=con.prepareStatement("select * from cart" );
		ResultSet rs=ps1.executeQuery();
		while (rs.next()) {
            int productId = rs.getInt("productid");
            System.out.println("Product Id=  "+productId);
            String productName = rs.getString("productname");
            System.out.println("Product Name ="+productName);
            String description = rs.getString("description");
            System.out.println("Description ="+description);
            int quantity = rs.getInt("quantity");
            System.out.println("Quantity  ="+quantity);
            double price = rs.getDouble("price");
            System.out.println("Price  ="+price);
           
            System.out.println("Prodcut purchased successfully");
            System.out.println("---------------------------------------------------------------------"
            		+ "-------------------------------------------------------------------------------------");
            
		}
	}
	}


