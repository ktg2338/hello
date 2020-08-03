package Method;

public class Gamble {
	public static void main(String[] args) {
	double dollar = dice() + dice() + dice();
	double won = exchange(dollar);
	
	System.out.printf("È¹µæ ±Ý¾× :  $%.2f(%.0f¿ø)", dollar, won);
	}
	  
	public static int dice(){
		return (int)(Math.random()*6)+1;
	}
	
	public static double exchange(double x) {
		double result = x * 1082.25108;
		return result;
	
	}
}

