package com.guest;

import java.sql.SQLException;
import java.util.Scanner;

import com.user.UserMainOutput;

public class Guest {
	
	public void getGuest() throws ClassNotFoundException, SQLException {
		System.out.println("Guest Operations:");
        System.out.println("1. View Product Item");
        System.out.println("2. Purchase the Item");
        System.out.print("Enter your choice: ");
        while(true){
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        switch(number) {
        case"1":
        	ProductDetails productDetails=new ProductDetails();
        	productDetails.getProductDetails();
        	System.out.println("Enter 2 to purchase the Item");
        	break;
        case"2":
        	System.out.println("Kindly Register and Login the Fisrt to Purchase the Item");
            UserMainOutput userMainOutput=new UserMainOutput();
            userMainOutput.getUser();
        }
        
	}
	}}

