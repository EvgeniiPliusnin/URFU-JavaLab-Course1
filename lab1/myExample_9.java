import java.util.Scanner;

public class myExample_9 {

	public static void main(String[] args) {
	
		Scanner inTerminal = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int entered = inTerminal.nextInt();
		
		int first = entered-1;
		int second = entered;
		int thirth = entered+1;
		int summ = first + second + thirth;
		double fourth = summ * summ;
		
		System.out.printf("%d, %d, %d, %.0f", first, second, thirth, fourth);
	}
}
