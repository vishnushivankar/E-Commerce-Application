package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
		public void loginDetails() throws ClassNotFoundException, SQLException  {
			   System.out.println("Login to an Account");
			   Scanner scanner=new Scanner(System.in);
			   System.out.println("Enter the Username");
			   String username= scanner.next();	    
			   System.out.println("Enter the Password");
			   String password= scanner.next();

			   try {
		            if (details(username, password)) {
		                System.out.println("Successfully logged in...\r\n");
		            } else {
		                System.out.println("Invalid username or password. Try again.");
		              
		        		Login.callloginmethod();
		            }
		        } catch (Exception e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        }
		    }

		    public static boolean details(String username, String password) throws ClassNotFoundException, SQLException {
		        Class.forName(Driver_Name);
		        
		        // Use try-with-resources for automatic closing of database resources
		        try (Connection con = DriverManager.getConnection(Driver_URL, Username, Password);
		             PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?")) {
		            
		            ps.setString(1, username);
		            ps.setString(2, password);
		            
		            try (ResultSet rs = ps.executeQuery()) {
		                if (rs.next()) {
		                    // If a matching record is found, login is successful
		                    System.out.println("User found in database.");
		                    return true;
		                } else {
		                    // No matching record, invalid login
		                    System.out.println("User not found.");
		                    return false;
		                }
		            }
		        }
		    }

		    public static void callloginmethod() {
		        Login login = new Login();
		        try {
					login.loginDetails();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
