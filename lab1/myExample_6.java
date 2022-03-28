import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class myExample_6 {

	public static void main (String[] args) {
	
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int year = calendar.get(Calendar.YEAR);
	
		Scanner inTerminal = new Scanner(System.in); //setup input from keyboard
		
		System.out.print("Please, Enter your name: ");
		String name = inTerminal.nextLine();
		System.out.print("Please, Enter year of your birth: ");
		int yearOfBirth = inTerminal.nextInt();
		
		System.out.println("Your name is " + name + " and you are " + (year - yearOfBirth) + " age");
		
		
		
	}
}
