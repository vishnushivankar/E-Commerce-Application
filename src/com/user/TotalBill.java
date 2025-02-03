package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TotalBill {

	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String TotalBill="select SUM(quantity * price) as Total_Bill from cart";
	public static void getTotalBill() {
		try {
			Class.forName(Driver_Name);
	Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
	PreparedStatement ps=con.prepareStatement(TotalBill);
	ResultSet rs=ps.executeQuery();
	rs.next();
	 double totalBill = rs.getDouble("Total_Bill");
	 System.out.println("Total Bill is = " 
				
		 +totalBill);
	con.close();
	ps.close();
	rs.close();
  
  
  System.out.println("Kindly pay the Bill.....");
  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
