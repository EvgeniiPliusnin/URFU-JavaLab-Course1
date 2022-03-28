import java.util.Scanner;

public class myExample_10 {

	public static void main (String[] args) {
	
		Scanner inTerminal = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int first = inTerminal.nextInt();
		System.out.print("Enter the second number: ");
		int second = inTerminal.nextInt();
		
		System.out.println("\nThe summ of two numbers is: " + (first + second));
		System.out.println("The difference of thwo numbers is: " + (first - second));
	}
}
