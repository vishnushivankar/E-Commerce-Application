package com.main.output;

import java.sql.SQLException;
import java.util.Scanner;

import com.admin.AdminMain;
import com.guest.Guest;
import com.user.UserMainOutput;

public class OutputMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Welcome to E-Commerce based Java Application");
        System.out.println("A. User Operations \r\n"+
        		"B. Admin Operations\r\n"+
        		"C. Guest Operations\r\n");
     
    	  Scanner scanner=new Scanner(System.in);
      
        System.out.println("Enter Your Choice number for above Opertaion");
        while(true) {
        String number=scanner.next();
		
		switch (number) {
		 case "A":
		UserMainOutput user =new UserMainOutput();
		user.getUser();
		AdminMain admin1=new AdminMain();
		admin1.getAdmindetails();
		break;
		case "B":
		AdminMain admin=new AdminMain();
		admin.getAdmindetails();
		Guest guest1=new Guest();
		guest1.getGuest();
		break;
		case "C":
		Guest guest=new Guest();
		guest.getGuest();
		
		return;
		default :
			System.out.println("Enter the Correct choise number\r\n"
					+ "\r\n");
			OutputMain output=new OutputMain();
			OutputMain.main(null);
		}
	}
}}
		