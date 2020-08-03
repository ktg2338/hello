package Method;

public class Walking {
	public static void main(String[] args) {
		int w = 5000;
		
		System.out.println("하루동안 "+ w +"걸음 걸었을 때 칼로리는 "+ calCal(w)+"cal 이다");
		
	}
	  
	public static double calCal(int w) {
		double c = 0.02;
		double result = w * c;
		return result;
	}
}

