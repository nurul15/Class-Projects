package labs;

import java.util.Scanner;
public class Discount_Prices {

	public static void main(String[] args) {
		
		
		Scanner price= new Scanner(System.in); //create scanner
		System.out.println(" Enter amount of Purchases:"); //Prints "Enter amount of purchases"
		double amount = price.nextInt();
		double percent= amount * 0.10;
		double discount= amount - percent;
	
		if (amount >= 1000) {
			System.out.println("Discounted price: " +discount);
			}

			else System.out.println("Your price is: " +amount);
		
		
		
		

	}

}
