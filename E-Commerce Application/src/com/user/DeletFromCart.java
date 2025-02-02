package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletFromCart {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String Delete_Query="delete from cart where productid = ?";
	
	public static void delete() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Product ID to delet the Product");
	        System.out.println("       "
					+ "            ");
	        int productid = scanner.nextInt();
	      
	        try {
				Class.forName(Driver_Name);
				Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
				 PreparedStatement ps = con.prepareStatement(Delete_Query);
				  ps.setInt(1, productid);
				  int rs = ps.executeUpdate();
				 
						
						System.out.println("The product has been deleted successfully from cart ");
						 System.out.println("---------------------------------------------------------------------"
				            		+ "-------------------------------------------------------------------------------------");
				  
						con.close();
						
						ps.close();
						
				  } catch (Exception e) {
									
									e.printStackTrace();
								}
	}
}


