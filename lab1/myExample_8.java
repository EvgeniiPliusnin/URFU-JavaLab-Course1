import java.util.Scanner;

public class myExample_8 {

	public static void main (String[] args) {
	
		Scanner inTerminal = new Scanner(System.in);
		System.out.print("Enter first term: ");
		int firstValue = inTerminal.nextInt();
		System.out.print("Enter second term: ");
		int secondValue = inTerminal.nextInt();
		System.out.println("Summ of two terms equals " + (firstValue + secondValue) );
		
	}
}
