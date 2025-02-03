package com.user;

import java.sql.SQLException;
import java.util.Scanner;

public class BuyTheProduct2 {
	
	public void getBuyTheProduct() throws ClassNotFoundException, SQLException {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("1. Add to cart another Procut\r\n"
	        		+ "2. Proceed for Further \r\n");
	        System.out.println();
	        String number = scanner.next();
	        String choice=number;
	        switch(choice) {
	        case "1":
	        	TransferProductToCart t=new TransferProductToCart();
	        	t.addToCart();
	        	BuyTheProduct2 b1=new BuyTheProduct2();
	        	b1.getBuyTheProduct();
	        	break;
	        case"2":
	        	PurchaseTheProduct.purchasefinally();
	        return;
	        default:
	        	System.out.println("Enter the Correct Option");
	        	BuyTheProduct2 b=new BuyTheProduct2();
	        	b.getBuyTheProduct();


}
	}}
					