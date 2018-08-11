import java.util.Scanner;

public class CreditCardValidator {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		System.out.println
			(
					number + " is " + 
					(isValid(number) ? "Valid" : "Not valid")  // ? : is short form for if/else statement
			);
		input.close();
	}

/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		boolean Valid = (
				(prefixMatched(number, 4)) ||
				(prefixMatched(number, 5)) || 
				(prefixMatched(number, 37))|| 
				(prefixMatched(number, 6)))
				&& (getSize(number) >= 13 && getSize(number) <= 16)
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		return Valid;
	}

	/** Sum of even place */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;

	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return (getPrefix(number, getSize(d)) == d);
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		String num = d + ""; //Making it into a string so you can read the length
		return num.length();
		/*
		 * return (Long.toString(d)).length();
		 */
	}

	/** Seeing if the given prefix matches the starting substring of the number */
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			// String num = Long.toString(number);
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		return number;
	}

}
