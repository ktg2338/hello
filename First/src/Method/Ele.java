package Method;

public class Ele {
	public static void main(String[] args) {
	int a = 13;
	int b = 7;
	int c = 10;
	
	System.out.printf("%d�� �� %S ����������\n" , a, guide(a));
	System.out.printf("%d�� �� %S ����������\n" , b, guide(b));
	System.out.printf("%d�� �� %S ����������\n" , c, guide(c));
	}
	  
	public static String guide(int x){
		if(x > 10)
			return "����";
		else
			return "����";
	}
}

