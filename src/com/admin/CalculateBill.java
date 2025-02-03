package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CalculateBill {

	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String TotalBill="select SUM(quantity * price) as Total_Bill from cart where productid=?";
	
	public static void getTotalBill() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the product Id to calculate and dispaly the bill");
		int productid=scanner.nextInt();
		try {
			Class.forName(Driver_Name);
	Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
	PreparedStatement ps=con.prepareStatement(TotalBill);
	ps.setInt(1, productid);
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
