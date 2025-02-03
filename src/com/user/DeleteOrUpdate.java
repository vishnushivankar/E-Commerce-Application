package com.user;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOrUpdate {
	
	public void getDeleteOrUpdate() throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("kindly choose the below Option");
		System.out.println("Type 1 to delete the Prodcut");
		System.out.println("Type 2 to Update the Quantity");
		System.out.println("OR");
		System.out.println("Type 3 go to Back Purchase");
		String number=scanner.next();
		String choice=number;
		switch(choice) {
		case"1":
			DeletFromCart deletFromCart=new DeletFromCart();
			deletFromCart.delete();
			 BuyTheProduct2 b=new BuyTheProduct2();
		    b.getBuyTheProduct();
			break;
		case"2":
			UpdateQuantity updateQuantity=new UpdateQuantity();
			updateQuantity.update();
			PurchaseTheProduct.purchasefinally();
			break;
			
		case"3":
			PurchaseTheProduct.purchasefinally();
			return;
			default:
				System.out.println("Kindly select the correact option");
		}
	}

}
