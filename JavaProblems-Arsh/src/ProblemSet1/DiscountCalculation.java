package ProblemSet1;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		DiscountCalculation obj = new DiscountCalculation();
		obj.calculateDiscount();
	}
	
//	creating a method to calcluate
	void calculateDiscount() {
		float item1;
		float item2;
		int discount;
		float totalAmount;
		float discountedAmount;
		float savedAmount;
		
//		taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Price of item 1: ");
		item1 = scan.nextFloat();
		System.out.println("Price of item 2: ");
		item2 = scan.nextFloat();
		System.out.println("Discount in percentage: ");
		discount = scan.nextInt();
		scan.close();
		totalAmount = item1 + item2;
		discountedAmount = totalAmount - (totalAmount * discount)/100;
		savedAmount = totalAmount - discountedAmount;
		
		System.out.printf("Total amount: $%.2f",totalAmount);
		System.out.printf("\nDiscounted amount: $%.2f",discountedAmount);
		System.out.printf("\nSaved amount: $%.2f",savedAmount);
		
	}
}
