import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float balance;
		int itemNumber;
		int potatoChipsCounter = 3;
		int cookiesCounter = 3;
		int candiesCounter = 3;
		double moneyReturn;

		while (true) {
			System.out.println("\n Please pick an item:"
					+ "\n1: Potato chips\t $1.25" 
					+ "\n2: Cookies \t $0.85"
					+ "\n3: Candies \t $0.95" 
					+ "\n4: Exit");
			
			boolean done = false;
			while (!done && scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					itemNumber = scanner.nextInt();
					switch (itemNumber) {
					
					case 1:// Potato Chips
		
						System.out.println("You have selected Potato Chips.");
						if (potatoChipsCounter > 0) {
							System.out.print("Please enter the amount of money your are dispensing: $");
							if (scanner.hasNextFloat() || scanner.hasNextInt()) {
								balance = scanner.nextFloat();
								if (balance >= 1.25) {
									potatoChipsCounter--;
									moneyReturn = balance - 1.25;
									System.out.printf("Your remaining change is: $%.2f", moneyReturn );
									System.out.println("");
									System.out.println("Here are your Potato Chips, they are very unhealthy.");
								} else {
									System.out.println("Insufficient funds, please try again!");
								}
								done = true;
							} else {
								scanner.next();
								System.out.println("Wrong input, this is not a valid number");
								done = true;
							}
						} else {
							System.out.println("We are out of Potato Chips, please make another selection");
							done = true;
						}
						break;
						
					case 2:// Cookies
						
						System.out.println("You have selected Cookies.");
						if (cookiesCounter > 0) {
							System.out.print("Please enter the amount of money your are dispensing: $");
							if (scanner.hasNextFloat() || scanner.hasNextInt()) {
								balance = scanner.nextFloat();
								if (balance >= 0.85) {
									cookiesCounter--;
									moneyReturn = balance - 0.85;
									System.out.printf("Your remaining change is: $%.2f", moneyReturn);
									System.out.println("");
									System.out.println("Here are your Cookies, they are very unhealthy.");
								} else {
									System.out.println("Insufficient funds, please try again!");
								}
								done = true;
							} else {
								scanner.next();
								System.out.println("Wrong input, this is not a valid number");
								done = true;
							}
						} else {
							System.out.println("We are out of Cookies, please make another selection");
							done = true;
						}
						break;

					case 3:// Candies
						
						System.out.println("You have selected Candies.");
						if (candiesCounter > 0) {
							System.out.print("Please enter the amount of money your are dispensing: $");
							if (scanner.hasNextFloat() || scanner.hasNextInt()) {
								balance = scanner.nextFloat();
								
								if (balance >= 0.95f ) { //fishy
									candiesCounter--;
									moneyReturn = balance - 0.95f; //fishy
									System.out.printf("Your remaining change is: $%.2f", moneyReturn);
									System.out.println("");
									System.out.println("Here are your Candies, they are very unhealthy.");
								} else {
									System.out.println("Insufficient funds, please try again!");
								}
								done = true;
							} else {
								scanner.next();
								System.out.println("Wrong input, this is not a valid number");
								done = true;
							}
						} else {
							System.out.println("We are out of Candies, please make another selection");
							done = true;
						}
						break;
						
					case 4: {// To terminate the program
						
						System.out.print("The vending machine has disappeared, walk away. ");
						System.exit(0);
						System.err.print("This message should not be here if the application has been terminated.");
					}
						break;
					}
				} else {	
					System.out.println("This is not a valid input:" + scanner.next());
				}
			}
		}
	
	}
}
