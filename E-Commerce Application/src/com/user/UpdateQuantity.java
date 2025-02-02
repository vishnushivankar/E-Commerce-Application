package com.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;
public class UpdateQuantity {
	
		public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
		public static final String Drive_URL="jdbc:oracle:thin:@localhost:1521:xe";
		public static final String Username="system";
		public static final String Password="system";
		public static final String Select_Query="UPDATE cart SET quantity = ? WHERE productid = ?";
				
		
		public void update() {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter Product ID to Change/Update the Quantity");
		        int productid = scanner.nextInt();
		        System.out.println("Select the Quantity to Change");
		     int quantity=   scanner.nextInt();
		
		        try {
					Class.forName(Driver_Name);
					Connection con=DriverManager.getConnection(Drive_URL, Username, Password);
					 PreparedStatement ps = con.prepareStatement(Select_Query);
					 ps.setInt(1, quantity);
					 ps.setInt(2, productid);
					  ResultSet rs = ps.executeQuery();
					  
							System.out.println("The Quantity has been changed of product from cart Sucessfully");
							 System.out.println("---------------------------------------------------------------------"
					            		+ "-------------------------------------------------------------------------------------");
					  
							con.close();
							rs.close();
							ps.close();
							
					  } catch (Exception e) {
										
										e.printStackTrace();
									}
		}
	}

						