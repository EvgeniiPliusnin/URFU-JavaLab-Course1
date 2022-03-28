import java.util.Scanner;

public class myExample_3 {

	public static void main (String[] args) {
	
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter current day of week: ");
		String day = in.next();
		System.out.print("Enter current month: ");
		String month = in.next();
		System.out.print("Enter current number of the day of the month: ");
		String numDay = in.next();
		
		System.out.println("today is " + day + ", " + numDay + " number of the day of the " + month);
	}
}
