package Method;

public class Pork {
	public static void main(String[] args) {
		int p = 3;
		double pork = calCal(p);
		System.out.printf("ªÔ∞„ªÏ %d¿Œ∫– : %.2f kcal", p, pork);
		
	}
	  
	public static double calCal(int p) {
		double c = 5.179;
		int g = 180; 
		
		double result = (g * p) * c;
		return result;
	
	}
}

