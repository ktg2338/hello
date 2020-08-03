package Method;

public class Gas {
	public static void main(String[] args) {
		
		double gas = 8.86;
		double dis = 182.736;
		double eff = carEff(gas, dis);
		System.out.printf("¿¬ºñ : %.2f km/L", eff);
		
	}
	  
	public static double carEff(double gas, double dis) {
		double result = dis/gas;
		return result;
	}
}

