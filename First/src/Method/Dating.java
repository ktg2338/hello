package Method;

public class Dating {
	public static void main(String[] args) {
		
		String x = rating(4.2, 4.7, 4.3);
		String y = rating(3.8, 4.1, 3.5);
		String z = rating(3.6, 3.0, 3.4);
		
		System.out.printf(" X : %s등급\n", x);
		System.out.printf(" Y : %s등급\n", y);
		System.out.printf(" Z : %s등급\n", z);
	}
	  
	public static String rating(double p, double l , double a){
		double sum = p + l + a;
		
		if(p >= 4.0 && l >= 4.0 && a >= 4.0)
			return "A";
		if(sum > 10 && (p >= 4.0 || l >= 4.0 || a >= 4.0))
			return "B";
		else
			return "C";
		}
}


