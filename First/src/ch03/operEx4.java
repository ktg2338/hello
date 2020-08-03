package ch03;

public class operEx4 {

	public static void main(String[] args) {
		// 관계연산자
		int num = 10;
		int  i = 2;
		
		boolean val = ((num = num+10) < 10) && ((i = i+2) <10);
		System.out.println(val);
		System.out.println(num);
		System.out.println(i);
		val = ((num = num+10) < 10) || ((i = i+2) <10);
		System.out.println(val);
		System.out.println(num);
		System.out.println(i);
	}

}
