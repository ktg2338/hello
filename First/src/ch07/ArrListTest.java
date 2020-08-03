package ch07;

import java.util.ArrayList;

public class ArrListTest {
	
	
	public static void main(String[]args) {
		ArrayList<Book> library = new ArrayList<Book>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);
		
		System.out.println(number.size());
		System.out.println(number.get(0));
		System.out.println(number.get(1));
		System.out.println(number.get(2));
		System.out.println(number.get(3));
		
	}
}
