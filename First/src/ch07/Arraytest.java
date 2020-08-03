package ch07;

public class Arraytest {
	public static void main(String[]args) {
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(num[7]);
		num[7] = 888;
		System.out.println(num[7]);
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
