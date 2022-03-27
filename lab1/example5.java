import java.util.Scanner;

public class example5 {

	public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	
	System.out.print ("Enter name: ");
	String name = in.nextLine();
	
	System.out.print("Enter age: ");
	int age = in.nextInt();
	
	System.out.print ("Enter height of body: ");
	float height = in.nextFloat();
	
	System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
	in.close();
	}
}
