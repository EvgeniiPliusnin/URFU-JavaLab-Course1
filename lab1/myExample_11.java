//Добавьте в пример расчета гипотенузы (см. раздел 2) метод, вычисляющий a^b
// . Используйте для этого функции расчета натурального логарифма и экспоненты (y=exp(b*log(a));

public class myExample_11 {

	   static double a = 3;
	   static double b = 4;

	
	public static double hyp() {
	
		return Math.sqrt(pow(a,2) + pow(b,2));
	}
	
	public static double pow(double firstTerm, double secondTerm) {
	
		return Math.exp(secondTerm * Math.log(firstTerm));
	}
	


	public static void main (String[] args) {
	
		System.out.println("\nHypotenuse = " + hyp());
	}
}
