package Method;

public class Diet {
	public static void main(String[] args) {
		
		double w = 74.5;
		double t = 1.73;
		double bmi = cal(w, t);
		
		System.out.printf("BMI : %.2f(%.1fkg, %.2fm)\n", bmi , w , t);
		System.out.printf("��� : %s�Դϴ�.\n", result(bmi));
	}
	  
	public static double cal(double w, double t) {
		double result = w/(t*t);
		return result;
	}
	
	public static String result(double x) {
		if(x >= 30)
			return "��";
		if(x >= 25)
			return "��ü��";
		if(x >= 18.5)
			return "����";
		else
			return "��ü��";
	}
}

