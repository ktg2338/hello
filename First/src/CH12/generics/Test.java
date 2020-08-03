package CH12.generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("¹®ÀÚ¿­");
//		list.add("A");
//		list.add("123");
//		list.add("3.14");
		
		String str = (String) list.get(0);
//		int number = (int) list.get(2);
		
		System.out.println(str);
//		System.out.println(number);
	}

}
