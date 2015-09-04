package labs;

import java.util.Scanner;

public class Cents_to_Dollar {

	public static void main(String[] args) 
{

		int dollar=0;
		int cents=0;
		int input;
		
		
		Scanner scan= new Scanner(System.in); //create scanner
		System.out.println(" Input the cents:"); //Prints "Input the cents"
		
		input = scan.nextInt();
		
		
		dollar= input / 100;
		cents=input % 100 ;
		
		System.out.println(" The value is : " + dollar+" Dollars and "+cents+" Cents");

		
		
		

	}

}
