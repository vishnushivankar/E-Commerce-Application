package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SortProductByPrice {
	public static final String Driver_Name="oracle.jdbc.driver.OracleDriver";
	public static final String Drive_URL="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username="system";
	public static final String Password="system";
	public static final String Select_Query="select productid, productname,description, quantity,price from products order by price DESC"; 
		
	public void getShortProductsbyprice() {
		
		try {
			Class.forName(Driver_Name);
Connection con=	DriverManager.getConnection(Drive_URL, Username,Password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(Select_Query);
System.out.println("Products are Shorted by Price");
while (rs.next()) {
	int productid=rs.getInt(1);
	System.out.println("Product Id=  "+productid);
	String productname=rs.getString(2);
	System.out.println("Product Name= "+productname);
	String description=rs.getString(3);
	System.out.println("Product description= "+description);
	int quantity=rs.getInt(4);
	System.out.println("Avalaible Qantity= "+quantity);
	int price=rs.getInt(5);
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

