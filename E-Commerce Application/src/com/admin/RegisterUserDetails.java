package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterUserDetails {
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	
	public static void getUserDetails() throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Mail ID to View the Registered User  ");
	String mail_id=scanner.next();
		Class.forName(Driver_Name);
		
				Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
				PreparedStatement ps=con.prepareStatement("SELECT * from registration WHERE mail_id = ?");
			ps.setString(1, mail_id);
				ResultSet rs=ps.executeQuery();
				 while (rs.next()) { 
		String FullName=rs.getString("full_name");
		System.out.println("Full Name-  "+FullName);
		String Mailid=rs.getString("mail_id");
		System.out.println("Mail Id-   "+Mailid);
		String MobileNumber=rs.getString("mobile_number");
		System.out.println("Mobile Number-   "+MobileNumber);
		String City=rs.getString("city");
		System.out.println("City-   "+City);
		
		
				 }
				con.close();
				ps.close();
				rs.close();
			}
	}

