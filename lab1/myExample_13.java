public class myExample_13 {

	public static void main (String[] args) {
	
		System.out.println("hypotenuse = " + hyp(3, 4));		
	}
	
	public static double hyp(double a, double b) {
	
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
	}
} 
