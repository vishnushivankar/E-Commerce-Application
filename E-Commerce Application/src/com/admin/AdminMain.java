package com.admin;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminMain {
	
	public void getAdmindetails() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the coice to perfom the opertaion");
		System.out.println("1. Add product Item");
		System.out.println("2. Calculate the Bill");
		System.out.println("3. Check the Quantity");
		System.out.println("4. Check Registered ude Details");
	while(true) {
		Scanner scanner=new Scanner(System.in);
	String number=scanner.next();
	switch(number) {
	case"1":
		AddProductItem.addProduct();
		System.out.println("Enter the 2 to Calculate the Bill");
		break;
	case"2":
		CalculateBill.getTotalBill();
		System.out.println(" Enter 3. Check the Quantity");
		break;
	case"3":
		CheckQuantity.getQuantity();
		System.out.println("Enter 4. Check Registered ude Details");
		break;
	case"4":
		RegisterUserDetails.getUserDetails();
		return;
		default:
			System.out.println("Enter the correct choice");
			AdminMain adminMain=new AdminMain();
			adminMain.getAdmindetails();
	}
	}

}
}