package labs;
import java.util.Scanner;
public class Order_Checker {

	public static void main(String[] args) 
{
		
		
		int bolt=5; 
		int nut=3;
		int washer=1;
		
		Scanner input1= new Scanner(System.in); //create scanner
		System.out.print(" How many bolts you want: "); //Prints "Enter amount of bolt"
		int boltswanted = input1.nextInt();
		
		Scanner input2= new Scanner(System.in); //create scanner
		System.out.print(" How many nuts you want: "); //Prints "Enter amount of nut"
		int nutswanted = input2.nextInt();
		
		Scanner input3= new Scanner(System.in); //create scanner
		System.out.print(" How many washer you want: "); //Prints "Enter amount of nut"
		int washerwanted = input3.nextInt();
		
		int boltcost=bolt * boltswanted; //multiply 5 * the number of bolt inputed 
		int nutcost=nut * nutswanted; //multiply 3 * the number of nut inputed
		int washercost=washer * washerwanted; //multiply 1 * the number of washer inputed
		int totalcost=boltcost+nutcost+washercost; //add all the total cost
		
		if ((nutswanted< boltswanted) && (washerwanted < 2*boltswanted)){System.out.println("Check the Order: too few nuts and washers");}
		
		else if (washerwanted < 2*boltswanted) {System.out.println("Check the Order: too few washer");}

		else if (nutswanted< boltswanted){
		System.out.println(" Check the order: too few nuts ");//Displays total cost
	}
	 
	
	else 
	System.out.println(" Check order : Order is good  " );//Displays total cost
		System.out.print("Total cost: " +totalcost);

	
}
}
