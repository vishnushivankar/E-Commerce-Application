package com.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.main.output.OutputMain;

public class UserMainOutput {
	public void getUser() throws ClassNotFoundException, SQLException {
		
		System.out.println("User Details");
		System.out.println("1. User Registration\r\n"+
		"2. User Login\r\n"+
		"3. User View Product Item \r\n"+
		"4. Short the product\r\n"+
		"5. Select Product and Add to cart\r\n"+
		"6. Purchase the Item\r\n");
		System.out.println("Enter the Choice");
		Scanner scanner=new Scanner(System.in);
		while(true){
		String choice=scanner.next();
		String number = choice;
		switch (number) {
		case "1":
			
			Registration registraion=new Registration();
			registraion.getRegistraion();
			SetUserName setUserName =new SetUserName ();
			setUserName.getUserName();
			System.out.println("Enter the 2 to Login as User");
		break;
		case "2":
			
			Login login=new Login();
			login.callloginmethod();
			
			System.out.println("Enter the 3 to Purchase the Product");
		break;
		case "3":
		
			ProductDetails productDetails=new ProductDetails();
			productDetails.getProductDetails();
			System.out.println("Enter the 4 to Short the Product");
			break;
		case "4":
			
			SortFinalDetails sortFinalDetails=new SortFinalDetails();
			sortFinalDetails.getSortFinalDetails();
			System.out.println("Enter the 5 to add the Prodcut to cart");
			break;
		case "5":
			
			 TransferProductToCart.addToCart();
			 BuyTheProduct2 b=new BuyTheProduct2();
		     b.getBuyTheProduct();
		     break;
		case"6":
			PurchaseTheProduct.purchasefinally();
		
			TotalBill totalbill=new TotalBill();
		
			totalbill.getTotalBill();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
					+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
			OutputMain outputMain=new OutputMain();
			outputMain.main(null);
		return;
		default :
			System.out.println("Enter the Correct choise number");
			
			UserMainOutput user1=new UserMainOutput();
			user1.getUser();
	}
		}
	}
	
	    
}

