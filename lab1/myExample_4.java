import java.util.Scanner;

public class myExample_4 {

	public static void main (String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter name of the current month: ");
		String month = in.next();
		
		System.out.print("Enter quantity of day per current month: ");
		int quantityDay = in.nextInt();
		
		System.out.println("There are " + quantityDay + " days in the month of " + month); 
	}
}
