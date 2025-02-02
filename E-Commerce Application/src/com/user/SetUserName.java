package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SetUserName {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	
	public  void getUserName() throws ClassNotFoundException, SQLException  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Set the User Name  ");
				String username=scanner.next();
				System.out.println("Set the Password ");
		String password=scanner.next();
		Class.forName(Driver_Name);
		Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
	PreparedStatement ps=con.prepareStatement("INSERT INTO login (username, password) VALUES (?, ?)");
	
	ps.setString(1, username);
	
	ps.setString(2, password);
	ps.executeUpdate();
	System.out.println("User Name and Password set Sucessfully");
	
	con.close();
	ps.close();
	
	
	
	}

}
