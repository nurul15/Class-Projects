package labs;
import java.util.Scanner;

public class Area_of_a_circle {

	public static void main(String[] args) 
{
		
		Scanner input= new Scanner(System.in); //create scanner
		System.out.println(" Enter a Radius");
		double radius = input.nextDouble();
		double area= Math.PI * (radius * radius);
		System.out.println("The area of the Circle with the Radius " +radius +" is : " + area);
		
		

	}

}