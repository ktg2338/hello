package Method;

public class Walking {
	public static void main(String[] args) {
		int w = 5000;
		
		System.out.println("�Ϸ絿�� "+ w +"���� �ɾ��� �� Į�θ��� "+ calCal(w)+"cal �̴�");
		
	}
	  
	public static double calCal(int w) {
		double c = 0.02;
		double result = w * c;
		return result;
	}
}

