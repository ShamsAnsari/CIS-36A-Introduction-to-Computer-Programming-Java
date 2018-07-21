
// When you enter a letters, the code stops working

import java.util.Scanner;

public class DigitsSum {
	public static void main (String[] args) {
		Scanner user  = new Scanner(System.in);	
		int number;
		int sum = 0;
		System.out.println("Enter a positive integer.");
		number = user.nextInt();

		if ( number <= 0) 
		{
			System.err.println("The integer that you have enter is negative, please check again.");    // How do I make it you've instead of  "you have"
		}
		if (number == 0) {
			System.err.println("The integer that you have enter is zero, please check again.");
		}	
		else {
			if (number > 999)
				System.err.println("The integer you have entered is too big, please keep it below 1000.");
			else {
				if (number <= 99) {
					sum = sum + number % 10;
					number = number / 10;	
					System.out.println("Sum of the digits is " + (sum + number) + "." );
				} else {
					sum = sum + number % 10;
					number =  number / 10;
					sum = sum + number % 10;
					number = number /10;
					System.out.println("Sum of the digits is " + (sum + number)+ ".");}
			}

		}


	}

}
