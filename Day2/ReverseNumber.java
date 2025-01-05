package Day2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int remainder = 0;
		
		while (num > 0) {
			reverse = reverse*10;
			remainder = num%10;
			num = (num - remainder)/10;
			reverse = reverse + remainder;
								
		}sc.close();
		System.out.println("Reversed number: " + reverse);
	} 

}
