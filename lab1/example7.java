import java.util.Scanner;

public class example7 {


	public static void main (String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter radius of circl: ");
		int radius = in.nextInt();
		long area = Math.round(Math.PI * Math.pow(radius, 2));
		System.out.printf("S of circle with radius R = %d equals %d \n", radius, area);
	}
}
