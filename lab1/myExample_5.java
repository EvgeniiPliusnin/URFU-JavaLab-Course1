import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class myExample_5 {

	public static void main (String[] args) {
	
		Scanner inTerminal = new Scanner(System.in);
		
		
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int currentYear = calendar.get(Calendar.YEAR);
		
		System.out.println("This program calculate the age of a person using the year of born");
		System.out.print("Enter the year of your born: ");
		int dateOfBorn = inTerminal.nextInt();
		
		int age = currentYear - dateOfBorn;
		System.out.println("Your age is: " + age);
		
		}
}
