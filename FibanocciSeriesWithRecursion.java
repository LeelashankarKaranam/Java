package shankar1;

import java.util.Scanner;

public class FibanocciSeriesWithRecursion {
	/*
	 * // initiating first two numbers of the Fibonacci series static int number1 =
	 * 0; static int number2 = 1;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * // Taking input from the user to print Fibonacci series up to how many
	 * numbers
	 * 
	 * System.out.println("Enter number up to which Fibonacci series to print:");
	 * 
	 * // Reading user input using Scanner object int upto = new
	 * Scanner(System.in).nextInt();
	 * 
	 * // Printing first two numbers System.out.print(number1 + " " + number2);
	 * 
	 * // Calling recursive function by decreasing 2 because two numbers are already
	 * printed printFibonacci(upto - 2);
	 * 
	 * } public static void printFibonacci(int count) {
	 * 
	 * if (count > 0) { int nextNumber = number1 + number2; number1 = number2;
	 * number2 = nextNumber;
	 * 
	 * System.out.print(" " + nextNumber);
	 * 
	 * // Call the recursive function again printFibonacci(count -1); }
	 * " }
	 */

	
	
	static int num1=0;
	static int num2=1;
	
 
	
	public static void main(String[] args)
	{
		System.out.println("----------practicing----------");
		System.out.println("enter number upto which fibonicci series to print: ");
		
		int upto = new Scanner(System.in).nextInt();
		
		System.out.print(num1+" "+num2);
		
		printFibonacci(upto-2);
	}
		
		public static void printFibonacci(int count)
		{
			if(count >0)
			{
				int nextNum= num1+num2;
				num1=num2;
				num2=nextNum;
				System.out.print(" "+nextNum);
				printFibonacci(count-1);
				
			}
		}
	}

