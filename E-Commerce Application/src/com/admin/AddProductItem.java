package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddProductItem {
	
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String Add_Query="INSERT INTO products(productid, productname, description, quantity, price) VALUES (?, ?, ?, ?, ?)";
	
	public static void addProduct() {
		System.out.println("Kindly Fill the Product details to add the item");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Product Id");
		int productid=scanner.nextInt();
		System.out.println("Enter the Product Name");
	String	productname=scanner.next();
	System.out.println("Enter the Prodcut Description");
	String description=scanner.next();
	System.out.println("Enter the Quantity");
	int quantity=scanner.nextInt();
	System.out.println("Enter the Price");
	int price=scanner.nextInt();
	try {
			Class.forName(Driver_Name);
			Connection con=DriverManager.getConnection(Driver_URL, Username, Password);
			PreparedStatement ps= con.prepareStatement(Add_Query);
		ps.setInt(1, productid);
		ps.setString(2, productname);
		ps.setString(3, description);
		ps.setInt(4, quantity);
		ps.setInt(5, price);
			
			ps.executeUpdate();
			System.out.println("Item added SuccessFully...");
			con.close();
			ps.close();
			
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
