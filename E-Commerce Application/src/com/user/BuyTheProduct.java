package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BuyTheProduct {
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Drive_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String Select_Query="INSERT INTO cart (productid, productname, description, quantity,price)\r\n" + 
			"SELECT productid, productname, description, quantity,price \r\n" + 
			"FROM products\r\n" + 
			"WHERE products.productid = ?";
	
	public void getBuyTheProduct() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Product ID to Buy the Product");
	        int productid = scanner.nextInt();
	        System.out.println("Select the Quantity");
	     int quantity1=   scanner.nextInt();
	
	        try {
				Class.forName(Driver_Name);
				Connection con=DriverManager.getConnection(Drive_URL, Username, Password);
				 PreparedStatement ps = con.prepareStatement(Select_Query);
				  ps.setInt(1, productid);
				  ResultSet rs = ps.executeQuery();
				  while (rs.next()) {
						int productid1=rs.getInt(1);
						System.out.println("Product Id=  "+productid1);
						String productname=rs.getString(2);
				  		System.out.println("Product Name= "+productname);
						String description=rs.getString(3);
						System.out.println("Description= "+description);
						String quantity=rs.getString(4);
					    System.out.println("Qantity= "+quantity);
						String price=rs.getString(5);
						System.out.println("Price = "+price);
						
						System.out.println("The product adde to cart Sucessfully");
						 System.out.println("---------------------------------------------------------------------"
				            		+ "-------------------------------------------------------------------------------------");
				  }
						con.close();
						rs.close();
						ps.close();
						
				  } catch (Exception e) {
									
									e.printStackTrace();
								}
	}
}

					