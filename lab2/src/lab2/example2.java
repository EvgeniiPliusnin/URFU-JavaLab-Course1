package lab2;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inTerminal = new Scanner(System.in);
		System.out.println("****************");
		System.out.println("Enter the number");
		System.out.println("****************\n");
		
		int number = inTerminal.nextInt();
		if(checkNumber(number))
			System.out.println("number is valid");
		else
			System.out.println("number is not valid");
		
//		for (int i = 0; i < 1000; i++) {
//			if(checkNumber(i) == true) 
//				System.out.println(i);
//		}
	}
	
	public static boolean checkNumber(int value) {
		
		if(value %5 == 2 && value %7 == 1)
			return true;
		else
			return false;
	}

}
