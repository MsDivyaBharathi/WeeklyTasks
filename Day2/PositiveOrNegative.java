package Day2;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
	if(num1 < 0) {
		System.out.println("The entered number " +num1+" is negative");
	} else if (num1 >= 1) {
		System.out.println("The entered number " +num1+" is positive");
	} else {
		System.out.println(num1 + " is neither negative nor positive");
	}
		
		sc.close();
	}

}
