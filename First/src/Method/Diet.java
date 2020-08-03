package Method;

public class Diet {
	public static void main(String[] args) {
		
		double w = 74.5;
		double t = 1.73;
		double bmi = cal(w, t);
		
		System.out.printf("BMI : %.2f(%.1fkg, %.2fm)\n", bmi , w , t);
		System.out.printf("결과 : %s입니다.\n", result(bmi));
	}
	  
	public static double cal(double w, double t) {
		double result = w/(t*t);
		return result;
	}
	
	public static String result(double x) {
		if(x >= 30)
			return "비만";
		if(x >= 25)
			return "과체중";
		if(x >= 18.5)
			return "정상";
		else
			return "저체중";
	}
}

