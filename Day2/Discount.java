package Day2;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be paid: ");
		double amountToBePaid = sc.nextDouble();
		double discount;
		double bill;
		
		if (amountToBePaid <=500) {
			 System.out.println("Your Bill amount is: "+ amountToBePaid + " To avail discount, the bill amount greater than 500");
		} else if (amountToBePaid >= 500 && amountToBePaid <=1000) {
		
			discount = amountToBePaid*0.1;
			bill = amountToBePaid - discount;
			System.out.println("Your Bill amount is: " + bill + " You have availed 10% of discount from the MRP");
		}else {
			discount = amountToBePaid*0.2;
			bill = amountToBePaid - discount;
			System.out.println("Your Bill amount is: " + bill + " You have availed 20% of discount from the MRP");
		}
		sc.close();	
		}
}
