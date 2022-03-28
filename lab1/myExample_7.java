import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class myExample_7 {

	public static void main (String[] args) {
	
		Scanner inTerminal = new Scanner(System.in);	//setup input from keyboard
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int currentYear = calendar.get(Calendar.YEAR);
		
		System.out.print("Please, Enter your age: ");
		int age = inTerminal.nextInt();
		int yearOfBirth = currentYear - age;
		
		System.out.println("Year of your birth is " + yearOfBirth);
	}
}
