package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDetails {
	
		public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
		public static final String Drive_URL="jdbc:oracle:thin:@localhost:1521:xe";
		public static final String Username="system";
		public static final String Password="system";
		public static final String Select_Query="select * from products";
		
		public void getProductDetails() {
			
			try {
				Class.forName(Driver_Name);
	Connection con=	DriverManager.getConnection(Drive_URL, Username,Password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(Select_Query);
	System.out.println("Products Details");
	while (rs.next()) {
		int productid=rs.getInt(1);
		System.out.println("Product Id=  "+productid);
		String productname=rs.getString(2);
  		System.out.println("Product Name= "+productname);
		String description=rs.getString(3);
		System.out.println("Product description= "+description);
		String quantity=rs.getString(4);
	    System.out.println("Avalaible Qantity= "+quantity);
		String price=rs.getString(5);
		System.out.println("Price = "+price);
		System.out.println("---------------------------------------------------------------------"
         		+ "-------------------------------------------------------------------------------------");
	}
	con.close();
	st.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}

}
