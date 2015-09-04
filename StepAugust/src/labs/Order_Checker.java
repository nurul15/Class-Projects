package labs;
import java.util.Scanner;
public class Order_Checker {

	public static void main(String[] args) 
{
		
		
		int bolt=5; 
		int nut=3;
		int washer=1;
		Scanner input1= new Scanner(System.in); //create scanner
		System.out.println(" How many bolt you want:"); //Prints "Enter amount of bolt"
		int boltswanted = input1.nextInt();
		
		Scanner input2= new Scanner(System.in); //create scanner
		System.out.println(" How many nut you want:"); //Prints "Enter amount of nut"
		int nutswanted = input2.nextInt();
		
		
		Scanner input3= new Scanner(System.in); //create scanner
		System.out.println(" How many washer you want:"); //Prints "Enter amount of washer"
		int washerwanted = input3.nextInt();
		
		int boltcost=bolt * boltswanted;
		int nutcost=nut * nutswanted;
		int washercost=washer * washerwanted;
		int totalcost=boltcost+nutcost+washercost;
		
		
		
		
		
		System.out.println(" Total cost : " +totalcost);

	}

}
