import java.util.Scanner; 

public class myExample_1 {

	public static void main (String[] args) {
	
	Scanner inCMD = new Scanner(System.in);
	System.out.print("Enter your first name: ");
	String firstName = inCMD.nextLine();
	System.out.print("Enter your second name: ");
	String secondName = inCMD.nextLine();
	System.out.print("Enter your last name: ");
	String lastName = inCMD.nextLine();
	
	System.out.println("Hello, " + firstName + " " + secondName + " " + lastName);
	}
}
