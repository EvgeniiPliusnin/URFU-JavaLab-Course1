//Используйте новый метод для расчета гипотенузы. Сделайте вариант
//метода hyp() с параметрами.

public class myExample_12 {

	
	public static double hyp(double a, double b) {
	
		return Math.sqrt(pow(a,2) + pow(b,2));
	}
	
	public static double pow(double firstTerm, double secondTerm) {
	
		return Math.exp(secondTerm * Math.log(firstTerm));
	}
	


	public static void main (String[] args) {
	
		System.out.println("\nHypotenuse = " + hyp(3,4));
	}
}
