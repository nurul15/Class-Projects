package myfirst;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
	    double guess;
		Scanner input= new Scanner(System.in); //create scanner
		
		Random answer=new Random ();
		int randomnum=answer.nextInt(10);
		
		for(int i=0; i<3; i++)
		{
			System.out.print("Enter a Guess: ");
			guess=input.nextDouble();
			
			if(randomnum==guess){
				System.out.println("Right! You won the game");
				i=3; }
			
			else if((randomnum==guess +2) || (randomnum==guess -2)){
				System.out.println("Warm");}
				
			else if((randomnum==guess +1) || (randomnum==guess -1)){
				System.out.println("Hot");}
			
			else 
				System.out.println("Cold"/*+randomnum*/);
			if (i==2 && guess != randomnum){
				System.out.println("Wrong! You Lost the Game The Correct Answer is: "+randomnum);
			}
			
			
		}
		

	}

}
