package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	
	public void getRegistraion() throws ClassNotFoundException, SQLException {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the FullName");
	String FULL_NAME=scanner.next();
	System.out.println("Enter the mail Id");
	String MAIL_ID=scanner.next();
	
	System.out.println("Enter the Mobile Number");
	String MOBILE_NUMBER=scanner.next();
	System.out.println("Enter the City");
    String CITY=scanner.next();
    
    Class.forName(Driver_Name);
  Connection con=  DriverManager.getConnection(Driver_URL, Username, Password);
  PreparedStatement ps=con.prepareStatement("insert into REGISTRATION values (?,?,?,?)");
  ps.setString(1, FULL_NAME);
  ps.setString(2, MAIL_ID);
  ps.setString(3, MOBILE_NUMBER);
  ps.setString(4, CITY);
  int rs=ps.executeUpdate();
    
    System.out.println("Registration has been Completed, Kindly process loging your account \r\n");

}
}
