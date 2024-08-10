package shankar1;

import java.util.Scanner;

public class FibanocciSeriesWithOutUsingRecursion {

	public static void main(String[] args) {

		/*
		 * // Taking input from the user to print Fibonacci series up to how many
		 * numbers
		 * 
		 * System.out.println("Enter number up to which Fibonacci series to print:");
		 * 
		 * // Reading user input using Scanner object int upto = new
		 * Scanner(System.in).nextInt();
		 * 
		 * // Initiating first two numbers of the Fibonacci series int number1 = 0; int
		 * number2 = 1;
		 * 
		 * // Printing first two numbers System.out.print(number1 + " " + number2);
		 * 
		 * // Start the loop from 3 because first two numbers are already printed for
		 * (int i = 3; i <= upto; i++) { int nextNumber = number1 + number2;
		 * System.out.print(" " + nextNumber); number1 = number2; number2 = nextNumber;
		 * }
		 */
		
		// Practicing
		System.out.println("----------PRACTICING----------");
		System.out.println("enter number upto which Fibanocci series to print:10");
		
		Scanner sc= new Scanner(System.in);
		
		int upto=sc.nextInt();
		int num1=0;
		int num2=1;
		
		System.out.print(num1+" "+num2);
		
		for(int i=3; i<=upto; i++)
		{
			int nextNumber= num1+num2;
			System.out.print(" "+nextNumber);
			num1=num2;
			num2=nextNumber;
		}
			
		
		
		
		
		
	}
}
