package com.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.main.output.OutputMain;

public class PurchaseTheProduct {
	
	public static void purchasefinally() throws SQLException, ClassNotFoundException {
	Scanner scanner=new Scanner(System.in);
		System.out.println("Please choose the Option to process for..");
		System.out.println("1. Purchase the product as seen in the cart");
		System.out.println("OR");
		System.out.println("2. Delete the Product OR Change the Quantity ");
		String yes=scanner.next();
		
		String choice = yes;
		switch (choice) {
		case "1":
			PerchaseProduct p=new PerchaseProduct();
			p.purchase();
			TotalBill totalbill=new TotalBill();
			
			totalbill.getTotalBill();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
					+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
			OutputMain outputMain=new OutputMain();
			outputMain.main(null);
			break;
		case"2":
			DeleteOrUpdate deleteOrUpdate=new DeleteOrUpdate();
			deleteOrUpdate.getDeleteOrUpdate();
TotalBill totalbill1=new TotalBill();
			
			totalbill1.getTotalBill();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
					+ "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
			OutputMain outputMain1=new OutputMain();
			outputMain1.main(null);
			
			return;
			default:
		
				System.out.println("enter the correct spelling");
				PurchaseTheProduct.purchasefinally();
}}}
