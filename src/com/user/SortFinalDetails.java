package com.user;

import java.util.Scanner;

public class SortFinalDetails {
	public  void getSortFinalDetails() {
		System.out.println("Choose the Option to sort the products by..\r\n"+
	"1. Short by Price\r\n"+
	"2. Short by Qantity\r\n");
		Scanner scanner=new Scanner(System.in);
		String sort=scanner.next();
		String sortn = sort;
		switch(sortn) {
		case"1":
			SortProductByPrice sortProductByPrice=new SortProductByPrice();
			sortProductByPrice.getShortProductsbyprice();
			break;
		case"2":
			
			SortByQuantity sortByQuantity=new SortByQuantity();
			sortByQuantity.getSortByQuantity();
		
			return;
			default:
				System.out.println("Kindly choose the correct option..");
				SortFinalDetails sortFinalDetails=new SortFinalDetails();
				sortFinalDetails.getSortFinalDetails();
		}
		
		
	}

}
