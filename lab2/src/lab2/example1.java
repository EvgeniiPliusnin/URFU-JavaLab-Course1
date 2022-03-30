package lab2;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********************************************************");
		System.out.println("Program checks if it can divide by 3 without a remainder");
		System.out.println("********************************************************\n");
		Scanner inTerminal = new Scanner(System.in); 
		
		System.out.print("Enter the number: ");
		int number = inTerminal.nextInt();
		
		if(number%3 == 0) {
			System.out.println("The entered number fully divided by 3");
		}
		else {
			System.out.println("The entered number can't be fully divided by 3");
		}
	}

}
